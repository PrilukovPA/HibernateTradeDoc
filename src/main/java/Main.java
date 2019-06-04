import entities.TradeDoc;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.Query;
import java.util.List;



public class Main {
    private static SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    public static void main(String[] args) {

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Query query = session.createQuery("SELECT td FROM tradedoc td WHERE td.id.tdoccode = 20159 AND td.id.servcode = '*'");
        List<TradeDoc> res = query.getResultList();
        TradeDoc doc = res.get(0);

        //doc.setLegal("A");
        doc.setLegal(" ");

        session.saveOrUpdate(doc);
        tx.commit();
        session.close();
    }
}
