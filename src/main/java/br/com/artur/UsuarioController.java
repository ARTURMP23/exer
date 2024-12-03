package br.com.artur;

import jakarta.annotation.ManagedBean;


@ManagedBean
public class UsuarioController {

    private Usuario usuario = new Usuario();
    private UsuarioService service = new UsuarioService();

    public void salvar() {
        service.cadastrarUsuario(usuario);
        usuario = new Usuario(); // Limpa os campos após salvar
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}


