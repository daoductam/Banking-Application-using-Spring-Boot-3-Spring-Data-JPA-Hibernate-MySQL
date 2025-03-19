package com.tamdao.banking.repository;

import com.tamdao.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository  extends JpaRepository<Account, Long> {
}
