package me.hyewonj.accounts;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * @author hyewonjo
 */
@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public Account createAccount(AccountDto.Create dto) {
        Account account = modelMapper.map(dto, Account.class);

        // TODO 유효한 username인지 판단
        String username = dto.getUsername();
        if (repository.findByUsername(username) != null) {
            throw new UserDuplicatedException(username);
        }

        // TODO password 해싱

        Date now = new Date();
        account.setJoined(now);
        account.setUpdated(now);
        return repository.save(account);
    }
}
