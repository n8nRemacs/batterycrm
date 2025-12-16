package com.avito.android.advert.item.ownership_cost.items;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.ownership_cost.items.input_form.OwnershipCostInputsItem;
import com.avito.android.advert.item.ownership_cost.items.results.OwnershipCostResultsItem;
import com.avito.android.remote.model.OwnershipCostResponse;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OwnershipCostItemsCreator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/n;", "Lcom/avito/android/advert/item/ownership_cost/items/m;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n implements m {
    @Inject
    public n() {
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.m
    @Y61.k
    public final OwnershipCostInputsItem a(@Y61.k OwnershipCostResponse ownershipCostResponse, @Y61.k String str) {
        return new OwnershipCostInputsItem(OwnershipCostInputsItem.class.getName(), 0, str, true, ownershipCostResponse);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.m
    @Y61.k
    public final OwnershipCostResultsItem b(@Y61.k OwnershipCostResponse ownershipCostResponse, @Y61.k String str, int i12) {
        return new OwnershipCostResultsItem(OwnershipCostResultsItem.class.getName(), i12, ownershipCostResponse, str);
    }
}
