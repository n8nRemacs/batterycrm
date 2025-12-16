package com.avito.android.advert.item.ownership_cost.items.results;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.OwnershipCostResponse;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OwnershipCostResultsItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/results/h;", "LTV0/d;", "Lcom/avito/android/advert/item/ownership_cost/items/results/j;", "Lcom/avito/android/advert/item/ownership_cost/items/results/OwnershipCostResultsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements TV0.d<j, OwnershipCostResultsItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.ownership_cost.dialogs.a f78056b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f78057c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k6.b f78058d;

    @Inject
    public h(@Y61.k com.avito.android.advert.item.ownership_cost.dialogs.a aVar, @Y61.k com.avito.android.advert_core.analytics.a aVar2, @Y61.k k6.b bVar) {
        this.f78056b = aVar;
        this.f78057c = aVar2;
        this.f78058d = bVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (OwnershipCostResultsItem) aVar);
    }

    public final void k(@Y61.k j jVar, @Y61.k OwnershipCostResultsItem ownershipCostResultsItem) {
        OwnershipCostResponse ownershipCostResponse = ownershipCostResultsItem.f78041d;
        OwnershipCostResponse.OwnershipCostResults ownershipCostResults = ownershipCostResponse.getOwnershipCostResults();
        OwnershipCostResponse.OwnershipCostDisclaimer ownershipCostDisclaimer = ownershipCostResponse.getOwnershipCostDisclaimer();
        jVar.setTitle(ownershipCostResults.getTitle());
        jVar.n(ownershipCostResults.getText());
        jVar.LG(new f(this, ownershipCostResultsItem));
        jVar.u4(ownershipCostResults.getTabs());
        jVar.Xl(new g(this, jVar, ownershipCostDisclaimer, ownershipCostResultsItem), ownershipCostResults.getLinks());
    }
}
