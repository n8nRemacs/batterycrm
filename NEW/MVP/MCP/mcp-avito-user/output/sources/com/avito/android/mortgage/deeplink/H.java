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

/* compiled from: MortgageDocumentUploadParser.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/deeplink/H;", "LKu/a;", "Lcom/avito/android/mortgage/deeplink/MortgageDocumentUploadLink;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class H extends AbstractC14350a<MortgageDocumentUploadLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        String strP = Ku.i.p(uri, "title");
        String strP2 = Ku.i.p(uri, "packageId");
        String strP3 = Ku.i.p(uri, "currentDocument");
        String strP4 = Ku.i.p(uri, "applicantId");
        String queryParameter = uri.getQueryParameter("applicationId");
        String queryParameter2 = uri.getQueryParameter("applicantType");
        F f12 = new F(uri);
        try {
            Type type = new G().getType();
            String queryParameter3 = uri.getQueryParameter("documents");
            if (queryParameter3 != null && (list = (List) gson.e(queryParameter3, type)) != null) {
                List list2 = !list.isEmpty() ? list : null;
                if (list2 != null) {
                    return new MortgageDocumentUploadLink(strP2, strP3, strP4, queryParameter, queryParameter2, strP, uri.getQueryParameter("error"), list2);
                }
            }
            f12.invoke(new IllegalArgumentException("Parameter documents is null!"));
            throw null;
        } catch (JsonParseException e12) {
            f12.invoke(e12);
            throw null;
        }
    }
}
