package com.yandex.mapkit.transport.masstransit;

import AK.c;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class Fitness implements Serializable {
    private List<Annotation> annotations;
    private boolean annotations__is_initialized;
    private List<ConstructionSegment> constructions;
    private boolean constructions__is_initialized;
    private ElevationData elevationData;
    private boolean elevationData__is_initialized;
    private NativeObject nativeObject;
    private List<RestrictedEntry> restrictedEntries;
    private boolean restrictedEntries__is_initialized;
    private List<TrafficTypeSegment> trafficTypes;
    private boolean trafficTypes__is_initialized;
    private FitnessType type;
    private boolean type__is_initialized;
    private List<PolylinePosition> viaPoints;
    private boolean viaPoints__is_initialized;

    public Fitness() {
        this.type__is_initialized = false;
        this.constructions__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.viaPoints__is_initialized = false;
        this.annotations__is_initialized = false;
        this.trafficTypes__is_initialized = false;
        this.elevationData__is_initialized = false;
    }

    private native List<Annotation> getAnnotations__Native();

    private native List<ConstructionSegment> getConstructions__Native();

    private native ElevationData getElevationData__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Fitness";
    }

    private native List<RestrictedEntry> getRestrictedEntries__Native();

    private native List<TrafficTypeSegment> getTrafficTypes__Native();

    private native FitnessType getType__Native();

    private native List<PolylinePosition> getViaPoints__Native();

    private native NativeObject init(FitnessType fitnessType, List<ConstructionSegment> list, List<RestrictedEntry> list2, List<PolylinePosition> list3, List<Annotation> list4, List<TrafficTypeSegment> list5, ElevationData elevationData);

    @N
    public synchronized List<Annotation> getAnnotations() {
        try {
            if (!this.annotations__is_initialized) {
                this.annotations = getAnnotations__Native();
                this.annotations__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.annotations;
    }

    @N
    public synchronized List<ConstructionSegment> getConstructions() {
        try {
            if (!this.constructions__is_initialized) {
                this.constructions = getConstructions__Native();
                this.constructions__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.constructions;
    }

    @P
    public synchronized ElevationData getElevationData() {
        try {
            if (!this.elevationData__is_initialized) {
                this.elevationData = getElevationData__Native();
                this.elevationData__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.elevationData;
    }

    @N
    public synchronized List<RestrictedEntry> getRestrictedEntries() {
        try {
            if (!this.restrictedEntries__is_initialized) {
                this.restrictedEntries = getRestrictedEntries__Native();
                this.restrictedEntries__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.restrictedEntries;
    }

    @N
    public synchronized List<TrafficTypeSegment> getTrafficTypes() {
        try {
            if (!this.trafficTypes__is_initialized) {
                this.trafficTypes = getTrafficTypes__Native();
                this.trafficTypes__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.trafficTypes;
    }

    @N
    public synchronized FitnessType getType() {
        try {
            if (!this.type__is_initialized) {
                this.type = getType__Native();
                this.type__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.type;
    }

    @N
    public synchronized List<PolylinePosition> getViaPoints() {
        try {
            if (!this.viaPoints__is_initialized) {
                this.viaPoints = getViaPoints__Native();
                this.viaPoints__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.viaPoints;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getType(), false, (Class<Archive>) FitnessType.class);
            archive.add((List) getConstructions(), false, (ArchivingHandler) new ClassHandler(ConstructionSegment.class));
            archive.add((List) getRestrictedEntries(), false, (ArchivingHandler) new ClassHandler(RestrictedEntry.class));
            archive.add((List) getViaPoints(), false, (ArchivingHandler) new ClassHandler(PolylinePosition.class));
            archive.add((List) getAnnotations(), false, (ArchivingHandler) new ClassHandler(Annotation.class));
            archive.add((List) getTrafficTypes(), false, (ArchivingHandler) new ClassHandler(TrafficTypeSegment.class));
            archive.add((Archive) getElevationData(), true, (Class<Archive>) ElevationData.class);
            return;
        }
        this.type = (FitnessType) archive.add((Archive) this.type, false, (Class<Archive>) FitnessType.class);
        this.type__is_initialized = true;
        this.constructions = c.x(ConstructionSegment.class, archive, this.constructions, false);
        this.constructions__is_initialized = true;
        this.restrictedEntries = c.x(RestrictedEntry.class, archive, this.restrictedEntries, false);
        this.restrictedEntries__is_initialized = true;
        this.viaPoints = c.x(PolylinePosition.class, archive, this.viaPoints, false);
        this.viaPoints__is_initialized = true;
        this.annotations = c.x(Annotation.class, archive, this.annotations, false);
        this.annotations__is_initialized = true;
        this.trafficTypes = c.x(TrafficTypeSegment.class, archive, this.trafficTypes, false);
        this.trafficTypes__is_initialized = true;
        ElevationData elevationData = (ElevationData) archive.add((Archive) this.elevationData, true, (Class<Archive>) ElevationData.class);
        this.elevationData = elevationData;
        this.elevationData__is_initialized = true;
        this.nativeObject = init(this.type, this.constructions, this.restrictedEntries, this.viaPoints, this.annotations, this.trafficTypes, elevationData);
    }

    public Fitness(@N FitnessType fitnessType, @N List<ConstructionSegment> list, @N List<RestrictedEntry> list2, @N List<PolylinePosition> list3, @N List<Annotation> list4, @N List<TrafficTypeSegment> list5, @P ElevationData elevationData) {
        this.type__is_initialized = false;
        this.constructions__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.viaPoints__is_initialized = false;
        this.annotations__is_initialized = false;
        this.trafficTypes__is_initialized = false;
        this.elevationData__is_initialized = false;
        if (fitnessType == null) {
            throw new IllegalArgumentException("Required field \"type\" cannot be null");
        }
        if (list == null) {
            throw new IllegalArgumentException("Required field \"constructions\" cannot be null");
        }
        if (list2 == null) {
            throw new IllegalArgumentException("Required field \"restrictedEntries\" cannot be null");
        }
        if (list3 == null) {
            throw new IllegalArgumentException("Required field \"viaPoints\" cannot be null");
        }
        if (list4 == null) {
            throw new IllegalArgumentException("Required field \"annotations\" cannot be null");
        }
        if (list5 != null) {
            this.nativeObject = init(fitnessType, list, list2, list3, list4, list5, elevationData);
            this.type = fitnessType;
            this.type__is_initialized = true;
            this.constructions = list;
            this.constructions__is_initialized = true;
            this.restrictedEntries = list2;
            this.restrictedEntries__is_initialized = true;
            this.viaPoints = list3;
            this.viaPoints__is_initialized = true;
            this.annotations = list4;
            this.annotations__is_initialized = true;
            this.trafficTypes = list5;
            this.trafficTypes__is_initialized = true;
            this.elevationData = elevationData;
            this.elevationData__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"trafficTypes\" cannot be null");
    }

    private Fitness(NativeObject nativeObject) {
        this.type__is_initialized = false;
        this.constructions__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.viaPoints__is_initialized = false;
        this.annotations__is_initialized = false;
        this.trafficTypes__is_initialized = false;
        this.elevationData__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
