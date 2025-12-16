package com.avito.android.mortgage.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: PreApprovalFormLinkParser.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/deeplink/h0;", "LKu/a;", "Lcom/avito/android/mortgage/deeplink/PreApprovalFormLink;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h0 extends AbstractC14350a<PreApprovalFormLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
        String queryParameter = uri.getQueryParameter("purposeId");
        String queryParameter2 = uri.getQueryParameter("regionId");
        String queryParameter3 = uri.getQueryParameter("propertyCost");
        Integer numY0 = queryParameter3 != null ? C43066x.y0(queryParameter3) : null;
        String queryParameter4 = uri.getQueryParameter("landCost");
        Integer numY02 = queryParameter4 != null ? C43066x.y0(queryParameter4) : null;
        String queryParameter5 = uri.getQueryParameter("downPayment");
        Integer numY03 = queryParameter5 != null ? C43066x.y0(queryParameter5) : null;
        String queryParameter6 = uri.getQueryParameter("creditTerm");
        Integer numY04 = queryParameter6 != null ? C43066x.y0(queryParameter6) : null;
        String queryParameter7 = uri.getQueryParameter("landingBorrowerAge");
        String queryParameter8 = uri.getQueryParameter("occupation");
        String queryParameter9 = uri.getQueryParameter("landingCurrentExperience");
        String queryParameter10 = uri.getQueryParameter("income");
        return new PreApprovalFormLink(numY0, numY02, numY03, numY04, queryParameter10 != null ? C43066x.y0(queryParameter10) : null, queryParameter, queryParameter2, queryParameter7, queryParameter8, queryParameter9, uri.getQueryParameter("proofOfIncome"), uri.getQueryParameter(SearchParamsConverterKt.SOURCE));
    }
}
