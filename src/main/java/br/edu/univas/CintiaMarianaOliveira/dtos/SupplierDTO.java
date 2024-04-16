package br.edu.univas.CintiaMarianaOliveira.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class SupplierDTO {
	private int cnpj;
	private String name;
	private Date lastBuyDate;
	private float qualityRate;
	private float probabilityNewDeals;
	
	

}
