package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class li1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Object f387518a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private int f387519b = 1;

    @j.N
    public final int a() {
        int i12;
        synchronized (this.f387518a) {
            i12 = this.f387519b;
        }
        return i12;
    }

    public final void a(@j.N int i12) {
        synchronized (this.f387518a) {
            this.f387519b = i12;
        }
    }
}
