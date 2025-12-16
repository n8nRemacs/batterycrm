package com.avito.android.vas_performance.screens.stickers.buy.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersBuyBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.b f320730a;

    public e(com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.b bVar) {
        this.f320730a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.a) this.f320730a.get());
    }
}
