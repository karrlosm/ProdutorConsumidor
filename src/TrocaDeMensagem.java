import java.util.ArrayList;

public class TrocaDeMensagem {
	
	
	private static String dado = null;
	public static ArrayList<String> dados = new ArrayList<String>();
	
	
	public static void send(String dadoRecebido) {
		dado = dadoRecebido;
	}
	
	public static String receive() {
		return dado;
	}

}
