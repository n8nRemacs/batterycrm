package com.avito.android.vas_performance.screens.stickers.buy.di;

import Zx.C19616a;
import ay.C24193b;
import com.avito.android.vas_performance.deeplink.StickersBuyVasLink;
import com.avito.android.vas_performance.q;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: StickersBuyFragmentMappingsModule_ProvideStickersBuyFragmentMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<A50.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C24193b f320646a;

    public i(C24193b c24193b) {
        this.f320646a = c24193b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C19616a c19616a = (C19616a) this.f320646a.get();
        h.f320645a.getClass();
        return new A50.a(m0.f406844a.b(StickersBuyVasLink.class), new q(c19616a));
    }
}
