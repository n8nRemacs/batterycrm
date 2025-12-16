package com.avito.android.entry_point_client_room.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SendReportParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/entry_point_client_room/deeplink/c;", "LKu/a;", "Lcom/avito/android/entry_point_client_room/deeplink/SendReportDeepLink;", "<init>", "()V", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c extends AbstractC14350a<SendReportDeepLink> {
    @Inject
    public c() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("itemId");
        String queryParameter2 = uri.getQueryParameter(SearchParamsConverterKt.SOURCE);
        String queryParameter3 = uri.getQueryParameter("dealId");
        return new SendReportDeepLink(queryParameter, queryParameter2, queryParameter3 != null ? Integer.valueOf(Integer.parseInt(queryParameter3)) : null);
    }
}
