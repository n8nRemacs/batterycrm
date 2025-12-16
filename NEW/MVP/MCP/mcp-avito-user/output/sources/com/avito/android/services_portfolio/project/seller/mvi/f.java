package com.avito.android.services_portfolio.project.seller.mvi;

import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PortfolioProjectSellerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.services_portfolio.project.seller.domain.b f280265a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f280266b;

    public f(com.avito.android.services_portfolio.project.seller.domain.b bVar, dagger.internal.l lVar) {
        this.f280265a = bVar;
        this.f280266b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.services_portfolio.project.seller.domain.a) this.f280265a.get(), (PortfolioProjectArguments.SellerArgs) this.f280266b.f393949a);
    }
}
