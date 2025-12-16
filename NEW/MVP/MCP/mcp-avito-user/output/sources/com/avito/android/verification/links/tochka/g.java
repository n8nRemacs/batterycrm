package com.avito.android.verification.links.tochka;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationTochkaLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/links/tochka/g;", "LKu/a;", "Lcom/avito/android/verification/links/tochka/VerificationTochkaLink;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends AbstractC14350a<VerificationTochkaLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.Custom {
        LinkedHashMap linkedHashMap = new LinkedHashMap(i.i(uri));
        linkedHashMap.remove("auth_url");
        String queryParameter = uri.getQueryParameter("auth_url");
        if (queryParameter != null) {
            return new VerificationTochkaLink(Uri.parse(queryParameter), linkedHashMap);
        }
        i.g(this, uri, "auth_url must not be null!!");
        throw null;
    }
}
