package com.avito.android.short_term_rent.bookingform.deeplink;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.short_term_rent.deeplink.BookingFormDeepLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BookingFormDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/deeplink/b;", "Lev/a;", "Lcom/avito/android/short_term_rent/deeplink/BookingFormDeepLink;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40161a<BookingFormDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C25719a f281231f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.short_term_rent.bookingform.e f281232g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f281233h;

    @Inject
    public b(@k C25719a c25719a, @k com.avito.android.short_term_rent.bookingform.e eVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f281231f = c25719a;
        this.f281232g = eVar;
        this.f281233h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        BookingFormDeepLink bookingFormDeepLink = (BookingFormDeepLink) deepLink;
        this.f281231f.a(bookingFormDeepLink, this, AuthSource.f92706i, new a(this, bookingFormDeepLink));
    }
}
