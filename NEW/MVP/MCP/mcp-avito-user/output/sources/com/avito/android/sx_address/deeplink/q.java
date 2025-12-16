package com.avito.android.sx_address.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import android.util.Base64;
import androidx.compose.runtime.internal.P;
import com.avito.android.ActionModalDialogContent;
import com.avito.android.SxAddressDeleteLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43047d;

/* compiled from: SxAddressDeleteDeeplinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sx_address/deeplink/q;", "LKu/a;", "Lcom/avito/android/SxAddressDeleteLink;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q extends AbstractC14350a<SxAddressDeleteLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        ActionModalDialogContent actionModalDialogContent;
        long jM2 = Ku.i.m(uri, "sellerAddressId");
        try {
            actionModalDialogContent = (ActionModalDialogContent) gson.d(ActionModalDialogContent.class, new String(Base64.decode(uri.getQueryParameter("content"), 0), C43047d.f410589b));
        } catch (Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "SxAddressDeleteLink parser parsing failed", th2);
            actionModalDialogContent = null;
        }
        return new SxAddressDeleteLink(jM2, actionModalDialogContent);
    }
}
