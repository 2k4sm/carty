package com.sm2k4.carty.DTOs;

import java.util.Date;

import com.sm2k4.carty.Models.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartDTO {
    private int id;
    private int userId;
    private Date date;
    private Product[] products;
}
