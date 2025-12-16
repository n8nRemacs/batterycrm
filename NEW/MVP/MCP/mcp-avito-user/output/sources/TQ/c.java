package tQ;

import com.avito.android.job.interview.links.JobInterviewInvitationLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: JobInterviewInvitationLinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f439246a;

    public c(d dVar) {
        this.f439246a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f439246a;
        b.f439245a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JobInterviewInvitationLink.class, new e(), new C43834a.b.C11809b(dVar));
    }
}
