package br.com.miracleworks.patchadmin.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-06-15T23:10:04.068-0300")
@StaticMetamodel(Motor.class)
public class Motor_ {
	public static volatile SingularAttribute<Motor, Long> id;
	public static volatile SingularAttribute<Motor, Integer> dimensaoFlange;
	public static volatile SingularAttribute<Motor, Boolean> comfreio;
	public static volatile SingularAttribute<Motor, Boolean> comVentilacaoForcada;
	public static volatile SingularAttribute<Motor, Double> flangeCalculado;
	public static volatile SingularAttribute<Motor, Double> cos;
	public static volatile SingularAttribute<Motor, Double> kwInicial;
	public static volatile SingularAttribute<Motor, Double> kwFinal;
	public static volatile SingularAttribute<Motor, String> rpm;
	public static volatile SingularAttribute<Motor, Double> i1;
	public static volatile SingularAttribute<Motor, String> nrSerie;
	public static volatile SingularAttribute<Motor, String> observacao;
	public static volatile SingularAttribute<Motor, Area> area;
	public static volatile SingularAttribute<Motor, Corredor> corredor;
	public static volatile SingularAttribute<Motor, Marca> marca;
	public static volatile SingularAttribute<Motor, Carcaca> carcaca;
	public static volatile SingularAttribute<Motor, FlangeCatalogo> flangeCatalogo;
	public static volatile SingularAttribute<Motor, Frequencia> frequencia;
	public static volatile SingularAttribute<Motor, Tensao> tensao;
	public static volatile SingularAttribute<Motor, Corrente> corrente;
	public static volatile SingularAttribute<Motor, IM> im;
	public static volatile SingularAttribute<Motor, IP> ip;
	public static volatile SingularAttribute<Motor, Equipamento> equipamento;
}
