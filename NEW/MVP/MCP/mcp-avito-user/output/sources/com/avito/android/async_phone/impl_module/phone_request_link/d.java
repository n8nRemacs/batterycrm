package com.avito.android.async_phone.impl_module.phone_request_link;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneRequestDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/async_phone/impl_module/phone_request_link/d;", "LKu/a;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestLink;", "<init>", "()V", "_avito_async-phone_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends AbstractC14350a<PhoneRequestLink> {
    @Inject
    public d() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strO = Ku.i.o(uri, "itemId");
        String queryParameter = uri.getQueryParameter("context");
        String queryParameter2 = uri.getQueryParameter("iacScenario");
        boolean z12 = Boolean.parseBoolean(uri.getQueryParameter("needAuth"));
        String queryParameter3 = uri.getQueryParameter("needConfirm");
        return new PhoneRequestLink(strO, queryParameter, z12, queryParameter3 != null ? Boolean.valueOf(Boolean.parseBoolean(queryParameter3)) : null, null, queryParameter2, 16, null);
    }
}
