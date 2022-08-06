package com.planit.spftjourney.bean;

import com.planit.journey_common.model.Point;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class JourneyMeta {
	
	private Point destinationPoint;
	private Integer costWeightage;
	private Integer timeWeightage;
}
