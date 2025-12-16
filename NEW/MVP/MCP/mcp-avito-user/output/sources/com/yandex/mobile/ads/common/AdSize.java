package com.yandex.mobile.ads.common;

import com.yandex.mobile.ads.impl.Cif;
import j.N;
import j.r;

/* loaded from: classes8.dex */
public class AdSize {

    /* renamed from: a, reason: collision with root package name */
    private final int f382685a;

    /* renamed from: b, reason: collision with root package name */
    private final int f382686b;

    public AdSize(int i12, int i13) {
        this.f382685a = i12;
        this.f382686b = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f382685a == adSize.f382685a && this.f382686b == adSize.f382686b;
    }

    @r
    public int getHeight() {
        return this.f382686b;
    }

    @r
    public int getWidth() {
        return this.f382685a;
    }

    public int hashCode() {
        return (this.f382685a * 31) + this.f382686b;
    }

    @N
    public String toString() {
        StringBuilder sbA = Cif.a("AdSize{mWidth=");
        sbA.append(this.f382685a);
        sbA.append(", mHeight=");
        return androidx.appcompat.app.r.t(sbA, this.f382686b, '}');
    }
}
