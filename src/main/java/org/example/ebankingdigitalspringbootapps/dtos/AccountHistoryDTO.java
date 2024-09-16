package org.example.ebankingdigitalspringbootapps.dtos;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import org.example.ebankingdigitalspringbootapps.enums.OperationType;

import java.util.List;

@Data
public class AccountHistoryDTO {
    private String AccountId;
    private double Balance;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    private int CurrentPage;
    private int PageSize;
    private int TotalPages;
    private List<AccountOperationDTO> accountOperationDTOS;


}
