package com.avito.android.mortgage.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageFormDeeplinkParser.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/deeplink/M;", "LKu/a;", "Lcom/avito/android/mortgage/deeplink/MortgageFormLink;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class M extends AbstractC14350a<MortgageFormLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        String strP = Ku.i.p(uri, "applicationId");
        String strP2 = Ku.i.p(uri, "applicantId");
        String queryParameter = uri.getQueryParameter("applicantType");
        String strP3 = Ku.i.p(uri, "title");
        K k12 = new K(uri);
        try {
            Type type = new L().getType();
            String queryParameter2 = uri.getQueryParameter("flowSteps");
            if (queryParameter2 != null && (list = (List) gson.e(queryParameter2, type)) != null) {
                List list2 = !list.isEmpty() ? list : null;
                if (list2 != null) {
                    String strP4 = Ku.i.p(uri, "step");
                    String queryParameter3 = uri.getQueryParameter("flowType");
                    if (queryParameter3 == null) {
                        queryParameter3 = "personal";
                    }
                    return new MortgageFormLink(strP, strP2, queryParameter, strP3, strP4, queryParameter3, list2);
                }
            }
            k12.invoke(new IllegalArgumentException("Parameter flowSteps is null!"));
            throw null;
        } catch (JsonParseException e12) {
            k12.invoke(e12);
            throw null;
        }
    }
}
