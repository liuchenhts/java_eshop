package au.com.chen.eshop.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;

    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_SEQ")
    @SequenceGenerator(sequenceName = "product_id_seq", allocationSize = 1, name = "PRODUCT_SEQ")
    private long id;

    @Column(name = "name")
    private String name;

    private Double price;

    @Column(insertable = false, updatable = false)
    private Date dateCreated;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", dateCreated=" + dateCreated +
                '}';
    }

}
