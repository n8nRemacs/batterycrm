package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    public final int f384580a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final float f384581b = 0.0f;

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dd.class != obj.getClass()) {
            return false;
        }
        dd ddVar = (dd) obj;
        return this.f384580a == ddVar.f384580a && Float.compare(ddVar.f384581b, this.f384581b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f384581b) + ((this.f384580a + 527) * 31);
    }
}
