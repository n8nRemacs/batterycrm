package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class eb<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final T f384830a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f384831b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final String f384832c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final h90 f384833d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f384834e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f384835f;

    public eb(@j.N String str, @j.N String str2, @j.N T t12, @j.P h90 h90Var, boolean z12, boolean z13) {
        this.f384831b = str;
        this.f384832c = str2;
        this.f384830a = t12;
        this.f384833d = h90Var;
        this.f384835f = z12;
        this.f384834e = z13;
    }

    @j.P
    public final h90 a() {
        return this.f384833d;
    }

    @j.N
    public final String b() {
        return this.f384831b;
    }

    @j.N
    public final String c() {
        return this.f384832c;
    }

    @j.N
    public final T d() {
        return this.f384830a;
    }

    public final boolean e() {
        return this.f384835f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eb.class != obj.getClass()) {
            return false;
        }
        eb ebVar = (eb) obj;
        if (this.f384834e != ebVar.f384834e || this.f384835f != ebVar.f384835f || !this.f384830a.equals(ebVar.f384830a) || !this.f384831b.equals(ebVar.f384831b) || !this.f384832c.equals(ebVar.f384832c)) {
            return false;
        }
        h90 h90Var = this.f384833d;
        h90 h90Var2 = ebVar.f384833d;
        return h90Var != null ? h90Var.equals(h90Var2) : h90Var2 == null;
    }

    public final boolean f() {
        return this.f384834e;
    }

    public final int hashCode() {
        int iA2 = v2.a(this.f384832c, v2.a(this.f384831b, this.f384830a.hashCode() * 31, 31), 31);
        h90 h90Var = this.f384833d;
        return ((((iA2 + (h90Var != null ? h90Var.hashCode() : 0)) * 31) + (this.f384834e ? 1 : 0)) * 31) + (this.f384835f ? 1 : 0);
    }
}
