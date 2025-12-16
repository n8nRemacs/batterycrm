package yM0;

import com.avito.android.verification.links.verifications_list_old.VerificationsListLinkOld;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationsListMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class I implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final IM0.c f443047a;

    public I(IM0.c cVar) {
        this.f443047a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        IM0.c cVar = this.f443047a;
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationsListLinkOld.class, new IM0.a(), new C43834a.b.C11809b(cVar));
    }
}
