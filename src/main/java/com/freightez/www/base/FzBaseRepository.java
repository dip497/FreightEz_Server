package com.freightez.www.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface FzBaseRepository<T extends FzBase> extends JpaRepository<T, Long> {
}