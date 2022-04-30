package com.myEcommerce.orderService.jpa;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class OrderEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120, unique = true, name = "product_id")
    private String productId;

    @Column(nullable = false, name = "qty")
    private Integer qty;

    @Column(nullable = false, name = "unit_price")
    private Integer unitPrice;

    @Column
    private Integer totalPrice;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false, unique = true)
    private String orderId;

    @Column(nullable = false, updatable = false, insertable = false, name = "created_at")
    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private Date createdAt;
}
