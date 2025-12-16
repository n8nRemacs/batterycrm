package com.yandex.mapkit.transport.masstransit;

import AK.c;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class RouteMetadata implements BaseMetadata, Serializable {
    private List<ComfortTag> comfortTags;
    private boolean comfortTags__is_initialized;
    private TravelEstimation estimation;
    private boolean estimation__is_initialized;
    private Flags flags;
    private boolean flags__is_initialized;
    private NativeObject nativeObject;
    private String routeId;
    private boolean routeId__is_initialized;
    private RouteSettings settings;
    private boolean settings__is_initialized;
    private List<WayPoint> wayPoints;
    private boolean wayPoints__is_initialized;
    private Weight weight;
    private boolean weight__is_initialized;

    public RouteMetadata() {
        this.weight__is_initialized = false;
        this.settings__is_initialized = false;
        this.estimation__is_initialized = false;
        this.wayPoints__is_initialized = false;
        this.routeId__is_initialized = false;
        this.flags__is_initialized = false;
        this.comfortTags__is_initialized = false;
    }

    private native List<ComfortTag> getComfortTags__Native();

    private native TravelEstimation getEstimation__Native();

    private native Flags getFlags__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RouteMetadata";
    }

    private native String getRouteId__Native();

    private native RouteSettings getSettings__Native();

    private native List<WayPoint> getWayPoints__Native();

    private native Weight getWeight__Native();

    private native NativeObject init(Weight weight, RouteSettings routeSettings, TravelEstimation travelEstimation, List<WayPoint> list, String str, Flags flags, List<ComfortTag> list2);

    @N
    public synchronized List<ComfortTag> getComfortTags() {
        try {
            if (!this.comfortTags__is_initialized) {
                this.comfortTags = getComfortTags__Native();
                this.comfortTags__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.comfortTags;
    }

    @P
    public synchronized TravelEstimation getEstimation() {
        try {
            if (!this.estimation__is_initialized) {
                this.estimation = getEstimation__Native();
                this.estimation__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.estimation;
    }

    @P
    public synchronized Flags getFlags() {
        try {
            if (!this.flags__is_initialized) {
                this.flags = getFlags__Native();
                this.flags__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.flags;
    }

    @P
    public synchronized String getRouteId() {
        try {
            if (!this.routeId__is_initialized) {
                this.routeId = getRouteId__Native();
                this.routeId__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.routeId;
    }

    @P
    public synchronized RouteSettings getSettings() {
        try {
            if (!this.settings__is_initialized) {
                this.settings = getSettings__Native();
                this.settings__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.settings;
    }

    @N
    public synchronized List<WayPoint> getWayPoints() {
        try {
            if (!this.wayPoints__is_initialized) {
                this.wayPoints = getWayPoints__Native();
                this.wayPoints__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.wayPoints;
    }

    @N
    public synchronized Weight getWeight() {
        try {
            if (!this.weight__is_initialized) {
                this.weight = getWeight__Native();
                this.weight__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getWeight(), false, (Class<Archive>) Weight.class);
            archive.add((Archive) getSettings(), true, (Class<Archive>) RouteSettings.class);
            archive.add((Archive) getEstimation(), true, (Class<Archive>) TravelEstimation.class);
            archive.add((List) getWayPoints(), false, (ArchivingHandler) new ClassHandler(WayPoint.class));
            archive.add(getRouteId(), true);
            archive.add((Archive) getFlags(), true, (Class<Archive>) Flags.class);
            archive.add((List) getComfortTags(), false, (ArchivingHandler) new EnumHandler(ComfortTag.class));
            return;
        }
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        this.settings = (RouteSettings) archive.add((Archive) this.settings, true, (Class<Archive>) RouteSettings.class);
        this.settings__is_initialized = true;
        this.estimation = (TravelEstimation) archive.add((Archive) this.estimation, true, (Class<Archive>) TravelEstimation.class);
        this.estimation__is_initialized = true;
        this.wayPoints = c.x(WayPoint.class, archive, this.wayPoints, false);
        this.wayPoints__is_initialized = true;
        this.routeId = archive.add(this.routeId, true);
        this.routeId__is_initialized = true;
        this.flags = (Flags) archive.add((Archive) this.flags, true, (Class<Archive>) Flags.class);
        this.flags__is_initialized = true;
        List<ComfortTag> listAdd = archive.add((List) this.comfortTags, false, (ArchivingHandler) new EnumHandler(ComfortTag.class));
        this.comfortTags = listAdd;
        this.comfortTags__is_initialized = true;
        this.nativeObject = init(this.weight, this.settings, this.estimation, this.wayPoints, this.routeId, this.flags, listAdd);
    }

    public RouteMetadata(@N Weight weight, @P RouteSettings routeSettings, @P TravelEstimation travelEstimation, @N List<WayPoint> list, @P String str, @P Flags flags, @N List<ComfortTag> list2) {
        this.weight__is_initialized = false;
        this.settings__is_initialized = false;
        this.estimation__is_initialized = false;
        this.wayPoints__is_initialized = false;
        this.routeId__is_initialized = false;
        this.flags__is_initialized = false;
        this.comfortTags__is_initialized = false;
        if (weight == null) {
            throw new IllegalArgumentException("Required field \"weight\" cannot be null");
        }
        if (list == null) {
            throw new IllegalArgumentException("Required field \"wayPoints\" cannot be null");
        }
        if (list2 != null) {
            this.nativeObject = init(weight, routeSettings, travelEstimation, list, str, flags, list2);
            this.weight = weight;
            this.weight__is_initialized = true;
            this.settings = routeSettings;
            this.settings__is_initialized = true;
            this.estimation = travelEstimation;
            this.estimation__is_initialized = true;
            this.wayPoints = list;
            this.wayPoints__is_initialized = true;
            this.routeId = str;
            this.routeId__is_initialized = true;
            this.flags = flags;
            this.flags__is_initialized = true;
            this.comfortTags = list2;
            this.comfortTags__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"comfortTags\" cannot be null");
    }

    private RouteMetadata(NativeObject nativeObject) {
        this.weight__is_initialized = false;
        this.settings__is_initialized = false;
        this.estimation__is_initialized = false;
        this.wayPoints__is_initialized = false;
        this.routeId__is_initialized = false;
        this.flags__is_initialized = false;
        this.comfortTags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
