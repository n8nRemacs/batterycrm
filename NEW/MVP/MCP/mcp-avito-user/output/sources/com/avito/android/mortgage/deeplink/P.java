package com.avito.android.mortgage.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: MortgageLandingDeeplinkParser.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/deeplink/P;", "LKu/a;", "Lcom/avito/android/mortgage/deeplink/MortgageLandingLink;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class P extends AbstractC14350a<MortgageLandingLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
        String queryParameter = uri.getQueryParameter("landingBorrowerAge");
        String queryParameter2 = uri.getQueryParameter("propertyCost");
        Integer numY0 = queryParameter2 != null ? C43066x.y0(queryParameter2) : null;
        String queryParameter3 = uri.getQueryParameter("landCost");
        Integer numY02 = queryParameter3 != null ? C43066x.y0(queryParameter3) : null;
        String queryParameter4 = uri.getQueryParameter("downPayment");
        Integer numY03 = queryParameter4 != null ? C43066x.y0(queryParameter4) : null;
        String queryParameter5 = uri.getQueryParameter("regionId");
        String queryParameter6 = uri.getQueryParameter("purposeId");
        String queryParameter7 = uri.getQueryParameter("creditTerm");
        return new MortgageLandingLink(queryParameter, numY0, numY02, numY03, queryParameter5, queryParameter6, queryParameter7 != null ? C43066x.y0(queryParameter7) : null, uri.getQueryParameter("mortgageProgram"), uri.getQueryParameter("occupation"), uri.getQueryParameter("landingTotalExperience"), uri.getQueryParameter("landingCurrentExperience"), uri.getQueryParameter("bankPayrollId"), uri.getQueryParameter("proofOfIncome"), uri.getQueryParameter("landingBusinessAge"), uri.getQueryParameter("iid"), uri.getQueryParameter(SearchParamsConverterKt.SOURCE), uri.getQueryParameter("utm_campaign"), uri.getQueryParameter("utm_medium"), uri.getQueryParameter("utm_term"), uri.getQueryParameter("utm_content"), uri.getQueryParameter("fromPage"), uri.getQueryParameter("flowType"), uri.getQueryParameter("sourceType"), false, 8388608, null);
    }
}
