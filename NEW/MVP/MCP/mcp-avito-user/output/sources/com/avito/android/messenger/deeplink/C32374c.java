package com.avito.android.messenger.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.BlockUserWithReasonLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BlockUserWithReasonDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/c;", "Lev/b;", "Lcom/avito/android/deep_linking/links/BlockUserWithReasonLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.deeplink.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32374c extends AbstractC40162b<BlockUserWithReasonLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.F f195496d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f195497e;

    @Inject
    public C32374c(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.messenger.F f12) {
        this.f195496d = f12;
        this.f195497e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        BlockUserWithReasonLink blockUserWithReasonLink = (BlockUserWithReasonLink) deepLink;
        this.f195497e.R(this.f195496d.h(blockUserWithReasonLink.f133051b, blockUserWithReasonLink.f133052c, blockUserWithReasonLink.f133053d), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
