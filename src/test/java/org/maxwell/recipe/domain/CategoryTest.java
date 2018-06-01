package org.maxwell.recipe.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

	Category category;

	@Before
	public void setUp() throws Exception {
		category = new Category();
	}

	@Test
	public void testGetId() throws Exception {
		Long idValue = 4L;
		category.setId(idValue);
		assertEquals(idValue, category.getId());
	}

	@Test
	public void testGetDescription() throws Exception {
		String description = "test";
		category.setDescription(description);
		assertEquals(description, category.getDescription());
	}

}
