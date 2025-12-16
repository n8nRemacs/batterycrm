package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class a81 implements k80 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f383439a;

    public a81(@j.N nr0 nr0Var) {
        this.f383439a = a(nr0Var);
    }

    @j.k0
    public static boolean a(@j.N nr0 nr0Var) {
        return nr0Var.isHardwareAccelerated();
    }

    @Override // com.yandex.mobile.ads.impl.k80
    @j.N
    public final String a() {
        return "supports: {inlineVideo: " + this.f383439a + "}";
    }
}
