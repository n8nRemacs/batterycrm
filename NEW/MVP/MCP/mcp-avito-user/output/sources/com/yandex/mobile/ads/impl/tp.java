package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class tp {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f390274a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f390275b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final String f390276c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final List<b30> f390277d;

    public tp(@j.N String str, @j.N String str2, @j.N String str3, @j.P ArrayList arrayList) {
        this.f390274a = str;
        this.f390275b = str2;
        this.f390276c = str3;
        this.f390277d = arrayList;
    }

    @j.P
    public final List<b30> a() {
        return this.f390277d;
    }

    @j.N
    public final String b() {
        return this.f390276c;
    }

    @j.N
    public final String c() {
        return this.f390275b;
    }

    @j.N
    public final String d() {
        return this.f390274a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tp.class != obj.getClass()) {
            return false;
        }
        tp tpVar = (tp) obj;
        if (!this.f390274a.equals(tpVar.f390274a) || !this.f390275b.equals(tpVar.f390275b) || !this.f390276c.equals(tpVar.f390276c)) {
            return false;
        }
        List<b30> list = this.f390277d;
        List<b30> list2 = tpVar.f390277d;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public final int hashCode() {
        int iA2 = v2.a(this.f390276c, v2.a(this.f390275b, this.f390274a.hashCode() * 31, 31), 31);
        List<b30> list = this.f390277d;
        return iA2 + (list != null ? list.hashCode() : 0);
    }
}
