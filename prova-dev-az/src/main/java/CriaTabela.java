import javax.persistence.Persistence;

public class CriaTabela{
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("FinanceiroPU");
	}
}
