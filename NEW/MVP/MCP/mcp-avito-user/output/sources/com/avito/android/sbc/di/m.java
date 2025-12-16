package com.avito.android.sbc.di;

import com.avito.android.deep_linking.links.DiscountDispatchLink;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SbcDeeplinkHandlerModule_ProvideDiscountDispatchDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f260012a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.sbc.deeplink.b f260013b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.sbc.deeplink.d f260014c;

    public m(l lVar, com.avito.android.sbc.deeplink.b bVar, com.avito.android.sbc.deeplink.d dVar) {
        this.f260012a = lVar;
        this.f260013b = bVar;
        this.f260014c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f260014c.getClass();
        com.avito.android.sbc.deeplink.c cVar = new com.avito.android.sbc.deeplink.c();
        com.avito.android.sbc.deeplink.b bVar = this.f260013b;
        this.f260012a.getClass();
        return new C43834a(DiscountDispatchLink.class, cVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DiscountDispatchLink.class), bVar));
    }
}
