package ar;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.deeplink.CompetitorAnalyticsDeepLink;
import com.avito.android.competitor_analytics.h;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lar/a;", "Lev/b;", "Lcom/avito/android/competitor_analytics/deeplink/CompetitorAnalyticsDeepLink;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ar.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C23658a extends AbstractC40162b<CompetitorAnalyticsDeepLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f56257d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final h f56258e;

    @Inject
    public C23658a(@k a.InterfaceC4053a interfaceC4053a, @k h hVar) {
        this.f56257d = interfaceC4053a;
        this.f56258e = hVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f56257d.R(this.f56258e.a(((CompetitorAnalyticsDeepLink) deepLink).f124247b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
