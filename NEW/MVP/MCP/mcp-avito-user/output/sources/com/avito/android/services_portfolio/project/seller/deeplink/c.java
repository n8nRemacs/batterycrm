package com.avito.android.services_portfolio.project.seller.deeplink;

import com.avito.android.services_portfolio.deeplink.ServicesPortfolioProjectSellerLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServicesPortfolioProjectSellerLinkHandlerModule_ProvidePortfolioProjectLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f280210a;

    public c(d dVar) {
        this.f280210a = dVar;
    }

    public static C43834a a(d dVar) {
        b.f280209a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServicesPortfolioProjectSellerLink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServicesPortfolioProjectSellerLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f280210a);
    }
}
