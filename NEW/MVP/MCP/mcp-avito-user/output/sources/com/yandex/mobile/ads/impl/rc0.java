package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class rc0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f389468a;

    /* renamed from: b, reason: collision with root package name */
    private final String f389469b;

    /* renamed from: c, reason: collision with root package name */
    private final int f389470c;

    /* renamed from: d, reason: collision with root package name */
    private final String f389471d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final String f389472e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final Float f389473f;

    /* renamed from: g, reason: collision with root package name */
    private final int f389474g;

    /* renamed from: h, reason: collision with root package name */
    private final int f389475h;

    /* renamed from: i, reason: collision with root package name */
    public int f389476i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private String f389477a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private String f389478b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private int f389479c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private String f389480d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        private String f389481e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        private Float f389482f;

        /* renamed from: g, reason: collision with root package name */
        private int f389483g;

        /* renamed from: h, reason: collision with root package name */
        private int f389484h;

        /* renamed from: i, reason: collision with root package name */
        public int f389485i;

        @j.N
        public final a a(@j.P String str) {
            this.f389481e = str;
            return this;
        }

        @j.N
        public final a b(@j.P String str) {
            this.f389479c = sc0.a(str);
            return this;
        }

        @j.N
        public final a c(@j.P String str) {
            try {
                this.f389483g = Integer.valueOf(str).intValue();
            } catch (Exception unused) {
            }
            return this;
        }

        @j.N
        public final a d(@j.P String str) {
            this.f389477a = str;
            return this;
        }

        @j.N
        public final a e(@j.P String str) {
            this.f389480d = str;
            return this;
        }

        @j.N
        public final a f(@j.P String str) {
            this.f389478b = str;
            return this;
        }

        @j.N
        public final a g(@j.P String str) {
            Float fValueOf;
            int i12 = g7.f385602b;
            try {
                fValueOf = Float.valueOf(Float.parseFloat(str));
            } catch (Exception unused) {
                fValueOf = null;
            }
            this.f389482f = fValueOf;
            return this;
        }

        @j.N
        public final a h(@j.P String str) {
            try {
                this.f389484h = Integer.valueOf(str).intValue();
            } catch (Exception unused) {
            }
            return this;
        }

        @j.N
        public final rc0 a() {
            return new rc0(this);
        }
    }

    public rc0(@j.N a aVar) {
        this.f389468a = aVar.f389477a;
        this.f389469b = aVar.f389478b;
        this.f389470c = aVar.f389479c;
        this.f389474g = aVar.f389483g;
        this.f389476i = aVar.f389485i;
        this.f389475h = aVar.f389484h;
        this.f389471d = aVar.f389480d;
        this.f389472e = aVar.f389481e;
        this.f389473f = aVar.f389482f;
    }

    @j.P
    public final String a() {
        return this.f389472e;
    }

    public final int b() {
        return this.f389474g;
    }

    public final String c() {
        return this.f389471d;
    }

    public final String d() {
        return this.f389469b;
    }

    @j.P
    public final Float e() {
        return this.f389473f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rc0.class != obj.getClass()) {
            return false;
        }
        rc0 rc0Var = (rc0) obj;
        if (this.f389474g != rc0Var.f389474g || this.f389475h != rc0Var.f389475h || this.f389476i != rc0Var.f389476i || this.f389470c != rc0Var.f389470c) {
            return false;
        }
        String str = this.f389468a;
        if (str == null ? rc0Var.f389468a != null : !str.equals(rc0Var.f389468a)) {
            return false;
        }
        String str2 = this.f389471d;
        if (str2 == null ? rc0Var.f389471d != null : !str2.equals(rc0Var.f389471d)) {
            return false;
        }
        String str3 = this.f389469b;
        if (str3 == null ? rc0Var.f389469b != null : !str3.equals(rc0Var.f389469b)) {
            return false;
        }
        String str4 = this.f389472e;
        if (str4 == null ? rc0Var.f389472e != null : !str4.equals(rc0Var.f389472e)) {
            return false;
        }
        Float f12 = this.f389473f;
        Float f13 = rc0Var.f389473f;
        return f12 == null ? f13 == null : f12.equals(f13);
    }

    public final int f() {
        return this.f389475h;
    }

    public final int hashCode() {
        String str = this.f389468a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f389469b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i12 = this.f389470c;
        int iA2 = (((((((iHashCode2 + (i12 != 0 ? n6.a(i12) : 0)) * 31) + this.f389474g) * 31) + this.f389475h) * 31) + this.f389476i) * 31;
        String str3 = this.f389471d;
        int iHashCode3 = (iA2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f389472e;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Float f12 = this.f389473f;
        return iHashCode4 + (f12 != null ? f12.hashCode() : 0);
    }
}
