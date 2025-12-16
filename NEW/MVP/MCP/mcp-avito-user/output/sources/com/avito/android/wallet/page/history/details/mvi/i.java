package com.avito.android.wallet.page.history.details.mvi;

import aP0.InterfaceC19802a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentHistoryDetailsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/i;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC19802a> f327960a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<NO0.a> f327961b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PaymentHistoryDetailsOpenParams f327962c;

    @Inject
    public i(@Y61.k h31.e<InterfaceC19802a> eVar, @Y61.k h31.e<NO0.a> eVar2, @Y61.k PaymentHistoryDetailsOpenParams paymentHistoryDetailsOpenParams) {
        this.f327960a = eVar;
        this.f327961b = eVar2;
        this.f327962c = paymentHistoryDetailsOpenParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.NumberFormatException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.android.wallet.page.history.details.mvi.g
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.wallet.page.history.details.mvi.g r0 = (com.avito.android.wallet.page.history.details.mvi.g) r0
            int r1 = r0.f327956s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f327956s = r1
            goto L18
        L13:
            com.avito.android.wallet.page.history.details.mvi.g r0 = new com.avito.android.wallet.page.history.details.mvi.g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f327954q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f327956s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L55
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.C42729a0.b(r7)
            h31.e<NO0.a> r7 = r6.f327961b
            java.lang.Object r7 = r7.get()
            NO0.a r7 = (NO0.a) r7
            com.avito.android.wallet.page.history.details.mvi.PaymentHistoryDetailsOpenParams r2 = r6.f327962c
            java.lang.String r2 = r2.f327875b
            long r4 = java.lang.Long.parseLong(r2)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            r0.f327956s = r3
            java.lang.Object r7 = r7.a(r2, r4, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r0 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L6d
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            OO0.a r7 = (OO0.a) r7
            com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction$ShowRefundSuccess r0 = new com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction$ShowRefundSuccess
            java.lang.String r7 = r7.getDeeplink()
            r0.<init>(r7)
            goto L80
        L6d:
            boolean r0 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L81
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r0 = r7.getError()
            java.lang.Throwable r7 = r7.getCause()
            com.avito.android.util.C35936s.a(r0, r7)
            com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction$ShowRefundError r0 = com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction.ShowRefundError.f327945b
        L80:
            return r0
        L81:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.page.history.details.mvi.i.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.wallet.page.history.details.mvi.h
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.wallet.page.history.details.mvi.h r0 = (com.avito.android.wallet.page.history.details.mvi.h) r0
            int r1 = r0.f327959s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f327959s = r1
            goto L18
        L13:
            com.avito.android.wallet.page.history.details.mvi.h r0 = new com.avito.android.wallet.page.history.details.mvi.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f327957q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f327959s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            h31.e<aP0.a> r5 = r4.f327960a
            java.lang.Object r5 = r5.get()
            aP0.a r5 = (aP0.InterfaceC19802a) r5
            com.avito.android.wallet.page.history.details.mvi.PaymentHistoryDetailsOpenParams r2 = r4.f327962c
            java.lang.String r2 = r2.f327875b
            r0.f327959s = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L5d
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            UO0.a r5 = (UO0.a) r5
            com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction$Content r0 = new com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction$Content
            r0.<init>(r5)
            goto L74
        L5d:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L75
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r0 = r5.getError()
            java.lang.Throwable r5 = r5.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r0, r5)
            com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction$Error r0 = new com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction$Error
            r0.<init>(r5)
        L74:
            return r0
        L75:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.page.history.details.mvi.i.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
