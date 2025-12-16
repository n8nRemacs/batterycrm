package com.avito.android.services_portfolio.project.buyer.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.services_portfolio.project.buyer.mvi.entity.PortfolioProjectBuyerInternalAction;
import iv0.AbstractC42117c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PortfolioProjectBuyerReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "Liv0/c;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements u<PortfolioProjectBuyerInternalAction, AbstractC42117c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AbstractC42117c a(PortfolioProjectBuyerInternalAction portfolioProjectBuyerInternalAction, AbstractC42117c abstractC42117c) {
        PortfolioProjectBuyerInternalAction portfolioProjectBuyerInternalAction2 = portfolioProjectBuyerInternalAction;
        AbstractC42117c abstractC42117c2 = abstractC42117c;
        if (portfolioProjectBuyerInternalAction2 instanceof PortfolioProjectBuyerInternalAction.ContentLoaded) {
            PortfolioProjectBuyerInternalAction.ContentLoaded contentLoaded = (PortfolioProjectBuyerInternalAction.ContentLoaded) portfolioProjectBuyerInternalAction2;
            return new AbstractC42117c.b(contentLoaded.f280040b, contentLoaded.f280041c, contentLoaded.f280042d);
        }
        if (portfolioProjectBuyerInternalAction2 instanceof PortfolioProjectBuyerInternalAction.OpenImage) {
            return abstractC42117c2;
        }
        if (portfolioProjectBuyerInternalAction2 instanceof PortfolioProjectBuyerInternalAction.Loading) {
            return AbstractC42117c.d.f405379d;
        }
        if (portfolioProjectBuyerInternalAction2 instanceof PortfolioProjectBuyerInternalAction.Error) {
            return new AbstractC42117c.C11542c(((PortfolioProjectBuyerInternalAction.Error) portfolioProjectBuyerInternalAction2).f280043b);
        }
        AbstractC42117c.f405373b.getClass();
        return AbstractC42117c.f405374c;
    }
}
