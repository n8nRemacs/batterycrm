package yM0;

import com.avito.android.verification.links.esia.VerificationEsiaLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationEsiaMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class u implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.esia.i f443073a;

    public u(com.avito.android.verification.links.esia.i iVar) {
        this.f443073a = iVar;
    }

    public static C43834a a(com.avito.android.verification.links.esia.i iVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationEsiaLink.class, new com.avito.android.verification.links.esia.l(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationEsiaLink.class), iVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443073a);
    }
}
