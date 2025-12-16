package com.avito.android.advert_amenities.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AmenityBottomSheetDialogModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f81148a;

    /* renamed from: b, reason: collision with root package name */
    public final u f81149b;

    public c(b bVar, u uVar) {
        this.f81148a = bVar;
        this.f81149b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f81149b.get();
        this.f81148a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
