package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* loaded from: classes8.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f391257a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f391258b;

    /* renamed from: c, reason: collision with root package name */
    private final int f391259c;

    public w2(int i12, @j.N String str, @j.N String str2) {
        this.f391259c = i12;
        this.f391258b = str;
        this.f391257a = str2;
    }

    public final int a() {
        return this.f391259c;
    }

    @j.N
    public final String b() {
        return this.f391258b;
    }

    @j.N
    public final String c() {
        return this.f391257a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w2.class != obj.getClass()) {
            return false;
        }
        w2 w2Var = (w2) obj;
        if (this.f391259c == w2Var.f391259c && this.f391258b.equals(w2Var.f391258b)) {
            return this.f391257a.equals(w2Var.f391257a);
        }
        return false;
    }

    public final int hashCode() {
        return v2.a(this.f391257a, this.f391258b.hashCode() * 31, 31) + this.f391259c;
    }

    @j.N
    public final String toString() {
        Locale locale = Locale.US;
        int i12 = this.f391259c;
        String str = this.f391258b;
        String str2 = this.f391257a;
        StringBuilder sb2 = new StringBuilder("AdFetchRequestError (code: ");
        sb2.append(i12);
        sb2.append(", description: ");
        sb2.append(str);
        sb2.append(", display_message: ");
        return AK.c.s(sb2, str2, ")");
    }
}
