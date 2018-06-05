package org.maxwell.recipe.services;

import java.util.Set;

import org.maxwell.recipe.commands.RecipeCommand;
import org.maxwell.recipe.domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();

	Recipe findById(Long l);

	RecipeCommand findCommandById(Long l);

	RecipeCommand saveRecipeCommand(RecipeCommand command);

	void deleteById(Long idToDelete);
}
