package yM0;

import com.avito.android.deep_linking.links.VerificationInputBillAmountLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideInputBillAmountMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50144m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_input_bill_amount.f f443065a;

    public C50144m(com.avito.android.verification.verification_input_bill_amount.f fVar) {
        this.f443065a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C50134c.f443050a.getClass();
        return new C43834a(VerificationInputBillAmountLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationInputBillAmountLink.class), this.f443065a));
    }
}
