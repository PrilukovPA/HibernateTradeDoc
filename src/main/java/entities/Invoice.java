package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="invoice")
public class Invoice {

    @Embeddable
    public static class Pk implements Serializable {

        @ManyToOne
        @JoinColumns({@JoinColumn(name = "servcode"), @JoinColumn(name = "tdoccode")})
        private TradeDoc tradeDoc;

        private Integer goodscode;
        private Integer histno;
    }

    @EmbeddedId
    private Pk id;
}
