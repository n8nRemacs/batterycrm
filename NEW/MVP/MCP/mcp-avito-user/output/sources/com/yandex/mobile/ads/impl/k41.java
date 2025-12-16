package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class k41 {

    /* renamed from: a, reason: collision with root package name */
    private final int f387044a;

    /* renamed from: b, reason: collision with root package name */
    private final int f387045b;

    public k41(int i12, int i13) {
        this.f387044a = i12;
        this.f387045b = i13;
    }

    public final int a() {
        return this.f387045b;
    }

    public final int b() {
        return this.f387044a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k41.class != obj.getClass()) {
            return false;
        }
        k41 k41Var = (k41) obj;
        return this.f387044a == k41Var.f387044a && this.f387045b == k41Var.f387045b;
    }

    public final int hashCode() {
        return (this.f387044a * 31) + this.f387045b;
    }
}
