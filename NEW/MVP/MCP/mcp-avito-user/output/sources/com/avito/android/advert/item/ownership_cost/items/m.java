package com.avito.android.advert.item.ownership_cost.items;

import com.avito.android.advert.item.ownership_cost.items.input_form.OwnershipCostInputsItem;
import com.avito.android.advert.item.ownership_cost.items.results.OwnershipCostResultsItem;
import com.avito.android.remote.model.OwnershipCostResponse;
import kotlin.Metadata;

/* compiled from: OwnershipCostItemsCreator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/m;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface m {

    /* compiled from: OwnershipCostItemsCreator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    OwnershipCostInputsItem a(@Y61.k OwnershipCostResponse ownershipCostResponse, @Y61.k String str);

    @Y61.k
    OwnershipCostResultsItem b(@Y61.k OwnershipCostResponse ownershipCostResponse, @Y61.k String str, int i12);
}
