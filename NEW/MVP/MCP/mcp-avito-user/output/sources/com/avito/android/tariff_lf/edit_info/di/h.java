package com.avito.android.tariff_lf.edit_info.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditInfoModule_ProvideMicroCategoryAdapterPresenter$_avito_tariff_lf_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298860a;

    public h(u uVar) {
        this.f298860a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f298860a.get();
        c.f298839a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
