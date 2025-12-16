package com.avito.android.autoteka.deeplinks.payment;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.autoteka.deeplinks.AutotekaPaymentLink;
import com.avito.android.autoteka.deeplinks.PaymentDetails;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.util.UtmParamsV2;
import com.google.gson.Gson;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: AutotekaPaymentDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/payment/d;", "LKu/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaPaymentLink;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends AbstractC14350a<AutotekaPaymentLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        Boolean boolV0;
        String queryParameter = uri.getQueryParameter("searchKey");
        String strN = i.n(uri, "productSlug");
        String queryParameter2 = uri.getQueryParameter("autotekaX");
        if (queryParameter2 == null) {
            com.avito.android.autoteka.helpers.c.f96648a.getClass();
            queryParameter2 = com.avito.android.autoteka.helpers.c.a();
        }
        String str = queryParameter2;
        String queryParameter3 = uri.getQueryParameter("fromBlock");
        Long lZ02 = queryParameter3 != null ? C43066x.z0(queryParameter3) : null;
        String queryParameter4 = uri.getQueryParameter("promoCode");
        UtmParamsV2.f318753g.getClass();
        UtmParamsV2 utmParamsV2 = new UtmParamsV2(uri.getQueryParameter("utm_medium"), uri.getQueryParameter("utm_source"), uri.getQueryParameter("utm_campaign"), uri.getQueryParameter("utm_content"), uri.getQueryParameter("utm_term"));
        String queryParameter5 = uri.getQueryParameter("paymentFailed");
        return new AutotekaPaymentLink(new PaymentDetails(queryParameter, strN, str, lZ02, utmParamsV2, queryParameter4 != null ? queryParameter4.toUpperCase(Locale.ROOT) : null, (queryParameter5 == null || (boolV0 = C43066x.v0(queryParameter5)) == null) ? false : boolV0.booleanValue()));
    }
}
