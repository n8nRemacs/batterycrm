package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class l31 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private String f387368a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private Long f387369b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f387370c;

    public final void a(@j.P String str) {
        this.f387368a = str;
    }

    @j.P
    public final String b() {
        return this.f387368a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l31.class != obj.getClass()) {
            return false;
        }
        l31 l31Var = (l31) obj;
        if (this.f387370c != l31Var.f387370c) {
            return false;
        }
        String str = this.f387368a;
        if (str == null ? l31Var.f387368a != null : !str.equals(l31Var.f387368a)) {
            return false;
        }
        Long l12 = this.f387369b;
        return l12 != null ? l12.equals(l31Var.f387369b) : l31Var.f387369b == null;
    }

    public final int hashCode() {
        String str = this.f387368a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l12 = this.f387369b;
        return ((iHashCode + (l12 != null ? l12.hashCode() : 0)) * 31) + (this.f387370c ? 1 : 0);
    }

    public final void a(boolean z12) {
        this.f387370c = z12;
    }

    @j.P
    public final Long a() {
        return this.f387369b;
    }

    public final void a(@j.P Long l12) {
        this.f387369b = l12;
    }
}
