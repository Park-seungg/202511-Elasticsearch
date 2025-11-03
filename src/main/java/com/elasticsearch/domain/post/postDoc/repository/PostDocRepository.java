package com.elasticsearch.domain.post.postDoc.repository;

import com.elasticsearch.domain.post.postDoc.document.PostDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PostDocRepository extends ElasticsearchRepository<PostDoc, String> {
}