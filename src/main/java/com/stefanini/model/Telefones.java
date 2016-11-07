package com.stefanini.model;
// Generated 07/11/2016 12:04:54 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Telefones generated by hbm2java
 */
@Entity
@Table(name = "telefones", catalog = "hackathon")
public class Telefones implements java.io.Serializable {

	private TelefonesId id;
	private int idTipoTelefone;

	public Telefones() {
	}

	public Telefones(TelefonesId id, int idTipoTelefone) {
		this.id = id;
		this.idTipoTelefone = idTipoTelefone;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "numero", column = @Column(name = "numero", nullable = false)),
			@AttributeOverride(name = "ddd", column = @Column(name = "ddd", nullable = false)),
			@AttributeOverride(name = "cpfProprietario", column = @Column(name = "cpfProprietario", nullable = false)) })
	public TelefonesId getId() {
		return this.id;
	}

	public void setId(TelefonesId id) {
		this.id = id;
	}

	@Column(name = "idTipoTelefone", nullable = false)
	public int getIdTipoTelefone() {
		return this.idTipoTelefone;
	}

	public void setIdTipoTelefone(int idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
	}

}
