package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f389074a;

    /* renamed from: b, reason: collision with root package name */
    private final int f389075b;

    public q3(int i12, int i13) {
        this.f389074a = i12;
        this.f389075b = i13;
    }

    public final int a() {
        return this.f389074a;
    }

    public final int b() {
        return this.f389075b;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q3.class != obj.getClass()) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return this.f389074a == q3Var.f389074a && this.f389075b == q3Var.f389075b;
    }

    public final int hashCode() {
        return (this.f389074a * 31) + this.f389075b;
    }
}
