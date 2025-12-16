package com.avito.android.advert.item.ownership_cost.dialogs;

import Y61.k;
import android.widget.LinearLayout;
import com.avito.android.remote.model.OwnershipCostResponse;
import kotlin.Metadata;

/* compiled from: OwnershipCostDisclaimerContentViewFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/dialogs/e;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface e {

    /* compiled from: OwnershipCostDisclaimerContentViewFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/dialogs/e$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void H(@k String str);
    }

    void a(@k LinearLayout linearLayout, @k OwnershipCostResponse.OwnershipCostDisclaimer ownershipCostDisclaimer);
}
