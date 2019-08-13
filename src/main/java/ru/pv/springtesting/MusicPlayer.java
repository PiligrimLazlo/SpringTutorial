package ru.pv.springtesting;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
//	private Music music;
	
	private List<Music> musicList = new ArrayList<Music>();
	
	private String name;
	private int volume;

	//IoC
//	public MusicPlayer(List<Music> musicList) {
//		this.musicList = musicList;
//	}
	
//	public MusicPlayer() {
//		
//	}
	
	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;
	}
	
	public void playMusic() {
		musicList.forEach(item -> System.out.println("Playing: " + item.getSong()));
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
