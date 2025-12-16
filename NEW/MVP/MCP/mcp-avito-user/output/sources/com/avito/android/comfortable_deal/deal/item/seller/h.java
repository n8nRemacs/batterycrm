package com.avito.android.comfortable_deal.deal.item.seller;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f121512a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.common.formatter.b f121513b;

    public h(l lVar, com.avito.android.comfortable_deal.common.formatter.b bVar) {
        this.f121512a = lVar;
        this.f121513b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y41.l) this.f121512a.f393949a, (com.avito.android.comfortable_deal.common.formatter.a) this.f121513b.get());
    }
}
