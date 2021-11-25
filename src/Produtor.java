
public class Produtor {
	
	public void enviarMensagem() {
		String[] dados = {"Dado1", "Dado2", "Dado3", "Dado4", "Dado5"};
		try {
			while (true) {
				Thread.sleep(500);
				while (TrocaDeMensagem.receive() != null) {
					System.out.println("Produtor: Aguardando consumidor");
					Thread.sleep(700);
				}
				for (String string : dados) {
					System.out.println("Produzindo dado: "+ string);
					TrocaDeMensagem.dados.add(string);
					Thread.sleep(2000);

				}
			System.out.println("Término da produção\n");
			TrocaDeMensagem.send("Enviado");

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
}
