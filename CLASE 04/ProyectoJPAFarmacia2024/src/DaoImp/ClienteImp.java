package DaoImp;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.*;
import model.TblCliente;
public class ClienteImp implements ICliente {

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		//nos conectamos con la unidad
		//de persistencia...
EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAFarmacia2024");
EntityManager em=emf.createEntityManager();
//iniciamos la transacciones
em.getTransaction().begin();
//invocamos al metodo persi... que nos
//permite insertar datos a la BD...
em.persist(cliente);
//comfirmamos la transaccion
em.getTransaction().commit();
//cerramos la transaccion
em.close();

	}//fin del metodo registrar cliente...

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		//nos con conectamos con la U.P.
		//para registrar los datos..
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAFarmacia2024");
		//para administrar las transacciones
		EntityManager em=emf.createEntityManager();
		try{
		//iniciamos la transaccion
		em.getTransaction().begin();
		//invocamos el metodo actualizar..
		em.merge(cliente);
		//confirmamos
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally{
		//cerramos
		em.close();
		}
	}//fin del metodo actualizar cliente

	@Override
	public void EliminarCliente(TblCliente cliente) {
		//nos conectams con la u.p
		//para poder registrar datos..
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAFarmacia2024");
		//para administrar las transaccione
		EntityManager em=emf.createEntityManager();
		try{
		//iniciar la transaccion
		em.getTransaction().begin();
		//recuperamos el codigo a eliminar..
		TblCliente elimcli=em.find(TblCliente.class,cliente.getIdcliente());
	     //aplicamos una condicion.
		if(elimcli!=null){
			//invocamos el metodo eliminar..
			em.remove(elimcli);
			//comfirmamos..
			em.getTransaction().commit();
			
		}  //fin de la condicion..
		}catch(RuntimeException ex){
			//aplicamos un condicion
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
		     ex.getMessage();
	} //fin del catch..
		finally{
		//cerramos
		em.close();
		}//fin del finally.
	}//fin del metodo eliminar cliente...

	@Override
	public List<TblCliente> Listado() {
		//nos conectarmos con la U.P.
		//para poder trabajar con bd.
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAFarmacia2024");
		//para administrar la transacciones..
		EntityManager em=emf.createEntityManager();
		List<TblCliente> list=null;
		try{
		//iniciamos la transaccion..
		em.getTransaction().begin();
		//aplicamos consultas jpql
		 list=em.createQuery("select c from TblCliente c",TblCliente.class).getResultList();
		//confirmamos
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			
		}finally{
		//cerramos
		em.close();
		}
		return list;
	}//fin del metodo listar cliente...

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		//nos conectamos con U.P.
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAFarmacia2024");
		//para administrar las transacciones
		EntityManager em=emf.createEntityManager();
		TblCliente buscarcli=null;
		try{
		//iniciamos la transaccion..
		em.getTransaction().begin();
		//invocamos al metodo buscar..
		 buscarcli=em.find(TblCliente.class,cliente.getIdcliente());
		//confirmamos
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally{
		//cerramos
		em.close();
		} //fin del finally...
		return buscarcli;
	}//fin del metodo buscar cliente...

}//fin de la clase....
