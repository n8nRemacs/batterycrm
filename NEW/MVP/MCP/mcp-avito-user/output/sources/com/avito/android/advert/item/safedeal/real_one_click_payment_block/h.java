package com.avito.android.advert.item.safedeal.real_one_click_payment_block;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.safedeal.remote.model.SafeDealPaymentBlockResponse;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSafeDealPaymentBlockView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/h;", "LTV0/e;", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface h extends TV0.e {

    /* compiled from: AdvertDetailsSafeDealPaymentBlockView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: AdvertDetailsSafeDealPaymentBlockView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/h$b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: AdvertDetailsSafeDealPaymentBlockView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        void r(@l Bundle bundle, @k DeepLink deepLink, @l String str);

        void u(@k ParametrizedEvent parametrizedEvent);
    }

    void EY();

    void gY();

    void jj();

    void nu(@k SafeDealPaymentBlockResponse safeDealPaymentBlockResponse, @k b bVar);

    void s3();
}
