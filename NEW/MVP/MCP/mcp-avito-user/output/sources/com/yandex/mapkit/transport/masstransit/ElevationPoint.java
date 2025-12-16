package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class ElevationPoint implements Serializable {
    private float elevation;

    public ElevationPoint(float f12) {
        this.elevation = f12;
    }

    public float getElevation() {
        return this.elevation;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.elevation = archive.add(this.elevation);
    }

    public ElevationPoint() {
    }
}
