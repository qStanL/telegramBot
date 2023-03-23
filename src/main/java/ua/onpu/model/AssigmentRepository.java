package ua.onpu.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigmentRepository extends CrudRepository<Assigment, Long> {

    List<Assigment> findAllByUserChatId(Long chatId);

}