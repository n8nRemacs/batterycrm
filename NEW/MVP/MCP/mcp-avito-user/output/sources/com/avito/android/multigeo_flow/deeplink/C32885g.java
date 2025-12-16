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

/* compiled from: JobMultiGeoAddParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/multigeo_flow/deeplink/g;", "LKu/a;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$AddAddress;", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.multigeo_flow.deeplink.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32885g extends AbstractC14350a<JobMultiGeoLink.AddAddress> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = Ku.i.p(uri, "ADDRESS_JWT");
        C32883e c32883e = new C32883e(uri);
        try {
            Type type = new C32884f().getType();
            String queryParameter = uri.getQueryParameter("FLOW_TYPE");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE != null) {
                return new JobMultiGeoLink.AddAddress(strP, (JobMultiGeoLink.FlowType) objE);
            }
            c32883e.invoke(new IllegalArgumentException("Parameter FLOW_TYPE is null!"));
            throw null;
        } catch (JsonParseException e12) {
            c32883e.invoke(e12);
            throw null;
        }
    }
}
