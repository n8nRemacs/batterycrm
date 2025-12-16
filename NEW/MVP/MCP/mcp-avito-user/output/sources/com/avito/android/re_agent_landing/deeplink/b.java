package com.avito.android.re_agent_landing.deeplink;

import Ju.AbstractC14250d;
import Qh0.C14897a;
import Y61.k;
import android.app.Application;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: ReAgentProfileCreateLandingDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/re_agent_landing/deeplink/b;", "Lev/a;", "Lcom/avito/android/re_agent_landing/deeplink/ReAgentProfileCreateLandingDeeplink;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends AbstractC40161a<ReAgentProfileCreateLandingDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C25719a f250536f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f250537g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C14897a f250538h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Application f250539i;

    @Inject
    public b(@k C25719a c25719a, @k a.InterfaceC4053a interfaceC4053a, @k C14897a c14897a, @k Application application) {
        this.f250536f = c25719a;
        this.f250537g = interfaceC4053a;
        this.f250538h = c14897a;
        this.f250539i = application;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ReAgentProfileCreateLandingDeeplink reAgentProfileCreateLandingDeeplink = (ReAgentProfileCreateLandingDeeplink) deepLink;
        C14897a c14897a = this.f250538h;
        c14897a.getClass();
        n<Object> nVar = C14897a.f13984c[0];
        if (!((Boolean) c14897a.f13985b.a().getValue()).booleanValue()) {
            j(AbstractC14250d.b.f9170c);
            return;
        }
        this.f250536f.a(reAgentProfileCreateLandingDeeplink, this, AuthSource.f92721p0, new a(this, reAgentProfileCreateLandingDeeplink));
    }
}
