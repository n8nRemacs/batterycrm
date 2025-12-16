package com.avito.android.advert.item.additionalSeller;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.remote.model.AdditionalSellerButtons;
import kotlin.Metadata;

/* compiled from: AdditionalSelllerView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/l;", "LTV0/e;", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface l extends TV0.e {

    /* compiled from: AdditionalSelllerView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: AdditionalSelllerView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/l$b;", "Lcom/avito/android/advert_core/advert/k;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends com.avito.android.advert_core.advert.k {

        /* compiled from: AdditionalSelllerView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        void j2(@Y61.k DeepLink deepLink);

        void m1(@Y61.k DetailsSheetLinkBody detailsSheetLinkBody);
    }

    void GE(@Y61.l AdditionalSellerButtons additionalSellerButtons);
}
