package yM0;

import com.avito.android.verification.links.remove.VerificationRemoveLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationRemoveMappingNewFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class x implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.remove.f f443076a;

    public x(com.avito.android.verification.links.remove.f fVar) {
        this.f443076a = fVar;
    }

    public static C43834a a(com.avito.android.verification.links.remove.f fVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationRemoveLink.class, new com.avito.android.verification.links.remove.i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationRemoveLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443076a);
    }
}
