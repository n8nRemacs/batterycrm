package yM0;

import com.avito.android.verification.links.open.VerificationOpenLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationOpenMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class w implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.open.e f443075a;

    public w(com.avito.android.verification.links.open.e eVar) {
        this.f443075a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.links.open.e eVar = this.f443075a;
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationOpenLink.class, new com.avito.android.verification.links.open.c(), new C43834a.b.C11809b(eVar));
    }
}
