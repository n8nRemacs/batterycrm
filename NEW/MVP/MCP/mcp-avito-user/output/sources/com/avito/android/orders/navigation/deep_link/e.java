package com.avito.android.orders.navigation.deep_link;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.orders.OrdersLink;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrdersLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/orders/navigation/deep_link/e;", "LKu/a;", "Lcom/avito/android/orders/OrdersLink;", "<init>", "()V", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends AbstractC14350a<OrdersLink> {
    @Inject
    public e() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter(NotificationOpenAtTab.TAB);
        String queryParameter2 = uri.getQueryParameter("ordersToPrefetch");
        if (queryParameter == null || queryParameter.length() <= 0) {
            queryParameter = null;
        }
        if (queryParameter2 == null || queryParameter2.length() <= 0) {
            queryParameter2 = null;
        }
        return new OrdersLink(queryParameter, queryParameter2);
    }
}
