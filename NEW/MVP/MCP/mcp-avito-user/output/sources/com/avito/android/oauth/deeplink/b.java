package com.avito.android.oauth.deeplink;

import Y61.k;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OAuthDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/oauth/deeplink/b;", "Lev/a;", "Lcom/avito/android/oauth/deeplink/OAuthDeepLink;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends AbstractC40161a<OAuthDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f208216f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Context f208217g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f208218h;

    @Inject
    public b(@k Context context, @k C25719a c25719a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f208216f = interfaceC4053a;
        this.f208217g = context;
        this.f208218h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        OAuthDeepLink oAuthDeepLink = (OAuthDeepLink) deepLink;
        this.f208218h.a(oAuthDeepLink, this, AuthSource.f92723q0, new a(this, oAuthDeepLink));
    }
}
