
package com.github.domain;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest

@QuarkusTestResource(DataBaseLifecyle.class)
public class ProdutoTest {

	@Test
	public void testUmProdutoNoBancoDeDados() {
		Assert.assertEquals(1, Produto.count());
	}

}
 
