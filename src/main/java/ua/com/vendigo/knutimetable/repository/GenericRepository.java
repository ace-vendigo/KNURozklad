package ua.com.vendigo.knutimetable.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dmytro Marchenko on 24.01.2015.
 * Parent interface for all our repositories.
 */
@NoRepositoryBean
public interface GenericRepository<T, ID extends Serializable> extends Repository<T, ID> {
    List<T> findAll();
    T findOne(ID id);
    <S extends T> S save(S object);

    void delete(ID id);
}
