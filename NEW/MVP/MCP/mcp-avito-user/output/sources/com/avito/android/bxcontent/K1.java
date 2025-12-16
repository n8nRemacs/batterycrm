package com.avito.android.bxcontent;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.AdvertListLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ItemListLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/K1;", "LKu/a;", "Lcom/avito/android/deep_linking/links/AdvertListLink$ItemList;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class K1 extends AbstractC14350a<AdvertListLink.ItemList> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.Custom {
        String queryParameter = uri.getQueryParameter("title");
        String queryParameter2 = uri.getQueryParameter("subtitle");
        String queryParameter3 = uri.getQueryParameter("ids");
        List listF0 = queryParameter3 != null ? C43066x.f0(queryParameter3, new String[]{","}, 0, 6) : null;
        String queryParameter4 = uri.getQueryParameter("title2");
        String queryParameter5 = uri.getQueryParameter("subtitle2");
        String queryParameter6 = uri.getQueryParameter("ids2");
        List listF02 = queryParameter6 != null ? C43066x.f0(queryParameter6, new String[]{","}, 0, 6) : null;
        String queryParameter7 = uri.getQueryParameter("title3");
        String queryParameter8 = uri.getQueryParameter("subtitle3");
        String queryParameter9 = uri.getQueryParameter("ids3");
        List listF03 = queryParameter9 != null ? C43066x.f0(queryParameter9, new String[]{","}, 0, 6) : null;
        boolean z12 = Boolean.parseBoolean(uri.getQueryParameter("stayInAppOnBack"));
        boolean z13 = Boolean.parseBoolean(uri.getQueryParameter("showOver"));
        boolean zF2 = kotlin.jvm.internal.L.f(uri.getQueryParameter("display"), "rich");
        String queryParameter10 = uri.getQueryParameter("categoryId");
        String queryParameter11 = uri.getQueryParameter("src");
        String queryParameter12 = uri.getQueryParameter(SearchParamsConverterKt.LOCATION_ID);
        String queryParameter13 = uri.getQueryParameter("fromPage");
        boolean z14 = Boolean.parseBoolean(uri.getQueryParameter("useCachedLocation"));
        String queryParameter14 = uri.getQueryParameter("context");
        List list = listF0;
        if (list != null && !list.isEmpty()) {
            return new AdvertListLink.ItemList(queryParameter, queryParameter2, listF0, queryParameter4, queryParameter5, listF02, queryParameter7, queryParameter8, listF03, Boolean.valueOf(z12), Boolean.valueOf(z13), zF2, queryParameter10, queryParameter11, queryParameter12, queryParameter13, z14, queryParameter14);
        }
        Ku.i.g(this, uri, "ids list must not be empty");
        throw null;
    }
}
