package com.avito.android.deeplink_handling;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink.JobApplyCreateLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: JobApplyCreateDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handling/a;", "LKu/a;", "Lcom/avito/android/deeplink/JobApplyCreateLink;", "<init>", "()V", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC14350a<JobApplyCreateLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new JobApplyCreateLink(i.p(uri, "itemId"), (CreateChannelLink) xVar.b(i.p(uri, "createChannelDeeplink")), i.p(uri, "fromPage"), uri.getQueryParameter("customFlowName"), uri.getQueryParameter("context"));
    }
}
