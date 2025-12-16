package com.avito.android.travel_search.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.travel_search.TravelSearchOpenParams;
import com.avito.android.travel_search.deeplink.TravelSearchLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import pF0.InterfaceC46946b;

/* compiled from: TravelSearchLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/deeplink/a;", "Lev/b;", "Lcom/avito/android/travel_search/deeplink/TravelSearchLink;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40162b<TravelSearchLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f302777d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC46946b f302778e;

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC46946b interfaceC46946b) {
        this.f302777d = interfaceC4053a;
        this.f302778e = interfaceC46946b;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        TravelSearchLink travelSearchLink = (TravelSearchLink) deepLink;
        SearchParams empty = travelSearchLink.f302770b;
        if (empty == null) {
            empty = SearchParams.INSTANCE.getEMPTY();
        }
        TravelSearchLink.TravelSearchFlow travelSearchFlow = travelSearchLink.f302771c;
        if (travelSearchFlow == null) {
            travelSearchFlow = TravelSearchLink.TravelSearchFlow.f302774d;
        }
        this.f302777d.R(this.f302778e.a(new TravelSearchOpenParams(empty, travelSearchFlow)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
