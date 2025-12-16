package com.avito.android.user_advert.soa_with_price.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CloseReasonSheetDialogModule_ProvideAdapterPresenter$_avito_user_advert_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f311885a;

    public d(u uVar) {
        this.f311885a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f311885a.get();
        int i12 = c.f311884a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
