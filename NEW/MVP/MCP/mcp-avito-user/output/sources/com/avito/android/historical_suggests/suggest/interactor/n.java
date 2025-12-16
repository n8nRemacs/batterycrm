package com.avito.android.historical_suggests.suggest.interactor;

import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nF.C44245a;
import pI.InterfaceC46962a;
import rI.InterfaceC47549a;

/* compiled from: HistoricalSuggestsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46962a> f162098a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47549a> f162099b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C44245a> f162100c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.historical_suggests.features.a> f162101d;

    /* renamed from: e, reason: collision with root package name */
    public final u f162102e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.historical_suggests.suggest.usecase.f> f162103f;

    public n(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f162098a = provider;
        this.f162099b = provider2;
        this.f162100c = provider3;
        this.f162101d = provider4;
        this.f162102e = uVar;
        this.f162103f = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(dagger.internal.g.a(w.a(this.f162098a)), dagger.internal.g.a(w.a(this.f162099b)), this.f162100c.get(), this.f162101d.get(), (com.avito.android.historical_suggests.suggest.usecase.i) this.f162102e.get(), this.f162103f.get());
    }
}
