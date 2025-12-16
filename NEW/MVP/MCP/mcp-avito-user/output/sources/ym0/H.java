package yM0;

import com.avito.android.verification.links.vtb.VerificationVTBLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationVTBMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class H implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.vtb.d f443046a;

    public H(com.avito.android.verification.links.vtb.d dVar) {
        this.f443046a = dVar;
    }

    public static C43834a a(com.avito.android.verification.links.vtb.d dVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationVTBLink.class, new com.avito.android.verification.links.vtb.j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationVTBLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443046a);
    }
}
