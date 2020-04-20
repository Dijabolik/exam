package com.exam.exam.entity;
    import lombok. Getter;
    import lombok. Setter;
    import javax.persistence.Entity;
    import javax.persistence.Id;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Long id;
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private String typeOf;
    @Setter
    @Getter
    private String origin;
    @Setter
    @Getter
    private Integer price;

    public Phone(Long id, String name, String typeOf,String origin, Integer price)
    {
        this.id = id;
        this.name = name;
        this.typeOf = typeOf;
        this.origin = origin;
        this.price = price;
    }

    public Phone()
    {}

}
