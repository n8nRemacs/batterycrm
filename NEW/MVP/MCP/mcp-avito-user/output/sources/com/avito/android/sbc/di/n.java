package com.avito.android.sbc.di;

import com.avito.android.deep_linking.links.DiscountDispatchLinkLegacy;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SbcDeeplinkHandlerModule_ProvideDiscountDispatchDeeplinkLegacyHandlerFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f260015a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.sbc.deeplink.b f260016b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.sbc.deeplink.f f260017c;

    public n(l lVar, com.avito.android.sbc.deeplink.b bVar, com.avito.android.sbc.deeplink.f fVar) {
        this.f260015a = lVar;
        this.f260016b = bVar;
        this.f260017c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f260017c.getClass();
        com.avito.android.sbc.deeplink.e eVar = new com.avito.android.sbc.deeplink.e();
        com.avito.android.sbc.deeplink.b bVar = this.f260016b;
        this.f260015a.getClass();
        return new C43834a(DiscountDispatchLinkLegacy.class, eVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DiscountDispatchLinkLegacy.class), bVar));
    }
}
