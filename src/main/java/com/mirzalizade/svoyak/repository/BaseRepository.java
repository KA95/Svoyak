package com.mirzalizade.svoyak.repository;

import com.mirzalizade.svoyak.model.AbstractEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Anton Klimansky
 */
@NoRepositoryBean
public interface BaseRepository<E extends AbstractEntity> extends CrudRepository<E, Long> {

}
