package com.avito.android.select_districts.domain;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectDistrictsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/domain/j;", "", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f266933a;

    @Inject
    public j(@Y61.k com.avito.android.geo_common.interactor.g gVar) {
        this.f266933a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.select_districts.domain.i
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.select_districts.domain.i r0 = (com.avito.android.select_districts.domain.i) r0
            int r1 = r0.f266932s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266932s = r1
            goto L18
        L13:
            com.avito.android.select_districts.domain.i r0 = new com.avito.android.select_districts.domain.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f266930q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f266932s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.f266932s = r3
            com.avito.android.geo_common.interactor.g r6 = r4.f266933a
            java.lang.Object r6 = r6.t(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L52
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            java.util.List r5 = (java.util.List) r5
            return r5
        L52:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L65
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r5 = r6.getError()
            java.lang.Throwable r6 = r6.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L65:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select_districts.domain.j.a(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
