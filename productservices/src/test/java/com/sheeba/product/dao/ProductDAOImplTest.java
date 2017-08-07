package com.sheeba.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sheeba.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void testCreate() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("IPhone");
		product.setDescription("Its Awesome");
		product.setPrice(700);
		dao.create(product);
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("IPhone",result.getName());
	}

	@Test
	public void testRead() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		//fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		//fail("Not yet implemented");
	}

}
