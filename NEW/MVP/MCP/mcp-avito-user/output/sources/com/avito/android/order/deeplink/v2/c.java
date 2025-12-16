package com.avito.android.order.deeplink.v2;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.order.deeplink.RedesignedOrderLink;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RedesignedOrderLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/order/deeplink/v2/c;", "LKu/a;", "Lcom/avito/android/order/deeplink/RedesignedOrderLink;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends AbstractC14350a<RedesignedOrderLink> {
    @Inject
    public c() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new RedesignedOrderLink(i.o(uri, "orderId"), uri.getBooleanQueryParameter("withBottomNavigation", true), new OrderScreenSegment(uri.getQueryParameter("segment")));
    }
}
