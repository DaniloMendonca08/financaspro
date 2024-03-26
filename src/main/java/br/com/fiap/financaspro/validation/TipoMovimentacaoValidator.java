package br.com.fiap.financaspro.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TipoMovimentacaoValidator implements ConstraintValidator<TipoMovimentacao, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.equals("ENTRADA") || value.equals("SAIDA"); //ele ira retornar verdadeiro caso o value seja igual a ENTRADA ou SAIDA, caso nao seja, retornará falso        
    }
    
}
