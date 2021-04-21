package com.iptech.chatapplication.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.iptech.chatapplication.dto.Channel;

@Component
public class ChannelRepository {
	private List<Channel> channels = new ArrayList<>();
	
	public ChannelRepository () {
		Channel general = new Channel();
		general.setChannelId(1L);
		general.setName("General");
		
		channels.add(general);
	}
	public Optional<Channel> findById (Long channelId) {
		return channels.stream()
					   .filter(channel -> channel.getChannelId().equals(channelId))
					   .findAny();
	}
	public List<Channel> findAll() {
		return channels;
	}
}
