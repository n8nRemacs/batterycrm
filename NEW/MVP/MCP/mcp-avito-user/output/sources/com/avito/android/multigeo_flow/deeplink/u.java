package com.avito.android.multigeo_flow.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobMultiGeoEditParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/multigeo_flow/deeplink/u;", "LKu/a;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$EditAddress;", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u extends AbstractC14350a<JobMultiGeoLink.EditAddress> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = Ku.i.p(uri, "ADDRESS_JWT");
        q qVar = new q(uri);
        try {
            Type type = new r().getType();
            String queryParameter = uri.getQueryParameter("ADDRESS_ITEM");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE == null) {
                qVar.invoke(new IllegalArgumentException("Parameter ADDRESS_ITEM is null!"));
                throw null;
            }
            JobMultiGeoLink.Address address = (JobMultiGeoLink.Address) objE;
            s sVar = new s(uri);
            try {
                Type type2 = new t().getType();
                String queryParameter2 = uri.getQueryParameter("FLOW_TYPE");
                Object objE2 = queryParameter2 != null ? gson.e(queryParameter2, type2) : null;
                if (objE2 != null) {
                    return new JobMultiGeoLink.EditAddress(strP, address, (JobMultiGeoLink.FlowType) objE2);
                }
                sVar.invoke(new IllegalArgumentException("Parameter FLOW_TYPE is null!"));
                throw null;
            } catch (JsonParseException e12) {
                sVar.invoke(e12);
                throw null;
            }
        } catch (JsonParseException e13) {
            qVar.invoke(e13);
            throw null;
        }
    }
}
