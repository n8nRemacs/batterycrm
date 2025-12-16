package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import ev.AbstractC40162b;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentSetProfileNameDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/a;", "Lev/b;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/ReAgentSetProfileNameDeeplink;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40162b<ReAgentSetProfileNameDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f211407d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Application f211408e;

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k Application application) {
        this.f211407d = interfaceC4053a;
        this.f211408e = application;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ReAgentSetProfileNameDeeplink reAgentSetProfileNameDeeplink = (ReAgentSetProfileNameDeeplink) deepLink;
        String str2 = reAgentSetProfileNameDeeplink.f211379b;
        ProfileCreateExtendedFlow profileCreateExtendedFlow = L.f(str2, "create") ? ProfileCreateExtendedFlow.Passport.Create.f211172d : L.f(str2, "profile") ? ProfileCreateExtendedFlow.Profile.Upgrade.f211175d : null;
        if (profileCreateExtendedFlow == null) {
            return AbstractC14250d.b.f9170c;
        }
        ReAgentSetProfileNameArgs reAgentSetProfileNameArgs = new ReAgentSetProfileNameArgs(reAgentSetProfileNameDeeplink.f211380c, Integer.valueOf(reAgentSetProfileNameDeeplink.f211381d), UUID.randomUUID().toString(), profileCreateExtendedFlow);
        ReAgentSetProfileNameActivity.f211374m.getClass();
        this.f211407d.R(new Intent(this.f211408e, (Class<?>) ReAgentSetProfileNameActivity.class).putExtra("passport.add_profile.re_agent_set_profile_name_args", reAgentSetProfileNameArgs), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
