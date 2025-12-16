package yM0;

import com.avito.android.verification.links.sber_finish.VerificationSberFinishLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationSberFinishMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50130A implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.sber_finish.g f443039a;

    public C50130A(com.avito.android.verification.links.sber_finish.g gVar) {
        this.f443039a = gVar;
    }

    public static C43834a a(com.avito.android.verification.links.sber_finish.g gVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationSberFinishLink.class, new com.avito.android.verification.links.sber_finish.j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationSberFinishLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443039a);
    }
}
