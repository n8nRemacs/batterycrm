package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class Tunnel implements Serializable {
    private Subpolyline position;

    public Tunnel(@N Subpolyline subpolyline) {
        if (subpolyline == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.position = subpolyline;
    }

    @N
    public Subpolyline getPosition() {
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (Subpolyline) archive.add((Archive) this.position, false, (Class<Archive>) Subpolyline.class);
    }

    public Tunnel() {
    }
}
