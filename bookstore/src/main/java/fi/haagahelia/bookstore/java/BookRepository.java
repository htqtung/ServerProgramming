package fi.haagahelia.bookstore.java;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findByCategory(@Param("category") String category);
	List<Book> findByAuthor(@Param("author") String author);
}
