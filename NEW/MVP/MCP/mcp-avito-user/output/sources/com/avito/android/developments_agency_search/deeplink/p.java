package com.avito.android.developments_agency_search.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.webview.l;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.HttpUrl;

/* compiled from: MortgageProApplicationLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/p;", "Lev/b;", "Lcom/avito/android/developments_agency_search/deeplink/MortgageProApplicationLink;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p extends AbstractC40162b<MortgageProApplicationLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f136454d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.webview.l f136455e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f136456f;

    /* compiled from: MortgageProApplicationLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/p$a;", "", "<init>", "()V", "", "MAV_HOST_URL", "Ljava/lang/String;", "PROD_HOST_URL", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public p(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.webview.l lVar, @Y61.k com.avito.android.P p12) {
        this.f136454d = interfaceC4053a;
        this.f136455e = lVar;
        this.f136456f = p12;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        MortgageProApplicationLink mortgageProApplicationLink = (MortgageProApplicationLink) deepLink;
        String strHost = HttpUrl.INSTANCE.get(this.f136456f.a()).host();
        if (kotlin.jvm.internal.L.f(strHost, "app.avito.ru")) {
            strHost = "m.avito.ru";
        }
        String str2 = mortgageProApplicationLink.f136383b;
        this.f136454d.R(l.a.a(this.f136455e, Uri.parse("https://" + strHost + "/mortgage/pro-application" + ((str2 == null || str2.length() == 0) ? "" : "?source=".concat(str2))).buildUpon().build(), new WebViewLinkSettings(false, true, false, false, false, null, null, false, false, false, false, 2044, null), 4), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
