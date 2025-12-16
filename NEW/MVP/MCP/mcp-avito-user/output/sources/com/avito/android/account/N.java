package com.avito.android.account;

import f90.InterfaceC40259h;
import javax.inject.Provider;

/* compiled from: AccountStorageInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class N implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final f90.w f68057a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l90.g> f68058b;

    /* renamed from: c, reason: collision with root package name */
    public final B3.n f68059c;

    /* renamed from: d, reason: collision with root package name */
    public final B3.p f68060d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f68061e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f68062f;

    public N(f90.w wVar, Provider provider, B3.n nVar, B3.p pVar, Provider provider2, dagger.internal.u uVar) {
        this.f68057a = wVar;
        this.f68058b = provider;
        this.f68059c = nVar;
        this.f68060d = pVar;
        this.f68061e = provider2;
        this.f68062f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new M((InterfaceC40259h) this.f68057a.get(), this.f68058b.get(), (B3.g) this.f68059c.get(), (B3.h) this.f68060d.get(), this.f68061e.get(), (a0) this.f68062f.get());
    }
}
