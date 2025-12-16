package com.avito.android.cpt.mass_activation.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CptMassActivationDeepLinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpt/mass_activation/deeplink/g;", "LKu/a;", "Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends AbstractC14350a<CptMassActivationEstimateLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        d dVar = new d(uri);
        try {
            Type type = new e().getType();
            String queryParameter = uri.getQueryParameter("itemIds");
            if (queryParameter != null && (list = (List) gson.e(queryParameter, type)) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    String strO = i.o(uri, "title");
                    try {
                        Type type2 = new f().getType();
                        String queryParameter2 = uri.getQueryParameter("description");
                        return new CptMassActivationEstimateLink((AttributedText) (queryParameter2 != null ? gson.e(queryParameter2, type2) : null), list, strO);
                    } catch (JsonParseException e12) {
                        throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "description", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
                    }
                }
            }
            dVar.invoke(new IllegalArgumentException("Parameter itemIds is null!"));
            throw null;
        } catch (JsonParseException e13) {
            dVar.invoke(e13);
            throw null;
        }
    }
}
