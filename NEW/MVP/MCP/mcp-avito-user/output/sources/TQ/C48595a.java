package tQ;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.job.interview.links.JobInterviewInvitationLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import uQ.InterfaceC48934a;

/* compiled from: JobInterviewInvitationLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LtQ/a;", "Lev/b;", "Lcom/avito/android/job/interview/links/JobInterviewInvitationLink;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tQ.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48595a extends AbstractC40162b<JobInterviewInvitationLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC48934a f439243d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f439244e;

    @Inject
    public C48595a(@k InterfaceC48934a interfaceC48934a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f439243d = interfaceC48934a;
        this.f439244e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f439244e.R(this.f439243d.a(((JobInterviewInvitationLink) deepLink).f174566b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
