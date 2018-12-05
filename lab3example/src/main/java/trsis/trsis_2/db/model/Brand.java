package trsis.trsis_2.db.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Brand")

public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;

    public Brand() {
    }

    public Brand(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Brand(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "brand_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Column(name = "brand_name")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
