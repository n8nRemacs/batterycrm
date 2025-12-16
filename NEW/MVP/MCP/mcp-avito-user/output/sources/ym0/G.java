package yM0;

import com.avito.android.verification.links.vtb_finish.VerificationVTBFinishLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationVTBFinishMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class G implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.vtb_finish.c f443045a;

    public G(com.avito.android.verification.links.vtb_finish.c cVar) {
        this.f443045a = cVar;
    }

    public static C43834a a(com.avito.android.verification.links.vtb_finish.c cVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationVTBFinishLink.class, new com.avito.android.verification.links.vtb_finish.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationVTBFinishLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443045a);
    }
}
