package com.project.glocery.services;

import com.project.glocery.models.Product;

public interface ProductService {
    void saveProduct(Product product);
    Product getProductById(Long productId);
    Product getProductByIdForTrashRestore(Long productId);
    Product getProductByName(String productName);

    void deleteProduct(Product product);
}
