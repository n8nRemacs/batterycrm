package com.avito.android.advert_details_items.sellerprofile;

import com.avito.android.advert_core.sellerprofile.ShowSellersProfileSource;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import com.avito.android.remote.model.AdvertSeller;
import com.avito.android.remote.model.advert_details.UserIconType;
import kotlin.Metadata;

/* compiled from: AdvertSellerProfilePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/E;", "LS9/a;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface E extends S9.a {

    /* compiled from: AdvertSellerProfilePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    /* renamed from: E3 */
    com.jakewharton.rxrelay3.c getF85564e();

    void J(@Y61.k InterfaceC28278h interfaceC28278h);

    void Na(@Y61.k ShowSellersProfileSource showSellersProfileSource);

    @Y61.k
    /* renamed from: Q1 */
    com.jakewharton.rxrelay3.c getF85566g();

    void e0();

    @Y61.k
    /* renamed from: v4 */
    com.jakewharton.rxrelay3.c getF85565f();

    void w4(@Y61.k AdvertSeller advertSeller, @Y61.k UserIconType userIconType, @Y61.l SellerSubscriptionState sellerSubscriptionState, boolean z12, boolean z13);
}
