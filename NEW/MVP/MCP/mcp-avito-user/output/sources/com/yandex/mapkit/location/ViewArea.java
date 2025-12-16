package com.yandex.mapkit.location;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class ViewArea implements Serializable {
    private double lengthwise;
    private double transverse;

    public ViewArea(double d12, double d13) {
        this.lengthwise = d12;
        this.transverse = d13;
    }

    public double getLengthwise() {
        return this.lengthwise;
    }

    public double getTransverse() {
        return this.transverse;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.lengthwise = archive.add(this.lengthwise);
        this.transverse = archive.add(this.transverse);
    }

    public ViewArea() {
    }
}
