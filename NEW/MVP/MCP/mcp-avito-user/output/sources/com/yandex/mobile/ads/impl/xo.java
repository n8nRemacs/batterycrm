package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.t50;

/* loaded from: classes8.dex */
final class xo {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final t50 f391786a;

    public xo(@j.N rt0 rt0Var) {
        t50.a aVar = new t50.a();
        float volume = rt0Var.getVolume();
        if (volume == 0.0f) {
            aVar.a(1.0f);
            aVar.b(true);
        } else {
            aVar.a(volume);
            aVar.b(false);
        }
        this.f391786a = aVar.a();
    }

    @j.N
    public final t50 a() {
        return this.f391786a;
    }
}
