package com.avito.android.str_seller_orders.navigation;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.StrOrdersBuyerDeeplink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersIntentFactory;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrOrdersBuyerDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/navigation/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/StrOrdersBuyerDeeplink;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40162b<StrOrdersBuyerDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final StrSellerOrdersIntentFactory f288808d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f288809e;

    @Inject
    public a(@Y61.k StrSellerOrdersIntentFactory strSellerOrdersIntentFactory, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f288808d = strSellerOrdersIntentFactory;
        this.f288809e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        StrOrdersBuyerDeeplink strOrdersBuyerDeeplink = (StrOrdersBuyerDeeplink) deepLink;
        this.f288809e.R(this.f288808d.a(strOrdersBuyerDeeplink.f133691b ? new StrSellerOrdersIntentFactory.ScreenState.TabsPages(StrSellerOrdersIntentFactory.InitialTab.f289694c) : StrSellerOrdersIntentFactory.ScreenState.SinglePage.Buyer.f289697b, strOrdersBuyerDeeplink.f133692c), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
