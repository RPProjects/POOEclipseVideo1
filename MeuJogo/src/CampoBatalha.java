import java.util.ArrayList;

import java.util.List;

public class CampoBatalha {
	Personagens p1;
	Personagens p2;
	
	List<Personagens> lutadores = new ArrayList<Personagens>();
	
	CampoBatalha (Personagens p1, Personagens p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public CampoBatalha(List<Personagens> lutadores) {
		this.lutadores = lutadores;
	}
	
	public void mostraBatalha() {
		System.out.println("------ Batalha ------\n" + p1.getNome() + " x " + p2.getNome());
	}
	
	public void mostraBatalhaLista() {
		System.out.println("------ Batalha Lista ------");
		for ( Personagens elem : lutadores) {
			  System.out.println("Lutador : "+ elem.getNome());
			}
	}
}
