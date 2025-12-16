package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.af1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ne1 implements oi1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ArrayList f388231a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final af1 f388232b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Map<String, List<String>> f388233c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final HashMap f388234d;

    /* renamed from: e, reason: collision with root package name */
    private final String f388235e;

    /* renamed from: f, reason: collision with root package name */
    private final String f388236f;

    /* renamed from: g, reason: collision with root package name */
    private final String f388237g;

    /* renamed from: h, reason: collision with root package name */
    private final String f388238h;

    /* renamed from: i, reason: collision with root package name */
    private final String f388239i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private final uj1 f388240j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    private final Integer f388241k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private final String f388242l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private jm1 f388243m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final ArrayList f388244n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f388245o;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private jm1 f388246a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private String f388247b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private String f388248c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private String f388249d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        private String f388250e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        private String f388251f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        private uj1 f388252g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        private Integer f388253h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        private String f388254i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f388255j;

        /* renamed from: k, reason: collision with root package name */
        @j.N
        private final ArrayList f388256k = new ArrayList();

        /* renamed from: l, reason: collision with root package name */
        @j.N
        private final ArrayList f388257l = new ArrayList();

        /* renamed from: m, reason: collision with root package name */
        @j.N
        private Map<String, List<String>> f388258m = new HashMap();

        /* renamed from: n, reason: collision with root package name */
        @j.N
        private final HashMap f388259n = new HashMap();

        /* renamed from: o, reason: collision with root package name */
        @j.N
        private af1 f388260o = new af1.a().a();

        /* renamed from: p, reason: collision with root package name */
        @j.N
        private final rg1 f388261p;

        public a(@j.N Context context, boolean z12) {
            this.f388255j = z12;
            this.f388261p = new rg1(context);
        }

        @j.N
        public final a a(@j.P jm1 jm1Var) {
            this.f388246a = jm1Var;
            return this;
        }

        @j.N
        public final a b(@j.P String str) {
            this.f388248c = str;
            return this;
        }

        @j.N
        public final a c(@j.P String str) {
            this.f388249d = str;
            return this;
        }

        @j.N
        public final void d(@j.P String str) {
            this.f388254i = str;
        }

        @j.N
        public final a e(@j.P String str) {
            this.f388250e = str;
            return this;
        }

        @j.N
        public final a f(@j.P String str) {
            this.f388251f = str;
            return this;
        }

        @j.N
        public final a a(@j.P String str) {
            this.f388247b = str;
            return this;
        }

        @j.N
        public final a b(@j.P ArrayList arrayList) {
            this.f388256k.addAll(arrayList);
            return this;
        }

        @j.N
        public final void a(@j.P Integer num) {
            this.f388253h = num;
        }

        @j.N
        public final a a(@j.N af1 af1Var) {
            this.f388260o = af1Var;
            return this;
        }

        @j.N
        public final a a(@j.N ArrayList arrayList) {
            this.f388257l.addAll(arrayList);
            return this;
        }

        @j.N
        public final void a(@j.P String str, @j.P String str2) {
            List arrayList = (List) this.f388259n.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f388259n.put(str, arrayList);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            arrayList.add(str2);
        }

        @j.N
        public final a a(@j.N uj1 uj1Var) {
            this.f388252g = uj1Var;
            return this;
        }

        @j.N
        public final ne1 a() {
            this.f388258m = this.f388261p.a(this.f388259n, this.f388252g);
            return new ne1(this);
        }
    }

    public ne1(@j.N a aVar) {
        this.f388245o = aVar.f388255j;
        this.f388235e = aVar.f388247b;
        this.f388236f = aVar.f388248c;
        this.f388237g = aVar.f388249d;
        this.f388232b = aVar.f388260o;
        this.f388238h = aVar.f388250e;
        this.f388239i = aVar.f388251f;
        this.f388241k = aVar.f388253h;
        this.f388242l = aVar.f388254i;
        this.f388231a = aVar.f388256k;
        this.f388233c = aVar.f388258m;
        this.f388234d = aVar.f388259n;
        this.f388240j = aVar.f388252g;
        this.f388243m = aVar.f388246a;
        this.f388244n = aVar.f388257l;
    }

    @Override // com.yandex.mobile.ads.impl.oi1
    @j.N
    public final Map<String, List<String>> a() {
        return Collections.unmodifiableMap(this.f388233c);
    }

    public final String b() {
        return this.f388235e;
    }

    public final String c() {
        return this.f388236f;
    }

    @j.N
    public final ArrayList d() {
        return this.f388244n;
    }

    @j.N
    public final ArrayList e() {
        return this.f388231a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ne1.class != obj.getClass()) {
            return false;
        }
        ne1 ne1Var = (ne1) obj;
        if (this.f388245o != ne1Var.f388245o) {
            return false;
        }
        String str = this.f388235e;
        if (str == null ? ne1Var.f388235e != null : !str.equals(ne1Var.f388235e)) {
            return false;
        }
        String str2 = this.f388236f;
        if (str2 == null ? ne1Var.f388236f != null : !str2.equals(ne1Var.f388236f)) {
            return false;
        }
        if (!this.f388231a.equals(ne1Var.f388231a)) {
            return false;
        }
        String str3 = this.f388237g;
        if (str3 == null ? ne1Var.f388237g != null : !str3.equals(ne1Var.f388237g)) {
            return false;
        }
        String str4 = this.f388238h;
        if (str4 == null ? ne1Var.f388238h != null : !str4.equals(ne1Var.f388238h)) {
            return false;
        }
        Integer num = this.f388241k;
        if (num == null ? ne1Var.f388241k != null : !num.equals(ne1Var.f388241k)) {
            return false;
        }
        if (!this.f388232b.equals(ne1Var.f388232b) || !this.f388233c.equals(ne1Var.f388233c) || !this.f388234d.equals(ne1Var.f388234d)) {
            return false;
        }
        String str5 = this.f388239i;
        if (str5 == null ? ne1Var.f388239i != null : !str5.equals(ne1Var.f388239i)) {
            return false;
        }
        uj1 uj1Var = this.f388240j;
        if (uj1Var == null ? ne1Var.f388240j != null : !uj1Var.equals(ne1Var.f388240j)) {
            return false;
        }
        if (!this.f388244n.equals(ne1Var.f388244n)) {
            return false;
        }
        jm1 jm1Var = this.f388243m;
        return jm1Var != null ? jm1Var.equals(ne1Var.f388243m) : ne1Var.f388243m == null;
    }

    public final String f() {
        return this.f388237g;
    }

    @j.P
    public final String g() {
        return this.f388242l;
    }

    @j.N
    public final Map<String, List<String>> h() {
        return Collections.unmodifiableMap(this.f388234d);
    }

    public final int hashCode() {
        int iHashCode = (this.f388234d.hashCode() + ((this.f388233c.hashCode() + ((this.f388232b.hashCode() + (this.f388231a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f388235e;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f388236f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f388237g;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f388241k;
        int iIntValue = (iHashCode4 + (num != null ? num.intValue() : 0)) * 31;
        String str4 = this.f388238h;
        int iHashCode5 = (iIntValue + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f388239i;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        uj1 uj1Var = this.f388240j;
        int iHashCode7 = (iHashCode6 + (uj1Var != null ? uj1Var.hashCode() : 0)) * 31;
        jm1 jm1Var = this.f388243m;
        return this.f388244n.hashCode() + ((((iHashCode7 + (jm1Var != null ? jm1Var.hashCode() : 0)) * 31) + (this.f388245o ? 1 : 0)) * 31);
    }

    @j.P
    public final Integer i() {
        return this.f388241k;
    }

    public final String j() {
        return this.f388238h;
    }

    public final String k() {
        return this.f388239i;
    }

    @j.N
    public final af1 l() {
        return this.f388232b;
    }

    @j.P
    public final uj1 m() {
        return this.f388240j;
    }

    @j.P
    public final jm1 n() {
        return this.f388243m;
    }

    public final boolean o() {
        return this.f388245o;
    }
}
