package com.avito.android.similar_adverts.mvi;

import Lw0.InterfaceC14445b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SimilarAdvertsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.similar_adverts.d> f283969a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f283970b;

    /* renamed from: c, reason: collision with root package name */
    public final u f283971c;

    public h(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f283969a = provider;
        this.f283970b = lVar;
        this.f283971c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f283969a.get(), (String) this.f283970b.f393949a, (InterfaceC14445b) this.f283971c.get());
    }
}
