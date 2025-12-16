package com.avito.android.payment.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PaymentGenericLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.payment.ParametersTree;
import com.avito.android.remote.model.category_parameters.CharParameter;
import ev.AbstractC40162b;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentGenericDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/deeplink/m;", "Lev/b;", "Lcom/avito/android/deep_linking/links/PaymentGenericLink;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m extends AbstractC40162b<PaymentGenericLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f214021d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36134w1 f214022e;

    @Inject
    public m(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC36134w1 interfaceC36134w1) {
        this.f214021d = interfaceC4053a;
        this.f214022e = interfaceC36134w1;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ParametersTree parametersTree;
        PaymentGenericLink paymentGenericLink = (PaymentGenericLink) deepLink;
        if (paymentGenericLink.f133557d.length() > 0) {
            parametersTree = new ParametersTree(Collections.singletonList(new CharParameter("paymentToken", "", true, true, null, null, null, paymentGenericLink.f133557d, null, null, null, null, null, null, null, null, null, null, 262000, null)));
        } else {
            parametersTree = new ParametersTree(C42784z0.f406748b);
        }
        this.f214021d.R(this.f214022e.d(paymentGenericLink.f133555b, paymentGenericLink.f133556c, parametersTree), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
