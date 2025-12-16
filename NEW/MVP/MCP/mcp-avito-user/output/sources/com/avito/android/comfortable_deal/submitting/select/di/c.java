package com.avito.android.comfortable_deal.submitting.select.di;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectRecyclerModule_BindItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f123327a;

    /* renamed from: b, reason: collision with root package name */
    public final l f123328b;

    public c(l lVar, l lVar2) {
        this.f123327a = lVar;
        this.f123328b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f123327a.f393949a;
        Y41.a aVar = (Y41.a) this.f123328b.f393949a;
        b.f123326a.getClass();
        return new com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.d(aVar, lVar);
    }
}
