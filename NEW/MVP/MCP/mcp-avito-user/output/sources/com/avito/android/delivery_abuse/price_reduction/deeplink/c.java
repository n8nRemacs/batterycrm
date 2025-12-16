package com.avito.android.delivery_abuse.price_reduction.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PriceReductionLinkHandlerModule_ProvidePriceReductionLinkMapperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f134803a;

    public c(d dVar) {
        this.f134803a = dVar;
    }

    public static C43834a a(d dVar) {
        b.f134802a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PriceReductionLink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PriceReductionLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f134803a);
    }
}
