package com.avito.android.select.bottom_sheet.di;

import com.avito.android.select.bottom_sheet.n;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectBottomSheetModule_ProvideListAdapter$_avito_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f265277a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f265278b;

    /* renamed from: c, reason: collision with root package name */
    public final u f265279c;

    public g(u uVar, Provider provider, Provider provider2) {
        this.f265277a = provider;
        this.f265278b = provider2;
        this.f265279c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f265277a.get();
        com.avito.konveyor.a aVar2 = this.f265278b.get();
        n nVar = (n) this.f265279c.get();
        int i12 = c.f265261a;
        return new com.avito.konveyor.adapter.d(aVar, aVar2, nVar);
    }
}
