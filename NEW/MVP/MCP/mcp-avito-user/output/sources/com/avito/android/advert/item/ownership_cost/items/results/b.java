package com.avito.android.advert.item.ownership_cost.items.results;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.remote.model.OwnershipCostResponse;
import kotlin.Metadata;

/* compiled from: CostTabsViewFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/results/b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface b {
    @Y61.k
    LinearLayout a(@Y61.k OwnershipCostResponse.OwnershipCostResults.CostResultTab.CostResultTabRow costResultTabRow, @Y61.k ViewGroup viewGroup, @Y61.k LayoutInflater layoutInflater, boolean z12);

    @Y61.k
    TextView b(@Y61.k String str, @Y61.k ViewGroup viewGroup, @Y61.k LayoutInflater layoutInflater);
}
