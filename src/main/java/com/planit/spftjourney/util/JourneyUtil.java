package com.planit.spftjourney.util;

import com.planit.journey_common.model.Journey;
import com.planit.spftjourney.bean.JourneyMeta;

public interface JourneyUtil {

	static Journey weightify(JourneyMeta journeyMeta, Journey j) {
		j.setJourneyWeight((j.getWaitingTimeInMillies() + j.getDurationInMillies()) * journeyMeta.getTimeWeightage()
				+ j.getTravellingCost() * journeyMeta.getCostWeightage());
		return j;
	}

	static boolean isEligible(Journey j, JourneyMeta journeyMeta) {
		// TODO Auto-generated method stub
		return true;
	}

}
