package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class g20 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ka f385549a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final String f385550b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final k20 f385551c;

    public g20(@Y61.k ka kaVar, @Y61.k String str, @Y61.k k20 k20Var) {
        this.f385549a = kaVar;
        this.f385550b = str;
        this.f385551c = k20Var;
    }

    @Y61.k
    public final ka a() {
        return this.f385549a;
    }

    @Y61.k
    public final k20 b() {
        return this.f385551c;
    }

    @Y61.k
    public final String c() {
        return this.f385550b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g20)) {
            return false;
        }
        g20 g20Var = (g20) obj;
        return kotlin.jvm.internal.L.f(this.f385549a, g20Var.f385549a) && kotlin.jvm.internal.L.f(this.f385550b, g20Var.f385550b) && this.f385551c == g20Var.f385551c;
    }

    public final int hashCode() {
        return this.f385551c.hashCode() + v2.a(this.f385550b, this.f385549a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("Identifiers(appMetricaIdentifiers=");
        sbA.append(this.f385549a);
        sbA.append(", mauid=");
        sbA.append(this.f385550b);
        sbA.append(", identifiersType=");
        sbA.append(this.f385551c);
        sbA.append(')');
        return sbA.toString();
    }
}
