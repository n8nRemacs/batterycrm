package com.avito.android.profile_settings_extended.deep_linking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ExtendedProfileSettingsLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import l90.o;

/* compiled from: ExtendedProfileSettingsLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/deep_linking/b;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ExtendedProfileSettingsLink;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends AbstractC40162b<ExtendedProfileSettingsLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o f230049d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings.b f230050e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f230051f;

    @Inject
    public b(@Y61.k o oVar, @Y61.k com.avito.android.profile_settings.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f230049d = oVar;
        this.f230050e = bVar;
        this.f230051f = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f230051f.R(this.f230050e.c().putExtra("up_intent", this.f230049d.b()), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
