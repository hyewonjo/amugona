package me.hyewonj.accounts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hyewonjo
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
