/**
 * 
 */
package br.com.fityou.database.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.fityou.database.domain.WorkoutItem;
import br.com.fityou.database.projections.WorkoutItemWithExerciseDetail;

/**
 * @author fpach
 *
 */
@RepositoryRestResource(collectionResourceRel = "workoutItem", path = "workoutItems", excerptProjection = WorkoutItemWithExerciseDetail.class)
public interface WorkoutItemRepository extends PagingAndSortingRepository<WorkoutItem, Long> {

}
