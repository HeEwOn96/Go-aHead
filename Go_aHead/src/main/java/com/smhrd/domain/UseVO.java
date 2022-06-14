package com.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UseVO {
	
	private int use_number;
	private int kick_using;
	private String kick_number;
	private String hel_number;
	private String mem_id;
	private String start_time;
	private String start_loc_lat;
	private String start_loc_long;
	private String end_loc_lat;
	private String end_loc_long;
	
	public UseVO(String kick_number, String hel_number, String mem_id, String start_loc_lat, String start_loc_long) {
		this.kick_number = kick_number;
		this.hel_number = hel_number;
		this.mem_id = mem_id;
		this.start_loc_lat = start_loc_lat;
		this.start_loc_long = start_loc_long;
	}

	public UseVO(int use_number, String end_loc_lat, String end_loc_long) {
		this.use_number = use_number;
		this.end_loc_lat = end_loc_lat;
		this.end_loc_long = end_loc_long;
	}
}
