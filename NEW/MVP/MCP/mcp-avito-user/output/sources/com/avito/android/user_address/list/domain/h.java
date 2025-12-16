package com.avito.android.user_address.list.domain;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressListInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/list/domain/h;", "Lcom/avito/android/user_address/list/domain/f;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.geo_common.interactor.g f307362a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.user_address.a f307363b;

    @Inject
    public h(@k com.avito.android.geo_common.interactor.g gVar, @k com.avito.android.user_address.a aVar) {
        this.f307362a = gVar;
        this.f307363b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.user_address.list.domain.f
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.user_address.list.domain.g
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.user_address.list.domain.g r0 = (com.avito.android.user_address.list.domain.g) r0
            int r1 = r0.f307361s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f307361s = r1
            goto L18
        L13:
            com.avito.android.user_address.list.domain.g r0 = new com.avito.android.user_address.list.domain.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f307359q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f307361s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            com.avito.android.user_address.a r6 = r4.f307363b
            java.lang.String r6 = r6.getF307189a()
            r0.f307361s = r3
            com.avito.android.geo_common.interactor.g r2 = r4.f307362a
            java.lang.Object r6 = r2.l(r6, r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L54
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            com.avito.android.geo_common.model.SetDefaultAddressResult r5 = (com.avito.android.geo_common.model.SetDefaultAddressResult) r5
            return r5
        L54:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L67
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r5 = r6.getError()
            java.lang.Throwable r6 = r6.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L67:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.list.domain.h.a(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
