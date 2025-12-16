package yM0;

import com.avito.android.verification.links.download.VerificationDownloadLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationDownloadMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class t implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.download.d f443072a;

    public t(com.avito.android.verification.links.download.d dVar) {
        this.f443072a = dVar;
    }

    public static C43834a a(com.avito.android.verification.links.download.d dVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationDownloadLink.class, new com.avito.android.verification.links.download.j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationDownloadLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443072a);
    }
}
