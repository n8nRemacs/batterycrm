package com.avito.android.vas_performance.screens.stickers.buy.di;

import com.avito.android.vas_performance.deeplink.StickersBuyVasLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import tL0.C48573d;

/* compiled from: StickersBuyDeeplinkMappingsModule_ProvideStickersBuyVasDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.deeplink.handler.h f320644a;

    public g(com.avito.android.vas_performance.deeplink.handler.h hVar) {
        this.f320644a = hVar;
    }

    public static C43834a a(com.avito.android.vas_performance.deeplink.handler.h hVar) {
        f.f320643a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(StickersBuyVasLink.class, new C48573d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StickersBuyVasLink.class), hVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f320644a);
    }
}
