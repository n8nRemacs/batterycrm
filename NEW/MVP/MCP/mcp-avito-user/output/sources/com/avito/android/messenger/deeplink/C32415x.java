package com.avito.android.messenger.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.L;
import com.avito.android.deep_linking.links.ChannelsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.F;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelsDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/x;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ChannelsLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.deeplink.x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32415x extends AbstractC40162b<ChannelsLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.F f195582d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f195583e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f195584f;

    @Inject
    public C32415x(@Y61.k com.avito.android.messenger.F f12, @Y61.k com.avito.android.L l12, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f195582d = f12;
        this.f195583e = l12;
        this.f195584f = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        Intent intentB = F.a.b(this.f195582d, ((ChannelsLink) deepLink).f133104c, 2);
        if (bundle != null ? bundle.getBoolean("with_up_intent", true) : true) {
            intentB.putExtra("up_intent", L.a.a(this.f195583e, null, 3));
        }
        this.f195584f.R(intentB, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
