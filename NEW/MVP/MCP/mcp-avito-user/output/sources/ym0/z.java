package yM0;

import com.avito.android.verification.links.sber_business.SberBusinessLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationSberBusinessMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class z implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.sber_business.e f443078a;

    public z(com.avito.android.verification.links.sber_business.e eVar) {
        this.f443078a = eVar;
    }

    public static C43834a a(com.avito.android.verification.links.sber_business.e eVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SberBusinessLink.class, new com.avito.android.verification.links.sber_business.j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SberBusinessLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443078a);
    }
}
