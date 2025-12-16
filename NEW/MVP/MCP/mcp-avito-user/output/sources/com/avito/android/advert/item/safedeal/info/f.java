package com.avito.android.advert.item.safedeal.info;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSafeDealInfoView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/info/f;", "LTV0/e;", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface f extends TV0.e {

    /* compiled from: AdvertDetailsSafeDealInfoView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: AdvertDetailsSafeDealInfoView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/info/f$b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void d(@k DeepLink deepLink);
    }

    void vF(@k SafeDeal.Info info, @k b bVar);
}
