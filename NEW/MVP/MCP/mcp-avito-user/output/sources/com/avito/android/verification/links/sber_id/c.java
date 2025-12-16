package com.avito.android.verification.links.sber_id;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationSberIdLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/links/sber_id/c;", "LKu/a;", "Lcom/avito/android/verification/links/sber_id/VerificationSberIdLink;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends AbstractC14350a<VerificationSberIdLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.Custom {
        LinkedHashMap linkedHashMap = new LinkedHashMap(i.i(uri));
        String str = (String) linkedHashMap.remove("client_id");
        String str2 = (String) linkedHashMap.remove("nonce");
        String str3 = (String) linkedHashMap.remove(VoiceInfo.STATE);
        String str4 = (String) linkedHashMap.remove("scope");
        String strDecode = str4 != null ? Uri.decode(str4) : null;
        String str5 = (String) linkedHashMap.remove("callback_uri");
        String strDecode2 = str5 != null ? Uri.decode(str5) : null;
        if (str != null && str2 != null && str3 != null && strDecode != null && strDecode2 != null) {
            return new VerificationSberIdLink(linkedHashMap, str, str2, str3, strDecode, strDecode2);
        }
        i.g(this, uri, "client_id | nonce | state | scope | callback_url must not be null!!");
        throw null;
    }
}
