package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class RestrictedTurn implements Serializable {
    private PolylinePosition position;

    public RestrictedTurn(@N PolylinePosition polylinePosition) {
        if (polylinePosition == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.position = polylinePosition;
    }

    @N
    public PolylinePosition getPosition() {
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
    }

    public RestrictedTurn() {
    }
}
