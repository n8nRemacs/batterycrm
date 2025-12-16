package com.avito.android.rating_form.select_item.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormSelectItemModule_ProvideResponsiveAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<com.avito.android.recycler.responsive.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f249008a;

    /* renamed from: b, reason: collision with root package name */
    public final u f249009b;

    public f(u uVar, Provider provider) {
        this.f249008a = provider;
        this.f249009b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f249008a.get();
        com.avito.android.recycler.responsive.a aVar2 = (com.avito.android.recycler.responsive.a) this.f249009b.get();
        c.f249007a.getClass();
        return new com.avito.android.recycler.responsive.f(aVar, aVar2);
    }
}
