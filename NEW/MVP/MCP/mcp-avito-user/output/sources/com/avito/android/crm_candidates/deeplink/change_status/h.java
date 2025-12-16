package com.avito.android.crm_candidates.deeplink.change_status;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.crm_candidates.deeplink.change_status.JobCrmChangeStatusDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.Navigation;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmChangeStatusDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/crm_candidates/deeplink/change_status/h;", "LKu/a;", "Lcom/avito/android/crm_candidates/deeplink/change_status/JobCrmChangeStatusDeeplink;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends AbstractC14350a<JobCrmChangeStatusDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        f fVar = new f(uri);
        try {
            Type type = new g().getType();
            String queryParameter = uri.getQueryParameter(Navigation.CONFIG);
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE != null) {
                return new JobCrmChangeStatusDeeplink((JobCrmChangeStatusDeeplink.JobApplicationStatusConfig) objE);
            }
            fVar.invoke(new IllegalArgumentException("Parameter config is null!"));
            throw null;
        } catch (JsonParseException e12) {
            fVar.invoke(e12);
            throw null;
        }
    }
}
