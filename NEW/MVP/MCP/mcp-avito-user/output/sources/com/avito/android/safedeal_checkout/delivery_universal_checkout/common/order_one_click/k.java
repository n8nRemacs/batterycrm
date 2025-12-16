package com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryOrderRealOneClickLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryOrderRealOneClickDeepLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/order_one_click/k;", "LKu/a;", "Lcom/avito/android/deep_linking/links/DeliveryOrderRealOneClickLink;", "<init>", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends AbstractC14350a<DeliveryOrderRealOneClickLink> {
    @Inject
    public k() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        try {
            Type type = new j().getType();
            String queryParameter = uri.getQueryParameter("extraRequestParams");
            return new DeliveryOrderRealOneClickLink((Map) (queryParameter != null ? gson.e(queryParameter, type) : null));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "extraRequestParams", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
