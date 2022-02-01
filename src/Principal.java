
public class Principal {

	public static void main(String[] args) {

		 Proveedor proveedor1 = new Proveedor(558,"Entel Internet Empresa" ,225171700, "Santiago-CL", "ISP -Telecomunicaciones");
		 Proveedor proveedor2 = new Proveedor(19,"Amazon Web Services" ,225171723, "California-EEUU", "Clouding -Telecomunicaciones");
		 Proveedor proveedor3 = new Proveedor(19,"HP Chile " ,251534543, "Santiago-CL", "Soporte-Computacional");

		 Insumo_servicio Insumo_servicio1 = new Insumo_servicio(1, "ISP-Empresa", proveedor1, 1200000);
		 Insumo_servicio Insumo_servicio2 = new Insumo_servicio(2, "Clouding-Soporte", proveedor2, 3600000);
		 Insumo_servicio Insumo_servicio3 = new Insumo_servicio(3, "Software-hardware", proveedor3, 4800000);

		 Cliente cliente1 = new Cliente(612020000, "MINISTERIO DE OBRAS PUBLICAS", 228789241, "Santiago-CL", "Publico" );
		 Cliente cliente2 = new Cliente(970180001, "Scotiabank-CL", 228789241, "Santiago-CL", "Privado" );

		 Empleado empleado1 = new Empleado(248566361, "Juan Perez", 98797244, "Santiago-CL", "Jefe Proyecto");
		 Empleado empleado2 = new Empleado(106454736, "Marco Benavente", 987432444, "Santiago-CL", "Desarrollador");
		 Empleado empleado3 = new Empleado(96211945, "Alexis Bravo", 787878786, "Santiago-CL", "Desarrollador");
		 Empleado empleado4 = new Empleado(137170655, "Hector Venegas", 434564356, "Santiago-CL", "QA");
		 Empleado empleado5 = new Empleado(185531627, "Carlos Romero", 34564357, "Santiago-CL", "Soporte-Productivo");
		 Empleado empleado6 = new Empleado(187864712, "Andrea Lopez", 436456546, "Santiago-CL", "Ventas-Comercial");



		 Proyecto_desarrollo proyecto_desarrollo1 = new Proyecto_desarrollo(1, "Proyecto Autorizaciones-API Fase 1", "01-09-2019", "01-06-2022", "En Curso", empleado6, Insumo_servicio2);
		 
		 Venta_producto venta_producto1 = new Venta_producto(3, "01-06-2022", proyecto_desarrollo1, cliente1, "SI", "132457");
		 
		 
		 System.out.println("Venta de proyecto");
		 System.out.println("Cliente " + venta_producto1.getCliente().getNombre() + "- Rut: " + venta_producto1.getCliente().getRut() + "- Comercial Venta: " + venta_producto1.getProyecto_desarrollo().getEmpleado().getNombre());
		 System.out.println("Proyecto: " + venta_producto1.getProyecto_desarrollo().getNombre_proyecto() + "- Es convenio Marco: "+ venta_producto1.getEs_oferta_publica()+ " - Numero Oferta Publica: "+ venta_producto1.getNumero_oferta_publica());
		 System.out.println("Fecha Inicio Proyecto:"+ venta_producto1.getProyecto_desarrollo().getFecha_inicio_proyecto() + " - Fecha Termino :"+ venta_producto1.getProyecto_desarrollo().getFecha_termino_proyecto());
		 System.out.println("----------------");
		 System.out.println("Equipo Interno Asignado");
		 System.out.println(empleado1.getCargo() + " : "+ empleado1.getNombre()+" -Rut: "+ empleado1.getRut());
		 System.out.println(empleado2.getCargo() + ": "+ empleado2.getNombre()+" -Rut: "+ empleado2.getRut());
		 System.out.println(empleado3.getCargo() + ": "+ empleado3.getNombre()+" -Rut: "+ empleado3.getRut());
		 System.out.println(empleado4.getCargo() + ": "+ empleado4.getNombre()+" -Rut: "+ empleado4.getRut());
		 System.out.println(empleado5.getCargo() + ": "+ empleado5.getNombre()+" -Rut: "+ empleado5.getRut());
		 System.out.println("----------------");
		 System.out.println("Proveedores Proyecto");
		 System.out.println(Insumo_servicio1.getProveedor().getNombre() + " - Servicio: "+ Insumo_servicio1.getNombre_insumo());
		 System.out.println(Insumo_servicio2.getProveedor().getNombre() + " - Servicio: "+ Insumo_servicio2.getNombre_insumo());
		 System.out.println(Insumo_servicio3.getProveedor().getNombre() + " - Servicio: "+ Insumo_servicio3.getNombre_insumo());
		 System.out.println("----------------");
		 

		 
		 

		 




			 

	}

}
