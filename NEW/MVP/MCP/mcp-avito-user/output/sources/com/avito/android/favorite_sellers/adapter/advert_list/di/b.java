package com.avito.android.favorite_sellers.adapter.advert_list.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertListItemModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f155532a;

    public b(u uVar) {
        this.f155532a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f155532a.get();
        int i12 = a.f155531a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
