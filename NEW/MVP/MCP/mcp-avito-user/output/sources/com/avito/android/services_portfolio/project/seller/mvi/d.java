package com.avito.android.services_portfolio.project.seller.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PortfolioProjectSellerActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.services_portfolio.project.seller.domain.b f280239a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f280240b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f280241c;

    public d(com.avito.android.services_portfolio.project.seller.domain.b bVar, dagger.internal.l lVar, Provider provider) {
        this.f280239a = bVar;
        this.f280240b = lVar;
        this.f280241c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.services_portfolio.project.seller.domain.a) this.f280239a.get(), (PortfolioProjectArguments.SellerArgs) this.f280240b.f393949a, this.f280241c.get());
    }
}
