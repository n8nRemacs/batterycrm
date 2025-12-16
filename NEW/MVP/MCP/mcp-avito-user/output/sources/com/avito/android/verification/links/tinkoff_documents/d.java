package com.avito.android.verification.links.tinkoff_documents;

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

/* compiled from: VerificationTinkoffDocumentsLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/links/tinkoff_documents/d;", "LKu/a;", "Lcom/avito/android/verification/links/tinkoff_documents/VerificationTinkoffDocumentsLink;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends AbstractC14350a<VerificationTinkoffDocumentsLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.Custom {
        LinkedHashMap linkedHashMap = new LinkedHashMap(i.i(uri));
        String str = (String) linkedHashMap.remove("client_id");
        String str2 = (String) linkedHashMap.remove("callback_url");
        Uri uri2 = str2 != null ? Uri.parse(Uri.decode(str2)) : null;
        String str3 = (String) linkedHashMap.remove("fallback_deeplink");
        Uri uri3 = str3 != null ? Uri.parse(Uri.decode(str3)) : null;
        DeepLink deepLinkE = uri3 != null ? xVar.e(uri3) : null;
        if (str != null && uri2 != null) {
            return new VerificationTinkoffDocumentsLink(linkedHashMap, str, uri2, deepLinkE);
        }
        i.g(this, uri, "client_id or callback_url must not be null!!");
        throw null;
    }
}
