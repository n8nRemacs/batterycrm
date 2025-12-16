package com.avito.android.advert.item.ownership_cost.items;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OwnershipCostItemViewFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/j;", "Lcom/avito/android/advert/item/ownership_cost/items/i;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.ownership_cost.items.results.b f78026a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f78027b;

    @Inject
    public j(@Y61.k com.avito.android.advert.item.ownership_cost.items.results.b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f78026a = bVar;
        this.f78027b = interfaceC35745a5;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.i
    @Y61.k
    public final com.avito.android.advert.item.ownership_cost.items.results.l a(@Y61.k ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        return new com.avito.android.advert.item.ownership_cost.items.results.l(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ownership_cost_results, viewGroup, true), this.f78026a);
    }
}
