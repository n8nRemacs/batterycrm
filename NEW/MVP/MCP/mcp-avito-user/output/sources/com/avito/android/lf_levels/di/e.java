package com.avito.android.lf_levels.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LfLevelsListModule_ProvideAdapterPresenter$_avito_lf_levels_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f175353a;

    public e(u uVar) {
        this.f175353a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f175353a.get();
        d.f175352a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
