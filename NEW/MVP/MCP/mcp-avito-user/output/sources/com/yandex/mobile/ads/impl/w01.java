package com.yandex.mobile.ads.impl;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes8.dex */
public final class w01 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final r7 f391244a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Proxy f391245b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final InetSocketAddress f391246c;

    public w01(@Y61.k r7 r7Var, @Y61.k Proxy proxy, @Y61.k InetSocketAddress inetSocketAddress) {
        this.f391244a = r7Var;
        this.f391245b = proxy;
        this.f391246c = inetSocketAddress;
    }

    @X41.i
    @Y61.k
    public final r7 a() {
        return this.f391244a;
    }

    @X41.i
    @Y61.k
    public final Proxy b() {
        return this.f391245b;
    }

    public final boolean c() {
        return this.f391244a.j() != null && this.f391245b.type() == Proxy.Type.HTTP;
    }

    @X41.i
    @Y61.k
    public final InetSocketAddress d() {
        return this.f391246c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof w01) {
            w01 w01Var = (w01) obj;
            if (kotlin.jvm.internal.L.f(w01Var.f391244a, this.f391244a) && kotlin.jvm.internal.L.f(w01Var.f391245b, this.f391245b) && kotlin.jvm.internal.L.f(w01Var.f391246c, this.f391246c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f391246c.hashCode() + ((this.f391245b.hashCode() + ((this.f391244a.hashCode() + 527) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("Route{");
        sbA.append(this.f391246c);
        sbA.append('}');
        return sbA.toString();
    }
}
