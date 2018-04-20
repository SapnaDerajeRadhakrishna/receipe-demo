package org.maxwell.recipe.repositories;

import java.util.Optional;

import org.maxwell.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
	Optional<Recipe> findByDescription(String description);
}
