package com.avito.android.sbc.di;

import com.avito.android.deep_linking.links.DiscountDispatchProxyDeepLink;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SbcDeeplinkHandlerModule_ProvideDiscountDispatchProxyDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f260018a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.sbc.deeplink.h f260019b;

    public o(l lVar, com.avito.android.sbc.deeplink.h hVar) {
        this.f260018a = lVar;
        this.f260019b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f260018a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(DiscountDispatchProxyDeepLink.class, new com.avito.android.sbc.deeplink.i(), new C43834a.b.C11809b(this.f260019b));
    }
}
