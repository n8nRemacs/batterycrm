package com.avito.android.external_apps.deep_linking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InAppBrowserLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InAppBrowserLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/i;", "Lev/b;", "Lcom/avito/android/deep_linking/links/InAppBrowserLink;", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends AbstractC40162b<InAppBrowserLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f155044d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f155045e;

    @Inject
    public i(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC35845m2 interfaceC35845m2) {
        this.f155044d = interfaceC4053a;
        this.f155045e = interfaceC35845m2;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f155044d.R(this.f155045e.u(((InAppBrowserLink) deepLink).f133371b, (6 & 2) == 0, (6 & 4) == 0), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
