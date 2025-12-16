package com.avito.android.sx_address.selectaddresslist.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectAddressListInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/domain/c;", "Lcom/avito/android/sx_address/selectaddresslist/domain/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final EA0.a f294089a;

    @Inject
    public c(@k EA0.a aVar) {
        this.f294089a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.sx_address.selectaddresslist.domain.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws com.avito.android.util.ApiException {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.avito.android.sx_address.selectaddresslist.domain.b
            if (r0 == 0) goto L14
            r0 = r10
            com.avito.android.sx_address.selectaddresslist.domain.b r0 = (com.avito.android.sx_address.selectaddresslist.domain.b) r0
            int r1 = r0.f294088s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f294088s = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.sx_address.selectaddresslist.domain.b r0 = new com.avito.android.sx_address.selectaddresslist.domain.b
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f294086q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f294088s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r10)
            goto L45
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.C42729a0.b(r10)
            r6.f294088s = r2
            java.lang.String r4 = "edit"
            r5 = 0
            EA0.a r1 = r7.f294089a
            r2 = r8
            java.lang.Object r10 = r1.f(r2, r4, r5, r6)
            if (r10 != r0) goto L45
            return r0
        L45:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r8 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r8 == 0) goto L54
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r8 = r10.getResult()
            PA0.a r8 = (PA0.a) r8
            return r8
        L54:
            boolean r8 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto L67
            com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
            com.avito.android.remote.error.ApiError r8 = r10.getError()
            java.lang.Throwable r9 = r10.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r8, r9)
            throw r8
        L67:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.selectaddresslist.domain.c.a(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
