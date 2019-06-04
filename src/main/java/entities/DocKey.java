package entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DocKey implements Serializable {
    private String servcode;
    private Integer tdoccode;

    public DocKey() {
    }

    public String getServcode() {
        return servcode;
    }

    public void setServcode(String servcode) {
        this.servcode = servcode;
    }

    public Integer getTdoccode() {
        return tdoccode;
    }

    public void setTdoccode(Integer tdoccode) {
        this.tdoccode = tdoccode;
    }
}
