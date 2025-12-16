package com.avito.android.short_term_rent;

import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.StrSoftBookingDeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrSoftBookingLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/o;", "Lev/a;", "Lcom/avito/android/deep_linking/links/StrSoftBookingDeepLink;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o extends AbstractC40161a<StrSoftBookingDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final StrBookingIntentFactory f282409f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f282410g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C25719a f282411h;

    @Inject
    public o(@Y61.k StrBookingIntentFactory strBookingIntentFactory, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k C25719a c25719a) {
        this.f282409f = strBookingIntentFactory;
        this.f282410g = interfaceC4053a;
        this.f282411h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        StrSoftBookingDeepLink strSoftBookingDeepLink = (StrSoftBookingDeepLink) deepLink;
        this.f282411h.a(strSoftBookingDeepLink, this, AuthSource.f92706i, new n(this, strSoftBookingDeepLink));
    }
}
