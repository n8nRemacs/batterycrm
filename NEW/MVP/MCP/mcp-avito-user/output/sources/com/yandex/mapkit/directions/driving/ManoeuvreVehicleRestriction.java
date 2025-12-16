package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class ManoeuvreVehicleRestriction implements Serializable {
    private PolylinePosition position;
    private VehicleRestriction vehicleRestriction;

    public ManoeuvreVehicleRestriction(@N VehicleRestriction vehicleRestriction, @N PolylinePosition polylinePosition) {
        if (vehicleRestriction == null) {
            throw new IllegalArgumentException("Required field \"vehicleRestriction\" cannot be null");
        }
        if (polylinePosition == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.vehicleRestriction = vehicleRestriction;
        this.position = polylinePosition;
    }

    @N
    public PolylinePosition getPosition() {
        return this.position;
    }

    @N
    public VehicleRestriction getVehicleRestriction() {
        return this.vehicleRestriction;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.vehicleRestriction = (VehicleRestriction) archive.add((Archive) this.vehicleRestriction, false, (Class<Archive>) VehicleRestriction.class);
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
    }

    public ManoeuvreVehicleRestriction() {
    }
}
