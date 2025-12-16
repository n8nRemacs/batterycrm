package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class qs {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f389288a;

    /* renamed from: b, reason: collision with root package name */
    private final int f389289b;

    public qs(int i12, @j.N String str) {
        this.f389288a = str;
        this.f389289b = i12;
    }

    @j.N
    public final String a() {
        return this.f389288a;
    }

    public final int b() {
        return this.f389289b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qs.class != obj.getClass()) {
            return false;
        }
        qs qsVar = (qs) obj;
        if (this.f389289b != qsVar.f389289b) {
            return false;
        }
        return this.f389288a.equals(qsVar.f389288a);
    }

    public final int hashCode() {
        return (this.f389288a.hashCode() * 31) + this.f389289b;
    }
}
