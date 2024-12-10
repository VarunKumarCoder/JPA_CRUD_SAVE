package com.cdc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="SPRINGJPA_DOCTOR_INFO")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer docId;
	@Column(name="DOC_NAME", length=25)
	@NonNull
	private String docName;
	@NonNull
	@Column(name="SPECIALiZATION",length = 30)
	private String specialiization;
	@NonNull
	@Column(name="INCOME")
	private Double income;
}
