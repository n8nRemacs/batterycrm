package com.avito.android.comfortable_deal.stages_transition.item.reasonslist.di;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReasonsListViewModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f122917a;

    public d(e eVar) {
        this.f122917a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f122917a.get();
        int i12 = c.f122916a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
