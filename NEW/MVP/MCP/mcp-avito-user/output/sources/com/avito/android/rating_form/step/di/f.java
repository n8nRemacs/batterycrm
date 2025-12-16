package com.avito.android.rating_form.step.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormStepModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f249280a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f249281b;

    public f(u uVar, Provider provider) {
        this.f249280a = uVar;
        this.f249281b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f249280a.get();
        com.avito.konveyor.a aVar = this.f249281b.get();
        e.f249279a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, aVar);
    }
}
