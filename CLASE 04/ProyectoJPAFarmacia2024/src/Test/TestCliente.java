package Test;

import java.util.List;

import DaoImp.ClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {
		//realizamos la respectiva instancia..
		TblCliente tblcli=new TblCliente();
		ClienteImp climp=new ClienteImp();
		//asignamos valores
		/*tblcli.setNombre("nilson alexander");
		tblcli.setApellido("gomez gomez");
		tblcli.setEmail("nilson@gmal.com");
		tblcli.setTelef("38741596");
		tblcli.setDni("1045786");
		tblcli.setSexo("M");
		tblcli.setNacion("chilena");
		//invocamos el metodo para registrar..
		climp.RegistrarCliente(tblcli);
		System.out.println("datos registrados");
		*/
		//*****testeamos el metodo actualizar
		/*tblcli.setIdcliente(2);
		tblcli.setNombre("nataly");
		tblcli.setApellido("perez gomez");
		tblcli.setEmail("nataly@gmail.com");
		tblcli.setTelef("38745936");
		tblcli.setDni("10457896");
		tblcli.setSexo("f");
		tblcli.setNacion("chilena");
		//invoco el metodo actualizar..
		climp.ActualizarCliente(tblcli);
		//emitimos un mensaje por consola
		System.out.println("datos actualizados");
		*/
		//*********testeando el metodo eliminar..
	/*	   //eliminamos el codigo 2
		tblcli.setIdcliente(2);
		//invoco el metodo a eliminar...
		climp.EliminarCliente(tblcli);
		//emitimos un mensaje por pantalla
		System.out.println("dato eliminado");
			*/
		//*******testeando el metodo listado
	/*	List<TblCliente> listadocliente=climp.Listado();
		//aplicamos un bucle for..
		for(TblCliente lis:listadocliente){
			//imprimimos por pantalla los datos 
			//de la bd..
			System.out.println(" codigo "+lis.getIdcliente()+
					" nombre "+lis.getNombre()+
					" apellido "+lis.getApellido()+
					" email "+lis.getEmail()+
					" telefono "+lis.getTelef()+
					" dni "+lis.getDni()+
					" sexo "+lis.getSexo()+
					" nacion "+lis.getNacion());
			
		}  //fin del bucle for...
*/
		
		//********testeando el metodo buscar por codigo...
		   //codigo a buscar...
	tblcli.setIdcliente(1);
	TblCliente buscli=climp.BuscarCliente(tblcli);
	//imprimimos por pantalla
	System.out.println(" codigo "+buscli.getIdcliente()
	+" nombre "+buscli.getNombre()+
	" apellido "+buscli.getApellido()+
	" email "+buscli.getEmail()+
	" telef "+buscli.getTelef()+
	" dni "+buscli.getDni()+
	" sexo "+buscli.getSexo()+
	" nacion "+buscli.getNacion());
	}//fin del metodo principal..

}//fin de la clase...
