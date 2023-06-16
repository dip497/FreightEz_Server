package com.freightez.www.base;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface FzAuditBaseRepository<T extends FzAuditBase> extends FzBaseRepository<T> {
}