package com.avito.android.vacancy_call_action.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: VacancyCallActionDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vacancy_call_action/deeplink/d;", "LKu/a;", "Lcom/avito/android/vacancy_call_action/deeplink/VacancyCallActionDeepLink;", "<init>", "()V", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends AbstractC14350a<VacancyCallActionDeepLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        long jM2 = i.m(uri, "vacancyId");
        String strP = i.p(uri, "fromPage");
        String queryParameter = uri.getQueryParameter("context");
        String queryParameter2 = uri.getQueryParameter("disclaimerPDViewed");
        return new VacancyCallActionDeepLink(strP, queryParameter2 != null ? C43066x.v0(queryParameter2) : null, queryParameter, jM2);
    }
}
