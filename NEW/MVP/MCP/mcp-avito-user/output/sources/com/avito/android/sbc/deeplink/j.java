package com.avito.android.sbc.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DiscountDispatchVasDeepLinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sbc/deeplink/j;", "LKu/a;", "Lcom/avito/android/sbc/deeplink/DiscountDispatchVasDeepLink;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends AbstractC14350a<DiscountDispatchVasDeepLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = Ku.i.p(uri, "checkoutContext");
        boolean z12 = Boolean.parseBoolean(uri.getQueryParameter("closable"));
        return new DiscountDispatchVasDeepLink(xVar.b(Ku.i.p(uri, "skipActionUri")), Ku.i.p(uri, "itemId"), strP, Ku.i.p(uri, "currentFlow"), uri.getQueryParameter("emptyActionTitle"), z12);
    }
}
