package com.avito.android.user_address.deeplink.sx_new_address;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.SxAddAddressSource;
import com.avito.android.SxAddressAddLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.Gson;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressAddLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_address/deeplink/sx_new_address/d;", "LKu/a;", "Lcom/avito/android/SxAddressAddLink;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC14350a<SxAddressAddLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = i.p(uri, "verticalId");
        String queryParameter = uri.getQueryParameter("esid");
        String queryParameter2 = uri.getQueryParameter(AddressParameter.TYPE);
        String queryParameter3 = uri.getQueryParameter(SearchParamsConverterKt.SOURCE);
        if (queryParameter3 == null) {
            queryParameter3 = "PROFILE".toLowerCase(Locale.ROOT);
        }
        return new SxAddressAddLink(Integer.parseInt(strP), L.f(queryParameter3, "profile") ? SxAddAddressSource.f67543b : L.f(queryParameter3, "publish") ? SxAddAddressSource.f67544c : null, Boolean.valueOf(uri.getBooleanQueryParameter("showsSuccessToast", true)), queryParameter, queryParameter2);
    }
}
