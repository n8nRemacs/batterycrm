package com.yandex.mobile.ads.impl;

import androidx.compose.runtime.C22026a;

/* loaded from: classes8.dex */
public final class nd {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final String f388218a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final String f388219b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private final String f388220c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private final String f388221d;

    public nd(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f388218a = str;
        this.f388219b = str2;
        this.f388220c = str3;
        this.f388221d = str4;
    }

    @Y61.l
    public final String a() {
        return this.f388221d;
    }

    @Y61.l
    public final String b() {
        return this.f388220c;
    }

    @Y61.l
    public final String c() {
        return this.f388219b;
    }

    @Y61.l
    public final String d() {
        return this.f388218a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd)) {
            return false;
        }
        nd ndVar = (nd) obj;
        return kotlin.jvm.internal.L.f(this.f388218a, ndVar.f388218a) && kotlin.jvm.internal.L.f(this.f388219b, ndVar.f388219b) && kotlin.jvm.internal.L.f(this.f388220c, ndVar.f388220c) && kotlin.jvm.internal.L.f(this.f388221d, ndVar.f388221d);
    }

    public final int hashCode() {
        String str = this.f388218a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f388219b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f388220c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f388221d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("BackgroundColors(top=");
        sbA.append(this.f388218a);
        sbA.append(", right=");
        sbA.append(this.f388219b);
        sbA.append(", left=");
        sbA.append(this.f388220c);
        sbA.append(", bottom=");
        return C22026a.c(sbA, this.f388221d, ')');
    }
}
