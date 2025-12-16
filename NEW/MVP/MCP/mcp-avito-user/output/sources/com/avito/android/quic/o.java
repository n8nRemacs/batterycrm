package com.avito.android.quic;

import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.ab_tests.Q;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.quic.performance.a;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import dagger.internal.y;
import javax.inject.Provider;
import t3.Z;

/* compiled from: QuicModule_ProvideRequestsPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<com.avito.android.quic.performance.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f246275a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f246276b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f246277c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f246278d;

    /* renamed from: e, reason: collision with root package name */
    public final K1 f246279e;

    /* renamed from: f, reason: collision with root package name */
    public final Z f246280f;

    public o(f fVar, dagger.internal.f fVar2, Provider provider, Provider provider2, K1 k12, Z z12) {
        this.f246275a = fVar;
        this.f246276b = fVar2;
        this.f246277c = provider;
        this.f246278d = provider2;
        this.f246279e = k12;
        this.f246280f = z12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f246276b.get();
        h31.e eVarB = dagger.internal.g.b(this.f246277c);
        InterfaceC35745a5 interfaceC35745a5 = this.f246278d.get();
        I1 i12 = (I1) this.f246279e.get();
        Q q12 = (Q) this.f246280f.get();
        this.f246275a.getClass();
        return new com.avito.android.quic.performance.a(new a.b(0, null, 0, 7, null), interfaceC28373a, eVarB, interfaceC35745a5, i12, q12);
    }
}
