package com.avito.android.profile.deep_linking;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.SessionsListLink;
import com.avito.android.safety.deeplink.SafetySettingsLink;
import ev.AbstractC40161a;
import go0.C40716a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SessionsListSyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/deep_linking/B;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/SessionsListLink;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class B extends AbstractC40161a<SessionsListLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f221888f;

    @Inject
    public B(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f221888f = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        i(new C40716a(), this.f221888f, new SafetySettingsLink(((SessionsListLink) deepLink).f133973b));
    }
}
