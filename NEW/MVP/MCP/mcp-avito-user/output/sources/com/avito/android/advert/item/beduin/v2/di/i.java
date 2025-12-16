package com.avito.android.advert.item.beduin.v2.di;

import com.avito.android.advert.item.beduin.v2.q;
import com.avito.android.advert.item.beduin.v2.s;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemCardNativeCellWrapperModule_ItemCardNativeCellWrapperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<com.avito.android.advert.item.beduin.v2.i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f73303a;

    /* renamed from: b, reason: collision with root package name */
    public final s f73304b;

    public i(l lVar, s sVar) {
        this.f73303a = lVar;
        this.f73304b = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.a aVar = (Y41.a) this.f73303a.f393949a;
        q qVar = (q) this.f73304b.get();
        g.f73301a.getClass();
        return new com.avito.android.advert.item.beduin.v2.i(aVar, qVar);
    }
}
