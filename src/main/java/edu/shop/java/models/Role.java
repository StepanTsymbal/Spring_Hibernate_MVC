package edu.shop.java.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="role")
public class Role extends Model{

	private static final long serialVersionUID = 1L;
	
	@NotNull
//	@Min(value=4)
	@Enumerated(EnumType.STRING)
	@Column(name="title", length=25, insertable=false, updatable=false)
	private RoleList title;
	
	@Column(name="description", length=255, insertable=false, updatable=false)	//this line is correct!
//	@Column(name="title", length=255, insertable=false, updatable=false)
	private String description;
	
	@ManyToMany(mappedBy="roles")
	private Set<User> users = new HashSet<>();
	
	public RoleList getTitle() {
		return title;
	}

	public void setTitle(RoleList title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Role(){
		super();
	}

	public Role(Long id){
		super(id);
	}
}
