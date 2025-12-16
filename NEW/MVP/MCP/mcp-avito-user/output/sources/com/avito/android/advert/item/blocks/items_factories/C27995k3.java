package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_details_items.portfolio.AdvertDetailsPortfolioBlockItem;
import com.avito.android.remote.model.ActionType;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.Portfolio;
import com.avito.android.remote.model.PortfolioAction;
import com.avito.android.remote.model.PortfolioProject;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPortfolioProjectsItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/k3;", "Lcom/avito/android/advert/item/blocks/items_factories/j3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.k3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27995k3 implements InterfaceC27988j3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.B2 f73979a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73980b;

    @Inject
    public C27995k3(@Y61.k com.avito.android.B2 b22, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73979a = b22;
        this.f73980b = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27988j3
    @Y61.l
    public final AdvertDetailsPortfolioBlockItem a(@Y61.k AdvertDetails advertDetails) {
        Portfolio portfolio;
        PortfolioAction portfolioAction;
        Object next;
        if (!this.f73979a.x().invoke().booleanValue() || (portfolio = advertDetails.getPortfolio()) == null) {
            return null;
        }
        String id2 = advertDetails.getId();
        String xHash = advertDetails.getXHash();
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        int iA2 = this.f73980b.a();
        String title = portfolio.getTitle();
        List<PortfolioProject> projects = portfolio.getProjects();
        List<PortfolioAction> actions = portfolio.getActions();
        if (actions != null) {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PortfolioAction) next).getActionType() == ActionType.Button) {
                    break;
                }
            }
            portfolioAction = (PortfolioAction) next;
        } else {
            portfolioAction = null;
        }
        String categoryId = advertDetails.getCategoryId();
        AdjustParameters adjustParameters = advertDetails.getAdjustParameters();
        return new AdvertDetailsPortfolioBlockItem(title, projects, portfolioAction, id2, categoryId, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null, xHash, "ITEM_PORTFOLIO_BLOCK", iA2);
    }
}
