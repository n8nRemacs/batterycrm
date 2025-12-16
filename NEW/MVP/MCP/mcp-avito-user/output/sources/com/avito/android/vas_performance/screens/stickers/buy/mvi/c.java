package com.avito.android.vas_performance.screens.stickers.buy.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersBuyActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.d f320703a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.b f320704b;

    public c(com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.d dVar, com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.b bVar) {
        this.f320703a = dVar;
        this.f320704b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.c) this.f320703a.get(), (com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.a) this.f320704b.get());
    }
}
