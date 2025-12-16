package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class d40 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f384523a;

    /* renamed from: b, reason: collision with root package name */
    private final int f384524b;

    /* renamed from: c, reason: collision with root package name */
    private final int f384525c;

    public d40(int i12, int i13, @j.N String str) {
        this.f384523a = str;
        this.f384524b = i12;
        this.f384525c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d40.class != obj.getClass()) {
            return false;
        }
        d40 d40Var = (d40) obj;
        if (this.f384524b == d40Var.f384524b && this.f384525c == d40Var.f384525c) {
            return this.f384523a.equals(d40Var.f384523a);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f384523a.hashCode() * 31) + this.f384524b) * 31) + this.f384525c;
    }
}
