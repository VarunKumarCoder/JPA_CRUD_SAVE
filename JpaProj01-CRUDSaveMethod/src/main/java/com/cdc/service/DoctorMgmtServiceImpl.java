package com.cdc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cdc.entity.Doctor;
import com.cdc.repository.IDoctorRepo;

public class DoctorMgmtServiceImpl implements IDoctorService {
	
	@Autowired
	private IDoctorRepo doctorRepo;
	@Override
	public String registerDoctor(Doctor doctor) {
		Doctor doc=doctorRepo.save(doctor);
		return "Doctor Id is saved with"+doc.getDocId();
	}

}
