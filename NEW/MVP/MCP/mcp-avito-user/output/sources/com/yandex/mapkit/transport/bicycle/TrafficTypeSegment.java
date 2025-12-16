package com.yandex.mapkit.transport.bicycle;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class TrafficTypeSegment implements Serializable {
    private Subpolyline subpolyline;
    private TrafficTypeID trafficType;

    public TrafficTypeSegment(@N TrafficTypeID trafficTypeID, @N Subpolyline subpolyline) {
        if (trafficTypeID == null) {
            throw new IllegalArgumentException("Required field \"trafficType\" cannot be null");
        }
        if (subpolyline == null) {
            throw new IllegalArgumentException("Required field \"subpolyline\" cannot be null");
        }
        this.trafficType = trafficTypeID;
        this.subpolyline = subpolyline;
    }

    @N
    public Subpolyline getSubpolyline() {
        return this.subpolyline;
    }

    @N
    public TrafficTypeID getTrafficType() {
        return this.trafficType;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.trafficType = (TrafficTypeID) archive.add((Archive) this.trafficType, false, (Class<Archive>) TrafficTypeID.class);
        this.subpolyline = (Subpolyline) archive.add((Archive) this.subpolyline, false, (Class<Archive>) Subpolyline.class);
    }

    public TrafficTypeSegment() {
    }
}
