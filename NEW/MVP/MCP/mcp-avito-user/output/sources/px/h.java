package PX;

import com.avito.android.mandatory_verification.deeplink.MandatoryVerificationLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MandatoryVerificationLinkHandlerModule_ProvideIntermediaryVerificationLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mandatory_verification.deeplink.b f13112a;

    public h(com.avito.android.mandatory_verification.deeplink.b bVar) {
        this.f13112a = bVar;
    }

    public static C43834a a(com.avito.android.mandatory_verification.deeplink.b bVar) {
        g.f13111a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MandatoryVerificationLink.class, new com.avito.android.mandatory_verification.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MandatoryVerificationLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f13112a);
    }
}
