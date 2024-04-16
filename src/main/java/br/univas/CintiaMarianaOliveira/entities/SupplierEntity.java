package br.univas.CintiaMarianaOliveira.entities;

import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter @Setter
@ToString

public class SupplierEntity implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cnpj;
	private String name;
	private Date lastBuyDate;
	private float qualityRate;
	private float probabilityNewDeals;
	private boolean active;

}
