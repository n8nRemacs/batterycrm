package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class uj0 {

    /* renamed from: a, reason: collision with root package name */
    private final AdResponse f390577a;

    /* renamed from: b, reason: collision with root package name */
    private final n2 f390578b;

    /* renamed from: c, reason: collision with root package name */
    private final bl0 f390579c;

    public uj0(@j.N bl0 bl0Var, @j.N AdResponse adResponse, @j.N n2 n2Var) {
        this.f390577a = adResponse;
        this.f390578b = n2Var;
        this.f390579c = bl0Var;
    }

    @j.N
    public final n2 a() {
        return this.f390578b;
    }

    @j.N
    public final AdResponse b() {
        return this.f390577a;
    }

    @j.N
    public final bl0 c() {
        return this.f390579c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uj0.class != obj.getClass()) {
            return false;
        }
        uj0 uj0Var = (uj0) obj;
        AdResponse adResponse = this.f390577a;
        if (adResponse == null ? uj0Var.f390577a != null : !adResponse.equals(uj0Var.f390577a)) {
            return false;
        }
        n2 n2Var = this.f390578b;
        if (n2Var == null ? uj0Var.f390578b != null : !n2Var.equals(uj0Var.f390578b)) {
            return false;
        }
        bl0 bl0Var = this.f390579c;
        return bl0Var != null ? bl0Var.equals(uj0Var.f390579c) : uj0Var.f390579c == null;
    }

    public final int hashCode() {
        AdResponse adResponse = this.f390577a;
        int iHashCode = (adResponse != null ? adResponse.hashCode() : 0) * 31;
        n2 n2Var = this.f390578b;
        int iHashCode2 = (iHashCode + (n2Var != null ? n2Var.hashCode() : 0)) * 31;
        bl0 bl0Var = this.f390579c;
        return iHashCode2 + (bl0Var != null ? bl0Var.hashCode() : 0);
    }
}
