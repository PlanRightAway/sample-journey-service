package com.planit.spftjourney.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.planit.journey_common.endpoint.JourneyServiceEndpoint;
import com.planit.journey_common.model.Journey;
import com.planit.journey_common.model.Medium;
import com.planit.journey_common.model.PlanCriteria;
import com.planit.journey_common.model.Point;
import com.planit.journey_common.model.RoutePointBean;

@RestController
public class SPFTJourneyController implements JourneyServiceEndpoint {

	// @Autowired
	// private JourneyService journeyService;
	Map<Point, List<Journey>> map = Map.of(
			new Point(0.0, 0.0, "some place", null), // ---->
			List.of(Journey.builder().sourcePoint(new Point(0.0, 0.0, "some place", null))
					.destinationPoint(new Point(1.0, 1.0, "new place", null)).durationInMillies(2 * 60 * 60 * 1000L)
					.startBufferTimeInMillies(0L).waitingTimeInMillies(15 * 60 * 1000L).startTimeInMillies(LocalDateTime.parse("2011-08-22T12:05:30").atZone(ZoneId.of("Asia/Kolkata")).toInstant().toEpochMilli()).endBufferTimeInMillies(0L)
					.travellingCost(100.0).travellingMedium(Medium.builder().type("walk").build()).build()),
			
			new Point(1.0, 1.0, "some place", null), // ---->
			List.of(Journey.builder().sourcePoint(new Point(1.0, 1.0, "some place", null))
					.destinationPoint(new Point(2.0, 2.0, "new place", null)).durationInMillies(2 * 60 * 60 * 1000L)
					.startBufferTimeInMillies(0L).waitingTimeInMillies(15 * 60 * 1000L).startTimeInMillies(LocalDateTime.parse("2011-08-22T14:20:30").atZone(ZoneId.of("Asia/Kolkata")).toInstant().toEpochMilli()).endBufferTimeInMillies(0L)
					.travellingCost(100.0).travellingMedium(Medium.builder().type("cab").build()).build(),
					Journey.builder().sourcePoint(new Point(1.0, 1.0, "some place", null))
					.destinationPoint(new Point(2.1, 2.1, "new place", null)).durationInMillies(2 * 60 * 60 * 1000L)
					.startBufferTimeInMillies(0L).waitingTimeInMillies(15 * 60 * 1000L).startTimeInMillies(LocalDateTime.parse("2011-08-22T14:20:30").atZone(ZoneId.of("Asia/Kolkata")).toInstant().toEpochMilli()).endBufferTimeInMillies(0L)
					.travellingCost(100.0).travellingMedium(Medium.builder().type("cab").build()).build()),
			
			new Point(2.0, 2.0, "some place", null), // ---->
			List.of(Journey.builder().sourcePoint(new Point(2.0, 2.0, "some place", null))
					.destinationPoint(new Point(3.0, 3.0, "new place", null)).durationInMillies(2 * 60 * 60 * 1000L)
					.startBufferTimeInMillies(0L).waitingTimeInMillies(15 * 60 * 1000L).startTimeInMillies(LocalDateTime.parse("2011-08-22T16:35:30").atZone(ZoneId.of("Asia/Kolkata")).toInstant().toEpochMilli()).endBufferTimeInMillies(0L)
					.travellingCost(100.0).travellingMedium(Medium.builder().type("flight").build()).build(),
					Journey.builder().sourcePoint(new Point(2.0, 2.0, "some place", null))
					.destinationPoint(new Point(5.0, 5.0, "new place", null)).durationInMillies(2 * 60 * 60 * 1000L)
					.startBufferTimeInMillies(0L).waitingTimeInMillies(15 * 60 * 1000L).startTimeInMillies(LocalDateTime.parse("2011-08-22T16:35:30").atZone(ZoneId.of("Asia/Kolkata")).toInstant().toEpochMilli()).endBufferTimeInMillies(0L)
					.travellingCost(100.0).travellingMedium(Medium.builder().type("bus").build()).build()),
			
			new Point(2.1, 2.1, "some place", null), // ---->
			List.of(Journey.builder().sourcePoint(new Point(2.1, 2.1, "some place", null))
					.destinationPoint(new Point(3.1, 3.1, "new place", null)).durationInMillies(2 * 60 * 60 * 1000L)
					.startBufferTimeInMillies(0L).waitingTimeInMillies(15 * 60 * 1000L).startTimeInMillies(LocalDateTime.parse("2011-08-22T18:50:30").atZone(ZoneId.of("Asia/Kolkata")).toInstant().toEpochMilli()).endBufferTimeInMillies(0L)
					.travellingCost(100.0).travellingMedium(Medium.builder().type("flight").build()).build()),
			
			new Point(3.0, 3.0, "some place", null), // ---->
			List.of(Journey.builder().sourcePoint(new Point(3.0, 3.0, "some place", null))
					.destinationPoint(new Point(4.0, 4.0, "new place", null)).durationInMillies(2 * 60 * 60 * 1000L)
					.startBufferTimeInMillies(0L).waitingTimeInMillies(10 * 60 * 1000L).startTimeInMillies(LocalDateTime.parse("2011-08-22T20:00:30").atZone(ZoneId.of("Asia/Kolkata")).toInstant().toEpochMilli()).endBufferTimeInMillies(0L)
					.travellingCost(100.0).travellingMedium(Medium.builder().type("metro").build()).build()),
			
			new Point(3.1, 3.1, "some place", null), // ---->
			List.of(Journey.builder().sourcePoint(new Point(3.1, 3.1, "some place", null))
					.destinationPoint(new Point(4.0, 4.0, "new place", null)).durationInMillies(2 * 60 * 60 * 1000L)
					.startBufferTimeInMillies(0L).waitingTimeInMillies(15 * 60 * 1000L).startTimeInMillies(LocalDateTime.parse("2011-08-22T20:00:30").atZone(ZoneId.of("Asia/Kolkata")).toInstant().toEpochMilli()).endBufferTimeInMillies(0L)
					.travellingCost(100.0).travellingMedium(Medium.builder().type("bus").build()).build()),
			
			new Point(4.0, 4.0, "some place", null), // ---->
			List.of(Journey.builder().sourcePoint(new Point(4.0, 4.0, "some place", null))
					.destinationPoint(new Point(5.0, 5.0, "new place", null)).durationInMillies(2 * 60 * 60 * 1000L)
					.startBufferTimeInMillies(0L).waitingTimeInMillies(15 * 60 * 1000L).startTimeInMillies(LocalDateTime.parse("2011-08-22T22:15:30").atZone(ZoneId.of("Asia/Kolkata")).toInstant().toEpochMilli()).endBufferTimeInMillies(0L)
					.travellingCost(100.0).travellingMedium(Medium.builder().type("walk").build()).build())
			);

	@Override
	public List<Journey> getJourneyRoutePoints(@RequestBody RoutePointBean routePointBean, @RequestParam Long planId) {
		// return journeyService.getJourneyRoutePoints(routePointBean, planId);
		return map.get(routePointBean.getPoint());
	}

	@Override
	public void registerPlan(@RequestParam Long planId, @RequestBody PlanCriteria planCriteria) {
		// journeyService.registerPlan(planId, planCriteria);
	}

}
