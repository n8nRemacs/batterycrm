package com.yandex.mobile.ads.impl;

import androidx.compose.runtime.C22026a;

/* loaded from: classes8.dex */
public final class ka {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final String f387089a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final String f387090b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private final String f387091c;

    public ka(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f387089a = str;
        this.f387090b = str2;
        this.f387091c = str3;
    }

    @Y61.l
    public final String a() {
        return this.f387089a;
    }

    @Y61.l
    public final String b() {
        return this.f387090b;
    }

    @Y61.l
    public final String c() {
        return this.f387091c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        return kotlin.jvm.internal.L.f(this.f387089a, kaVar.f387089a) && kotlin.jvm.internal.L.f(this.f387090b, kaVar.f387090b) && kotlin.jvm.internal.L.f(this.f387091c, kaVar.f387091c);
    }

    public final int hashCode() {
        String str = this.f387089a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f387090b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f387091c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("AppMetricaIdentifiers(adGetUrl=");
        sbA.append(this.f387089a);
        sbA.append(", deviceId=");
        sbA.append(this.f387090b);
        sbA.append(", uuid=");
        return C22026a.c(sbA, this.f387091c, ')');
    }
}
