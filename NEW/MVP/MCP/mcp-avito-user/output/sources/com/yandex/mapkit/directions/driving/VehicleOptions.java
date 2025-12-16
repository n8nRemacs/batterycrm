package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public final class VehicleOptions implements Serializable {
    private Float axleWeight;
    private Boolean buswayPermitted;
    private Integer ecoClass;
    private Boolean hasTrailer;
    private Float height;
    private Float length;
    private Float maxWeight;
    private Float payload;
    private VehicleType vehicleType;
    private Float weight;
    private Float width;

    public VehicleOptions(@N VehicleType vehicleType, @P Float f12, @P Float f13, @P Float f14, @P Float f15, @P Float f16, @P Float f17, @P Float f18, @P Integer num, @P Boolean bool, @P Boolean bool2) {
        this.vehicleType = VehicleType.DEFAULT;
        if (vehicleType == null) {
            throw new IllegalArgumentException("Required field \"vehicleType\" cannot be null");
        }
        this.vehicleType = vehicleType;
        this.weight = f12;
        this.axleWeight = f13;
        this.maxWeight = f14;
        this.height = f15;
        this.width = f16;
        this.length = f17;
        this.payload = f18;
        this.ecoClass = num;
        this.hasTrailer = bool;
        this.buswayPermitted = bool2;
    }

    @P
    public Float getAxleWeight() {
        return this.axleWeight;
    }

    @P
    public Boolean getBuswayPermitted() {
        return this.buswayPermitted;
    }

    @P
    public Integer getEcoClass() {
        return this.ecoClass;
    }

    @P
    public Boolean getHasTrailer() {
        return this.hasTrailer;
    }

    @P
    public Float getHeight() {
        return this.height;
    }

    @P
    public Float getLength() {
        return this.length;
    }

    @P
    public Float getMaxWeight() {
        return this.maxWeight;
    }

    @P
    public Float getPayload() {
        return this.payload;
    }

    @N
    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    @P
    public Float getWeight() {
        return this.weight;
    }

    @P
    public Float getWidth() {
        return this.width;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.vehicleType = (VehicleType) archive.add((Archive) this.vehicleType, false, (Class<Archive>) VehicleType.class);
        this.weight = archive.add(this.weight, true);
        this.axleWeight = archive.add(this.axleWeight, true);
        this.maxWeight = archive.add(this.maxWeight, true);
        this.height = archive.add(this.height, true);
        this.width = archive.add(this.width, true);
        this.length = archive.add(this.length, true);
        this.payload = archive.add(this.payload, true);
        this.ecoClass = archive.add(this.ecoClass, true);
        this.hasTrailer = archive.add(this.hasTrailer, true);
        this.buswayPermitted = archive.add(this.buswayPermitted, true);
    }

    public VehicleOptions setAxleWeight(@P Float f12) {
        this.axleWeight = f12;
        return this;
    }

    public VehicleOptions setBuswayPermitted(@P Boolean bool) {
        this.buswayPermitted = bool;
        return this;
    }

    public VehicleOptions setEcoClass(@P Integer num) {
        this.ecoClass = num;
        return this;
    }

    public VehicleOptions setHasTrailer(@P Boolean bool) {
        this.hasTrailer = bool;
        return this;
    }

    public VehicleOptions setHeight(@P Float f12) {
        this.height = f12;
        return this;
    }

    public VehicleOptions setLength(@P Float f12) {
        this.length = f12;
        return this;
    }

    public VehicleOptions setMaxWeight(@P Float f12) {
        this.maxWeight = f12;
        return this;
    }

    public VehicleOptions setPayload(@P Float f12) {
        this.payload = f12;
        return this;
    }

    public VehicleOptions setVehicleType(@N VehicleType vehicleType) {
        if (vehicleType == null) {
            throw new IllegalArgumentException("Required field \"vehicleType\" cannot be null");
        }
        this.vehicleType = vehicleType;
        return this;
    }

    public VehicleOptions setWeight(@P Float f12) {
        this.weight = f12;
        return this;
    }

    public VehicleOptions setWidth(@P Float f12) {
        this.width = f12;
        return this;
    }

    public VehicleOptions() {
        this.vehicleType = VehicleType.DEFAULT;
    }
}
