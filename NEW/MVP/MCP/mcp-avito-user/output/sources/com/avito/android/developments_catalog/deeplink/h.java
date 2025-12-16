package com.avito.android.developments_catalog.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DevelopmentsCatalogLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: DevelopmentsCatalogLinkParser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_catalog/deeplink/h;", "LKu/a;", "Lcom/avito/android/deep_linking/links/DevelopmentsCatalogLink;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends AbstractC14350a<DevelopmentsCatalogLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        DeepLink deepLinkA;
        String strN = Ku.i.n(uri, "itemId");
        String queryParameter = uri.getQueryParameter("itemTitle");
        String queryParameter2 = uri.getQueryParameter("context");
        String queryParameter3 = uri.getQueryParameter("fromPage");
        String queryParameter4 = uri.getQueryParameter("modelCardRedirect");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String str = queryParameter;
        if (queryParameter4 != null) {
            deepLinkA = xVar.a(uri);
            if (deepLinkA == null) {
                deepLinkA = xVar.b(queryParameter4);
            }
        } else {
            deepLinkA = null;
        }
        return new DevelopmentsCatalogLink(strN, str, queryParameter2, queryParameter3, deepLinkA);
    }
}
