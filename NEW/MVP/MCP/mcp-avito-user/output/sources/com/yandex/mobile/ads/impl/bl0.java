package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class bl0 {

    /* renamed from: a, reason: collision with root package name */
    private String f383977a;

    /* renamed from: b, reason: collision with root package name */
    private List<eb<?>> f383978b;

    /* renamed from: c, reason: collision with root package name */
    private List<nj0> f383979c;

    /* renamed from: d, reason: collision with root package name */
    private l31 f383980d;

    /* renamed from: e, reason: collision with root package name */
    private List<q31> f383981e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private List<String> f383982f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private List<vq> f383983g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private q4 f383984h;

    /* renamed from: i, reason: collision with root package name */
    private HashMap f383985i = new HashMap();

    public final void a() {
        this.f383985i.put("status", ky0.c.f387327b);
    }

    public final void b(@j.N ArrayList arrayList) {
        this.f383983g = arrayList;
    }

    public final void c(@j.N ArrayList arrayList) {
        this.f383982f = arrayList;
    }

    public final void d(ArrayList arrayList) {
        this.f383981e = arrayList;
    }

    public final List<nj0> e() {
        return this.f383979c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bl0.class != obj.getClass()) {
            return false;
        }
        bl0 bl0Var = (bl0) obj;
        String str = this.f383977a;
        if (str == null ? bl0Var.f383977a != null : !str.equals(bl0Var.f383977a)) {
            return false;
        }
        List<eb<?>> list = this.f383978b;
        if (list == null ? bl0Var.f383978b != null : !list.equals(bl0Var.f383978b)) {
            return false;
        }
        List<nj0> list2 = this.f383979c;
        if (list2 == null ? bl0Var.f383979c != null : !list2.equals(bl0Var.f383979c)) {
            return false;
        }
        l31 l31Var = this.f383980d;
        if (l31Var == null ? bl0Var.f383980d != null : !l31Var.equals(bl0Var.f383980d)) {
            return false;
        }
        List<q31> list3 = this.f383981e;
        if (list3 == null ? bl0Var.f383981e != null : !list3.equals(bl0Var.f383981e)) {
            return false;
        }
        List<String> list4 = this.f383982f;
        if (list4 == null ? bl0Var.f383982f != null : !list4.equals(bl0Var.f383982f)) {
            return false;
        }
        List<vq> list5 = this.f383983g;
        if (list5 == null ? bl0Var.f383983g != null : !list5.equals(bl0Var.f383983g)) {
            return false;
        }
        q4 q4Var = this.f383984h;
        if (q4Var == null ? bl0Var.f383984h != null : !q4Var.equals(bl0Var.f383984h)) {
            return false;
        }
        HashMap map = this.f383985i;
        HashMap map2 = bl0Var.f383985i;
        return map != null ? map.equals(map2) : map2 == null;
    }

    @j.N
    public final HashMap f() {
        return this.f383985i;
    }

    @j.P
    public final List<String> g() {
        return this.f383982f;
    }

    @j.P
    public final l31 h() {
        return this.f383980d;
    }

    public final int hashCode() {
        String str = this.f383977a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List<eb<?>> list = this.f383978b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<nj0> list2 = this.f383979c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        l31 l31Var = this.f383980d;
        int iHashCode4 = (iHashCode3 + (l31Var != null ? l31Var.hashCode() : 0)) * 31;
        List<q31> list3 = this.f383981e;
        int iHashCode5 = (iHashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.f383982f;
        int iHashCode6 = (iHashCode5 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<vq> list5 = this.f383983g;
        int iHashCode7 = (iHashCode6 + (list5 != null ? list5.hashCode() : 0)) * 31;
        q4 q4Var = this.f383984h;
        int iHashCode8 = (iHashCode7 + (q4Var != null ? q4Var.hashCode() : 0)) * 31;
        HashMap map = this.f383985i;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }

    @j.P
    public final List<q31> i() {
        return this.f383981e;
    }

    @j.P
    public final q4 b() {
        return this.f383984h;
    }

    public final List<eb<?>> c() {
        return this.f383978b;
    }

    @j.P
    public final List<vq> d() {
        return this.f383983g;
    }

    public final void a(ArrayList arrayList) {
        this.f383978b = arrayList;
    }

    public final void a(List<nj0> list) {
        this.f383979c = list;
    }

    public final void a(l31 l31Var) {
        this.f383980d = l31Var;
    }

    public final void a(@j.P q4 q4Var) {
        this.f383984h = q4Var;
    }

    public final void a(String str) {
        this.f383977a = str;
    }
}
