package com.avito.android.rating_form.select_item.di;

import com.avito.android.recycler.responsive.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormSelectItemModule_ProvideResponsiveRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f249011a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f249012b;

    public h(u uVar, Provider provider) {
        this.f249011a = uVar;
        this.f249012b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.responsive.e eVar = (com.avito.android.recycler.responsive.e) this.f249011a.get();
        com.avito.konveyor.a aVar = this.f249012b.get();
        c.f249007a.getClass();
        return new j(eVar, aVar);
    }
}
