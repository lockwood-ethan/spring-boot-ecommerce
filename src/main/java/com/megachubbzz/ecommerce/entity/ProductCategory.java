package com.megachubbzz.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_category")
@Getter
@Setter
public class ProductCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long Id;
	@Column(name = "category_name")
	public String categoryName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	public Set<Product> products;
}
