package com.avito.android.advert.item.ownership_cost.items;

import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: OwnershipCostItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ OwnershipCostItem f77962l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f77963m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OwnershipCostItem ownershipCostItem, f fVar) {
        super(0);
        this.f77962l = ownershipCostItem;
        this.f77963m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String f77946c;
        String title;
        LinkedHashMap linkedHashMap;
        this.f77962l.f77955i = false;
        f fVar = this.f77963m;
        com.avito.android.advert.item.ownership_cost.f fVar2 = fVar.f77968e;
        OwnershipCostResponse f77945b = fVar2.getF77945b();
        if (f77945b != null && (f77946c = fVar2.getF77946c()) != null) {
            OwnershipCostResponse.OwnershipCostResults.CostResultTab costResultTab = (OwnershipCostResponse.OwnershipCostResults.CostResultTab) C42745f0.G(f77945b.getOwnershipCostResults().getTabs());
            if (costResultTab != null) {
                title = costResultTab.getTitle();
                linkedHashMap = new LinkedHashMap();
                for (OwnershipCostResponse.OwnershipCostResults.CostResultTab.CostResultTabRow costResultTabRow : costResultTab.getRows()) {
                    linkedHashMap.put(costResultTabRow.getLabel(), costResultTabRow.getValue());
                }
                linkedHashMap.put(costResultTab.getTotal().getLabel(), costResultTab.getTotal().getValue());
            } else {
                title = null;
                linkedHashMap = null;
            }
            fVar.f77969f.Z1(f77946c, title, linkedHashMap != null ? C35755b0.c(linkedHashMap) : null);
        }
        return G0.f406611a;
    }
}
