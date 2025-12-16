package com.avito.android.vas_performance.screens.stickers.buy.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.vas_performance.screens.stickers.buy.StickersBuyMviScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersBuyModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f320656a;

    public o(dagger.internal.l lVar) {
        this.f320656a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f320656a.f393949a;
        n.f320655a.getClass();
        return new C28478k(StickersBuyMviScreen.f320610d, rVar, null, 4, null);
    }
}
