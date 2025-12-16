package yM0;

import com.avito.android.verification.links.tochka.VerificationTochkaLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationTochkaMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class F implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.tochka.c f443044a;

    public F(com.avito.android.verification.links.tochka.c cVar) {
        this.f443044a = cVar;
    }

    public static C43834a a(com.avito.android.verification.links.tochka.c cVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationTochkaLink.class, new com.avito.android.verification.links.tochka.g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationTochkaLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443044a);
    }
}
