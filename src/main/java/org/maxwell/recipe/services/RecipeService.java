package org.maxwell.recipe.services;

import java.util.Set;

import org.maxwell.recipe.domain.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
}
