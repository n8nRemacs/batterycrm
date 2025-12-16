package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final List<v4> f389082a;

    public q4(@Y61.l ArrayList arrayList) {
        this.f389082a = arrayList;
    }

    @Y61.l
    public final List<v4> a() {
        return this.f389082a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4) && kotlin.jvm.internal.L.f(this.f389082a, ((q4) obj).f389082a);
    }

    public final int hashCode() {
        List<v4> list = this.f389082a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.foundation.H.p(Cif.a("AdPod(items="), this.f389082a, ')');
    }
}
