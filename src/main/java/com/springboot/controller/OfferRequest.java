package com.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferRequest {
    private int restaurant_id;
    private String offer_type;
    private int offer_value;

    private List<String> customer_segment;

    public OfferRequest(int i, String flatx, int i1, List<String> segments) {
        this.restaurant_id=i;
        this.offer_type=flatx;
        this.offer_value=i1;
        this.customer_segment=segments;
    }

    public void setRestaurantId(int i) {
        this.restaurant_id=i;
    }
}
