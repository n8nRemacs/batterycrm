package yM0;

import com.avito.android.verification.links.tinkoff_finish_web.VerificationTinkoffFinishWebLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationTinkoffFinishWebMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class E implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.tinkoff_finish_web.e f443043a;

    public E(com.avito.android.verification.links.tinkoff_finish_web.e eVar) {
        this.f443043a = eVar;
    }

    public static C43834a a(com.avito.android.verification.links.tinkoff_finish_web.e eVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationTinkoffFinishWebLink.class, new com.avito.android.verification.links.tinkoff_finish_web.i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationTinkoffFinishWebLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443043a);
    }
}
