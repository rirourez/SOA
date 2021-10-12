package com.ryadh.voitures;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ryadh.voitures.entities.Voiture;
import com.ryadh.voitures.repos.VoitureRepository;

@SpringBootTest
class VoituresApplicationTests {

	@Autowired
	private VoitureRepository voitureRepository;
	
	@Test
	public void testCreateVoiture() {
	Voiture v = new Voiture("Ford","Mustang", 78200.500,new Date());
	voitureRepository.save(v);
	}

	@Test
	public void testFindVoiture()
	{
		Voiture v = voitureRepository.findById(1L).get();
	System.out.println(v);
	}
	
	@Test
	public void testUpdateVoiture()
	{
		Voiture v = voitureRepository.findById(1L).get();
		v.setPrixVoiture(5000.0);
		voitureRepository.save(v);
		
	}
	
	@Test
	public void testDeleteVoiture()
	{
		voitureRepository.deleteById(1L);
	}
	
	@Test
	public void testListerTousVoitures()
	{
		List<Voiture> voit = voitureRepository.findAll();
			for (Voiture v : voit)
			{
				System.out.println(v);
			}
		
	}
}

