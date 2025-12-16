package com.avito.android.virtual_deal_room_reference_category.reference_category.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScrollableReferenceCategoryModule_ProvideDataAwareAdapterPresenterImplFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f327246a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f327247b;

    /* renamed from: c, reason: collision with root package name */
    public final u f327248c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f327246a = provider;
        this.f327247b = provider2;
        this.f327248c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f327246a);
        com.avito.konveyor.adapter.h hVar = this.f327247b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f327248c.get();
        int i12 = c.f327244a;
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
