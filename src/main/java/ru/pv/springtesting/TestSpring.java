package ru.pv.springtesting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		 ClassicalMusic music = context.getBean("musicBean1", ClassicalMusic.class);
		 System.out.println(music.getSong());
		 
		// MusicPlayer musicPlayer = new MusicPlayer(music);
		
//		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		musicPlayer.playMusic();
//		
//		System.out.println(musicPlayer.getName());
//		System.out.println(musicPlayer.getVolume());
		
		context.close();
		
	}
}
