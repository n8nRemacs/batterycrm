package com.avito.android.work_profile.deeplink_handling;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import com.avito.android.work_profile.deeplink.JobSeekerCvsLink;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: JobSeekerCvsLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/work_profile/deeplink_handling/f;", "LKu/a;", "Lcom/avito/android/work_profile/deeplink/JobSeekerCvsLink;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends AbstractC14350a<JobSeekerCvsLink> {

    /* compiled from: JobSeekerCvsLinkParser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<WorkProfileTab> f330631a = kotlin.enums.c.a(WorkProfileTab.values());
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter(NotificationOpenAtTab.TAB);
        if (queryParameter == null) {
            queryParameter = a.f330631a.get(0).f330699b;
        }
        return new JobSeekerCvsLink(queryParameter, uri.getQueryParameter("fromPage"));
    }
}
