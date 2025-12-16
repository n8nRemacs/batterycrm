package com.avito.android.help_center.help_center_request;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.HelpCenterRequestLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.help_center.InterfaceC30751h;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HelpCenterRequestDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/help_center/help_center_request/b;", "Lev/b;", "Lcom/avito/android/deep_linking/links/HelpCenterRequestLink;", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends AbstractC40162b<HelpCenterRequestLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30751h f161760d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f161761e;

    @Inject
    public b(@Y61.k InterfaceC30751h interfaceC30751h, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f161760d = interfaceC30751h;
        this.f161761e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        HelpCenterRequestLink helpCenterRequestLink = (HelpCenterRequestLink) deepLink;
        this.f161761e.R(this.f161760d.b(helpCenterRequestLink.f133349b, helpCenterRequestLink.f133350c, helpCenterRequestLink.f133351d), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
