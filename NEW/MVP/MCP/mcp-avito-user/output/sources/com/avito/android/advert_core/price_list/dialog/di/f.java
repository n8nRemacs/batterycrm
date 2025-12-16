package com.avito.android.advert_core.price_list.dialog.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertPriceListBottomSheetDialogModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final c f84062a;

    /* renamed from: b, reason: collision with root package name */
    public final u f84063b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f84064c;

    public f(c cVar, u uVar, Provider provider) {
        this.f84062a = cVar;
        this.f84063b = uVar;
        this.f84064c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f84063b.get();
        com.avito.konveyor.a aVar = this.f84064c.get();
        this.f84062a.getClass();
        return new j(hVar, aVar);
    }
}
