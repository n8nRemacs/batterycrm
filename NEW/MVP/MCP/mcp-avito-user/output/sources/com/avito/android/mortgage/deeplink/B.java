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

/* compiled from: MortgageDocumentRequirementsParser.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/deeplink/B;", "LKu/a;", "Lcom/avito/android/mortgage/deeplink/MortgageDocumentRequirementsLink;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B extends AbstractC14350a<MortgageDocumentRequirementsLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        String strP = Ku.i.p(uri, "packageType");
        C32610z c32610z = new C32610z(uri);
        try {
            Type type = new A().getType();
            String queryParameter = uri.getQueryParameter("visibleTypes");
            if (queryParameter != null && (list = (List) gson.e(queryParameter, type)) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    return new MortgageDocumentRequirementsLink(strP, list, uri.getQueryParameter("applicationId"));
                }
            }
            c32610z.invoke(new IllegalArgumentException("Parameter visibleTypes is null!"));
            throw null;
        } catch (JsonParseException e12) {
            c32610z.invoke(e12);
            throw null;
        }
    }
}
