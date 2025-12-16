package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class c51 {

    /* renamed from: a, reason: collision with root package name */
    private final int f384180a;

    /* renamed from: b, reason: collision with root package name */
    private final int f384181b;

    /* renamed from: c, reason: collision with root package name */
    private final int f384182c;

    /* renamed from: d, reason: collision with root package name */
    private final int f384183d;

    /* renamed from: e, reason: collision with root package name */
    private final int f384184e;

    public c51(int i12, int i13, int i14, int i15) {
        this.f384180a = i12;
        this.f384181b = i13;
        this.f384182c = i14;
        this.f384183d = i15;
        this.f384184e = i14 * i15;
    }

    public final int a() {
        return this.f384184e;
    }

    public final int b() {
        return this.f384183d;
    }

    public final int c() {
        return this.f384182c;
    }

    public final int d() {
        return this.f384180a;
    }

    public final int e() {
        return this.f384181b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c51)) {
            return false;
        }
        c51 c51Var = (c51) obj;
        return this.f384180a == c51Var.f384180a && this.f384181b == c51Var.f384181b && this.f384182c == c51Var.f384182c && this.f384183d == c51Var.f384183d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f384183d) + androidx.appcompat.app.r.e(this.f384182c, androidx.appcompat.app.r.e(this.f384181b, Integer.hashCode(this.f384180a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("SmartCenter(x=");
        sbA.append(this.f384180a);
        sbA.append(", y=");
        sbA.append(this.f384181b);
        sbA.append(", width=");
        sbA.append(this.f384182c);
        sbA.append(", height=");
        return androidx.appcompat.app.r.t(sbA, this.f384183d, ')');
    }
}
