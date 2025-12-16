package com.avito.android.quic;

import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QuicInterceptorImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f246240a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.quic.cronet.f> f246241b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.quic.cronet.s f246242c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<p> f246243d;

    /* renamed from: e, reason: collision with root package name */
    public final K1 f246244e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.quic.cronet.o> f246245f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<a> f246246g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<CronetTcpRstReporter> f246247h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.quic.tracking.i f246248i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f246249j;

    public d(dagger.internal.f fVar, Provider provider, com.avito.android.quic.cronet.s sVar, Provider provider2, K1 k12, Provider provider3, Provider provider4, Provider provider5, com.avito.android.quic.tracking.i iVar, Provider provider6) {
        this.f246240a = fVar;
        this.f246241b = provider;
        this.f246242c = sVar;
        this.f246243d = provider2;
        this.f246244e = k12;
        this.f246245f = provider3;
        this.f246246g = provider4;
        this.f246247h = provider5;
        this.f246248i = iVar;
        this.f246249j = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f246240a.get();
        com.avito.android.quic.cronet.f fVar = this.f246241b.get();
        this.f246242c.getClass();
        return new c(interfaceC28373a, fVar, new com.avito.android.quic.cronet.r(), this.f246243d.get(), (I1) this.f246244e.get(), this.f246245f.get(), this.f246246g.get(), this.f246247h.get(), (com.avito.android.quic.tracking.e) this.f246248i.get(), this.f246249j.get());
    }
}
