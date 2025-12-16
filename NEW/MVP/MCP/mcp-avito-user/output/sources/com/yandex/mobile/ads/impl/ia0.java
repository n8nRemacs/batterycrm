package com.yandex.mobile.ads.impl;

import android.location.Location;

/* loaded from: classes8.dex */
final class ia0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Object f386422a;

    public ia0(@j.N Object obj) {
        this.f386422a = obj;
    }

    @j.P
    public final Location a() {
        Object objA = nx0.a(this.f386422a, "getResult", new Object[0]);
        if (objA instanceof Location) {
            return (Location) objA;
        }
        return null;
    }

    public final boolean b() {
        Object objA = nx0.a(this.f386422a, "isComplete", new Object[0]);
        if (objA instanceof Boolean) {
            return ((Boolean) objA).booleanValue();
        }
        return false;
    }
}
