package com.yandex.mobile.ads.impl;

import android.graphics.Typeface;

/* loaded from: classes8.dex */
public final class qw {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final Typeface f389319a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final Typeface f389320b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private final Typeface f389321c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private final Typeface f389322d;

    public qw(@Y61.l Typeface typeface, @Y61.l Typeface typeface2, @Y61.l Typeface typeface3, @Y61.l Typeface typeface4) {
        this.f389319a = typeface;
        this.f389320b = typeface2;
        this.f389321c = typeface3;
        this.f389322d = typeface4;
    }

    @Y61.l
    public final Typeface a() {
        return this.f389322d;
    }

    @Y61.l
    public final Typeface b() {
        return this.f389319a;
    }

    @Y61.l
    public final Typeface c() {
        return this.f389321c;
    }

    @Y61.l
    public final Typeface d() {
        return this.f389320b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw)) {
            return false;
        }
        qw qwVar = (qw) obj;
        return kotlin.jvm.internal.L.f(this.f389319a, qwVar.f389319a) && kotlin.jvm.internal.L.f(this.f389320b, qwVar.f389320b) && kotlin.jvm.internal.L.f(this.f389321c, qwVar.f389321c) && kotlin.jvm.internal.L.f(this.f389322d, qwVar.f389322d);
    }

    public final int hashCode() {
        Typeface typeface = this.f389319a;
        int iHashCode = (typeface == null ? 0 : typeface.hashCode()) * 31;
        Typeface typeface2 = this.f389320b;
        int iHashCode2 = (iHashCode + (typeface2 == null ? 0 : typeface2.hashCode())) * 31;
        Typeface typeface3 = this.f389321c;
        int iHashCode3 = (iHashCode2 + (typeface3 == null ? 0 : typeface3.hashCode())) * 31;
        Typeface typeface4 = this.f389322d;
        return iHashCode3 + (typeface4 != null ? typeface4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("FontTypefaceData(light=");
        sbA.append(this.f389319a);
        sbA.append(", regular=");
        sbA.append(this.f389320b);
        sbA.append(", medium=");
        sbA.append(this.f389321c);
        sbA.append(", bold=");
        sbA.append(this.f389322d);
        sbA.append(')');
        return sbA.toString();
    }
}
