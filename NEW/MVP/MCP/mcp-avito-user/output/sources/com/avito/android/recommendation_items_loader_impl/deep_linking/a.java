package com.avito.android.recommendation_items_loader_impl.deep_linking;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.AnalyticParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.recommendation_items_loader_impl.deep_linking.RecommendationBlocksLink;
import com.avito.android.recommendation_items_loader_impl.screen.RecommendationLoaderActivity;
import com.avito.android.recommendation_items_loader_impl.screen.RecommendationLoaderActivityArgument;
import com.avito.android.util.H;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RecommendationBlocksDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/deep_linking/a;", "Lev/b;", "Lcom/avito/android/recommendation_items_loader_impl/deep_linking/RecommendationBlocksLink;", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends AbstractC40162b<RecommendationBlocksLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f252283d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Context f252284e;

    @Inject
    public a(@k Context context, @k a.InterfaceC4053a interfaceC4053a) {
        this.f252283d = interfaceC4053a;
        this.f252284e = context;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        RecommendationBlocksLink recommendationBlocksLink = (RecommendationBlocksLink) deepLink;
        RecommendationLoaderActivity.a aVar = RecommendationLoaderActivity.f252287r;
        Context applicationContext = this.f252284e.getApplicationContext();
        AnalyticParams analyticParamsA = bundle != null ? H.a(bundle) : null;
        aVar.getClass();
        this.f252283d.R(new Intent(applicationContext, (Class<?>) RecommendationLoaderActivity.class).putExtra("com.avito.android.recommendation_items_loader_impl.screen.argument_blocks", new RecommendationLoaderActivityArgument.RecommendationBlocksLoaderArgument(recommendationBlocksLink.f252276b, recommendationBlocksLink.f252277c, analyticParamsA)), com.avito.android.deeplink_handler.view.b.f134588l);
        return RecommendationBlocksLink.b.f252278b;
    }
}
