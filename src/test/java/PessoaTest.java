import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarImpostoPessoaFisica() {
        PessoaFisica pessoaFisica = new PessoaFisica("12345678910");
        pessoaFisica.setIncome(1000);
        assertEquals("Imposto para Pessoa Física (12345678910): 100.0.", pessoaFisica.taxReport());
    }

    @Test
    void deveRetornarImpostoPessoaJuridicaPequena() {
        PessoaJuridica pessoaJuridica = new PessoaJuridica("12345678910");
        pessoaJuridica.setIncome(999.99f);
        assertEquals("Imposto para Pessoa Jurídica (12345678910, pequena): 49.9995.", pessoaJuridica.taxReport());
    }

    @Test
    void deveRetornarImpostoPessoaJuridicaMedia() {
        PessoaJuridica pessoaJuridica = new PessoaJuridica("12345678910");
        pessoaJuridica.setIncome(9999.99f);
        assertEquals("Imposto para Pessoa Jurídica (12345678910, média): 999.999.", pessoaJuridica.taxReport());
    }

    @Test
    void deveRetornarImpostoPessoaJuridicaGrande() {
        PessoaJuridica pessoaJuridica = new PessoaJuridica("12345678910");
        pessoaJuridica.setIncome(10000.0f);
        assertEquals("Imposto para Pessoa Jurídica (12345678910, grande): 1500.0.", pessoaJuridica.taxReport());
    }


}