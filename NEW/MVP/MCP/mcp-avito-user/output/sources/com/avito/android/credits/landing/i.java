package com.avito.android.credits.landing;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.deep_linking.links.CreditProductsLandingLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CreditProductsLandingLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/landing/i;", "Lev/b;", "Lcom/avito/android/deep_linking/links/CreditProductsLandingLink;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends AbstractC40162b<CreditProductsLandingLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.credits.f f128942d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f128943e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f128944f;

    @Inject
    public i(@k com.avito.android.credits.f fVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.navigation.a aVar) {
        this.f128942d = fVar;
        this.f128943e = interfaceC4053a;
        this.f128944f = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CreditProductsLandingLink creditProductsLandingLink = (CreditProductsLandingLink) deepLink;
        NavigationTabSetItem navigationTabSetItemA = this.f128944f.a();
        this.f128943e.R(this.f128942d.b(creditProductsLandingLink.f133166d, creditProductsLandingLink.f133165c, navigationTabSetItemA), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
