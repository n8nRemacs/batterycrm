package yM0;

import com.avito.android.deep_linking.links.VerificationStartLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideStartLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.start.e f443068a;

    public p(com.avito.android.verification.links.start.e eVar) {
        this.f443068a = eVar;
    }

    public static C43834a a(com.avito.android.verification.links.start.e eVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationStartLink.class, new com.avito.android.verification.links.start.i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationStartLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443068a);
    }
}
