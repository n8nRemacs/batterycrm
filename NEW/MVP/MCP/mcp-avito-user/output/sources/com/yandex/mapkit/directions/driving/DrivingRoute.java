package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.annotations.AnnotationLanguage;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.mapkit.navigation.RoutePosition;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public interface DrivingRoute {
    void addConditionsListener(@N ConditionsListener conditionsListener);

    @P
    AnnotationLanguage getAnnotationLanguage();

    @N
    List<Checkpoint> getCheckpoints();

    @N
    List<DirectionSign> getDirectionSigns();

    @N
    List<Event> getEvents();

    @N
    List<Ferry> getFerries();

    @N
    List<FordCrossing> getFordCrossings();

    @N
    Polyline getGeometry();

    @N
    List<Highway> getHighways();

    @N
    List<JamSegment> getJamSegments();

    @N
    List<LaneSign> getLaneSigns();

    int getLegIndex();

    @N
    List<ManoeuvreVehicleRestriction> getManoeuvreVehicleRestrictions();

    @N
    DrivingRouteMetadata getMetadata();

    @N
    List<PedestrianCrossing> getPedestrianCrossings();

    @N
    PolylinePosition getPosition();

    @N
    List<RailwayCrossing> getRailwayCrossings();

    @P
    List<RequestPoint> getRequestPoints();

    @N
    List<RestrictedEntry> getRestrictedEntries();

    @N
    List<RestrictedTurn> getRestrictedTurns();

    @N
    List<RoadVehicleRestriction> getRoadVehicleRestrictions();

    @N
    String getRouteId();

    @N
    RoutePosition getRoutePosition();

    @N
    List<RuggedRoad> getRuggedRoads();

    @N
    List<DrivingSection> getSections();

    @N
    List<SpeedBump> getSpeedBumps();

    @N
    List<Float> getSpeedLimits();

    @N
    List<TollRoad> getTollRoads();

    @N
    List<TrafficLight> getTrafficLights();

    @N
    List<Tunnel> getTunnels();

    @N
    VehicleOptions getVehicleOptions();

    @N
    List<PolylinePosition> getWayPoints();

    @N
    List<ZoneCrossing> getZoneCrossings();

    boolean isAreConditionsOutdated();

    @N
    DrivingRouteMetadata metadataAt(@N PolylinePosition polylinePosition);

    void removeConditionsListener(@N ConditionsListener conditionsListener);

    void requestConditionsUpdate();

    int sectionIndex(int i12);

    void setLegIndex(int i12);

    void setPosition(@N PolylinePosition polylinePosition);
}
