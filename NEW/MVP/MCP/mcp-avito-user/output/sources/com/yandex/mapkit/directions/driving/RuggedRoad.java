package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class RuggedRoad implements Serializable {
    private boolean inPoorCondition;
    private Subpolyline position;
    private boolean unpaved;

    public RuggedRoad(@N Subpolyline subpolyline, boolean z12, boolean z13) {
        if (subpolyline == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.position = subpolyline;
        this.unpaved = z12;
        this.inPoorCondition = z13;
    }

    public boolean getInPoorCondition() {
        return this.inPoorCondition;
    }

    @N
    public Subpolyline getPosition() {
        return this.position;
    }

    public boolean getUnpaved() {
        return this.unpaved;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (Subpolyline) archive.add((Archive) this.position, false, (Class<Archive>) Subpolyline.class);
        this.unpaved = archive.add(this.unpaved);
        this.inPoorCondition = archive.add(this.inPoorCondition);
    }

    public RuggedRoad() {
    }
}
