package com.avito.android.virtual_deal_room_reference_category.reference_category.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ScrollableReferenceCategoryModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f327245a;

    public d(u uVar) {
        this.f327245a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f327245a.get();
        int i12 = c.f327244a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
