package com.avito.android.user_address.deeplink.multigeo;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiGeoSuggestLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_address/deeplink/multigeo/j;", "LKu/a;", "Lcom/avito/android/deep_linking/links/UserAddressLink$MultiGeoSuggest;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends AbstractC14350a<UserAddressLink.MultiGeoSuggest> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = Ku.i.p(uri, AddressParameter.Value.JSON_WEB_TOKEN);
        h hVar = new h(uri);
        try {
            Type type = new i().getType();
            String queryParameter = uri.getQueryParameter("FLOW_TYPE");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE == null) {
                hVar.invoke(new IllegalArgumentException("Parameter FLOW_TYPE is null!"));
                throw null;
            }
            JobMultiGeoLink.FlowType flowType = (JobMultiGeoLink.FlowType) objE;
            String queryParameter2 = uri.getQueryParameter("successUrl");
            return new UserAddressLink.MultiGeoSuggest(strP, flowType, queryParameter2 != null ? xVar.b(queryParameter2) : null);
        } catch (JsonParseException e12) {
            hVar.invoke(e12);
            throw null;
        }
    }
}
