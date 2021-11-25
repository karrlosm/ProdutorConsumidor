
public class Consumidor {
	
	public void receberMensagem() {
		try {
			while (true) {
				Thread.sleep(500);
				while (TrocaDeMensagem.receive() == null) {
					System.out.println("Consumidor: Aguardando produtor");
					Thread.sleep(700);
				}
				for (String string : TrocaDeMensagem.dados) {
					
					System.out.println("Consumindo produto: " + string);
					Thread.sleep(2000);
				}
				TrocaDeMensagem.dados.clear();
				
				System.out.println(TrocaDeMensagem.dados);
				System.out.println("Consumidor: consumiu tudo\n");
				TrocaDeMensagem.send(null);
			}
			
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
