package uQ;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.job.interview.JobInterviewInvitationActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InterviewIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ/b;", "LuQ/a;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uQ.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48935b implements InterfaceC48934a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f439929a;

    @Inject
    public C48935b(@k Application application) {
        this.f439929a = application;
    }

    @Override // uQ.InterfaceC48934a
    @k
    public final Intent a(@k String str) {
        JobInterviewInvitationActivity.f174509y.getClass();
        return new Intent(this.f439929a, (Class<?>) JobInterviewInvitationActivity.class).putExtra("interview_invitation_id", str);
    }
}
