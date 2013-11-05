package br.com.caelum.goodbuy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class ProdutoDao {
	
	
	private final Session session;

	public ProdutoDao(Session session) {
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	public List<Produto> listaTudo() {
		return this.session.createCriteria(Produto.class).list();
	}
	
	public void salva(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.save(produto);
		tx.commit();
	}
	
	public Produto carrega(Long id) {
		return (Produto) this.session.load(Produto.class, id);
	}
	
	public void atualiza(Produto produto) {
		Transaction tx = session.beginTransaction();
		this.session.update(produto);
		tx.commit();
	}
	
	public void remove(Produto produto) {
		Transaction tx = session.beginTransaction();
		this.session.delete(produto);
		tx.commit();
	}
	/*public void atualiza(String nome, String descricao, Double preco) {       //usado no exemplo teste
	Produto produto = (Produto) session.load(Produto.class, 1L);
	Transaction tx = session.beginTransaction();
	produto.setNome(nome);
	produto.setDescricao(descricao);
	produto.setPreco(preco);
	session.update(produto);
	tx.commit();
}*/

}

