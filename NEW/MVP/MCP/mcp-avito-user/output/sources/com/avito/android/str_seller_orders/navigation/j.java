package com.avito.android.str_seller_orders.navigation;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.str_seller_orders.strsellerorders.StrOrdersSellerDeeplink;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: StrOrdersSellerDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders/navigation/j;", "LKu/a;", "Lcom/avito/android/str_seller_orders/strsellerorders/StrOrdersSellerDeeplink;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends AbstractC14350a<StrOrdersSellerDeeplink> {
    @Inject
    public j() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter("allTabs");
        boolean z12 = queryParameter != null ? Boolean.parseBoolean(queryParameter) : true;
        try {
            Type type = new i().getType();
            String queryParameter2 = uri.getQueryParameter("sellerFilters");
            Map mapC = (Map) (queryParameter2 != null ? gson.e(queryParameter2, type) : null);
            if (mapC == null) {
                mapC = P0.c();
            }
            return new StrOrdersSellerDeeplink(z12, mapC);
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "sellerFilters", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
