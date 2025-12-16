package com.avito.android.sx_address.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.SelectAddressListLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: SelectAddressListDeeplinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sx_address/deeplink/l;", "LKu/a;", "Lcom/avito/android/SelectAddressListLink;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sx_address.deeplink.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35172l extends AbstractC14350a<SelectAddressListLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        long jM2 = Ku.i.m(uri, "verticalId");
        String queryParameter = uri.getQueryParameter("sellerAddressId");
        return new SelectAddressListLink(jM2, queryParameter != null ? Long.valueOf(Long.parseLong(queryParameter)) : null);
    }
}
