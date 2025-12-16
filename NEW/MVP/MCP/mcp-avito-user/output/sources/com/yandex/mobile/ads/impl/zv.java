package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class zv {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<d40> f392350a;

    public zv(@j.N ArrayList arrayList) {
        this.f392350a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zv.class != obj.getClass()) {
            return false;
        }
        return this.f392350a.equals(((zv) obj).f392350a);
    }

    public final int hashCode() {
        return this.f392350a.hashCode();
    }
}
