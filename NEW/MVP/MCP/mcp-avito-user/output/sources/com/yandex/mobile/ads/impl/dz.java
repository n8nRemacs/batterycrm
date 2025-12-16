package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes8.dex */
public final class dz {

    /* renamed from: a, reason: collision with root package name */
    private final String f384714a;

    /* renamed from: b, reason: collision with root package name */
    private final String f384715b;

    public dz(String str, String str2) {
        this.f384714a = str;
        this.f384715b = str2;
    }

    public final String a() {
        return this.f384714a;
    }

    public final String b() {
        return this.f384715b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dz.class != obj.getClass()) {
            return false;
        }
        dz dzVar = (dz) obj;
        return TextUtils.equals(this.f384714a, dzVar.f384714a) && TextUtils.equals(this.f384715b, dzVar.f384715b);
    }

    public final int hashCode() {
        return this.f384715b.hashCode() + (this.f384714a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("Header[name=");
        sbA.append(this.f384714a);
        sbA.append(",value=");
        return AK.c.s(sbA, this.f384715b, "]");
    }
}
