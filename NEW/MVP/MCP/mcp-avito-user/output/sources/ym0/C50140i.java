package yM0;

import com.avito.android.deep_linking.links.VerificationFetchInvoiceLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideFetchInvoiceMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50140i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_fetch_invoice.e f443061a;

    public C50140i(com.avito.android.verification.verification_fetch_invoice.e eVar) {
        this.f443061a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_fetch_invoice.e eVar = this.f443061a;
        C50134c.f443050a.getClass();
        return new C43834a(VerificationFetchInvoiceLink.class, null, new C43834a.b.C11809b(eVar));
    }
}
