package com.avito.android.virtual_deal_room.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ClientEditDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/e;", "LKu/a;", "Lcom/avito/android/virtual_deal_room/deeplink/ClientEditDeeplink;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends AbstractC14350a<ClientEditDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("clientId");
        if (queryParameter == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String queryParameter2 = uri.getQueryParameter("firstName");
        String str = queryParameter2 == null ? "" : queryParameter2;
        String queryParameter3 = uri.getQueryParameter("lastName");
        String str2 = queryParameter3 == null ? "" : queryParameter3;
        String queryParameter4 = uri.getQueryParameter("middleName");
        String str3 = queryParameter4 == null ? "" : queryParameter4;
        String queryParameter5 = uri.getQueryParameter("phone");
        String str4 = queryParameter5 == null ? "" : queryParameter5;
        String queryParameter6 = uri.getQueryParameter("email");
        return new ClientEditDeeplink(queryParameter, str, str2, str3, str4, queryParameter6 == null ? "" : queryParameter6);
    }
}
