package repository;

import com.api.pos.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoCategory extends JpaRepository<Category, Integer> {
}
