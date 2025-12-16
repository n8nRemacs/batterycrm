package com.avito.android.advert.item.ownership_cost.dialogs.region_select.item;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.remote.model.OwnershipCostResponse;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RegionSelectItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/dialogs/region_select/item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/ownership_cost/dialogs/region_select/item/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f77937c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckmark f77938b;

    public h(@k View view) {
        super(view);
        this.f77938b = (ListItemCheckmark) view;
    }

    @Override // com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.f
    public final void rD(@k OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region region, boolean z12, @k l<? super OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region, G0> lVar) {
        ListItemCheckmark listItemCheckmark = this.f77938b;
        listItemCheckmark.setChecked(z12);
        listItemCheckmark.setTitle(region.getLabel());
        listItemCheckmark.setOnClickListener(new g(0, lVar, region));
    }
}
