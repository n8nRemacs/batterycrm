package yM0;

import com.avito.android.verification.verification_form_builder.deeplink.VerificationFormBuilderLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideFormBuilderMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50142k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final SM0.b f443063a;

    public C50142k(SM0.b bVar) {
        this.f443063a = bVar;
    }

    public static C43834a a(SM0.b bVar) {
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationFormBuilderLink.class, new SM0.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationFormBuilderLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443063a);
    }
}
