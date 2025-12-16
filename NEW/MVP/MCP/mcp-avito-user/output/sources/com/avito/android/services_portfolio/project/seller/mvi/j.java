package com.avito.android.services_portfolio.project.seller.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.services_portfolio.project.seller.mvi.entity.PortfolioProjectSellerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kv0.c;

/* compiled from: PortfolioProjectSellerOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "Lkv0/c;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements t<PortfolioProjectSellerInternalAction, kv0.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final kv0.c b(PortfolioProjectSellerInternalAction portfolioProjectSellerInternalAction) {
        kv0.c c11763c;
        PortfolioProjectSellerInternalAction portfolioProjectSellerInternalAction2 = portfolioProjectSellerInternalAction;
        if (portfolioProjectSellerInternalAction2 instanceof PortfolioProjectSellerInternalAction.Back) {
            return c.a.f413272a;
        }
        if (portfolioProjectSellerInternalAction2 instanceof PortfolioProjectSellerInternalAction.OpenImage) {
            PortfolioProjectSellerInternalAction.OpenImage openImage = (PortfolioProjectSellerInternalAction.OpenImage) portfolioProjectSellerInternalAction2;
            c11763c = new c.b(openImage.f280263b, Integer.valueOf(openImage.f280264c));
        } else {
            if (!(portfolioProjectSellerInternalAction2 instanceof PortfolioProjectSellerInternalAction.Error)) {
                return null;
            }
            c11763c = new c.C11763c(((PortfolioProjectSellerInternalAction.Error) portfolioProjectSellerInternalAction2).f280261b.getMessage());
        }
        return c11763c;
    }
}
