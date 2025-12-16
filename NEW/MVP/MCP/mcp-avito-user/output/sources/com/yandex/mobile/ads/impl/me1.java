package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class me1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<ff1<yn0>> f387985a;

    public me1(@j.N ArrayList arrayList) {
        this.f387985a = arrayList;
    }

    @j.N
    public final ff1<yn0> a() {
        return this.f387985a.get(0);
    }

    @j.N
    public final List<ff1<yn0>> b() {
        return this.f387985a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || me1.class != obj.getClass()) {
            return false;
        }
        return this.f387985a.equals(((me1) obj).f387985a);
    }

    public final int hashCode() {
        return this.f387985a.hashCode();
    }
}
