package com.avito.android.credits.di;

import com.avito.android.deep_linking.links.CreditProductsLandingLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CreditDeepLinksHandlerModule_ProvideCreditProductsLandingLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.credits.landing.j f128859a;

    public k(com.avito.android.credits.landing.j jVar) {
        this.f128859a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.credits.landing.j jVar = this.f128859a;
        i.f128857a.getClass();
        return new C43834a(CreditProductsLandingLink.class, null, new C43834a.b.C11809b(jVar));
    }
}
