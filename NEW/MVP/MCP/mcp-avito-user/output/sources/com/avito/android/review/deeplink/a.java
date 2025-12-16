package com.avito.android.review.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import an0.InterfaceC19915a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ComfortableDealReviewsDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/review/deeplink/a;", "Lev/b;", "Lcom/avito/android/review/deeplink/ComfortableDealReviewsLink;", "_avito_comfortable-deal-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40162b<ComfortableDealReviewsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC19915a f255364d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f255365e;

    @Inject
    public a(@k InterfaceC19915a interfaceC19915a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f255364d = interfaceC19915a;
        this.f255365e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f255365e.R(this.f255364d.getIntent(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
