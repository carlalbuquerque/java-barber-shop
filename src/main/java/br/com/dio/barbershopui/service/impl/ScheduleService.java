package br.com.dio.barbershopui.service.impl;

import br.com.dio.barbershopui.entity.ScheduleEntity;
import br.com.dio.barbershopui.repository.IScheduleRepository;
import br.com.dio.barbershopui.service.IScheduleService;
import br.com.dio.barbershopui.service.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());

        return repository.save(entity);
    }

    @Override
    public void delete(long id) {
        Optional<ScheduleEntity> schedule = repository.findById(id);
        if (!schedule.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Agendamento não encontrado");
        }
        repository.deleteById(id);
    }
}
