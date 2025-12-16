package com.avito.android.user_address.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressMapLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_address/deeplink/E;", "LKu/a;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Map;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class E extends AbstractC14350a<UserAddressLink.Map> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter("geoSessionId");
        String strP = Ku.i.p(uri, AddressParameter.TYPE);
        double dJ2 = Ku.i.j(uri, "longitude");
        double dJ3 = Ku.i.j(uri, "latitude");
        UserAddressLink.BottomSheetState.a aVar = UserAddressLink.BottomSheetState.f133775b;
        String queryParameter2 = uri.getQueryParameter("bottomSheetState");
        aVar.getClass();
        UserAddressLink.BottomSheetState bottomSheetStateA = UserAddressLink.BottomSheetState.a.a(queryParameter2);
        if (bottomSheetStateA == null) {
            bottomSheetStateA = UserAddressLink.BottomSheetState.COLLAPSED;
        }
        UserAddressLink.BottomSheetState bottomSheetState = bottomSheetStateA;
        String queryParameter3 = uri.getQueryParameter("successUrl");
        return new UserAddressLink.Map(queryParameter, bottomSheetState, strP, dJ2, dJ3, queryParameter3 != null ? xVar.b(queryParameter3) : null, uri.getBooleanQueryParameter("enableDeleteAddress", true));
    }
}
