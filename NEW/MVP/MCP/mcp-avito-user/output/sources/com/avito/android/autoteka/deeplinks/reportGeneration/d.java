package com.avito.android.autoteka.deeplinks.reportGeneration;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.autoteka.deeplinks.AutotekaReportGenerationLink;
import com.avito.android.autoteka.deeplinks.ReportGenerationDetails;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: AutotekaReportGenerationDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/reportGeneration/d;", "LKu/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaReportGenerationLink;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends AbstractC14350a<AutotekaReportGenerationLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = i.n(uri, "usagePublicId");
        String queryParameter = uri.getQueryParameter("fromBlock");
        return new AutotekaReportGenerationLink(new ReportGenerationDetails(strN, uri.getQueryParameter("autotekaX"), queryParameter != null ? C43066x.z0(queryParameter) : null));
    }
}
