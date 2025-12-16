package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    private final float f384230a;

    public cb(float f12) {
        this.f384230a = f12 == 0.0f ? 1.7777778f : f12;
    }

    public final int a(int i12) {
        return Math.round(i12 / this.f384230a);
    }

    public final int b(int i12) {
        return Math.round(i12 * this.f384230a);
    }
}
