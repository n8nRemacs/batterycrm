package com.avito.android.payment.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.SBOLPaymentLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SBOLPaymentDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/deeplink/y;", "Lev/b;", "Lcom/avito/android/deep_linking/links/SBOLPaymentLink;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class y extends AbstractC40162b<SBOLPaymentLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f214063d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36134w1 f214064e;

    @Inject
    public y(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC36134w1 interfaceC36134w1) {
        this.f214063d = interfaceC4053a;
        this.f214064e = interfaceC36134w1;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f214063d.R(this.f214064e.c(((SBOLPaymentLink) deepLink).f133641b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
