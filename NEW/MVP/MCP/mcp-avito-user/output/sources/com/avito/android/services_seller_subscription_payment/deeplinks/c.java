package com.avito.android.services_seller_subscription_payment.deeplinks;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.services_seller_subscription_payment.ServicesSellerSubscriptionPaymentLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ServicesSellerSubscriptionPaymentLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/deeplinks/c;", "LKu/a;", "Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentLink;", "<init>", "()V", "_avito_services-seller-subscription-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends AbstractC14350a<ServicesSellerSubscriptionPaymentLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new ServicesSellerSubscriptionPaymentLink(i.p(uri, "paymentUrl"));
    }
}
