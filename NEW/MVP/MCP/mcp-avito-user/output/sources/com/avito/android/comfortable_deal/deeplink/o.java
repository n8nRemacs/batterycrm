package com.avito.android.comfortable_deal.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.webview.l;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComfortableDealOfferDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/o;", "Lev/b;", "Lcom/avito/android/comfortable_deal/deeplink/ComfortableDealOfferDeeplink;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o extends AbstractC40162b<ComfortableDealOfferDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f121971d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.webview.l f121972e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f121973f;

    @Inject
    public o(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.webview.l lVar, @Y61.k com.avito.android.util.C c12) {
        this.f121971d = interfaceC4053a;
        this.f121972e = lVar;
        this.f121973f = c12;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ComfortableDealOfferDeeplink comfortableDealOfferDeeplink = (ComfortableDealOfferDeeplink) deepLink;
        boolean zL2 = this.f121973f.l();
        String str2 = comfortableDealOfferDeeplink.f121851b;
        Uri.Builder builderBuildUpon = Uri.parse(zL2 ? androidx.camera.camera2.internal.G.f("https://www.avito.ru/comfortable-deal-offer/", str2) : androidx.camera.camera2.internal.G.f("https://staging-www.k.avito.ru/comfortable-deal-offer/", str2)).buildUpon();
        String str3 = comfortableDealOfferDeeplink.f121852c;
        if (str3 != null) {
            builderBuildUpon = builderBuildUpon.appendQueryParameter(SearchParamsConverterKt.SOURCE, str3);
        }
        this.f121971d.R(l.a.a(this.f121972e, builderBuildUpon.build(), new WebViewLinkSettings(false, true, false, false, false, null, null, false, false, false, false, 2044, null), 4), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
