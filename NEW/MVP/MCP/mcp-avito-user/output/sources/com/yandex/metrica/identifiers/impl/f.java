package com.yandex.metrica.identifiers.impl;

import kotlin.jvm.internal.L;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f377722a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f377723b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Boolean f377724c;

    public f(@Y61.k String str, @Y61.l String str2, @Y61.l Boolean bool) {
        this.f377722a = str;
        this.f377723b = str2;
        this.f377724c = bool;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f377722a, fVar.f377722a) && L.f(this.f377723b, fVar.f377723b) && L.f(this.f377724c, fVar.f377724c);
    }

    public final int hashCode() {
        String str = this.f377722a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f377723b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f377724c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "AdsIdInfo(provider=" + this.f377722a + ", advId=" + this.f377723b + ", limitedAdTracking=" + this.f377724c + ")";
    }
}
