package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class rb0 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final String f389460a;

    /* renamed from: b, reason: collision with root package name */
    private final float f389461b;

    public rb0(@j.P String str, float f12) {
        this.f389460a = str;
        this.f389461b = f12;
    }

    public final float a() {
        return this.f389461b;
    }

    @j.P
    public final String b() {
        return this.f389460a;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rb0.class != obj.getClass()) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        if (Float.compare(rb0Var.f389461b, this.f389461b) != 0) {
            return false;
        }
        String str = this.f389460a;
        return str != null ? str.equals(rb0Var.f389460a) : rb0Var.f389460a == null;
    }

    public final int hashCode() {
        String str = this.f389460a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        float f12 = this.f389461b;
        return iHashCode + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0);
    }
}
