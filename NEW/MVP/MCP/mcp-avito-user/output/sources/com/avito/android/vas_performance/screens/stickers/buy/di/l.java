package com.avito.android.vas_performance.screens.stickers.buy.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersBuyListModule_ProvideItemBinder$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.common_item.header.b f320649a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.stickers.buy.item.stickers.d f320650b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.c f320651c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.common_item.attributed_text.c f320652d;

    public l(com.avito.android.vas_performance.screens.common_item.header.b bVar, com.avito.android.vas_performance.screens.stickers.buy.item.stickers.d dVar, com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.c cVar, com.avito.android.vas_performance.screens.common_item.attributed_text.c cVar2) {
        this.f320649a = bVar;
        this.f320650b = dVar;
        this.f320651c = cVar;
        this.f320652d = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.vas_performance.screens.common_item.header.a aVar = (com.avito.android.vas_performance.screens.common_item.header.a) this.f320649a.get();
        com.avito.android.vas_performance.screens.stickers.buy.item.stickers.c cVar = (com.avito.android.vas_performance.screens.stickers.buy.item.stickers.c) this.f320650b.get();
        com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.b bVar = (com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.b) this.f320651c.get();
        com.avito.android.vas_performance.screens.common_item.attributed_text.b bVar2 = (com.avito.android.vas_performance.screens.common_item.attributed_text.b) this.f320652d.get();
        j.f320647a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(cVar);
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
