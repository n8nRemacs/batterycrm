package com.avito.android.services_portfolio.project.buyer.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import com.avito.android.services_portfolio.project.buyer.mvi.entity.PortfolioProjectBuyerInternalAction;
import gv0.C40742a;
import iv0.AbstractC42117c;
import iv0.InterfaceC42115a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PortfolioProjectBuyerActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Liv0/a;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "Liv0/c;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC42115a, PortfolioProjectBuyerInternalAction, AbstractC42117c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.services_portfolio.project.buyer.domain.a f280021a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C40742a f280022b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PortfolioProjectArguments.BuyerArgs f280023c;

    @Inject
    public c(@Y61.k com.avito.android.services_portfolio.project.buyer.domain.a aVar, @Y61.k C40742a c40742a, @Y61.k PortfolioProjectArguments.BuyerArgs buyerArgs) {
        this.f280021a = aVar;
        this.f280022b = c40742a;
        this.f280023c = buyerArgs;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PortfolioProjectBuyerInternalAction> b(InterfaceC42115a interfaceC42115a, AbstractC42117c abstractC42117c) {
        return new C43152f0(C43175k.G(new a(interfaceC42115a, this, null)), new b(3, null));
    }
}
