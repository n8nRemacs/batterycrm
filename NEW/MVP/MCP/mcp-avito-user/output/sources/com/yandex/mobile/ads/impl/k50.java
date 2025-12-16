package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes8.dex */
public final class k50 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakReference<lu> f387048a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final List<df1> f387049b;

    public k50(@j.N lu luVar, @j.N List<df1> list) {
        this.f387048a = new WeakReference<>(luVar);
        this.f387049b = list;
    }

    @j.N
    public final List<df1> a() {
        return this.f387049b;
    }

    @j.P
    public final lu b() {
        return this.f387048a.get();
    }
}
