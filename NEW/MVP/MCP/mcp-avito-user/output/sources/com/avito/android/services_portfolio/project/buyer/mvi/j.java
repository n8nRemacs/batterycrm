package com.avito.android.services_portfolio.project.buyer.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.services_portfolio.project.buyer.mvi.entity.PortfolioProjectBuyerInternalAction;
import iv0.InterfaceC42116b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PortfolioProjectBuyerOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "Liv0/b;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements t<PortfolioProjectBuyerInternalAction, InterfaceC42116b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42116b b(PortfolioProjectBuyerInternalAction portfolioProjectBuyerInternalAction) {
        InterfaceC42116b cVar;
        PortfolioProjectBuyerInternalAction portfolioProjectBuyerInternalAction2 = portfolioProjectBuyerInternalAction;
        if (portfolioProjectBuyerInternalAction2 instanceof PortfolioProjectBuyerInternalAction.Back) {
            return InterfaceC42116b.a.f405367a;
        }
        if (portfolioProjectBuyerInternalAction2 instanceof PortfolioProjectBuyerInternalAction.OpenImage) {
            PortfolioProjectBuyerInternalAction.OpenImage openImage = (PortfolioProjectBuyerInternalAction.OpenImage) portfolioProjectBuyerInternalAction2;
            cVar = new InterfaceC42116b.C11541b(openImage.f280045b, Integer.valueOf(openImage.f280046c), openImage.f280047d, openImage.f280048e);
        } else {
            if (!(portfolioProjectBuyerInternalAction2 instanceof PortfolioProjectBuyerInternalAction.Error)) {
                return null;
            }
            cVar = new InterfaceC42116b.c(((PortfolioProjectBuyerInternalAction.Error) portfolioProjectBuyerInternalAction2).f280043b.getMessage());
        }
        return cVar;
    }
}
