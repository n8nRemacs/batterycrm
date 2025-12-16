package com.avito.android.advert_details_items.portfolio;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.PortfolioAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: PortfolioBlockItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/portfolio/g;", "Lcom/avito/android/advert_details_items/portfolio/c;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f85124b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.services_portfolio.uxFeedback.b f85125c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f85126d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C43238h f85127e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f85128f;

    @Inject
    public g(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.services_portfolio.uxFeedback.b bVar, @k InterfaceC28373a interfaceC28373a, @k R0 r02) {
        this.f85124b = aVar;
        this.f85125c = bVar;
        this.f85126d = interfaceC28373a;
        this.f85127e = U.a(r02.b());
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String title;
        i iVar = (i) eVar;
        AdvertDetailsPortfolioBlockItem advertDetailsPortfolioBlockItem = (AdvertDetailsPortfolioBlockItem) aVar;
        if (!this.f85128f) {
            this.f85126d.c(new N8.a(advertDetailsPortfolioBlockItem.f85109e, advertDetailsPortfolioBlockItem.f85110f, advertDetailsPortfolioBlockItem.f85111g, advertDetailsPortfolioBlockItem.f85112h));
            this.f85128f = true;
        }
        C43259k.d(this.f85127e, null, null, new d(this, null), 3);
        f fVar = new f(this);
        iVar.setTitle(advertDetailsPortfolioBlockItem.f85106b);
        PortfolioAction portfolioAction = advertDetailsPortfolioBlockItem.f85108d;
        if (portfolioAction != null && (title = portfolioAction.getTitle()) != null) {
            iVar.G60(title, new e(portfolioAction, this));
        }
        iVar.h10(fVar, advertDetailsPortfolioBlockItem.f85107c);
    }

    @Override // com.avito.android.advert_details_items.portfolio.c
    public final void t() {
        U.b(this.f85127e, null);
    }
}
