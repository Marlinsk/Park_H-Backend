package app.prod.src.backend_garage.entidade;

import java.util.Objects;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "park-service-garage")
public class Garagem {
	
	private String id;
	private String tituloAnuncio;
	private String tipoLogradouroString;
	private String descricaoLocal;
	
	private String estado;
	private String cidade;
	private String rua;
	private String bairro;
	private String numero;
	private String complementoLocal;	
	
	public Garagem() {
		super();
	}

	public Garagem(String tituloAnuncio, String tipoLogradouroString, String descricaoLocal, String estado, String cidade, String rua, String bairro,
			String numero, String complementoLocal) {
		super();
		this.tituloAnuncio = tituloAnuncio;
		this.descricaoLocal = descricaoLocal;
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.complementoLocal = complementoLocal;
	}
    
	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@DynamoDBAttribute
	public String getTituloAnuncio() {
		return tituloAnuncio;
	}

	public void setTituloAnuncio(String tituloAnuncio) {
		this.tituloAnuncio = tituloAnuncio;
	}

	@DynamoDBAttribute
	public String getDescricaoLocal() {
		return descricaoLocal;
	}

	public void setDescricaoLocal(String descricaoLocal) {
		this.descricaoLocal = descricaoLocal;
	}

	@DynamoDBAttribute
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@DynamoDBAttribute
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@DynamoDBAttribute
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	@DynamoDBAttribute
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@DynamoDBAttribute
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@DynamoDBAttribute
	public String getComplementoLocal() {
		return complementoLocal;
	}

	public void setComplementoLocal(String complementoLocal) {
		this.complementoLocal = complementoLocal;
	}
	
	@DynamoDBAttribute
	public String getTipoLogradouroString() {
		return tipoLogradouroString;
	}

	public void setTipoLogradouroString(String tipoLogradouroString) {
		this.tipoLogradouroString = tipoLogradouroString;
	}

	@Override
	public String toString() {
		return "Garagem [id=" + id + ", tituloAnuncio=" + tituloAnuncio + ", tipoLogradouroString="
				+ tipoLogradouroString + ", descricaoLocal=" + descricaoLocal + ", estado=" + estado + ", cidade="
				+ cidade + ", rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + ", complementoLocal="
				+ complementoLocal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cidade, complementoLocal, descricaoLocal, estado, id, numero, rua,
				tipoLogradouroString, tituloAnuncio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Garagem other = (Garagem) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(complementoLocal, other.complementoLocal)
				&& Objects.equals(descricaoLocal, other.descricaoLocal) && Objects.equals(estado, other.estado)
				&& Objects.equals(id, other.id) && Objects.equals(numero, other.numero)
				&& Objects.equals(rua, other.rua) && Objects.equals(tipoLogradouroString, other.tipoLogradouroString)
				&& Objects.equals(tituloAnuncio, other.tituloAnuncio);
	}
	
}
