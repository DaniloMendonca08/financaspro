package br.com.fiap.financaspro.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Movimentacao {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Descrição é obrigatória")
    @Size(min = 3, max = 255, message = "Descrição deve ter pelo menos 3 caracteres")
    private String descricao;

    @Positive(message = "O valor deve ser positivo") //validar para que o número tenha q ser obrigatoriamente positivo
    private BigDecimal valor;

    //@PastOrPresent
    private LocalDate data;

    //@TipoMovimentacao
    private String tipo; //entrada ou saída de dinheiro
}
