package yM0;

import com.avito.android.deep_linking.links.VerificationInputInnLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideInnMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50143l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_input_inn.j f443064a;

    public C50143l(com.avito.android.verification.verification_input_inn.j jVar) {
        this.f443064a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_input_inn.j jVar = this.f443064a;
        C50134c.f443050a.getClass();
        return new C43834a(VerificationInputInnLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationInputInnLink.class), jVar));
    }
}
