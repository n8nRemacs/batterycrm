package com.avito.android.publish.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Of0.InterfaceC14681a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PublishLimitsHistoryLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishLimitsHistoryDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/deeplink/J;", "Lev/b;", "Lcom/avito/android/deep_linking/links/PublishLimitsHistoryLink;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class J extends AbstractC40162b<PublishLimitsHistoryLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14681a f232535d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f232536e;

    @Inject
    public J(@Y61.k InterfaceC14681a interfaceC14681a, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f232535d = interfaceC14681a;
        this.f232536e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f232536e.R(this.f232535d.a(((PublishLimitsHistoryLink) deepLink).f133626b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
