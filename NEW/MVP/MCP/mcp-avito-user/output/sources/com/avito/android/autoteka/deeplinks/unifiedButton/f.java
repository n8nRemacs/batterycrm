package com.avito.android.autoteka.deeplinks.unifiedButton;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.autoteka.deeplinks.AutotekaUnifiedButtonLink;
import com.avito.android.autoteka.deeplinks.UnifiedButtonLinkDetails;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutotekaUnifiedButtonDeepLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/unifiedButton/f;", "LKu/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaUnifiedButtonLink;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends AbstractC14350a<AutotekaUnifiedButtonLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        d dVar = new d(uri);
        try {
            Type type = new e().getType();
            String queryParameter = uri.getQueryParameter("contentJson");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE != null) {
                return new AutotekaUnifiedButtonLink((UnifiedButtonLinkDetails) objE);
            }
            dVar.invoke(new IllegalArgumentException("Parameter contentJson is null!"));
            throw null;
        } catch (JsonParseException e12) {
            dVar.invoke(e12);
            throw null;
        }
    }
}
