package edu.shop.java.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_category")
public class ProductCategory extends Model{

	private static final long serialVersionUID = 1L;
	
	@Column(name="title", length=50)
	private String title;
	
	@OneToMany(mappedBy="productCategory", cascade=CascadeType.ALL, orphanRemoval=true)
	private Set<Product> products = new HashSet<>();
	
	public String getTitle() {
		return title;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ProductCategory(){
		super();
	}
	
	public ProductCategory(Long id){
		super(id);
	}

}
