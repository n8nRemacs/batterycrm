package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class uj1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<String> f390580a;

    public uj1(@j.N ArrayList arrayList) {
        this.f390580a = arrayList;
    }

    @j.N
    public final List<String> a() {
        return this.f390580a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uj1.class != obj.getClass()) {
            return false;
        }
        return this.f390580a.equals(((uj1) obj).f390580a);
    }

    public final int hashCode() {
        return this.f390580a.hashCode();
    }
}
