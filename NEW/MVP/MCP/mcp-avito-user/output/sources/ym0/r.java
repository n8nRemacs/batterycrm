package yM0;

import com.avito.android.verification.links.alfa.VerificationAlfaLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationAlfaMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class r implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.alfa.f f443070a;

    public r(com.avito.android.verification.links.alfa.f fVar) {
        this.f443070a = fVar;
    }

    public static C43834a a(com.avito.android.verification.links.alfa.f fVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationAlfaLink.class, new com.avito.android.verification.links.alfa.i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationAlfaLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443070a);
    }
}
