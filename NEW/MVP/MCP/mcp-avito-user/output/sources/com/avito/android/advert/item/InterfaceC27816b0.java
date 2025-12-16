package com.avito.android.advert.item;

import android.os.Bundle;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.PaymentBlockItemState;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsItemsPresenterInterface.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/b0;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.b0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC27816b0 {
    @Y61.k
    Bundle H();

    void O(int i12, long j12);

    void b(@Y61.k Bundle bundle);

    void c(@Y61.k PaymentBlockItemState paymentBlockItemState);

    void clearItems();

    void d(@Y61.k List<? extends TrustFactorsComponent> list, boolean z12);

    void f(@Y61.k String str);

    void h(@Y61.k AdvertDetailsWithMeta advertDetailsWithMeta);
}
