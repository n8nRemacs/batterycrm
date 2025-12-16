package com.avito.android.btob_business_trip.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.btob_business_trip.B2bBusinessTripDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import qk.InterfaceC47408a;

/* compiled from: B2bBusinessTripDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/btob_business_trip/deeplink/a;", "Lev/b;", "Lcom/avito/android/btob_business_trip/B2bBusinessTripDeeplink;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40162b<B2bBusinessTripDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC47408a f107839d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f107840e;

    @Inject
    public a(@k InterfaceC47408a interfaceC47408a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f107839d = interfaceC47408a;
        this.f107840e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f107840e.R(this.f107839d.a(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
