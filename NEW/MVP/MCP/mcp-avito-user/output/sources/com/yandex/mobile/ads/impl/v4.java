package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    private final long f390790a;

    public v4(long j12) {
        this.f390790a = j12;
    }

    public final long a() {
        return this.f390790a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4) && this.f390790a == ((v4) obj).f390790a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f390790a);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.u(Cif.a("AdPodItem(duration="), this.f390790a, ')');
    }
}
