package com.carro.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carro.service.entity.Carro;
import com.carro.service.repository.CarroRepository;

@Service
public class CarroService {
	@Autowired
	private CarroRepository carroRepository;
	
	public List<Carro>getALl(){
		return (List<Carro>) carroRepository.findAll();
	}
	
	public Carro getCarroById(int id) {
		return carroRepository.findById(id).orElseThrow();
	}
	
	public Carro save(Carro carro) {
		Carro carroNuenvo = carroRepository.save(carro);
		return carroNuenvo;
	}
	
	public List<Carro>findByUsuarioId(int usuarioId){
		return carroRepository.findByUsuarioId(usuarioId);
	}
}

//https://www.youtube.com/watch?v=icTg6iTqpUk
// 43:34
