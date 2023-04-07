package biblioteka;

import java.util.List;

public interface BibliotekaInterfejs {
	public void dodajKnjigu(Knjiga knjiga);
	public void obrisiKnjigu(Knjiga knjiga);
	public List<Knjiga> vratiSveKnjige();
	public List<Knjiga> pronadjiKnjigu(Autor autor,long ISBN,String naslov,String izdavac);
	
}
