package com.avito.android.advert_details_items.services_discount_and_gifts;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BuyerGiftDialogView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/services_discount_and_gifts/k;", "Lcom/avito/android/advert_details_items/services_discount_and_gifts/j;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TextView f85684a;

    public k(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.buyer_gift_popup_description);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f85684a = (TextView) viewFindViewById;
    }
}
