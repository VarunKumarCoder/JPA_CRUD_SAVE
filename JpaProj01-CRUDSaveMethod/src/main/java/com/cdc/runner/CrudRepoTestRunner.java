package com.cdc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cdc.entity.Doctor;
import com.cdc.service.IDoctorService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	
	@Autowired
	private IDoctorService doctorService;
	
	@Override
	public void run(String... args) throws Exception {
		
		//For SAVE METHOD
		/*
		 * Doctor doctor=new Doctor(); doctor.setDocName("Kumar");
		 * doctor.setIncome(300000.0); doctor.setSpecialiization("Sensology"); String
		 * resultMsg=doctorService.registerDoctor(doctor);
		 * System.out.println(resultMsg);
		 */
		
		//For SAVEALL Method
		try {
			List<Doctor> list=List.of(new Doctor("Meda","Dentist",4000000.0), 
									  new Doctor("Upendra","Chemist",5000000.0),
									  new Doctor("Kumar","Neurology",6000000.0));
			String result=doctorService.registerGroupOfDoctors(list);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();		}
		
	}

}
