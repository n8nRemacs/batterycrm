package com.avito.android.gig_motivation_payment.data;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rH.InterfaceC47543a;

/* compiled from: MotivationPaymentRepositoryImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_motivation_payment/data/e;", "LrH/a;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements InterfaceC47543a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RF.a f160101a;

    public e(@k RF.a aVar) {
        this.f160101a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rH.InterfaceC47543a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_motivation_payment.data.e.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rH.InterfaceC47543a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.gig_motivation_payment.data.d
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.gig_motivation_payment.data.d r0 = (com.avito.android.gig_motivation_payment.data.d) r0
            int r1 = r0.f160100s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160100s = r1
            goto L18
        L13:
            com.avito.android.gig_motivation_payment.data.d r0 = new com.avito.android.gig_motivation_payment.data.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f160098q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f160100s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            r0.f160100s = r3
            RF.a r6 = r4.f160101a
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L5d
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            UF.a r5 = (UF.a) r5
            sH.c r6 = new sH.c
            com.avito.android.deep_linking.links.DeepLink r5 = r5.getUri()
            r6.<init>(r5)
            com.avito.android.remote.model.TypedResult$Success r5 = new com.avito.android.remote.model.TypedResult$Success
            r5.<init>(r6)
            r6 = r5
            goto L61
        L5d:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L62
        L61:
            return r6
        L62:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_motivation_payment.data.e.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rH.InterfaceC47543a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.gig_motivation_payment.data.c
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.gig_motivation_payment.data.c r0 = (com.avito.android.gig_motivation_payment.data.c) r0
            int r1 = r0.f160097s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160097s = r1
            goto L18
        L13:
            com.avito.android.gig_motivation_payment.data.c r0 = new com.avito.android.gig_motivation_payment.data.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f160095q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f160097s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            r0.f160097s = r3
            RF.a r6 = r4.f160101a
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L5d
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            TF.a r5 = (TF.a) r5
            sH.b r6 = new sH.b
            com.avito.android.deep_linking.links.DeepLink r5 = r5.getUri()
            r6.<init>(r5)
            com.avito.android.remote.model.TypedResult$Success r5 = new com.avito.android.remote.model.TypedResult$Success
            r5.<init>(r6)
            r6 = r5
            goto L61
        L5d:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L62
        L61:
            return r6
        L62:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_motivation_payment.data.e.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
