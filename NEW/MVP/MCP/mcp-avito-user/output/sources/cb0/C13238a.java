package Cb0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ProfileSettingsLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import l90.o;

/* compiled from: ProfileSettingsLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LCb0/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ProfileSettingsLink;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cb0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13238a extends AbstractC40162b<ProfileSettingsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final o f2285d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.profile_settings.b f2286e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f2287f;

    @Inject
    public C13238a(@k o oVar, @k com.avito.android.profile_settings.b bVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f2285d = oVar;
        this.f2286e = bVar;
        this.f2287f = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ProfileSettingsLink profileSettingsLink = (ProfileSettingsLink) deepLink;
        this.f2287f.R(this.f2286e.b(profileSettingsLink.f133613b, null, profileSettingsLink.f133614c).putExtra("up_intent", this.f2285d.b()), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
