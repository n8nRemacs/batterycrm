package com.avito.android.developments_agency_search.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsFactory;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: RealtyAgencySearchLotsLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/D;", "LKu/a;", "Lcom/avito/android/developments_agency_search/deeplink/RealtyAgencySearchLotsLink;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class D extends AbstractC14350a<RealtyAgencySearchLotsLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
        String queryParameter = uri.getQueryParameter("title");
        String queryParameter2 = uri.getQueryParameter("isFiltersEnabled");
        boolean z12 = queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : false;
        SearchParams searchParamsFromUri = SearchParamsFactory.INSTANCE.fromUri(uri);
        String queryParameter3 = uri.getQueryParameter("parentScreen");
        if (queryParameter3 == null) {
            queryParameter3 = "unknown";
        }
        String str = queryParameter3;
        String queryParameter4 = uri.getQueryParameter("clientId");
        String queryParameter5 = uri.getQueryParameter("latitude");
        Double dValueOf = queryParameter5 != null ? Double.valueOf(Double.parseDouble(queryParameter5)) : null;
        String queryParameter6 = uri.getQueryParameter("longitude");
        return new RealtyAgencySearchLotsLink(queryParameter, z12, searchParamsFromUri, str, queryParameter4, dValueOf, queryParameter6 != null ? Double.valueOf(Double.parseDouble(queryParameter6)) : null);
    }
}
