package edu.uoc.epcsd.productcatalog.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serialNumber", nullable = false, unique = true)
    private String serialNumber;

    @Column(name = "status", nullable = false)
    private ItemStatus status;

    @ManyToOne
    private Product product;

}