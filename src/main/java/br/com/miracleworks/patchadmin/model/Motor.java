package br.com.miracleworks.patchadmin.model;

//@Entity
//@Table(name = "motor")
public class Motor {
//public class Motor extends BaseEntity {

	private Long id;
	private Integer dimensaoFlange;
	private Boolean comfreio;
	private Boolean comVentilacaoForcada;
	private Double flangeCalculado;
	private Double cos;
	private Double kwInicial;
	private Double kwFinal;
	private String rpm;
	private Double i1;
	private String nrSerie;
	private String observacao;
	private Area area;
	private Corredor corredor;
	private Marca marca;
	private Carcaca carcaca;
	private FlangeCatalogo flangeCatalogo;
	private Frequencia frequencia;
	private Tensao tensao;
	private Corrente corrente;
	private IM im;
	private IP ip;
	private Equipamento equipamento;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Override
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public Integer getDimensaoFlange() {
//		return dimensaoFlange;
//	}
//
//	public void setDimensaoFlange(Integer dimensaoFlange) {
//		this.dimensaoFlange = dimensaoFlange;
//	}
//
//	public Boolean getComfreio() {
//		return comfreio;
//	}
//
//	public void setComfreio(Boolean comfreio) {
//		this.comfreio = comfreio;
//	}
//
//	public Boolean getComVentilacaoForcada() {
//		return comVentilacaoForcada;
//	}
//
//	public void setComVentilacaoForcada(Boolean comVentilacaoForcada) {
//		this.comVentilacaoForcada = comVentilacaoForcada;
//	}
//
//	public Double getFlangeCalculado() {
//		return flangeCalculado;
//	}
//
//	public void setFlangeCalculado(Double flangeCalculado) {
//		this.flangeCalculado = flangeCalculado;
//	}
//
//	public Double getCos() {
//		return cos;
//	}
//
//	public void setCos(Double cos) {
//		this.cos = cos;
//	}
//
//	public Double getKwInicial() {
//		return kwInicial;
//	}
//
//	public void setKwInicial(Double kwInicial) {
//		this.kwInicial = kwInicial;
//	}
//
//	public Double getKwFinal() {
//		return kwFinal;
//	}
//
//	public void setKwFinal(Double kwFinal) {
//		this.kwFinal = kwFinal;
//	}
//
//	public String getRpm() {
//		return rpm;
//	}
//
//	public void setRpm(String rpm) {
//		this.rpm = rpm;
//	}
//
//	public Double getI1() {
//		return i1;
//	}
//
//	public void setI1(Double i1) {
//		this.i1 = i1;
//	}
//
//	public String getNrSerie() {
//		return nrSerie;
//	}
//
//	public void setNrSerie(String nrSerie) {
//		this.nrSerie = nrSerie;
//	}
//
//	public String getObservacao() {
//		return observacao;
//	}
//
//	public void setObservacao(String observacao) {
//		this.observacao = observacao;
//	}
//
//	public Area getArea() {
//		return area;
//	}
//
//	public void setArea(Area area) {
//		this.area = area;
//	}
//
//	public Corredor getCorredor() {
//		return corredor;
//	}
//
//	public void setCorredor(Corredor corredor) {
//		this.corredor = corredor;
//	}
//
//	public Marca getMarca() {
//		return marca;
//	}
//
//	public void setMarca(Marca marca) {
//		this.marca = marca;
//	}
//
//	public Carcaca getCarcaca() {
//		return carcaca;
//	}
//
//	public void setCarcaca(Carcaca carcaca) {
//		this.carcaca = carcaca;
//	}
//
//	public FlangeCatalogo getFlangeCatalogo() {
//		return flangeCatalogo;
//	}
//
//	public void setFlangeCatalogo(FlangeCatalogo flangeCatalogo) {
//		this.flangeCatalogo = flangeCatalogo;
//	}
//
//	public Frequencia getFrequencia() {
//		return frequencia;
//	}
//
//	public void setFrequencia(Frequencia frequencia) {
//		this.frequencia = frequencia;
//	}
//
//	public Tensao getTensao() {
//		return tensao;
//	}
//
//	public void setTensao(Tensao tensao) {
//		this.tensao = tensao;
//	}
//
//	public Corrente getCorrente() {
//		return corrente;
//	}
//
//	public void setCorrente(Corrente corrente) {
//		this.corrente = corrente;
//	}
//
//	public IM getIm() {
//		return im;
//	}
//
//	public void setIm(IM im) {
//		this.im = im;
//	}
//
//	public IP getIp() {
//		return ip;
//	}
//
//	public void setIp(IP ip) {
//		this.ip = ip;
//	}
//
//	public Equipamento getEquipamento() {
//		return equipamento;
//	}
//
//	public void setEquipamento(Equipamento equipamento) {
//		this.equipamento = equipamento;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((comVentilacaoForcada == null) ? 0 : comVentilacaoForcada.hashCode());
		result = prime * result + ((comfreio == null) ? 0 : comfreio.hashCode());
		result = prime * result + ((cos == null) ? 0 : cos.hashCode());
		result = prime * result + ((dimensaoFlange == null) ? 0 : dimensaoFlange.hashCode());
		result = prime * result + ((flangeCalculado == null) ? 0 : flangeCalculado.hashCode());
		result = prime * result + ((i1 == null) ? 0 : i1.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((kwFinal == null) ? 0 : kwFinal.hashCode());
		result = prime * result + ((kwInicial == null) ? 0 : kwInicial.hashCode());
		result = prime * result + ((nrSerie == null) ? 0 : nrSerie.hashCode());
		result = prime * result + ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + ((rpm == null) ? 0 : rpm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Motor other = (Motor) obj;
		
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		
		return true;
	}
}
