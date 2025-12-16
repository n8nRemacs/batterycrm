package com.avito.android.tariff.cpx.info.advance.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceShowLink;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceShowLinkBody;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCpxInfoAdvanceShowDeeplinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/info/advance/deeplink/j;", "LKu/a;", "Lcom/avito/android/tariff/deeplink/TariffCpxInfoAdvanceShowLink;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends AbstractC14350a<TariffCpxInfoAdvanceShowLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        h hVar = new h(uri);
        try {
            Type type = new i().getType();
            String queryParameter = uri.getQueryParameter("contentJson");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE != null) {
                return new TariffCpxInfoAdvanceShowLink((TariffCpxInfoAdvanceShowLinkBody) objE);
            }
            hVar.invoke(new IllegalArgumentException("Parameter contentJson is null!"));
            throw null;
        } catch (JsonParseException e12) {
            hVar.invoke(e12);
            throw null;
        }
    }
}
