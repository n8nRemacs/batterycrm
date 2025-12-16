package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class b30 {

    /* renamed from: a, reason: collision with root package name */
    private int f383767a;

    /* renamed from: b, reason: collision with root package name */
    private int f383768b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private String f383769c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private String f383770d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private k51 f383771e;

    public final int a() {
        return this.f383768b;
    }

    @j.P
    public final String b() {
        return this.f383770d;
    }

    @j.P
    public final k51 c() {
        return this.f383771e;
    }

    @j.P
    public final String d() {
        return this.f383769c;
    }

    public final int e() {
        return this.f383767a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b30.class != obj.getClass()) {
            return false;
        }
        b30 b30Var = (b30) obj;
        if (this.f383767a != b30Var.f383767a || this.f383768b != b30Var.f383768b) {
            return false;
        }
        String str = this.f383769c;
        if (str == null ? b30Var.f383769c != null : !str.equals(b30Var.f383769c)) {
            return false;
        }
        String str2 = this.f383770d;
        if (str2 == null ? b30Var.f383770d != null : !str2.equals(b30Var.f383770d)) {
            return false;
        }
        k51 k51Var = this.f383771e;
        return k51Var != null ? k51Var.equals(b30Var.f383771e) : b30Var.f383771e == null;
    }

    public final int hashCode() {
        int i12 = ((this.f383767a * 31) + this.f383768b) * 31;
        String str = this.f383769c;
        int iHashCode = (i12 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f383770d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        k51 k51Var = this.f383771e;
        return iHashCode2 + (k51Var != null ? k51Var.hashCode() : 0);
    }

    public final void a(int i12) {
        this.f383768b = i12;
    }

    public final void b(int i12) {
        this.f383767a = i12;
    }

    public final void a(@j.P String str) {
        this.f383770d = str;
    }

    public final void b(@j.P String str) {
        this.f383769c = str;
    }

    public final void a(@j.P k51 k51Var) {
        this.f383771e = k51Var;
    }
}
