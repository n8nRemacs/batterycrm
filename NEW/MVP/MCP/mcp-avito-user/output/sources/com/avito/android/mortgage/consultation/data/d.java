package com.avito.android.mortgage.consultation.data;

import Y61.k;
import androidx.compose.runtime.internal.P;
import i00.InterfaceC41203a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageConsultationRepository.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/consultation/data/d;", "Lcom/avito/android/mortgage/consultation/data/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC41203a> f198543a;

    @Inject
    public d(@k h31.e<InterfaceC41203a> eVar) {
        this.f198543a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.avito.android.mortgage.consultation.data.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l java.lang.String r15, @Y61.l java.lang.String r16, @Y61.k java.lang.String r17, @Y61.k java.lang.String r18, @Y61.k java.lang.String r19, @Y61.k java.lang.String r20, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            r14 = this;
            r0 = r14
            r1 = r21
            boolean r2 = r1 instanceof com.avito.android.mortgage.consultation.data.b
            if (r2 == 0) goto L16
            r2 = r1
            com.avito.android.mortgage.consultation.data.b r2 = (com.avito.android.mortgage.consultation.data.b) r2
            int r3 = r2.f198538s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f198538s = r3
            goto L1b
        L16:
            com.avito.android.mortgage.consultation.data.b r2 = new com.avito.android.mortgage.consultation.data.b
            r2.<init>(r14, r1)
        L1b:
            java.lang.Object r1 = r2.f198536q
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f198538s
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            kotlin.C42729a0.b(r1)
            goto L5a
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            kotlin.C42729a0.b(r1)
            h31.e<i00.a> r1 = r0.f198543a
            java.lang.Object r1 = r1.get()
            i00.a r1 = (i00.InterfaceC41203a) r1
            q00.b r4 = new q00.b
            r9 = 0
            r6 = r4
            r7 = r15
            r8 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2.f198538s = r5
            java.lang.Object r1 = r1.f(r4, r2)
            if (r1 != r3) goto L5a
            return r3
        L5a:
            com.avito.android.remote.model.TypedResult r1 = (com.avito.android.remote.model.TypedResult) r1
            boolean r2 = r1 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r2 == 0) goto L77
            com.avito.android.remote.model.TypedResult$Success r1 = (com.avito.android.remote.model.TypedResult.Success) r1
            java.lang.Object r1 = r1.getResult()
            q00.a r1 = (q00.C47178a) r1
            boolean r1 = r1.getSuccess()
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            com.avito.android.remote.model.TypedResult$Success r2 = new com.avito.android.remote.model.TypedResult$Success
            r2.<init>(r1)
            r1 = r2
            goto L7b
        L77:
            boolean r2 = r1 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.consultation.data.d.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.avito.android.mortgage.consultation.data.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.consultation.data.d.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
