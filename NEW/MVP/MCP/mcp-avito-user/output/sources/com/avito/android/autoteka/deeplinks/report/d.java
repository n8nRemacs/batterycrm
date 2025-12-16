package com.avito.android.autoteka.deeplinks.report;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.autoteka.deeplinks.AutotekaReportLink;
import com.avito.android.autoteka.deeplinks.ReportDetails;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: AutotekaReportDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/report/d;", "LKu/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaReportLink;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends AbstractC14350a<AutotekaReportLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = i.n(uri, "reportPublicId");
        String queryParameter = uri.getQueryParameter("autotekaX");
        String queryParameter2 = uri.getQueryParameter("actionType");
        String queryParameter3 = uri.getQueryParameter("fromBlock");
        return new AutotekaReportLink(new ReportDetails(queryParameter, strN, queryParameter3 != null ? C43066x.z0(queryParameter3) : null, queryParameter2));
    }
}
