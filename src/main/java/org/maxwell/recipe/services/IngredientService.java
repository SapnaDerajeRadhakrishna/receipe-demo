package org.maxwell.recipe.services;

import org.maxwell.recipe.commands.IngredientCommand;

public interface IngredientService {

	IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

	IngredientCommand saveIngredientCommand(IngredientCommand command);

	void deleteById(Long recipeId, Long idToDelete);
}
