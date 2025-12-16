package com.avito.android.messenger.conversation.mvi.deeplinks.unsupported_platfor_action;

import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UnsupportedPlatformActionLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UnsupportedPlatformActionDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/unsupported_platfor_action/e;", "Lev/b;", "Lcom/avito/android/deep_linking/links/UnsupportedPlatformActionLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends AbstractC40162b<UnsupportedPlatformActionLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35845m2 f190674d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.d f190675e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f190676f;

    @Inject
    public e(@k InterfaceC35845m2 interfaceC35845m2, @k a.d dVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f190674d = interfaceC35845m2;
        this.f190675e = dVar;
        this.f190676f = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f190675e.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new d(this));
        return new UnsupportedPlatformActionLink.b();
    }
}
