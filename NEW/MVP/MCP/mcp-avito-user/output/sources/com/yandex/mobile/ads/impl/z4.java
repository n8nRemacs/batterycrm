package com.yandex.mobile.ads.impl;

import androidx.compose.runtime.C22026a;

/* loaded from: classes8.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f392182a = "Fullscreen ad was already presented. Fullscreen can be presented just once.";

    @Y61.k
    public final String a() {
        return this.f392182a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4) && kotlin.jvm.internal.L.f(this.f392182a, ((z4) obj).f392182a);
    }

    public final int hashCode() {
        return this.f392182a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(Cif.a("AdPresentationError(description="), this.f392182a, ')');
    }
}
