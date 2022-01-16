package io.turntabl.leaderboardservice.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class ProfileRepositoryTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {
        assertNotNull(entityManager);
        assertNotNull(dataSource);
    }


}
