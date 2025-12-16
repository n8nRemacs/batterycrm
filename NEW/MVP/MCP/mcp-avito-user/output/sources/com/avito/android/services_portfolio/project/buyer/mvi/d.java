package com.avito.android.services_portfolio.project.buyer.mvi;

import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import dagger.internal.x;
import dagger.internal.y;
import gv0.C40742a;

/* compiled from: PortfolioProjectBuyerActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.services_portfolio.project.buyer.domain.b f280024a;

    /* renamed from: b, reason: collision with root package name */
    public final gv0.b f280025b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f280026c;

    public d(com.avito.android.services_portfolio.project.buyer.domain.b bVar, gv0.b bVar2, dagger.internal.l lVar) {
        this.f280024a = bVar;
        this.f280025b = bVar2;
        this.f280026c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.services_portfolio.project.buyer.domain.a) this.f280024a.get(), (C40742a) this.f280025b.get(), (PortfolioProjectArguments.BuyerArgs) this.f280026c.f393949a);
    }
}
