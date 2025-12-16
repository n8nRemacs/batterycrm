package com.yandex.mobile.ads.impl;

import android.os.Bundle;

/* loaded from: classes8.dex */
public final class zp implements rg {

    /* renamed from: a, reason: collision with root package name */
    public final int f392331a;

    /* renamed from: b, reason: collision with root package name */
    public final int f392332b;

    /* renamed from: c, reason: collision with root package name */
    public final int f392333c;

    public zp(int i12, int i13, int i14) {
        this.f392331a = i12;
        this.f392332b = i13;
        this.f392333c = i14;
    }

    private static zp a(Bundle bundle) {
        return new zp(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp)) {
            return false;
        }
        zp zpVar = (zp) obj;
        return this.f392331a == zpVar.f392331a && this.f392332b == zpVar.f392332b && this.f392333c == zpVar.f392333c;
    }

    public final int hashCode() {
        return ((((this.f392331a + 527) * 31) + this.f392332b) * 31) + this.f392333c;
    }
}
