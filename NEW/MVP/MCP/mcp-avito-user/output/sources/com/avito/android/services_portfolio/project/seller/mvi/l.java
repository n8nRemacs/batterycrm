package com.avito.android.services_portfolio.project.seller.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.services_portfolio.project.seller.mvi.entity.PortfolioProjectSellerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kv0.d;

/* compiled from: PortfolioProjectSellerReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "Lkv0/d;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements u<PortfolioProjectSellerInternalAction, kv0.d> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final kv0.d a(PortfolioProjectSellerInternalAction portfolioProjectSellerInternalAction, kv0.d dVar) {
        PortfolioProjectSellerInternalAction portfolioProjectSellerInternalAction2 = portfolioProjectSellerInternalAction;
        kv0.d dVar2 = dVar;
        if (portfolioProjectSellerInternalAction2 instanceof PortfolioProjectSellerInternalAction.ContentLoaded) {
            return new d.b(((PortfolioProjectSellerInternalAction.ContentLoaded) portfolioProjectSellerInternalAction2).f280260b);
        }
        if (portfolioProjectSellerInternalAction2 instanceof PortfolioProjectSellerInternalAction.OpenImage) {
            return dVar2;
        }
        if (portfolioProjectSellerInternalAction2 instanceof PortfolioProjectSellerInternalAction.Loading) {
            return d.C11764d.f413280d;
        }
        if (portfolioProjectSellerInternalAction2 instanceof PortfolioProjectSellerInternalAction.Error) {
            return new d.c(((PortfolioProjectSellerInternalAction.Error) portfolioProjectSellerInternalAction2).f280261b);
        }
        kv0.d.f413276b.getClass();
        return kv0.d.f413277c;
    }
}
