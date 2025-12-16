package com.avito.android.order.deeplink.v2;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.order.deeplink.RedesignedOrderLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: RedesignedOrderDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/order/deeplink/v2/a;", "Lev/b;", "Lcom/avito/android/order/deeplink/RedesignedOrderLink;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40162b<RedesignedOrderLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final T40.a f209469d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final S40.a f209470e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f209471f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f209472g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final dD.b f209473h;

    @Inject
    public a(@k T40.a aVar, @k S40.a aVar2, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.navigation.a aVar3, @k dD.b bVar) {
        this.f209469d = aVar;
        this.f209470e = aVar2;
        this.f209471f = interfaceC4053a;
        this.f209472g = aVar3;
        this.f209473h = bVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        Intent intentA;
        RedesignedOrderLink redesignedOrderLink = (RedesignedOrderLink) deepLink;
        dD.b bVar = this.f209473h;
        bVar.getClass();
        n<Object> nVar = dD.b.f393739f[0];
        boolean zBooleanValue = ((Boolean) bVar.f393740b.a().invoke()).booleanValue();
        OrderScreenSegment orderScreenSegment = redesignedOrderLink.f209456d;
        com.avito.android.navigation.a aVar = this.f209472g;
        boolean z12 = redesignedOrderLink.f209455c;
        String str2 = redesignedOrderLink.f209454b;
        if (zBooleanValue) {
            NavigationTabSetItem navigationTabSetItemA = aVar.a();
            if (navigationTabSetItemA == null) {
                navigationTabSetItemA = NavigationTab.f106974j;
            }
            intentA = this.f209469d.a(str2, navigationTabSetItemA, z12, orderScreenSegment);
        } else {
            NavigationTabSetItem navigationTabSetItemA2 = aVar.a();
            if (navigationTabSetItemA2 == null) {
                navigationTabSetItemA2 = NavigationTab.f106974j;
            }
            intentA = this.f209470e.a(str2, navigationTabSetItemA2, z12, orderScreenSegment);
        }
        this.f209471f.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
