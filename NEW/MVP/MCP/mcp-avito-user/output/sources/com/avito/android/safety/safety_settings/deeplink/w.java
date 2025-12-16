package com.avito.android.safety.safety_settings.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.SessionsSocialLogoutLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import po0.InterfaceC47119a;

/* compiled from: SessionsSocialLogoutSyncLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/safety_settings/deeplink/w;", "Lev/b;", "Lcom/avito/android/deep_linking/links/auth/SessionsSocialLogoutLink;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w extends AbstractC40162b<SessionsSocialLogoutLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safety.sessions.k f257602d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47119a f257603e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f257604f;

    @Inject
    public w(@Y61.k com.avito.android.safety.sessions.k kVar, @Y61.k InterfaceC47119a interfaceC47119a, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f257602d = kVar;
        this.f257603e = interfaceC47119a;
        this.f257604f = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        SessionsSocialLogoutLink sessionsSocialLogoutLink = (SessionsSocialLogoutLink) deepLink;
        boolean zF2 = L.f(bundle != null ? bundle.getString("deeplink_handling_source") : null, "safety_settings");
        SessionsSocialLogoutLink.Mode mode = sessionsSocialLogoutLink.f133979g;
        SessionsSocialLogoutLink.Mode mode2 = SessionsSocialLogoutLink.Mode.f133981c;
        Intent intentA = this.f257602d.a(sessionsSocialLogoutLink.f133974b, sessionsSocialLogoutLink.f133975c, sessionsSocialLogoutLink.f133976d, mode == mode2, sessionsSocialLogoutLink.f133977e, sessionsSocialLogoutLink.f133978f);
        if (!zF2 && mode == mode2) {
            intentA.putExtra("up_intent", InterfaceC47119a.C12288a.a(this.f257603e, null, 3));
        }
        this.f257604f.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
