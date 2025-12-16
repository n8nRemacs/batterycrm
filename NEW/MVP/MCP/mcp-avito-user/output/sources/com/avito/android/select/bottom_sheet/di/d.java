package com.avito.android.select.bottom_sheet.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectBottomSheetModule_ProvideAdapterPresenter$_avito_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f265262a;

    public d(u uVar) {
        this.f265262a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f265262a.get();
        int i12 = c.f265261a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
