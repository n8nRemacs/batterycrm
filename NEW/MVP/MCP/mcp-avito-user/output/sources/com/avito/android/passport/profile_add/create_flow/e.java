package com.avito.android.passport.profile_add.create_flow;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationActivity;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReAgentShortFlowCreationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/e;", "Lev/b;", "Lcom/avito/android/passport/profile_add/create_flow/ReAgentShortFlowCreationDeeplink;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends AbstractC40162b<ReAgentShortFlowCreationDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f211356d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Application f211357e;

    @Inject
    public e(@k a.InterfaceC4053a interfaceC4053a, @k Application application) {
        this.f211356d = interfaceC4053a;
        this.f211357e = application;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ReAgentShortFlowCreationActivity.f211511m.getClass();
        this.f211356d.R(new Intent(this.f211357e, (Class<?>) ReAgentShortFlowCreationActivity.class).putExtra("navigationBackDeeplink", ((ReAgentShortFlowCreationDeeplink) deepLink).f211337b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
