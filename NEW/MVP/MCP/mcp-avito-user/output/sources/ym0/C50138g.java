package yM0;

import com.avito.android.deep_linking.links.VerificationDisclaimerLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideDisclaimerMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50138g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_disclaimer.j f443059a;

    public C50138g(com.avito.android.verification.verification_disclaimer.j jVar) {
        this.f443059a = jVar;
    }

    public static C43834a a(com.avito.android.verification.verification_disclaimer.j jVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationDisclaimerLink.class, new com.avito.android.verification.links.disclaimer.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationDisclaimerLink.class), jVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443059a);
    }
}
