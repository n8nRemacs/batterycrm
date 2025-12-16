package com.avito.android.advert_core.price_list.dialog.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertPriceListBottomSheetDialogModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final c f84058a;

    /* renamed from: b, reason: collision with root package name */
    public final u f84059b;

    public d(c cVar, u uVar) {
        this.f84058a = cVar;
        this.f84059b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f84059b.get();
        this.f84058a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
