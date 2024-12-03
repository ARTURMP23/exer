package br.com.artur;

public class UsuarioService {

    private UsuarioRepository repository = new UsuarioRepository();

    public void cadastrarUsuario(Usuario usuario) {
        if (usuario.getNome() == null || usuario.getNome().isBlank()) {
            throw new IllegalArgumentException("O nome é obrigatório!");
        }
        if (usuario.getEmail() == null || usuario.getEmail().isBlank()) {
            throw new IllegalArgumentException("O email é obrigatório!");
        }
        repository.salvar(usuario);
    }
}

