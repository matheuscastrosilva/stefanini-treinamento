package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

@Named("agenteMB")
@SessionScoped
public class AgenteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4084437316158365314L;
	@Inject
	private AgenteService agenteService;
	private Agente agente;
//	private List<Agente> listaAgente;

	public AgenteBean() {
		agente = new Agente();
		agenteService = new AgenteService();
	}

	public void criar() {

		// listaAgente.add(agente);
		// agenteService.incluir(agente);
		// chamar();

	}

//	public String chamar() {
//		return "pages/teste";
//	}

	public AgenteService getAgenteService() {
		return agenteService;
	}

	public void setAgenteService(AgenteService agenteService) {
		this.agenteService = agenteService;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

//	public List<Agente> getListaAgente() {
//		return listaAgente;
//	}
//
//	public void setListaAgente(List<Agente> listaAgente) {
//		this.listaAgente = listaAgente;
//	}

}
