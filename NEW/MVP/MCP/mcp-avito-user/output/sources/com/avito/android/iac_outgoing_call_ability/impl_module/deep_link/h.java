package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacCanRecallLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: IacCanRecallLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/h;", "LKu/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink;", "<init>", "()V", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends AbstractC14350a<IacCanRecallLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        DeepLink noMatchLink;
        DeepLink noMatchLink2;
        String str = "";
        String strN = Ku.i.n(uri, "prevCallId");
        String strN2 = Ku.i.n(uri, "scenario");
        try {
            String queryParameter = uri.getQueryParameter("onError");
            if (queryParameter == null) {
                queryParameter = "";
            }
            noMatchLink = xVar.b(queryParameter);
        } catch (Exception unused) {
            noMatchLink = new NoMatchLink();
        }
        try {
            String queryParameter2 = uri.getQueryParameter("onForbidden");
            if (queryParameter2 != null) {
                str = queryParameter2;
            }
            noMatchLink2 = xVar.b(str);
        } catch (Exception unused2) {
            noMatchLink2 = new NoMatchLink();
        }
        return new IacCanRecallLink(strN, strN2, noMatchLink, noMatchLink2);
    }
}
