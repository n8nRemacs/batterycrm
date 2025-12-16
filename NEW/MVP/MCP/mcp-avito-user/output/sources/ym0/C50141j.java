package yM0;

import com.avito.android.deep_linking.links.VerificationFinishLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideFinishMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50141j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_finish.o f443062a;

    public C50141j(com.avito.android.verification.verification_finish.o oVar) {
        this.f443062a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_finish.o oVar = this.f443062a;
        C50134c.f443050a.getClass();
        return new C43834a(VerificationFinishLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationFinishLink.class), oVar));
    }
}
