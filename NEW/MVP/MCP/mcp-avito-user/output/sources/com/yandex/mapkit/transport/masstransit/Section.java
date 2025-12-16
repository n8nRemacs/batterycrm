package com.yandex.mapkit.transport.masstransit;

import AK.c;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class Section implements Serializable {
    private Subpolyline geometry;
    private boolean geometry__is_initialized;
    private SectionMetadata metadata;
    private boolean metadata__is_initialized;
    private NativeObject nativeObject;
    private List<Subpolyline> rideLegs;
    private boolean rideLegs__is_initialized;
    private List<RouteStop> stops;
    private boolean stops__is_initialized;

    public Section() {
        this.metadata__is_initialized = false;
        this.geometry__is_initialized = false;
        this.stops__is_initialized = false;
        this.rideLegs__is_initialized = false;
    }

    private native Subpolyline getGeometry__Native();

    private native SectionMetadata getMetadata__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Section";
    }

    private native List<Subpolyline> getRideLegs__Native();

    private native List<RouteStop> getStops__Native();

    private native NativeObject init(SectionMetadata sectionMetadata, Subpolyline subpolyline, List<RouteStop> list, List<Subpolyline> list2);

    @N
    public synchronized Subpolyline getGeometry() {
        try {
            if (!this.geometry__is_initialized) {
                this.geometry = getGeometry__Native();
                this.geometry__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.geometry;
    }

    @N
    public synchronized SectionMetadata getMetadata() {
        try {
            if (!this.metadata__is_initialized) {
                this.metadata = getMetadata__Native();
                this.metadata__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.metadata;
    }

    @N
    public synchronized List<Subpolyline> getRideLegs() {
        try {
            if (!this.rideLegs__is_initialized) {
                this.rideLegs = getRideLegs__Native();
                this.rideLegs__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.rideLegs;
    }

    @N
    public synchronized List<RouteStop> getStops() {
        try {
            if (!this.stops__is_initialized) {
                this.stops = getStops__Native();
                this.stops__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.stops;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getMetadata(), false, (Class<Archive>) SectionMetadata.class);
            archive.add((Archive) getGeometry(), false, (Class<Archive>) Subpolyline.class);
            archive.add((List) getStops(), false, (ArchivingHandler) new ClassHandler(RouteStop.class));
            c.z(Subpolyline.class, archive, getRideLegs(), false);
            return;
        }
        this.metadata = (SectionMetadata) archive.add((Archive) this.metadata, false, (Class<Archive>) SectionMetadata.class);
        this.metadata__is_initialized = true;
        this.geometry = (Subpolyline) archive.add((Archive) this.geometry, false, (Class<Archive>) Subpolyline.class);
        this.geometry__is_initialized = true;
        this.stops = c.x(RouteStop.class, archive, this.stops, false);
        this.stops__is_initialized = true;
        List<Subpolyline> listX = c.x(Subpolyline.class, archive, this.rideLegs, false);
        this.rideLegs = listX;
        this.rideLegs__is_initialized = true;
        this.nativeObject = init(this.metadata, this.geometry, this.stops, listX);
    }

    public Section(@N SectionMetadata sectionMetadata, @N Subpolyline subpolyline, @N List<RouteStop> list, @N List<Subpolyline> list2) {
        this.metadata__is_initialized = false;
        this.geometry__is_initialized = false;
        this.stops__is_initialized = false;
        this.rideLegs__is_initialized = false;
        if (sectionMetadata == null) {
            throw new IllegalArgumentException("Required field \"metadata\" cannot be null");
        }
        if (subpolyline == null) {
            throw new IllegalArgumentException("Required field \"geometry\" cannot be null");
        }
        if (list == null) {
            throw new IllegalArgumentException("Required field \"stops\" cannot be null");
        }
        if (list2 != null) {
            this.nativeObject = init(sectionMetadata, subpolyline, list, list2);
            this.metadata = sectionMetadata;
            this.metadata__is_initialized = true;
            this.geometry = subpolyline;
            this.geometry__is_initialized = true;
            this.stops = list;
            this.stops__is_initialized = true;
            this.rideLegs = list2;
            this.rideLegs__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"rideLegs\" cannot be null");
    }

    private Section(NativeObject nativeObject) {
        this.metadata__is_initialized = false;
        this.geometry__is_initialized = false;
        this.stops__is_initialized = false;
        this.rideLegs__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
