package com.cdc.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdc.entity.Doctor;
import com.cdc.repository.IDoctorRepo;

@Service("doctorService")
public class DoctorMgmtServiceImpl implements IDoctorService {
	
	@Autowired
	private IDoctorRepo doctorRepo;
	@Override
	public String registerDoctor(Doctor doctor) {
		Doctor doc=doctorRepo.save(doctor);
		return "Doctor Id is saved with"+doc.getDocId();
	}
	@Override
	public String registerGroupOfDoctors(Iterable<Doctor> doctors) {
		if(doctors!=null) {
			Iterable<Doctor> savedDoctors=doctorRepo.saveAll(doctors);//recieve rows from runner class and saves
			int size=((Collection)savedDoctors).size();//saved rows size
			List<Integer> list=new ArrayList();//Received rows are converted into List
			savedDoctors.forEach(d->{
				list.add(d.getDocId());//List is added into docid forEach iterates all rows
			});	
			return size+" Number of Doctors are saved with ID values "+list.toString();
		}
		else {
			throw new IllegalArgumentException("Invalid Doctors Info");
		}
		
	}

}
