package com.avito.android.calltracking;

import javax.inject.Provider;

/* compiled from: CalltrackingPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<M> f113571a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f113572b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f113573c;

    public E(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f113571a = provider;
        this.f113572b = uVar;
        this.f113573c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D(this.f113571a.get(), (com.avito.konveyor.adapter.a) this.f113572b.get(), (InterfaceC29287o) this.f113573c.f393949a);
    }
}
