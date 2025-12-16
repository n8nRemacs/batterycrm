package com.avito.android.developments_advice.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.developments_advice.remote.model.ConsultationFormLink;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.FormInput;
import com.avito.android.remote.model.LandingInfo;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ConsultationFormLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_advice/deeplink/c;", "LKu/a;", "Lcom/avito/android/developments_advice/remote/model/ConsultationFormLink;", "<init>", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends AbstractC14350a<ConsultationFormLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("itemId");
        String queryParameter2 = uri.getQueryParameter("developmentId");
        String queryParameter3 = uri.getQueryParameter("developerId");
        String queryParameter4 = uri.getQueryParameter("developmentOfferId");
        String queryParameter5 = uri.getQueryParameter("requestType");
        String queryParameter6 = uri.getQueryParameter("formTitle");
        String queryParameter7 = uri.getQueryParameter("formDescription");
        String queryParameter8 = uri.getQueryParameter("formButtonTitle");
        String queryParameter9 = uri.getQueryParameter(SearchParamsConverterKt.LOCATION_ID);
        String queryParameter10 = uri.getQueryParameter("fromPage");
        String queryParameter11 = uri.getQueryParameter("marketingParams");
        String queryParameter12 = uri.getQueryParameter("hideNameInput");
        Boolean boolV0 = queryParameter12 != null ? C43066x.v0(queryParameter12) : null;
        String queryParameter13 = uri.getQueryParameter("hideQuestionInput");
        Boolean boolV02 = queryParameter13 != null ? C43066x.v0(queryParameter13) : null;
        String queryParameter14 = uri.getQueryParameter("chooseCallbackTime");
        Boolean boolV03 = queryParameter14 != null ? C43066x.v0(queryParameter14) : null;
        String queryParameter15 = uri.getQueryParameter("x");
        String queryParameter16 = uri.getQueryParameter("mainTextLinkText");
        String queryParameter17 = uri.getQueryParameter("mainTextLinkUrl");
        DeepLink deepLinkB = queryParameter17 != null ? xVar.b(queryParameter17) : null;
        String queryParameter18 = uri.getQueryParameter("mainTextLinkAsButton");
        Boolean boolV04 = queryParameter18 != null ? C43066x.v0(queryParameter18) : null;
        return new ConsultationFormLink((queryParameter6 == null && queryParameter7 == null && queryParameter8 == null && queryParameter11 == null && boolV0 == null) ? null : new ConsultationFormData(queryParameter6, queryParameter7, null, new FormInput(null, null, null, null, null, boolV0, false, null, 223, null), null, new FormInput(null, null, null, null, null, boolV02, false, null, 223, null), null, queryParameter8, null, null, new AnalyticsData(queryParameter9, queryParameter10, null, queryParameter11, 4, null), new LandingInfo(queryParameter16, deepLinkB, boolV04), 852, null), boolV03, queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, queryParameter15, uri.getQueryParameter("mcid"));
    }
}
