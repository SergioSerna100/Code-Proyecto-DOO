package co.edu.uco.ucobet.entity;

import co.edu.uco.crosscutting.helpers.UUIDHelper;
import java.util.UUID;

class DomainEntity 
{
	private UUID id;
	
	protected DomainEntity(final UUID id) {
		setId(id);
	}

	protected UUID getId() {
		return id;
	}

	protected void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}
}