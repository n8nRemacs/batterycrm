package Ld0;

import com.avito.android.publish.deeplink.F;
import com.avito.android.publish.links.JobEnrichmentFeedbackDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakeJobEnrichmentFeedbackDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10039a;

    /* renamed from: b, reason: collision with root package name */
    public final F f10040b;

    public j(C14382a c14382a, F f12) {
        this.f10039a = c14382a;
        this.f10040b = f12;
    }

    public static C43834a a(C14382a c14382a, F f12) {
        c14382a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JobEnrichmentFeedbackDeeplink.class, new Md0.g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JobEnrichmentFeedbackDeeplink.class), f12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f10039a, this.f10040b);
    }
}
