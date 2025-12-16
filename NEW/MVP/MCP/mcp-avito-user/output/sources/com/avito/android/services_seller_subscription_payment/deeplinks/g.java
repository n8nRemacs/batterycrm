package com.avito.android.services_seller_subscription_payment.deeplinks;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.services_seller_subscription_payment.ServicesSellerSubscriptionPaymentResultLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ServicesSellerSubscriptionPaymentResultLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/deeplinks/g;", "LKu/a;", "Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentResultLink;", "<init>", "()V", "_avito_services-seller-subscription-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends AbstractC14350a<ServicesSellerSubscriptionPaymentResultLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        ServicesSellerSubscriptionPaymentResultLink.Status status;
        Uri uriQ = i.q(uri, ContextActionHandler.Link.DEEPLINK);
        String strP = i.p(uri, "status");
        if (strP.equals("success")) {
            status = ServicesSellerSubscriptionPaymentResultLink.Status.f280449b;
        } else {
            if (!strP.equals(PaymentStateKt.PAYMENT_STATE_FAILED)) {
                throw new DeeplinkParsingError.WrongParameterValue(toString(), "status", null, null, 12, null);
            }
            status = ServicesSellerSubscriptionPaymentResultLink.Status.f280450c;
        }
        return new ServicesSellerSubscriptionPaymentResultLink(uriQ, status);
    }
}
