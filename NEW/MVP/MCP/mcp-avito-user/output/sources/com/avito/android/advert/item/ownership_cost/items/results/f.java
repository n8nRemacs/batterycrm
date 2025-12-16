package com.avito.android.advert.item.ownership_cost.items.results;

import com.avito.android.remote.model.OwnershipCostResponse;
import java.util.LinkedHashMap;
import k6.AbstractC42523a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OwnershipCostResultsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.l<OwnershipCostResponse.OwnershipCostResults.CostResultTab, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f78049l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OwnershipCostResultsItem f78050m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, OwnershipCostResultsItem ownershipCostResultsItem) {
        super(1);
        this.f78049l = hVar;
        this.f78050m = ownershipCostResultsItem;
    }

    @Override // Y41.l
    public final G0 invoke(OwnershipCostResponse.OwnershipCostResults.CostResultTab costResultTab) {
        OwnershipCostResponse.OwnershipCostResults.CostResultTab costResultTab2 = costResultTab;
        h hVar = this.f78049l;
        hVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (OwnershipCostResponse.OwnershipCostResults.CostResultTab.CostResultTabRow costResultTabRow : costResultTab2.getRows()) {
            linkedHashMap.put(costResultTabRow.getLabel(), costResultTabRow.getValue());
        }
        linkedHashMap.put(costResultTab2.getTotal().getLabel(), costResultTab2.getTotal().getValue());
        hVar.f78057c.Z1(this.f78050m.f78042e, costResultTab2.getTitle(), linkedHashMap);
        hVar.f78058d.a(AbstractC42523a.C11604a.f406092b);
        return G0.f406611a;
    }
}
