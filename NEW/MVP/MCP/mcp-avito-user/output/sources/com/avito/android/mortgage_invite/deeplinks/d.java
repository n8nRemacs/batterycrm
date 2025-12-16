package com.avito.android.mortgage_invite.deeplinks;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.mortgage_invite.deeplink.MortgageApplicationClientFormLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: MortgageApplicationClientFormLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/deeplinks/d;", "LKu/a;", "Lcom/avito/android/mortgage_invite/deeplink/MortgageApplicationClientFormLink;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends AbstractC14350a<MortgageApplicationClientFormLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = Ku.i.p(uri, "applicationId");
        String strP2 = Ku.i.p(uri, "flowType");
        String queryParameter = uri.getQueryParameter("clientType");
        if (queryParameter == null) {
            queryParameter = "borrower";
        }
        return new MortgageApplicationClientFormLink(strP, strP2, queryParameter);
    }
}
