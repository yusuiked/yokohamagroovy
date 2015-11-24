package org.yukung.yokohamagroovy.libraries.service;

import org.yukung.yokohamagroovy.libraries.entity.Category;

/**
 * @author yukung
 */
public interface CategoryService {
    Category create(Category category);

    Category find(Long categoryId);

    void update(Category category);

    void delete(Category category);
}
