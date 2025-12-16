package com.avito.android.messenger.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.ChannelMapLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelMapDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/v;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ChannelMapLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.deeplink.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32411v extends AbstractC40162b<ChannelMapLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.F f195574d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f195575e;

    @Inject
    public C32411v(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.messenger.F f12) {
        this.f195574d = f12;
        this.f195575e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ChannelMapLink channelMapLink = (ChannelMapLink) deepLink;
        String str2 = channelMapLink.f133100b;
        if (str2 == null) {
            str2 = "";
        }
        MarkersRequest markersRequest = new MarkersRequest(channelMapLink.f133101c, new RawJson(channelMapLink.f133102d));
        this.f195575e.R(this.f195574d.g(str2, new GeoMarker[0], markersRequest, false), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
