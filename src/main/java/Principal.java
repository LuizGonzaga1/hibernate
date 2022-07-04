import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {
	 Pessoa p1 = new Pessoa (null, "Luiz", "luizjunior-cte@hotmail.com","Aluno");
	 Pessoa p2 = new Pessoa (null, "pedro","pedro@gmail","Aluno");
	 Pessoa p3 = new Pessoa (null, "joão","joão@gmail","Funcionario");
	 	System.out.println(p1);
	 	System.out.println(p2);
	 	System.out.println(p3);
	 	
	 	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaHibernate");
	 	EntityManager em = emf.createEntityManager();
	 	
	 	em.getTransaction().begin();
	 	
	}

}
