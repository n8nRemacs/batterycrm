package com.avito.android.mortgage.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.mortgage.landing.model.LandingArguments;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import t00.InterfaceC48454a;

/* compiled from: MortgageLandingDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/deeplink/N;", "Lev/b;", "Lcom/avito/android/mortgage/deeplink/MortgageLandingLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class N extends AbstractC40162b<MortgageLandingLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f198755d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48454a f198756e;

    @Inject
    public N(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC48454a interfaceC48454a) {
        this.f198755d = interfaceC4053a;
        this.f198756e = interfaceC48454a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        MortgageLandingLink mortgageLandingLink = (MortgageLandingLink) deepLink;
        String str2 = mortgageLandingLink.f198739x;
        this.f198755d.R(this.f198756e.c(new LandingArguments(mortgageLandingLink.f198723h, mortgageLandingLink.f198717b, mortgageLandingLink.f198721f, mortgageLandingLink.f198722g, mortgageLandingLink.f198720e, mortgageLandingLink.f198718c, mortgageLandingLink.f198719d, mortgageLandingLink.f198724i, mortgageLandingLink.f198725j, mortgageLandingLink.f198726k, mortgageLandingLink.f198727l, mortgageLandingLink.f198728m, mortgageLandingLink.f198729n, mortgageLandingLink.f198730o, mortgageLandingLink.f198731p, mortgageLandingLink.f198732q, mortgageLandingLink.f198733r, mortgageLandingLink.f198734s, mortgageLandingLink.f198735t, mortgageLandingLink.f198736u, mortgageLandingLink.f198737v, mortgageLandingLink.f198738w, str2, null, mortgageLandingLink.f198740y)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
