package com.yandex.mapkit.geometry.geo;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class XYPoint implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private double f377448x;

    /* renamed from: y, reason: collision with root package name */
    private double f377449y;

    public XYPoint(double d12, double d13) {
        this.f377448x = d12;
        this.f377449y = d13;
    }

    public double getX() {
        return this.f377448x;
    }

    public double getY() {
        return this.f377449y;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f377448x = archive.add(this.f377448x);
        this.f377449y = archive.add(this.f377449y);
    }

    public XYPoint() {
    }
}
