package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class mu0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f388090a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f388091b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final Map<String, Object> f388092c;

    public mu0(@j.N String str, @j.N String str2, @j.P HashMap map) {
        this.f388090a = str;
        this.f388091b = str2;
        this.f388092c = map;
    }

    @j.P
    public final Map<String, Object> a() {
        return this.f388092c;
    }

    @j.N
    public final String b() {
        return this.f388090a;
    }

    @j.N
    public final String c() {
        return this.f388091b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mu0.class != obj.getClass()) {
            return false;
        }
        mu0 mu0Var = (mu0) obj;
        if (!this.f388090a.equals(mu0Var.f388090a) || !this.f388091b.equals(mu0Var.f388091b)) {
            return false;
        }
        Map<String, Object> map = this.f388092c;
        Map<String, Object> map2 = mu0Var.f388092c;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public final int hashCode() {
        int iA2 = v2.a(this.f388091b, this.f388090a.hashCode() * 31, 31);
        Map<String, Object> map = this.f388092c;
        return iA2 + (map != null ? map.hashCode() : 0);
    }
}
