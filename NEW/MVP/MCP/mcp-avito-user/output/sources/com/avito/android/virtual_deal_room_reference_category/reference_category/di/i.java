package com.avito.android.virtual_deal_room_reference_category.reference_category.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScrollableReferenceCategoryModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f327252a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f327253b;

    public i(u uVar, Provider provider) {
        this.f327252a = uVar;
        this.f327253b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f327252a.get();
        com.avito.konveyor.a aVar2 = this.f327253b.get();
        int i12 = c.f327244a;
        return new j(aVar, aVar2);
    }
}
