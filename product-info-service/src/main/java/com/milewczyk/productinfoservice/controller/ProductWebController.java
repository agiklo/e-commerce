package com.milewczyk.productinfoservice.controller;

import com.milewczyk.productinfoservice.model.dto.ProductDTO;
import com.milewczyk.productinfoservice.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping(produces = "application/json", path = "/products-info")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ProductWebController {

    private final ProductService productService;

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("productId") Long productId) {
        return status(HttpStatus.OK).body(productService.getProductById(productId));
    }
}
