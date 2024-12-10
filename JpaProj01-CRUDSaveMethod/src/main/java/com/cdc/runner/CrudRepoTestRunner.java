package com.cdc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.cdc.entity.Doctor;
import com.cdc.service.IDoctorService;

public class CrudRepoTestRunner implements CommandLineRunner {
	
	@Autowired
	private IDoctorService doctorService;
	
	@Override
	public void run(String... args) throws Exception {
		Doctor doctor=new Doctor();
		doctor.setDocName("Varun");
		doctor.setIncome(200000.0);
		doctor.setSpecialiization("Cardiology");
		String resultMsg=doctorService.registerDoctor(doctor);
		System.out.println(resultMsg);

	}

}
