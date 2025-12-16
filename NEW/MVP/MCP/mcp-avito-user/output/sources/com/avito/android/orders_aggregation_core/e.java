package com.avito.android.orders_aggregation_core;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.orders_aggregation_core.deeplink.OrdersAggregationLink;
import com.avito.android.orders_aggregation_core.deeplink.OrdersAggregationSettings;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrdersAggregationDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/orders_aggregation_core/e;", "LKu/a;", "Lcom/avito/android/orders_aggregation_core/deeplink/OrdersAggregationLink;", "<init>", "()V", "_avito_orders-aggregation-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends AbstractC14350a<OrdersAggregationLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter("selectedTab");
        try {
            Type type = new d().getType();
            String queryParameter2 = uri.getQueryParameter("settings");
            return new OrdersAggregationLink(queryParameter, (OrdersAggregationSettings) (queryParameter2 != null ? gson.e(queryParameter2, type) : null));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "settings", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
