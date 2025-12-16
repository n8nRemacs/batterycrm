package yM0;

import com.avito.android.verification.links.mts.VerificationMTSLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationMTSMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class v implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.mts.g f443074a;

    public v(com.avito.android.verification.links.mts.g gVar) {
        this.f443074a = gVar;
    }

    public static C43834a a(com.avito.android.verification.links.mts.g gVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationMTSLink.class, new com.avito.android.verification.links.mts.h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationMTSLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443074a);
    }
}
