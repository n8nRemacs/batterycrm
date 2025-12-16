package com.avito.android.payment.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryOrderPaymentSuccessLink;
import com.avito.android.deeplink_handler.handler.b;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryOrderPaymentSuccessLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/deeplink/b;", "Lev/b;", "Lcom/avito/android/deep_linking/links/DeliveryOrderPaymentSuccessLink;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.payment.deeplink.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32971b extends AbstractC40162b<DeliveryOrderPaymentSuccessLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f214008d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f214009e;

    @Inject
    public C32971b(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.deep_linking.x xVar) {
        this.f214008d = aVar;
        this.f214009e = xVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        b.a.a(this.f214008d, this.f214009e.e(((DeliveryOrderPaymentSuccessLink) deepLink).f133190b), null, null, 6);
        return AbstractC14250d.c.f9171c;
    }
}
