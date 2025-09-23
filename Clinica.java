public class Clinica {

    public static class Paciente {
        public long id;
        public String nome;
        public String email;
        public String telefone;
        public Long dataNascimento;
        public Long grupoSanguineo;
        public String sexo;
        public String cep;
        public String endereco;
        public String cidade;
        public String estado;

        public Paciente(long id, String nome, String email, String telefone, Long dataNascimento, Long grupoSanguineo,
                String sexo, String cep, String endereco, String cidade, String estado) {
            this.id = id;
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            this.dataNascimento = dataNascimento;
            this.grupoSanguineo = grupoSanguineo;
            this.sexo = sexo;
            this.cep = cep;
            this.endereco = endereco;
            this.cidade = cidade;
            this.estado = estado;
        }

        @Override
        public String toString() {
            return "Paciente:" + "\n" +
                    "id             = " + id + "\n" +
                    "nome           = " + nome + "\n" +
                    "email          = " + email + "\n" +
                    "telefone       = " + telefone + "\n" +
                    "dataNascimento = " + dataNascimento + "\n" +
                    "grupoSanguineo = " + grupoSanguineo + "\n" +
                    "sexo           = " + sexo + "\n" +
                    "cep            = " + cep + "\n" +
                    "endereco       = " + endereco + "\n" +
                    "cidade         = " + cidade + "\n" +
                    "estado         = " + estado + "\n" +
                    "\n";
        }

    }


    public static class Atendimento {
        public long id;
        public String data;
        public String hora;
        public double valor;
        public String status;
        public String observacao;

        public Atendimento(long id, String data, String hora, double valor, String status, String observacao) {
            this.id = id;
            this.data = data;
            this.hora = hora;
            this.valor = valor;
            this.status = status;
            this.observacao = observacao;
        }

        @Override
        public String toString() {
            return "Atendimento:" + "\n" +
                    "id         = " + id + "\n" +
                    "data       = " + data + "\n" +
                    "hora       = " + hora + "\n" +
                    "valor      = " + valor + "\n" +
                    "status     = " + status + "\n" +
                    "observacao = " + observacao + "\n" +
                    "\n";
        }
    }

    public static class Profissional {
        public long id;
        public String nome;
        public String registroConselho;
        public String email;
        public String telefone;

        public Profissional(long id, String nome, String registroConselho, String email, String telefone) {
            this.id = id;
            this.nome = nome;
            this.registroConselho = registroConselho;
            this.email = email;
            this.telefone = telefone;
        }

        @Override
        public String toString() {
            return "Profissional:" + "\n" +
                    "id               = " + id + "\n" +
                    "nome             = " + nome + "\n" +
                    "registroConselho = " + registroConselho + "\n" +
                    "email            = " + email + "\n" +
                    "telefone         = " + telefone + "\n" +
                    "\n";
        }
    }

    public static class Usuario {
        public long id;
        public String nomeCompleto;
        public String nomeUsuario;
        public String senha;
        public Boolean ativo;
        public String papel;

        public Usuario(long id, String nomeCompleto, String nomeUsuario, String senha, Boolean ativo, String papel) {
            this.id = id;
            this.nomeCompleto = nomeCompleto;
            this.nomeUsuario = nomeUsuario;
            this.senha = senha;
            this.ativo = ativo;
            this.papel = papel;
        }

        @Override
        public String toString() {
            return "Atendimento:" + "\n" +
                    "id           = " + id + "\n" +
                    "nomeCompleto = " + nomeCompleto + "\n" +
                    "nomeUsuario  = " + nomeUsuario + "\n" +
                    "senha        = " + senha + "\n" +
                    "ativo        = " + ativo + "\n" +
                    "papel        = " + papel + "\n" +
                    "\n";
        }
    }

    public static class Convenio {
        public long id;
        public String nome;
        public String razaoSocial;
        public String cnpj;
        public String representante;
        public String email;
        public String telefone;
        public Boolean ativo;

        public Convenio(Long id, String nome, String razaoSocial, String cnpj, String representante, String email,
                String telefone, Boolean ativo) {
            this.id = id;
            this.nome = nome;
            this.razaoSocial = razaoSocial;
            this.cnpj = cnpj;
            this.representante = representante;
            this.email = email;
            this.telefone = telefone;
            this.ativo = ativo;
        }

        @Override
        public String toString() {
            return "Convenio:" + "\n" +
                    "id            = " + id + "\n" +
                    "nome          = " + nome + "\n" +
                    "razaoSocial   = " + razaoSocial + "\n" +
                    "cnpj          = " + cnpj + "\n" +
                    "representante = " + representante + "\n" +
                    "email         = " + email + "\n" +
                    "telefone      = " + telefone + "\n" +
                    "ativo         = " + ativo + "\n" +
                    "\n";
        }
    }

    public static class Unidade {
        public long id;
        public String nome;
        public String endereco;

        public Unidade(Long id, String nome, String endereco) {
            this.id = id;
            this.nome = nome;
            this.endereco = endereco;
        }

        @Override
        public String toString() {
            return "Unidade:" + "\n" +
                    "id       = " + id + "\n" +
                    "nome     = " + nome + "\n" +
                    "endereco = " + endereco + "\n" +
                    "\n";
        }
    }

    public static class Especialidade {
        public long id;
        public String nome;

        public Especialidade (Long id, String nome) {
            this.id = id;
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Unidade:" + "\n" +
                    "id       = " + id + "\n" +
                    "nome     = " + nome + "\n" +
                    "\n";
        }
    }

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(1L, "nome1", "email1", "telefone1", 01012000L, 1L, "sexo1", "cep1", "endereço1", "cidade1", "estado1");
        System.out.println(paciente1);

        Atendimento atendimento1 = new Atendimento(2L, "data2", "hora2", 2.0, "status2", "obserrvação2");
        System.out.println(atendimento1);

        Profissional profissional1 = new Profissional(3L, "nome3", "Registro Conselho3", "email3", "telefone3");
        System.out.println(profissional1);

        Usuario usuario1 = new Usuario(4L, "Nome Completo4", "Nome Usuario4", "Senha4", null, "papel4");
        System.out.println(usuario1);

        Convenio convenio1 = new Convenio(5L, "Nome5", "Razão Social5", "CNPJ5", "Representante5", "Email5", "Telefone5", null);
        System.out.println(convenio1);

        Unidade unidade1 = new Unidade(6L, "Nome6", "Endereço6");
        System.out.println(unidade1);
        
        Especialidade especialidade1 = new Especialidade(7L, "Nome7");
        System.out.println(especialidade1);
    }

}
