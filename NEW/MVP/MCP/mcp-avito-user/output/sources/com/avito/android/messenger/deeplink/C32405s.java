package com.avito.android.messenger.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.ChannelDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.F;
import com.avito.android.util.C35967w2;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelDetailsDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/s;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ChannelDetailsLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.deeplink.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32405s extends AbstractC40162b<ChannelDetailsLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.F f195564d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f195565e;

    @Inject
    public C32405s(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.messenger.F f12) {
        this.f195564d = f12;
        this.f195565e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ChannelDetailsLink channelDetailsLink = (ChannelDetailsLink) deepLink;
        Intent intentC = this.f195564d.c((30 & 2) != 0 ? null : null, channelDetailsLink.f133098b, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 32) != 0 ? null : channelDetailsLink.f133099c, (30 & 16) == 0);
        if (bundle != null ? bundle.getBoolean("with_up_intent", true) : true) {
            intentC.putExtra("up_intent", F.a.b(this.f195564d, null, 3).addFlags(603979776));
        }
        C35967w2.c(intentC, bundle != null ? com.avito.android.util.H.b(bundle) : null);
        this.f195565e.R(intentC, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
