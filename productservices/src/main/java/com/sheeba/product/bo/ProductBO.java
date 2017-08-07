package com.sheeba.product.bo;

import com.sheeba.product.dto.Product;

public interface ProductBO {
	public void create(Product product);
	public Product findProduct(int id);
}
