package com.android.volley;

import android.text.TextUtils;

/* compiled from: Header.java */
/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f67092a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67093b;

    public o(String str, String str2) {
        this.f67092a = str;
        this.f67093b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return TextUtils.equals(this.f67092a, oVar.f67092a) && TextUtils.equals(this.f67093b, oVar.f67093b);
    }

    public final int hashCode() {
        return this.f67093b.hashCode() + (this.f67092a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.f67092a);
        sb2.append(",value=");
        return AK.c.s(sb2, this.f67093b, "]");
    }
}
