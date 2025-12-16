package com.yandex.mobile.ads.impl;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final String f385581a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final String f385582b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final String f385583c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final List<String> f385584d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final Location f385585e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final Map<String, String> f385586f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private final String f385587g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private final AdTheme f385588h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private String f385589a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private String f385590b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private Location f385591c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private String f385592d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        private List<String> f385593e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        private Map<String, String> f385594f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        private String f385595g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        private AdTheme f385596h;

        @j.N
        public final g5 a() {
            return new g5(this, 0);
        }

        @j.N
        public final a b(@j.P String str) {
            this.f385595g = str;
            return this;
        }

        @j.N
        public final a c(@j.P String str) {
            this.f385592d = str;
            return this;
        }

        @j.N
        public final a d(@j.P String str) {
            this.f385590b = str;
            return this;
        }

        @j.N
        public final a a(@j.P String str) {
            this.f385589a = str;
            return this;
        }

        @j.N
        public final a a(@j.P List<String> list) {
            this.f385593e = list;
            return this;
        }

        @j.N
        public final a a(@j.P Location location) {
            this.f385591c = location;
            return this;
        }

        @j.N
        public final a a(@j.P Map<String, String> map) {
            this.f385594f = map;
            return this;
        }

        @j.N
        public final a a(@j.P AdTheme adTheme) {
            this.f385596h = adTheme;
            return this;
        }
    }

    public /* synthetic */ g5(a aVar, int i12) {
        this(aVar);
    }

    @j.P
    public final String a() {
        return this.f385581a;
    }

    @j.P
    public final String b() {
        return this.f385587g;
    }

    @j.P
    public final String c() {
        return this.f385583c;
    }

    @j.P
    public final List<String> d() {
        return this.f385584d;
    }

    @j.P
    public final String e() {
        return this.f385582b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g5.class != obj.getClass()) {
            return false;
        }
        g5 g5Var = (g5) obj;
        String str = this.f385581a;
        if (str == null ? g5Var.f385581a != null : !str.equals(g5Var.f385581a)) {
            return false;
        }
        String str2 = this.f385582b;
        if (str2 == null ? g5Var.f385582b != null : !str2.equals(g5Var.f385582b)) {
            return false;
        }
        String str3 = this.f385583c;
        if (str3 == null ? g5Var.f385583c != null : !str3.equals(g5Var.f385583c)) {
            return false;
        }
        List<String> list = this.f385584d;
        if (list == null ? g5Var.f385584d != null : !list.equals(g5Var.f385584d)) {
            return false;
        }
        Location location = this.f385585e;
        if (location == null ? g5Var.f385585e != null : !location.equals(g5Var.f385585e)) {
            return false;
        }
        Map<String, String> map = this.f385586f;
        if (map == null ? g5Var.f385586f != null : !map.equals(g5Var.f385586f)) {
            return false;
        }
        String str4 = this.f385587g;
        if (str4 == null ? g5Var.f385587g == null : str4.equals(g5Var.f385587g)) {
            return this.f385588h == g5Var.f385588h;
        }
        return false;
    }

    @j.P
    public final Location f() {
        return this.f385585e;
    }

    @j.P
    public final Map<String, String> g() {
        return this.f385586f;
    }

    @j.P
    public final AdTheme h() {
        return this.f385588h;
    }

    public final int hashCode() {
        String str = this.f385581a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f385582b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f385583c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f385584d;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f385585e;
        int iHashCode5 = (iHashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f385586f;
        int iHashCode6 = (iHashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f385587g;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f385588h;
        return iHashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private g5(@j.N a aVar) {
        this.f385581a = aVar.f385589a;
        this.f385582b = aVar.f385590b;
        this.f385583c = aVar.f385592d;
        this.f385584d = aVar.f385593e;
        this.f385585e = aVar.f385591c;
        this.f385586f = aVar.f385594f;
        this.f385587g = aVar.f385595g;
        this.f385588h = aVar.f385596h;
    }
}
