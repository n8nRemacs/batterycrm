package com.avito.android.auction.details;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.AuctionDetailsBottomSheetLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AuctionDetailsDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auction/details/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/AuctionDetailsBottomSheetLink;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40162b<AuctionDetailsBottomSheetLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f92332d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f92333e;

    @Inject
    public a(@Y61.k e eVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f92332d = eVar;
        this.f92333e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f92333e.R(this.f92332d.a(((AuctionDetailsBottomSheetLink) deepLink).f133017b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
