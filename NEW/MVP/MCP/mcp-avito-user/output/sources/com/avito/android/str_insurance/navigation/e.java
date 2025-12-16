package com.avito.android.str_insurance.navigation;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.str_insurance.InsuranceData;
import com.avito.android.str_insurance.StrInsuranceLink;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrInsuranceLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_insurance/navigation/e;", "LKu/a;", "Lcom/avito/android/str_insurance/StrInsuranceLink;", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends AbstractC14350a<StrInsuranceLink> {
    @Inject
    public e() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        c cVar = new c(uri);
        try {
            Type type = new d().getType();
            String queryParameter = uri.getQueryParameter("data");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE != null) {
                return new StrInsuranceLink((InsuranceData) objE);
            }
            cVar.invoke(new IllegalArgumentException("Parameter data is null!"));
            throw null;
        } catch (JsonParseException e12) {
            cVar.invoke(e12);
            throw null;
        }
    }
}
