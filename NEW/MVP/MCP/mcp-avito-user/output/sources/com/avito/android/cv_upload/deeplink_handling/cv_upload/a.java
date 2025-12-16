package com.avito.android.cv_upload.deeplink_handling.cv_upload;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink.JobCvUploadLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: CvUploadDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_upload/deeplink_handling/cv_upload/a;", "LKu/a;", "Lcom/avito/android/deeplink/JobCvUploadLink;", "<init>", "()V", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC14350a<JobCvUploadLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new JobCvUploadLink(i.p(uri, "fromPage"), Boolean.parseBoolean(uri.getQueryParameter("shouldShowLoadScreen")), uri.getQueryParameter("loadScreenHintText"));
    }
}
