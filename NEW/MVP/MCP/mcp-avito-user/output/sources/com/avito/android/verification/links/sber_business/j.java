package com.avito.android.verification.links.sber_business;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: SberBusinessLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/links/sber_business/j;", "LKu/a;", "Lcom/avito/android/verification/links/sber_business/SberBusinessLink;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends AbstractC14350a<SberBusinessLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.Custom {
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ku.i.i(uri));
        String str = (String) linkedHashMap.remove("auth_url");
        if (str != null) {
            return new SberBusinessLink(linkedHashMap, Uri.decode(str));
        }
        Ku.i.g(this, uri, "auth_url must not be null");
        throw null;
    }
}
