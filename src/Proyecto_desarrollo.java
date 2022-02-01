
public class Proyecto_desarrollo {

	private int id_desarrollo;
	private String nombre_proyecto;
	private String fecha_inicio_proyecto;
	private String fecha_termino_proyecto;
	private String estado_proyecto;
	private Empleado empleado;
	private Insumo_servicio insumo_servicio;
	
	public Proyecto_desarrollo(int id_desarrollo, String nombre_proyecto,
			String fecha_inicio_proyecto, String fecha_termino_proyecto,
			String estado_proyecto, Empleado empleado, Insumo_servicio insumo_servicio) {
		super();
		this.id_desarrollo = id_desarrollo;
		this.nombre_proyecto = nombre_proyecto;
		this.fecha_inicio_proyecto = fecha_inicio_proyecto;
		this.fecha_termino_proyecto = fecha_termino_proyecto;
		this.estado_proyecto = estado_proyecto;
		this.empleado = empleado;
		this.insumo_servicio = insumo_servicio;
	}
	
	public int getId_desarrollo() {
		return id_desarrollo;
	}

	public void setId_desarrollo(int id_desarrollo) {
		this.id_desarrollo = id_desarrollo;
	}

	public String getNombre_proyecto() {
		return nombre_proyecto;
	}

	public void setNombre_proyecto(String nombre_proyecto) {
		this.nombre_proyecto = nombre_proyecto;
	}

	public String getFecha_inicio_proyecto() {
		return fecha_inicio_proyecto;
	}

	public void setFecha_inicio_proyecto(String fecha_inicio_proyecto) {
		this.fecha_inicio_proyecto = fecha_inicio_proyecto;
	}

	public String getFecha_termino_proyecto() {
		return fecha_termino_proyecto;
	}

	public void setFecha_termino_proyecto(String fecha_termino_proyecto) {
		this.fecha_termino_proyecto = fecha_termino_proyecto;
	}

	public String getEstado_proyecto() {
		return estado_proyecto;
	}

	public void setEstado_proyecto(String estado_proyecto) {
		this.estado_proyecto = estado_proyecto;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Insumo_servicio getInsumo_servicio() {
		return insumo_servicio;
	}

	public void setInsumo_servicio(Insumo_servicio insumo_servicio) {
		this.insumo_servicio = insumo_servicio;
	}

}
