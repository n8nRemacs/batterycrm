package yM0;

import com.avito.android.deep_linking.links.VerificationStatusListLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideStatusListMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_status_list.j f443069a;

    public q(com.avito.android.verification.verification_status_list.j jVar) {
        this.f443069a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_status_list.j jVar = this.f443069a;
        C50134c.f443050a.getClass();
        return new C43834a(VerificationStatusListLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationStatusListLink.class), jVar));
    }
}
