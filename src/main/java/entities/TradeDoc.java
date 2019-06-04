package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NamedQuery(name = "qwe1", query = "SELECT td FROM tradedoc td WHERE td.id.tdoccode = 20159 AND td.id.servcode = '*'")
@Entity(name = "tradedoc")
public class TradeDoc {

    @Embeddable
    public static class Pk implements Serializable {
        private String servcode;
        private Integer tdoccode;
    }

    @EmbeddedId
    private Pk id;

    @Column(name = "tdocdate")
    private Date date;

    private String legal;

    @OneToMany(mappedBy = "id.tradeDoc")
    private List<Invoice> invoice = new ArrayList<>();




    public TradeDoc() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

}
