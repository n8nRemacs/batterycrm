package com.avito.android.messenger.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelBottomSheetInputLinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/e;", "Lev/b;", "Lcom/avito/android/messenger/deeplink/ChannelBottomSheetInputLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.deeplink.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32378e extends AbstractC40162b<ChannelBottomSheetInputLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f195507d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.F f195508e;

    @Inject
    public C32378e(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.messenger.F f12) {
        this.f195507d = interfaceC4053a;
        this.f195508e = f12;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ChannelBottomSheetInputLink channelBottomSheetInputLink = (ChannelBottomSheetInputLink) deepLink;
        String str2 = channelBottomSheetInputLink.f195308b;
        String str3 = channelBottomSheetInputLink.f195312f;
        String str4 = channelBottomSheetInputLink.f195313g;
        this.f195507d.R(this.f195508e.n(str2, channelBottomSheetInputLink.f195310d, channelBottomSheetInputLink.f195311e, str3, str4, channelBottomSheetInputLink.f195314h, channelBottomSheetInputLink.f195315i, channelBottomSheetInputLink.f195309c), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
