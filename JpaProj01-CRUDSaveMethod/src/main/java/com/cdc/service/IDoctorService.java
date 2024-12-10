package com.cdc.service;

import com.cdc.entity.Doctor;

public interface IDoctorService {
	
	//For SAVE method
	public String registerDoctor(Doctor doctor);
	
	//For SAVEALL method
	public String registerGroupOfDoctors(Iterable <Doctor> doctors);
}
