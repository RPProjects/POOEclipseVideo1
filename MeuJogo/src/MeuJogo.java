import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MeuJogo {

	public static void main(String[] args) {
		Personagens p1 = new Personagens("Kill", "Cat1", 40, 0.3);
		Personagens p2 = new Personagens("Dead", "Cat2", 30, 0.4);
		
		p1.mostraPersonagem();
		p2.mostraPersonagem();
		
		Random fatorAle = new Random();
		p1.setFatorAleatorio(fatorAle.nextDouble());
		p2.setFatorAleatorio(fatorAle.nextDouble());
		
		p1.mostraPersonagem();
		p2.mostraPersonagem();
		
		double forcaP1 = p1.getForca()*p1.getFatorAleatorio();
		double forcaP2 = p2.getForca()*p2.getFatorAleatorio();
		System.out.println("Força " + p1.getNome() + "=" + forcaP1);
		System.out.println("Força " + p2.getNome() + "=" + forcaP2);
		
		if ((p1.getForca()*p1.getFatorAleatorio()) > (p2.getForca()*p2.getFatorAleatorio())) {
			System.out.println("Personagem " + p1.getNome() +" ganhou a batalha");
		} else if ((p1.getForca()*p1.getFatorAleatorio()) < (p2.getForca()*p2.getFatorAleatorio())) {
			System.out.println("Personagem " + p2.getNome() +" ganhou a batalha");
		} else {
			System.out.println("EMPATE!!");			
		}
		
		CampoBatalha cb = new CampoBatalha(p1, p2);
		cb.mostraBatalha();
		
		List<Personagens> listaLutador = new ArrayList<Personagens>();
		listaLutador.add(p1);
		listaLutador.add(p2);
		
		for ( Personagens elem : listaLutador) {
			  System.out.println("Lutador : "+ elem.getNome());
			}
		
		System.out.println(listaLutador);
		
		CampoBatalha cb2 = new CampoBatalha(listaLutador);
		cb2.mostraBatalhaLista();
	}

}
