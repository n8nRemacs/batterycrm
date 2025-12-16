package com.avito.android.quic;

import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.ab_tests.Q;
import com.avito.android.ab_tests.QuicTuningAB;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.W6;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
import com.avito.android.quic.p;
import com.avito.android.remote.analytics.C34250g;
import dagger.internal.y;
import javax.inject.Provider;
import t3.Z;
import t3.b0;

/* compiled from: QuicStrategyImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final K1 f246321a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f246322b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f246323c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f246324d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<a> f246325e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.quic.cronet.d> f246326f;

    /* renamed from: g, reason: collision with root package name */
    public final W6 f246327g;

    /* renamed from: h, reason: collision with root package name */
    public final C34250g f246328h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f246329i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.quic.cronet.o> f246330j;

    public s(K1 k12, Z z12, b0 b0Var, dagger.internal.f fVar, Provider provider, Provider provider2, W6 w62, C34250g c34250g, dagger.internal.u uVar, Provider provider3) {
        this.f246321a = k12;
        this.f246322b = z12;
        this.f246323c = b0Var;
        this.f246324d = fVar;
        this.f246325e = provider;
        this.f246326f = provider2;
        this.f246327g = w62;
        this.f246328h = c34250g;
        this.f246329i = uVar;
        this.f246330j = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new q((I1) this.f246321a.get(), (Q) this.f246322b.get(), (QuicTuningAB) this.f246323c.get(), (InterfaceC28373a) this.f246324d.get(), this.f246325e.get(), this.f246326f.get(), (p.b) this.f246327g.get(), (CronetTcpRstReporter.b) this.f246328h.get(), (com.avito.android.quic.cronet.t) this.f246329i.get(), this.f246330j.get());
    }
}
