package com.yandex.mapkit.transport.bicycle;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.uri.UriObjectMetadata;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public interface Route {
    @N
    List<ConstructionSegment> getConstructions();

    @P
    Flags getFlags();

    @N
    Polyline getGeometry();

    @N
    List<Leg> getLegs();

    @N
    List<RestrictedEntry> getRestrictedEntries();

    @P
    String getRouteId();

    @N
    List<Section> getSections();

    @N
    List<TrafficTypeSegment> getTrafficTypes();

    @N
    UriObjectMetadata getUriMetadata();

    @N
    List<ViaPoint> getViaPoints();

    @N
    List<WayPoint> getWayPoints();

    @N
    Weight getWeight();
}
