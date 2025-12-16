package com.avito.android.travel_guest_profile.navigation;

import Y61.k;
import a61.InterfaceC19688a;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import navigation.TravelGuestProfileLink;

/* compiled from: TravelGuestProfileLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/navigation/e;", "Lev/a;", "Lnavigation/TravelGuestProfileLink;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends AbstractC40161a<TravelGuestProfileLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC19688a f302209f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f302210g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f302211h;

    @Inject
    public e(@k InterfaceC19688a interfaceC19688a, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a) {
        this.f302209f = interfaceC19688a;
        this.f302210g = interfaceC4053a;
        this.f302211h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        TravelGuestProfileLink travelGuestProfileLink = (TravelGuestProfileLink) deepLink;
        this.f302211h.b(travelGuestProfileLink, this, null, new d(this, travelGuestProfileLink));
        j(TravelGuestProfileLink.b.C11862b.f415188b);
    }
}
