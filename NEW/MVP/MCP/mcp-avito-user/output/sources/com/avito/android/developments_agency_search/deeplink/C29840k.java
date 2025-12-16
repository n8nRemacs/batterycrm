package com.avito.android.developments_agency_search.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_agency_search.deeplink.DealRoomLink;
import com.google.gson.Gson;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;

/* compiled from: DealRoomLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/k;", "LKu/a;", "Lcom/avito/android/developments_agency_search/deeplink/DealRoomLink;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.developments_agency_search.deeplink.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29840k extends AbstractC14350a<DealRoomLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
        Object next;
        String queryParameter = uri.getQueryParameter("clientId");
        if (queryParameter == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        DealRoomLink.Status.a aVar = DealRoomLink.Status.f136365c;
        String queryParameter2 = uri.getQueryParameter("status");
        aVar.getClass();
        Iterator it = ((AbstractC42738c) DealRoomLink.Status.f136374l).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DealRoomLink.Status) next).f136375b.equals(queryParameter2)) {
                break;
            }
        }
        DealRoomLink.Status status = (DealRoomLink.Status) next;
        String queryParameter3 = uri.getQueryParameter("parentScreen");
        if (queryParameter3 == null) {
            queryParameter3 = "unknown";
        }
        return new DealRoomLink(queryParameter, status, queryParameter3);
    }
}
