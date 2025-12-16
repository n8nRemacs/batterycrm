package com.avito.android.vas_performance.screens.stickers.buy;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: StickersBuyViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.stickers.buy.mvi.h f320695a;

    public j(com.avito.android.vas_performance.screens.stickers.buy.mvi.h hVar) {
        this.f320695a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.screens.stickers.buy.mvi.g gVar = (com.avito.android.vas_performance.screens.stickers.buy.mvi.g) this.f320695a.get();
        i2.f411430a.getClass();
        return new i(gVar, i2.a.f411433c);
    }
}
