package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes8.dex */
public final class jj1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ij1 f386890a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final b90 f386891b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ob0 f386892c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final Map<String, String> f386893d;

    public jj1(@Y61.k ij1 ij1Var, @Y61.k b90 b90Var, @Y61.k ob0 ob0Var, @Y61.k Map<String, String> map) {
        this.f386890a = ij1Var;
        this.f386891b = b90Var;
        this.f386892c = ob0Var;
        this.f386893d = map;
    }

    @Y61.k
    public final Map<String, String> a() {
        return this.f386893d;
    }

    @Y61.k
    public final b90 b() {
        return this.f386891b;
    }

    @Y61.k
    public final ob0 c() {
        return this.f386892c;
    }

    @Y61.k
    public final ij1 d() {
        return this.f386890a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj1)) {
            return false;
        }
        jj1 jj1Var = (jj1) obj;
        return kotlin.jvm.internal.L.f(this.f386890a, jj1Var.f386890a) && kotlin.jvm.internal.L.f(this.f386891b, jj1Var.f386891b) && kotlin.jvm.internal.L.f(this.f386892c, jj1Var.f386892c) && kotlin.jvm.internal.L.f(this.f386893d, jj1Var.f386893d);
    }

    public final int hashCode() {
        return this.f386893d.hashCode() + ((this.f386892c.hashCode() + ((this.f386891b.hashCode() + (this.f386890a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("ViewSizeInfo(view=");
        sbA.append(this.f386890a);
        sbA.append(", layoutParams=");
        sbA.append(this.f386891b);
        sbA.append(", measured=");
        sbA.append(this.f386892c);
        sbA.append(", additionalInfo=");
        return androidx.appcompat.app.r.w(sbA, this.f386893d, ')');
    }

    public /* synthetic */ jj1(ij1 ij1Var, b90 b90Var, ob0 ob0Var) {
        this(ij1Var, b90Var, ob0Var, kotlin.collections.P0.c());
    }
}
