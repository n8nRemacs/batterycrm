package com.avito.android.checkout.deeplink.handlers;

import android.os.Bundle;
import com.avito.android.checkout.deeplink.CheckoutPromoCodeV2DeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CheckoutPromoCodeV2DeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/deeplink/handlers/d;", "Lev/a;", "Lcom/avito/android/checkout/deeplink/CheckoutPromoCodeV2DeepLink;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends AbstractC40161a<CheckoutPromoCodeV2DeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.checkout.domain.a f118204f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.i f118205g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f118206h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f118207i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f118208j;

    @Inject
    public d(@Y61.k com.avito.android.checkout.domain.a aVar, @Y61.k a.i iVar, @Y61.k a.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k R0 r02) {
        this.f118204f = aVar;
        this.f118205g = iVar;
        this.f118206h = gVar;
        this.f118207i = aVar2;
        this.f118208j = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f118208j, null, null, new c(bundle, this, (CheckoutPromoCodeV2DeepLink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f118208j, null);
    }
}
