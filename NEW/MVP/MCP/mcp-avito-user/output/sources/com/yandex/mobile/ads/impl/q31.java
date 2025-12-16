package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class q31 {

    /* renamed from: a, reason: collision with root package name */
    private long f389079a;

    /* renamed from: b, reason: collision with root package name */
    private String f389080b;

    /* renamed from: c, reason: collision with root package name */
    private int f389081c;

    public final void a(long j12) {
        this.f389079a = j12;
    }

    public final String b() {
        return this.f389080b;
    }

    public final int c() {
        return this.f389081c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q31.class != obj.getClass()) {
            return false;
        }
        q31 q31Var = (q31) obj;
        if (this.f389079a != q31Var.f389079a || this.f389081c != q31Var.f389081c) {
            return false;
        }
        String str = this.f389080b;
        String str2 = q31Var.f389080b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        long j12 = this.f389079a;
        int i12 = ((int) (j12 ^ (j12 >>> 32))) * 31;
        String str = this.f389080b;
        return ((i12 + (str != null ? str.hashCode() : 0)) * 31) + this.f389081c;
    }

    public final void a(String str) {
        this.f389080b = str;
    }

    public final void a(int i12) {
        this.f389081c = i12;
    }

    public final long a() {
        return this.f389079a;
    }
}
