package com.avito.android.lf_levels.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LfLevelsListModule_ProvideListRecyclerAdapter$_avito_lf_levels_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f175356a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f175357b;

    public h(u uVar, Provider provider) {
        this.f175356a = uVar;
        this.f175357b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f175356a.get();
        com.avito.konveyor.a aVar2 = this.f175357b.get();
        d.f175352a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
