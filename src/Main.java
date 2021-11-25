
public class Main {

	public static void main(String[] args) {

		Thread produtor = new Thread( ()->{
			new Produtor().enviarMensagem();
		});


		Thread consumidor = new Thread( ()->{
			new Consumidor().receberMensagem();
		});
		
		
		produtor.start();
		consumidor.start();
		
		
	}
	

}
