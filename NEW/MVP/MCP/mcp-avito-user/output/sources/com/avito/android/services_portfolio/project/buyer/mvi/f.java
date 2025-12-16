package com.avito.android.services_portfolio.project.buyer.mvi;

import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PortfolioProjectBuyerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.services_portfolio.project.buyer.domain.b f280049a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f280050b;

    public f(com.avito.android.services_portfolio.project.buyer.domain.b bVar, dagger.internal.l lVar) {
        this.f280049a = bVar;
        this.f280050b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.services_portfolio.project.buyer.domain.a) this.f280049a.get(), (PortfolioProjectArguments.BuyerArgs) this.f280050b.f393949a);
    }
}
