package com.yandex.mobile.ads.impl;

import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class dq0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f384648a;

    /* renamed from: b, reason: collision with root package name */
    private final int f384649b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private final SSLSocketFactory f384650c;

    public dq0(int i12, int i13, @Y61.l SSLSocketFactory sSLSocketFactory) {
        this.f384648a = i12;
        this.f384649b = i13;
        this.f384650c = sSLSocketFactory;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq0)) {
            return false;
        }
        dq0 dq0Var = (dq0) obj;
        return this.f384648a == dq0Var.f384648a && this.f384649b == dq0Var.f384649b && kotlin.jvm.internal.L.f(this.f384650c, dq0Var.f384650c);
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f384649b, Integer.hashCode(this.f384648a) * 31, 31);
        SSLSocketFactory sSLSocketFactory = this.f384650c;
        return iE2 + (sSLSocketFactory == null ? 0 : sSLSocketFactory.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("OkHttpConfiguration(connectionTimeoutMs=");
        sbA.append(this.f384648a);
        sbA.append(", readTimeoutMs=");
        sbA.append(this.f384649b);
        sbA.append(", sslSocketFactory=");
        sbA.append(this.f384650c);
        sbA.append(')');
        return sbA.toString();
    }
}
