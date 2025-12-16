package com.avito.android.developments_advice.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.ConsultationStartLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ConsultationStartLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_advice/deeplink/f;", "LKu/a;", "Lcom/avito/android/deep_linking/links/ConsultationStartLink;", "<init>", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends AbstractC14350a<ConsultationStartLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("itemId");
        String queryParameter2 = uri.getQueryParameter("developmentId");
        String queryParameter3 = uri.getQueryParameter("developerId");
        String queryParameter4 = uri.getQueryParameter("developmentOfferId");
        String queryParameter5 = uri.getQueryParameter("requestType");
        String queryParameter6 = uri.getQueryParameter(SearchParamsConverterKt.LOCATION_ID);
        String queryParameter7 = uri.getQueryParameter("nodeType");
        String queryParameter8 = uri.getQueryParameter("fromPage");
        String queryParameter9 = uri.getQueryParameter("name");
        String queryParameter10 = uri.getQueryParameter("phone");
        String queryParameter11 = uri.getQueryParameter("marketingParams");
        return new ConsultationStartLink(queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, new AnalyticsData(queryParameter6, queryParameter8, queryParameter7, queryParameter11), queryParameter9, queryParameter10, uri.getQueryParameter("x"), uri.getQueryParameter("questionText"), uri.getQueryParameter("formTitle"), uri.getQueryParameter("formDescription"), uri.getQueryParameter("mcid"));
    }
}
