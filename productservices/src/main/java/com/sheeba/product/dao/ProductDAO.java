package com.sheeba.product.dao;

import com.sheeba.product.dto.Product;

public interface ProductDAO {
	public void create(Product product);
	public Product read(int id);
	public void delete(int id);
	public void update(Product product);
	
}
