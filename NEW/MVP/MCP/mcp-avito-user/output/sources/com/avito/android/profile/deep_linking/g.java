package com.avito.android.profile.deep_linking;

import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.profile.deeplinks.IacProfilePhonesSettingsLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacProfilePhonesSettingsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/deep_linking/g;", "Lev/a;", "Lcom/avito/android/profile/deeplinks/IacProfilePhonesSettingsLink;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends AbstractC40161a<IacProfilePhonesSettingsLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f221902f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final l90.c f221903g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C25719a f221904h;

    @Inject
    public g(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k l90.c cVar, @Y61.k C25719a c25719a) {
        this.f221902f = interfaceC4053a;
        this.f221903g = cVar;
        this.f221904h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AuthSource authSource = AuthSource.f92681P;
        f fVar = new f(this);
        this.f221904h.a((IacProfilePhonesSettingsLink) deepLink, this, authSource, fVar);
    }
}
