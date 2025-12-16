package com.avito.android.verification.links.tochka;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationTochkaLinkInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/tochka/e;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final BM0.a f324675a;

    @Inject
    public e(@k BM0.a aVar) {
        this.f324675a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.util.LinkedHashMap r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws com.avito.android.util.ApiException {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.avito.android.verification.links.tochka.d
            if (r0 == 0) goto L14
            r0 = r11
            com.avito.android.verification.links.tochka.d r0 = (com.avito.android.verification.links.tochka.d) r0
            int r1 = r0.f324674s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f324674s = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            com.avito.android.verification.links.tochka.d r0 = new com.avito.android.verification.links.tochka.d
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r8.f324672q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f324674s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r11)
            goto L77
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.C42729a0.b(r11)
            java.lang.String r11 = "code"
            java.lang.Object r11 = r10.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r1 = "codeVerifier"
            java.lang.Object r1 = r10.get(r1)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = "error"
            java.lang.Object r1 = r10.get(r1)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "flow"
            java.lang.Object r1 = r10.get(r1)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = "state"
            java.lang.Object r1 = r10.get(r1)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = "type"
            java.lang.Object r10 = r10.get(r1)
            r7 = r10
            java.lang.String r7 = (java.lang.String) r7
            r8.f324674s = r2
            BM0.a r1 = r9.f324675a
            r2 = r11
            java.lang.Object r11 = r1.b(r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L77
            return r0
        L77:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
            boolean r10 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r10 == 0) goto L86
            com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
            java.lang.Object r10 = r11.getResult()
            FM0.d r10 = (FM0.d) r10
            return r10
        L86:
            boolean r10 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r10 == 0) goto L99
            com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
            com.avito.android.remote.error.ApiError r10 = r11.getError()
            java.lang.Throwable r11 = r11.getCause()
            com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r10, r11)
            throw r10
        L99:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.links.tochka.e.a(java.util.LinkedHashMap, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
