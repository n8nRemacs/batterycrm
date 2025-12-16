package com.avito.android.cv_validation_bottom_sheet.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CvValidationDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/deeplink/m;", "LKu/a;", "Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationLink;", "<init>", "()V", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m extends AbstractC14350a<CvValidationLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        e eVar = new e(uri);
        try {
            Type type = new f().getType();
            String queryParameter = uri.getQueryParameter("cvInfoArray");
            if (queryParameter != null && (list = (List) gson.e(queryParameter, type)) != null) {
                List list2 = !list.isEmpty() ? list : null;
                if (list2 != null) {
                    g gVar = new g(uri);
                    try {
                        Type type2 = new h().getType();
                        String queryParameter2 = uri.getQueryParameter("button");
                        Object objE = queryParameter2 != null ? gson.e(queryParameter2, type2) : null;
                        if (objE == null) {
                            gVar.invoke(new IllegalArgumentException("Parameter button is null!"));
                            throw null;
                        }
                        CvValidationButton cvValidationButton = (CvValidationButton) objE;
                        i iVar = new i(uri);
                        try {
                            Type type3 = new j().getType();
                            String queryParameter3 = uri.getQueryParameter("texts");
                            Object objE2 = queryParameter3 != null ? gson.e(queryParameter3, type3) : null;
                            if (objE2 == null) {
                                iVar.invoke(new IllegalArgumentException("Parameter texts is null!"));
                                throw null;
                            }
                            CvValidationTexts cvValidationTexts = (CvValidationTexts) objE2;
                            long jM2 = Ku.i.m(uri, "vacancyId");
                            k kVar = new k(uri);
                            try {
                                Type type4 = new l().getType();
                                String queryParameter4 = uri.getQueryParameter("args");
                                Object objE3 = queryParameter4 != null ? gson.e(queryParameter4, type4) : null;
                                if (objE3 != null) {
                                    return new CvValidationLink(list2, cvValidationButton, cvValidationTexts, jM2, (Bundle) objE3);
                                }
                                kVar.invoke(new IllegalArgumentException("Parameter args is null!"));
                                throw null;
                            } catch (JsonParseException e12) {
                                kVar.invoke(e12);
                                throw null;
                            }
                        } catch (JsonParseException e13) {
                            iVar.invoke(e13);
                            throw null;
                        }
                    } catch (JsonParseException e14) {
                        gVar.invoke(e14);
                        throw null;
                    }
                }
            }
            eVar.invoke(new IllegalArgumentException("Parameter cvInfoArray is null!"));
            throw null;
        } catch (JsonParseException e15) {
            eVar.invoke(e15);
            throw null;
        }
    }
}
