package com.avito.android.calltracking.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalltrackingFragmentModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f113666a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f113667b;

    public h(Provider<com.avito.konveyor.adapter.a> provider, Provider<com.avito.konveyor.a> provider2) {
        this.f113666a = provider;
        this.f113667b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f113666a.get();
        com.avito.konveyor.a aVar2 = this.f113667b.get();
        g.f113665a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
