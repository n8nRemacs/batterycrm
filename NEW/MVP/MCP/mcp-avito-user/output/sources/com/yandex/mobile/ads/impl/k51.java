package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes8.dex */
public final class k51 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final String f387050a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final String f387051b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private final String f387052c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private final String f387053d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private final nd f387054e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    private final c51 f387055f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private final List<c51> f387056g;

    public k51() {
        this(0);
    }

    @Y61.l
    public final nd a() {
        return this.f387054e;
    }

    @Y61.l
    public final c51 b() {
        return this.f387055f;
    }

    @Y61.l
    public final List<c51> c() {
        return this.f387056g;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k51)) {
            return false;
        }
        k51 k51Var = (k51) obj;
        return kotlin.jvm.internal.L.f(this.f387050a, k51Var.f387050a) && kotlin.jvm.internal.L.f(this.f387051b, k51Var.f387051b) && kotlin.jvm.internal.L.f(this.f387052c, k51Var.f387052c) && kotlin.jvm.internal.L.f(this.f387053d, k51Var.f387053d) && kotlin.jvm.internal.L.f(this.f387054e, k51Var.f387054e) && kotlin.jvm.internal.L.f(this.f387055f, k51Var.f387055f) && kotlin.jvm.internal.L.f(this.f387056g, k51Var.f387056g);
    }

    public final int hashCode() {
        String str = this.f387050a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f387051b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f387052c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f387053d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        nd ndVar = this.f387054e;
        int iHashCode5 = (iHashCode4 + (ndVar == null ? 0 : ndVar.hashCode())) * 31;
        c51 c51Var = this.f387055f;
        int iHashCode6 = (iHashCode5 + (c51Var == null ? 0 : c51Var.hashCode())) * 31;
        List<c51> list = this.f387056g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("SmartCenterSettings(colorWizButton=");
        sbA.append(this.f387050a);
        sbA.append(", colorWizButtonText=");
        sbA.append(this.f387051b);
        sbA.append(", colorWizBack=");
        sbA.append(this.f387052c);
        sbA.append(", colorWizBackRight=");
        sbA.append(this.f387053d);
        sbA.append(", backgroundColors=");
        sbA.append(this.f387054e);
        sbA.append(", smartCenter=");
        sbA.append(this.f387055f);
        sbA.append(", smartCenters=");
        return androidx.compose.foundation.H.p(sbA, this.f387056g, ')');
    }

    public /* synthetic */ k51(int i12) {
        this(null, null, null, null, null, null, null);
    }

    public k51(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l nd ndVar, @Y61.l c51 c51Var, @Y61.l List<c51> list) {
        this.f387050a = str;
        this.f387051b = str2;
        this.f387052c = str3;
        this.f387053d = str4;
        this.f387054e = ndVar;
        this.f387055f = c51Var;
        this.f387056g = list;
    }
}
