package com.emerzonic.SpringApp.DAO;

import com.emerzonic.SpringApp.entity.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    public List<Post> findPostsByTitleContains(String searchTerm);

    @EntityGraph(value = "post.comments.replies",type = EntityGraph.EntityGraphType.LOAD)
    Post getById(Integer postId);

}