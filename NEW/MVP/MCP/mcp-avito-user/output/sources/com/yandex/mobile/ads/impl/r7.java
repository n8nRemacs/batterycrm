package com.yandex.mobile.ads.impl;

import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.yandex.mobile.ads.impl.s10;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final lr f389423a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final SocketFactory f389424b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private final SSLSocketFactory f389425c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private final HostnameVerifier f389426d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private final ki f389427e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final wc f389428f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private final Proxy f389429g = null;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private final ProxySelector f389430h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    private final s10 f389431i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    private final List<sv0> f389432j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    private final List<il> f389433k;

    public r7(@Y61.k String str, int i12, @Y61.k lr lrVar, @Y61.k SocketFactory socketFactory, @Y61.l SSLSocketFactory sSLSocketFactory, @Y61.l aq0 aq0Var, @Y61.l ki kiVar, @Y61.k wc wcVar, @Y61.k List list, @Y61.k List list2, @Y61.k ProxySelector proxySelector) {
        this.f389423a = lrVar;
        this.f389424b = socketFactory;
        this.f389425c = sSLSocketFactory;
        this.f389426d = aq0Var;
        this.f389427e = kiVar;
        this.f389428f = wcVar;
        this.f389430h = proxySelector;
        this.f389431i = new s10.a().c(sSLSocketFactory != null ? Constants.SCHEME : "http").b(str).a(i12).a();
        this.f389432j = qc1.b(list);
        this.f389433k = qc1.b(list2);
    }

    @Y61.l
    @X41.i
    public final ki a() {
        return this.f389427e;
    }

    @X41.i
    @Y61.k
    public final List<il> b() {
        return this.f389433k;
    }

    @X41.i
    @Y61.k
    public final lr c() {
        return this.f389423a;
    }

    @Y61.l
    @X41.i
    public final HostnameVerifier d() {
        return this.f389426d;
    }

    @X41.i
    @Y61.k
    public final List<sv0> e() {
        return this.f389432j;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof r7) {
            r7 r7Var = (r7) obj;
            if (kotlin.jvm.internal.L.f(this.f389431i, r7Var.f389431i) && a(r7Var)) {
                return true;
            }
        }
        return false;
    }

    @Y61.l
    @X41.i
    public final Proxy f() {
        return this.f389429g;
    }

    @X41.i
    @Y61.k
    public final wc g() {
        return this.f389428f;
    }

    @X41.i
    @Y61.k
    public final ProxySelector h() {
        return this.f389430h;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f389427e) + ((Objects.hashCode(this.f389426d) + ((Objects.hashCode(this.f389425c) + ((Objects.hashCode(this.f389429g) + ((this.f389430h.hashCode() + androidx.compose.foundation.H.e(androidx.compose.foundation.H.e((this.f389428f.hashCode() + ((this.f389423a.hashCode() + ((this.f389431i.hashCode() + 527) * 31)) * 31)) * 31, 31, this.f389432j), 31, this.f389433k)) * 31)) * 31)) * 31)) * 31);
    }

    @X41.i
    @Y61.k
    public final SocketFactory i() {
        return this.f389424b;
    }

    @Y61.l
    @X41.i
    public final SSLSocketFactory j() {
        return this.f389425c;
    }

    @X41.i
    @Y61.k
    public final s10 k() {
        return this.f389431i;
    }

    @Y61.k
    public final String toString() {
        String string;
        StringBuilder sbA = Cif.a("Address{");
        sbA.append(this.f389431i.g());
        sbA.append(':');
        sbA.append(this.f389431i.i());
        sbA.append(", ");
        if (this.f389429g != null) {
            StringBuilder sbA2 = Cif.a("proxy=");
            sbA2.append(this.f389429g);
            string = sbA2.toString();
        } else {
            StringBuilder sbA3 = Cif.a("proxySelector=");
            sbA3.append(this.f389430h);
            string = sbA3.toString();
        }
        return C22026a.c(sbA, string, '}');
    }

    public final boolean a(@Y61.k r7 r7Var) {
        return kotlin.jvm.internal.L.f(this.f389423a, r7Var.f389423a) && kotlin.jvm.internal.L.f(this.f389428f, r7Var.f389428f) && kotlin.jvm.internal.L.f(this.f389432j, r7Var.f389432j) && kotlin.jvm.internal.L.f(this.f389433k, r7Var.f389433k) && kotlin.jvm.internal.L.f(this.f389430h, r7Var.f389430h) && kotlin.jvm.internal.L.f(this.f389429g, r7Var.f389429g) && kotlin.jvm.internal.L.f(this.f389425c, r7Var.f389425c) && kotlin.jvm.internal.L.f(this.f389426d, r7Var.f389426d) && kotlin.jvm.internal.L.f(this.f389427e, r7Var.f389427e) && this.f389431i.i() == r7Var.f389431i.i();
    }
}
