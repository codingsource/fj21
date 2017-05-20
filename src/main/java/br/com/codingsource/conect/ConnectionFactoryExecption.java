package br.com.codingsource.conect;

public class ConnectionFactoryExecption extends RuntimeException{
	
	/**
	 * @autor Peter Thomas
	 */
	private static final long serialVersionUID = -7838206091994531349L;

	public ConnectionFactoryExecption () {
		super("Erro ao criar conexão com banco de dados!");
	}
}
