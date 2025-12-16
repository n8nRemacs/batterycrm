package com.yandex.mapkit.transport.bicycle.internal;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.transport.bicycle.ConstructionSegment;
import com.yandex.mapkit.transport.bicycle.Flags;
import com.yandex.mapkit.transport.bicycle.Leg;
import com.yandex.mapkit.transport.bicycle.RestrictedEntry;
import com.yandex.mapkit.transport.bicycle.Route;
import com.yandex.mapkit.transport.bicycle.Section;
import com.yandex.mapkit.transport.bicycle.TrafficTypeSegment;
import com.yandex.mapkit.transport.bicycle.ViaPoint;
import com.yandex.mapkit.transport.bicycle.WayPoint;
import com.yandex.mapkit.transport.bicycle.Weight;
import com.yandex.mapkit.uri.UriObjectMetadata;
import com.yandex.runtime.NativeObject;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class RouteBinding implements Route {
    private final NativeObject nativeObject;

    public RouteBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @N
    public native List<ConstructionSegment> getConstructions();

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @P
    public native Flags getFlags();

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @N
    public native Polyline getGeometry();

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @N
    public native List<Leg> getLegs();

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @N
    public native List<RestrictedEntry> getRestrictedEntries();

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @P
    public native String getRouteId();

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @N
    public native List<Section> getSections();

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @N
    public native List<TrafficTypeSegment> getTrafficTypes();

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @N
    public native UriObjectMetadata getUriMetadata();

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @N
    public native List<ViaPoint> getViaPoints();

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @N
    public native List<WayPoint> getWayPoints();

    @Override // com.yandex.mapkit.transport.bicycle.Route
    @N
    public native Weight getWeight();
}
