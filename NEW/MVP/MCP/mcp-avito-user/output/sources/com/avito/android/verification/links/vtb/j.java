package com.avito.android.verification.links.vtb;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: VerificationVTBLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/links/vtb/j;", "LKu/a;", "Lcom/avito/android/verification/links/vtb/VerificationVTBLink;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends AbstractC14350a<VerificationVTBLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.Custom {
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ku.i.i(uri));
        linkedHashMap.remove("auth_url");
        String str = (String) linkedHashMap.remove("is_app_2_app_enabled");
        Boolean boolV0 = str != null ? C43066x.v0(str) : null;
        if (uri.getQueryParameter("auth_url") != null) {
            return boolV0 != null ? new VerificationVTBLink(Uri.parse(uri.getQueryParameter("auth_url")), linkedHashMap, boolV0.booleanValue()) : new VerificationVTBLink(Uri.parse(uri.getQueryParameter("auth_url")), linkedHashMap, false, 4, null);
        }
        Ku.i.g(this, uri, "auth_url must not be null!!");
        throw null;
    }
}
