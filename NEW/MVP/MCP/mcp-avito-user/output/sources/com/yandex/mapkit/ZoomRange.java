package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class ZoomRange implements Serializable {
    private int zMax;
    private int zMin;

    public ZoomRange(int i12, int i13) {
        this.zMin = i12;
        this.zMax = i13;
    }

    public int getZMax() {
        return this.zMax;
    }

    public int getZMin() {
        return this.zMin;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.zMin = archive.add(this.zMin);
        this.zMax = archive.add(this.zMax);
    }

    public ZoomRange() {
    }
}
