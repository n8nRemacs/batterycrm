package com.avito.android.recommendation_items_loader_impl.deep_linking;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.AnalyticParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.recommendation_items_loader_impl.deep_linking.RecommendationItemsLink;
import com.avito.android.recommendation_items_loader_impl.screen.RecommendationLoaderActivity;
import com.avito.android.recommendation_items_loader_impl.screen.RecommendationLoaderActivityArgument;
import com.avito.android.util.H;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RecommendationItemsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/deep_linking/b;", "Lev/b;", "Lcom/avito/android/recommendation_items_loader_impl/deep_linking/RecommendationItemsLink;", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends AbstractC40162b<RecommendationItemsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f252285d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Context f252286e;

    @Inject
    public b(@k Context context, @k a.InterfaceC4053a interfaceC4053a) {
        this.f252285d = interfaceC4053a;
        this.f252286e = context;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        RecommendationItemsLink recommendationItemsLink = (RecommendationItemsLink) deepLink;
        RecommendationLoaderActivity.a aVar = RecommendationLoaderActivity.f252287r;
        Context applicationContext = this.f252286e.getApplicationContext();
        AnalyticParams analyticParamsA = bundle != null ? H.a(bundle) : null;
        aVar.getClass();
        this.f252285d.R(new Intent(applicationContext, (Class<?>) RecommendationLoaderActivity.class).putExtra("com.avito.android.recommendation_items_loader_impl.screen.argument_items", new RecommendationLoaderActivityArgument.RecommendationItemsLoaderArgument(recommendationItemsLink.f252279b, recommendationItemsLink.f252280c, recommendationItemsLink.f252281d, analyticParamsA)), com.avito.android.deeplink_handler.view.b.f134588l);
        return RecommendationItemsLink.b.f252282b;
    }
}
