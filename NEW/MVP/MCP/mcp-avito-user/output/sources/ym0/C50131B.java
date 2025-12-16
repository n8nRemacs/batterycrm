package yM0;

import com.avito.android.verification.links.sber_id.VerificationSberIdLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideVerificationSberIdMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50131B implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.links.sber_id.g f443040a;

    public C50131B(com.avito.android.verification.links.sber_id.g gVar) {
        this.f443040a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.links.sber_id.g gVar = this.f443040a;
        C50134c.f443050a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationSberIdLink.class, new com.avito.android.verification.links.sber_id.c(), new C43834a.b.C11809b(gVar));
    }
}
