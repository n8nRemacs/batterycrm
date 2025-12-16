package com.avito.android.str_seller_orders.navigation;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.str_seller_orders.strsellerordersrange.StrOrdersRangeDeeplink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrOrdersRangeDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/navigation/c;", "Lev/b;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/StrOrdersRangeDeeplink;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40162b<StrOrdersRangeDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Ez0.b f288812d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f288813e;

    @Inject
    public c(@Y61.k Ez0.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f288812d = bVar;
        this.f288813e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        StrOrdersRangeDeeplink strOrdersRangeDeeplink = (StrOrdersRangeDeeplink) deepLink;
        this.f288813e.R(this.f288812d.a(strOrdersRangeDeeplink.f290203b, strOrdersRangeDeeplink.f290204c, strOrdersRangeDeeplink.f290205d), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
