package com.avito.android.travel_payment_selector.mvi.interactor;

import Y61.k;
import com.avito.android.util.R0;
import iF0.InterfaceC41280a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: PaymentSelectorApiInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/interactor/d;", "", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC41280a f302687a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f302688b;

    @Inject
    public d(@k InterfaceC41280a interfaceC41280a, @k R0 r02) {
        this.f302687a = interfaceC41280a;
        this.f302688b = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.avito.android.travel_payment_selector.mvi.interactor.d r7, kotlinx.coroutines.flow.InterfaceC43172j r8, java.lang.Long r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof com.avito.android.travel_payment_selector.mvi.interactor.c
            if (r0 == 0) goto L16
            r0 = r10
            com.avito.android.travel_payment_selector.mvi.interactor.c r0 = (com.avito.android.travel_payment_selector.mvi.interactor.c) r0
            int r1 = r0.f302686t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f302686t = r1
            goto L1b
        L16:
            com.avito.android.travel_payment_selector.mvi.interactor.c r0 = new com.avito.android.travel_payment_selector.mvi.interactor.c
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f302684r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f302686t
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            goto L37
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.C42729a0.b(r10)
            goto L81
        L3b:
            kotlinx.coroutines.flow.j r8 = r0.f302683q
            kotlin.C42729a0.b(r10)
            goto L51
        L41:
            kotlin.C42729a0.b(r10)
            r0.f302683q = r8
            r0.f302686t = r5
            iF0.a r7 = r7.f302687a
            java.lang.Object r10 = r7.a(r9, r0)
            if (r10 != r1) goto L51
            goto La1
        L51:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r7 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            r9 = 0
            if (r7 == 0) goto L84
            com.avito.android.travel_payment_selector.mvi.entity.PaymentSelectorInternalAction$Loaded r7 = new com.avito.android.travel_payment_selector.mvi.entity.PaymentSelectorInternalAction$Loaded
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r10 = r10.getResult()
            kF0.a r10 = (kF0.C42577a) r10
            com.avito.android.remote.model.text.AttributedText r2 = r10.getTitle()
            long r5 = r10.getDefaultPaymentTypeIndex()
            java.util.List r10 = r10.b()
            com.avito.android.travel_payment_selector.mvi.model.a r3 = new com.avito.android.travel_payment_selector.mvi.model.a
            r3.<init>(r5, r10, r2)
            r7.<init>(r3)
            r0.f302683q = r9
            r0.f302686t = r4
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L81
            goto La1
        L81:
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto La1
        L84:
            boolean r7 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r7 == 0) goto L81
            com.avito.android.travel_payment_selector.mvi.entity.PaymentSelectorInternalAction$Error r7 = new com.avito.android.travel_payment_selector.mvi.entity.PaymentSelectorInternalAction$Error
            com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
            java.lang.Throwable r2 = r10.getCause()
            com.avito.android.remote.error.ApiError r10 = r10.getError()
            r7.<init>(r10, r2)
            r0.f302683q = r9
            r0.f302686t = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L81
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_payment_selector.mvi.interactor.d.a(com.avito.android.travel_payment_selector.mvi.interactor.d, kotlinx.coroutines.flow.j, java.lang.Long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @k
    public final C43137a0 b(@k String str) {
        return new C43137a0(new b(2, null), C43175k.I(this.f302688b.a(), C43175k.G(new a(this, str, null))));
    }
}
