package com.springboot.ecommerceapp.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrderItemResponseDto {

    private Integer id;

    private Integer quantity;

    private Double price;

    private Date createdDate;

    private Integer productId;

    public static OrderItemResponseDto ConvertToOrderItemResponseDto(OrderItem item) {
        OrderItemResponseDto dto = new OrderItemResponseDto();
        dto.setCreatedDate(item.getCreatedDate());
        dto.setId(item.getId());
        dto.setQuantity(item.getQuantity());
        dto.setPrice(item.getPrice());
        dto.setProductId(item.getProductId());
        return dto;
    }
}
