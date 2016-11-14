package org.launchcode.blogz.models.dao;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.launchcode.blogz.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface PostDao extends CrudRepository<Post, Integer> {
	
Post findByTitle(String title);
	
	Post findByUid(int uid);
	
	Post findByCreated(Date created);
	
	Post findByModified(Date modified);
	
	List<Post> findAll();
    
    List<Post> findByAuthor(int authorId);
    
    // TODO - add method signatures as needed
	
}
