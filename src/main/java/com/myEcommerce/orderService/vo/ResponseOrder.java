package com.myEcommerce.orderService.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class ResponseOrder {

    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;
    private Integer stock;
    private Date createdAt;

    private String orderId;

}
