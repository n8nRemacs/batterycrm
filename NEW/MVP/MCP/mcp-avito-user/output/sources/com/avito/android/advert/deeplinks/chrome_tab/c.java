package com.avito.android.advert.deeplinks.chrome_tab;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.CustomChromeTabExternalLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CustomChromeTabLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/deeplinks/chrome_tab/c;", "Lev/b;", "Lcom/avito/android/deep_linking/links/CustomChromeTabExternalLink;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends AbstractC40162b<CustomChromeTabExternalLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f68900d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35845m2 f68901e;

    @Inject
    public c(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC35845m2 interfaceC35845m2) {
        this.f68900d = interfaceC4053a;
        this.f68901e = interfaceC35845m2;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f68900d.R(this.f68901e.u(((CustomChromeTabExternalLink) deepLink).f133167b, (6 & 2) == 0, (6 & 4) == 0), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
