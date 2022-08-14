package br.com.cadastroclientes_.infotec.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name="seq_cliente", sequenceName="seq_cliente", allocationSize = 1, initialValue = 1)
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente")
	private Long id;
	private String loja;
	private String vendedora;
	private Date data_compra;
	private String nome;
	private Date data_nascimento;
	private String filiacao;
	private String rua;
	private String numero;
	private String cep;
	private String bairro;
	private String ponto_de_referencia;
	private String cidade;
	private String estado;
	private String fixo;
	private String movel;
	private String email;
	private String instagram;
	private String facebook;
	private String rg;
	private String orgao_expedidor;
	private Date data_de_expedicao;
	private String cpf;
	private String profissao;
	private String trabalha;
	private String funcao;
	private String olho_direito_ESF;
	private String olho_direito_CIL;
	private String olho_direito_EIXO;
	private String olho_direito_DNP;
	private String olho_esquerdo_ESF;
	private String olho_esquerdo_CIL;
	private String olho_esquerdo_EIXO;
	private String olho_esquerdo_DNP;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoja() {
		return loja;
	}
	public void setLoja(String loja) {
		this.loja = loja;
	}
	public String getVendedora() {
		return vendedora;
	}
	public void setVendedora(String vendedora) {
		this.vendedora = vendedora;
	}
	public Date getData_compra() {
		return data_compra;
	}
	public void setData_compra(Date data_compra) {
		this.data_compra = data_compra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getPonto_de_referencia() {
		return ponto_de_referencia;
	}
	public void setPonto_de_referencia(String ponto_de_referencia) {
		this.ponto_de_referencia = ponto_de_referencia;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFixo() {
		return fixo;
	}
	public void setFixo(String fixo) {
		this.fixo = fixo;
	}
	public String getMovel() {
		return movel;
	}
	public void setMovel(String movel) {
		this.movel = movel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getOrgao_expedidor() {
		return orgao_expedidor;
	}
	public void setOrgao_expedidor(String orgao_expedidor) {
		this.orgao_expedidor = orgao_expedidor;
	}
	public Date getData_de_expedicao() {
		return data_de_expedicao;
	}
	public void setData_de_expedicao(Date data_de_expedicao) {
		this.data_de_expedicao = data_de_expedicao;
	}
	public String getCpf() {
		return cpf;		
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getTrabalha() {
		return trabalha;
	}
	public void setTrabalha(String trabalha) {
		this.trabalha = trabalha;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getOlho_direito_ESF() {
		return olho_direito_ESF;
	}
	public void setOlho_direito_ESF(String olho_direito_ESF) {
		this.olho_direito_ESF = olho_direito_ESF;
	}
	public String getOlho_direito_CIL() {
		return olho_direito_CIL;
	}
	public void setOlho_direito_CIL(String olho_direito_CIL) {
		this.olho_direito_CIL = olho_direito_CIL;
	}
	public String getOlho_direito_EIXO() {
		return olho_direito_EIXO;
	}
	public void setOlho_direito_EIXO(String olho_direito_EIXO) {
		this.olho_direito_EIXO = olho_direito_EIXO;
	}
	public String getOlho_direito_DNP() {
		return olho_direito_DNP;
	}
	public void setOlho_direito_DNP(String olho_direito_DNP) {
		this.olho_direito_DNP = olho_direito_DNP;
	}
	public String getOlho_esquerdo_ESF() {
		return olho_esquerdo_ESF;
	}
	public void setOlho_esquerdo_ESF(String olho_esquerdo_ESF) {
		this.olho_esquerdo_ESF = olho_esquerdo_ESF;
	}
	public String getOlho_esquerdo_CIL() {
		return olho_esquerdo_CIL;
	}
	public void setOlho_esquerdo_CIL(String olho_esquerdo_CIL) {
		this.olho_esquerdo_CIL = olho_esquerdo_CIL;
	}
	public String getOlho_esquerdo_EIXO() {
		return olho_esquerdo_EIXO;
	}
	public void setOlho_esquerdo_EIXO(String olho_esquerdo_EIXO) {
		this.olho_esquerdo_EIXO = olho_esquerdo_EIXO;
	}
	public String getOlho_esquerdo_DNP() {
		return olho_esquerdo_DNP;
	}
	public void setOlho_esquerdo_DNP(String olho_esquerdo_DNP) {
		this.olho_esquerdo_DNP = olho_esquerdo_DNP;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}
}