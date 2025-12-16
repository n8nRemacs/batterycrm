package yM0;

import com.avito.android.verification.links.close.VerificationCloseLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationCloseMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class s implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final HM0.c f443071a;

    public s(HM0.c cVar) {
        this.f443071a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        HM0.c cVar = this.f443071a;
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationCloseLink.class, new HM0.a(), new C43834a.b.C11809b(cVar));
    }
}
