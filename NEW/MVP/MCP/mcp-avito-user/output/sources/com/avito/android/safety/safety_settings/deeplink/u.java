package com.avito.android.safety.safety_settings.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.SessionsInfoLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SessionsInfoSyncLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/safety_settings/deeplink/u;", "Lev/b;", "Lcom/avito/android/deep_linking/links/auth/SessionsInfoLink;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u extends AbstractC40162b<SessionsInfoLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safety.sessions.g f257598d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f257599e;

    @Inject
    public u(@Y61.k com.avito.android.safety.sessions.g gVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f257598d = gVar;
        this.f257599e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f257599e.R(this.f257598d.a(((SessionsInfoLink) deepLink).f133963b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
