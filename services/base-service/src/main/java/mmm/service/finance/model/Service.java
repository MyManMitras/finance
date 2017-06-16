package mmm.service.finance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SERVICE")
public class Service {
	
	@Id
	@SequenceGenerator(name = "SERVICE_ID", sequenceName = "SERVICE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SERVICE_ID")
	private Long id;
	
	@Column(nullable=false, name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public boolean equals(Object obj) {
		Service objRole = (Service)obj;
		if(this.name.equals(objRole.getName()))
			return true;
		return false;
	}
}
