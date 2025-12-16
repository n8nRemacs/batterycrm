package com.avito.android.bxcontent.mvi;

import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: BxContentReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class K0 implements dagger.internal.h<J0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f111395a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.bxcontent.U0> f111396b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f111397c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f111398d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f111399e;

    public K0(Provider provider, Provider provider2, dagger.internal.u uVar, d1 d1Var, Provider provider3) {
        this.f111395a = provider;
        this.f111396b = provider2;
        this.f111397c = uVar;
        this.f111398d = d1Var;
        this.f111399e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new J0(this.f111395a.get(), this.f111396b.get(), (com.avito.android.serp.adapter.skeleton.c) this.f111397c.get(), (b1) this.f111398d.get(), this.f111399e.get());
    }
}
