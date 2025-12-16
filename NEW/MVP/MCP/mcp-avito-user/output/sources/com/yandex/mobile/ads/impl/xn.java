package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class xn {

    /* renamed from: a, reason: collision with root package name */
    public final String f391780a;

    /* renamed from: b, reason: collision with root package name */
    public final vw f391781b;

    /* renamed from: c, reason: collision with root package name */
    public final vw f391782c;

    /* renamed from: d, reason: collision with root package name */
    public final int f391783d;

    /* renamed from: e, reason: collision with root package name */
    public final int f391784e;

    public xn(String str, vw vwVar, vw vwVar2, int i12, int i13) {
        db.a(i12 == 0 || i13 == 0);
        this.f391780a = db.a(str);
        this.f391781b = (vw) db.a(vwVar);
        this.f391782c = (vw) db.a(vwVar2);
        this.f391783d = i12;
        this.f391784e = i13;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xn.class != obj.getClass()) {
            return false;
        }
        xn xnVar = (xn) obj;
        return this.f391783d == xnVar.f391783d && this.f391784e == xnVar.f391784e && this.f391780a.equals(xnVar.f391780a) && this.f391781b.equals(xnVar.f391781b) && this.f391782c.equals(xnVar.f391782c);
    }

    public final int hashCode() {
        return this.f391782c.hashCode() + ((this.f391781b.hashCode() + v2.a(this.f391780a, (((this.f391783d + 527) * 31) + this.f391784e) * 31, 31)) * 31);
    }
}
