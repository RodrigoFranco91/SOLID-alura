package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeReajuste implements ValidacaoReajuste{
	
	public void validar(Funcionario funcionario, BigDecimal aumento)  {
		
		BigDecimal salarioAtual = funcionario.getDadosPessoais().getSalario();
				
		LocalDate dateUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now(); 
		Long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dateUltimoReajuste, dataAtual);
		
		if (mesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser no minimo de 6 meses");
		}
		
	}

}
