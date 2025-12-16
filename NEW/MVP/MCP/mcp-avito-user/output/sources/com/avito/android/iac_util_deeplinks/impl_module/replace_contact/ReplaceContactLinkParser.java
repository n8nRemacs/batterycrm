package com.avito.android.iac_util_deeplinks.impl_module.replace_contact;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ReplaceContactLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/replace_contact/ReplaceContactLinkParser;", "LKu/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/replace_contact/ReplaceContactLink;", "<init>", "()V", "ReplaceContactLinkParserError", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReplaceContactLinkParser extends AbstractC14350a<ReplaceContactLink> {

    /* compiled from: ReplaceContactLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/replace_contact/ReplaceContactLinkParser$ReplaceContactLinkParserError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReplaceContactLinkParserError extends RuntimeException {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = i.n(uri, "contactName");
        List<String> listF0 = C43066x.f0(i.n(uri, "phones"), new String[]{","}, 0, 6);
        for (String str : listF0) {
            if (C43066x.K(str)) {
                throw new ReplaceContactLinkParserError("phone number is blank");
            }
            for (int i12 = 0; i12 < str.length(); i12++) {
                if (!Character.isDigit(str.charAt(i12))) {
                    throw new ReplaceContactLinkParserError("phone number contains invalid symbol");
                }
            }
            if (str.length() != 11) {
                throw new ReplaceContactLinkParserError("phone number length is incorrect");
            }
        }
        String queryParameter = uri.getQueryParameter("onSuccess");
        DeepLink deepLinkB = queryParameter != null ? xVar.b(queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter("onError");
        return new ReplaceContactLink(strN, listF0, deepLinkB, queryParameter2 != null ? xVar.b(queryParameter2) : null);
    }
}
