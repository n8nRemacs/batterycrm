package com.avito.android.user_address.suggest.domain;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressSuggestInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/domain/d;", "Lcom/avito/android/user_address/suggest/domain/a;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<TG0.a> f308058a;

    @Inject
    public d(@k h31.e<TG0.a> eVar) {
        this.f308058a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.user_address.suggest.domain.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r12, @Y61.k java.lang.String r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws com.avito.android.util.ApiException {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.avito.android.user_address.suggest.domain.b
            if (r0 == 0) goto L14
            r0 = r14
            com.avito.android.user_address.suggest.domain.b r0 = (com.avito.android.user_address.suggest.domain.b) r0
            int r1 = r0.f308054s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f308054s = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            com.avito.android.user_address.suggest.domain.b r0 = new com.avito.android.user_address.suggest.domain.b
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r10.f308052q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f308054s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r14)
            goto L53
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.C42729a0.b(r14)
            h31.e<TG0.a> r14 = r11.f308058a
            java.lang.Object r14 = r14.get()
            r1 = r14
            TG0.a r1 = (TG0.a) r1
            r10.f308054s = r2
            java.util.Map r9 = kotlin.collections.P0.c()
            r6 = 0
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r12
            r7 = r13
            java.lang.Object r14 = r1.f(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r14 != r0) goto L53
            return r0
        L53:
            com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
            boolean r12 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r12 == 0) goto L62
            com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
            java.lang.Object r12 = r14.getResult()
            tF.a$c r12 = (tF.AbstractC48544a.c) r12
            return r12
        L62:
            boolean r12 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r12 == 0) goto L75
            com.avito.android.remote.model.TypedResult$Error r14 = (com.avito.android.remote.model.TypedResult.Error) r14
            com.avito.android.remote.error.ApiError r12 = r14.getError()
            java.lang.Throwable r13 = r14.getCause()
            com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r12, r13)
            throw r12
        L75:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.suggest.domain.d.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.user_address.suggest.domain.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.user_address.suggest.domain.c
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.user_address.suggest.domain.c r0 = (com.avito.android.user_address.suggest.domain.c) r0
            int r1 = r0.f308057s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308057s = r1
            goto L18
        L13:
            com.avito.android.user_address.suggest.domain.c r0 = new com.avito.android.user_address.suggest.domain.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f308055q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f308057s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            h31.e<TG0.a> r6 = r4.f308058a
            java.lang.Object r6 = r6.get()
            TG0.a r6 = (TG0.a) r6
            r0.f308057s = r3
            r2 = 0
            java.lang.Object r6 = r6.k(r5, r2, r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L55
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            com.avito.android.geo_common.model.CoordsByAddressResult r5 = (com.avito.android.geo_common.model.CoordsByAddressResult) r5
            return r5
        L55:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L68
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r5 = r6.getError()
            java.lang.Throwable r6 = r6.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L68:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.suggest.domain.d.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
