package co.edu.co.ucobet.data.dao;

import java.util.UUID;

import co.edu.uco.ucobet.entity.CityEntity;

public interface CityDAO extends CreateDAO<CityEntity>, UptadeDAO<CityEntity>, DeleteDAO<UUID>, RetrieveDAO <CityEntity, UUID> {

}
