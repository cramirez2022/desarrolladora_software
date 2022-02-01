
public class Insumo_servicio {
	
	private int id_insumo;
	private String nombre_insumo;
	private Proveedor proveedor;
	private int valor_compra;

	public Insumo_servicio(int id_insumo, String nombre_insumo, Proveedor proveedor, int valor_compra) {
		super();
		this.id_insumo = id_insumo;
		this.nombre_insumo = nombre_insumo;
		this.proveedor = proveedor;
		this.valor_compra = valor_compra;
	}
	
	public int getId_insumo() {
		return id_insumo;
	}

	public void setId_insumo(int id_insumo) {
		this.id_insumo = id_insumo;
	}

	public String getNombre_insumo() {
		return nombre_insumo;
	}

	public void setNombre_insumo(String nombre_insumo) {
		this.nombre_insumo = nombre_insumo;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public int getValor_compra() {
		return valor_compra;
	}

	public void setValor_compra(int valor_compra) {
		this.valor_compra = valor_compra;
	}

}
