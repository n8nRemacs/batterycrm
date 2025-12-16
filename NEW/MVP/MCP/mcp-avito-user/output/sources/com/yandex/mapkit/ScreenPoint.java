package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class ScreenPoint implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private float f377441x;

    /* renamed from: y, reason: collision with root package name */
    private float f377442y;

    public ScreenPoint(float f12, float f13) {
        this.f377441x = f12;
        this.f377442y = f13;
    }

    public float getX() {
        return this.f377441x;
    }

    public float getY() {
        return this.f377442y;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f377441x = archive.add(this.f377441x);
        this.f377442y = archive.add(this.f377442y);
    }

    public ScreenPoint() {
    }
}
