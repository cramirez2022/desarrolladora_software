
public class Venta_producto {
	
	private int id_venta_producto;
	private String fecha_venta;
	private Proyecto_desarrollo proyecto_desarrollo;
	private Cliente cliente;
	private String es_oferta_publica;
	private String numero_oferta_publica;
	
	public Venta_producto(int id_venta_producto, String fecha_venta,
			Proyecto_desarrollo proyecto_desarrollo, Cliente cliente,
			String es_oferta_publica, String numero_oferta_publica) {
		super();
		this.id_venta_producto = id_venta_producto;
		this.fecha_venta = fecha_venta;
		this.proyecto_desarrollo = proyecto_desarrollo;
		this.cliente = cliente;
		this.es_oferta_publica = es_oferta_publica;
		this.numero_oferta_publica = numero_oferta_publica;
	}

	public int getId_venta_producto() {
		return id_venta_producto;
	}

	public void setId_venta_producto(int id_venta_producto) {
		this.id_venta_producto = id_venta_producto;
	}

	public String getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(String fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public Proyecto_desarrollo getProyecto_desarrollo() {
		return proyecto_desarrollo;
	}

	public void setProyecto_desarrollo(Proyecto_desarrollo proyecto_desarrollo) {
		this.proyecto_desarrollo = proyecto_desarrollo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getEs_oferta_publica() {
		return es_oferta_publica;
	}

	public void setEs_oferta_publica(String es_oferta_publica) {
		this.es_oferta_publica = es_oferta_publica;
	}

	public String getNumero_oferta_publica() {
		return numero_oferta_publica;
	}

	public void setNumero_oferta_publica(String numero_oferta_publica) {
		this.numero_oferta_publica = numero_oferta_publica;
	}
	
	


}
