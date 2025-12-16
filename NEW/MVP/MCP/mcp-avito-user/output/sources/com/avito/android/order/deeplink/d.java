package com.avito.android.order.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrderLinkDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/order/deeplink/d;", "Lev/b;", "Lcom/avito/android/order/deeplink/OrderLink;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends AbstractC40162b<OrderLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final S40.a f209462d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f209463e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f209464f;

    @Inject
    public d(@k S40.a aVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.navigation.a aVar2) {
        this.f209462d = aVar;
        this.f209463e = interfaceC4053a;
        this.f209464f = aVar2;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        OrderLink orderLink = (OrderLink) deepLink;
        NavigationTabSetItem navigationTabSetItemA = this.f209464f.a();
        if (navigationTabSetItemA == null) {
            navigationTabSetItemA = NavigationTab.f106974j;
        }
        this.f209463e.R(this.f209462d.a(orderLink.f209451b, navigationTabSetItemA, orderLink.f209452c, orderLink.f209453d), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
