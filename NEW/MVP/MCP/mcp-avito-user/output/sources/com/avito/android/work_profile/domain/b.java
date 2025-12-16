package com.avito.android.work_profile.domain;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GetAppliesListInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/domain/b;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f330636a;

    @Inject
    public b(@k j jVar) {
        this.f330636a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.work_profile.domain.a
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.work_profile.domain.a r0 = (com.avito.android.work_profile.domain.a) r0
            int r1 = r0.f330635s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f330635s = r1
            goto L18
        L13:
            com.avito.android.work_profile.domain.a r0 = new com.avito.android.work_profile.domain.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f330633q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f330635s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            r0.f330635s = r3
            com.avito.android.work_profile.domain.j r5 = r4.f330636a
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L81
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r0 = r5.getResult()
            com.avito.android.work_profile.domain.entity.AppliesToVacancy r0 = (com.avito.android.work_profile.domain.entity.AppliesToVacancy) r0
            com.avito.android.work_profile.domain.entity.AppliesBanner r0 = r0.getBanner()
            java.lang.Object r5 = r5.getResult()
            com.avito.android.work_profile.domain.entity.AppliesToVacancy r5 = (com.avito.android.work_profile.domain.entity.AppliesToVacancy) r5
            java.util.List r5 = r5.getList()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L69
            com.avito.android.work_profile.domain.entity.AppliesEmptyElement r5 = com.avito.android.work_profile.domain.entity.AppliesEmptyElement.INSTANCE
            java.util.List r5 = java.util.Collections.singletonList(r5)
        L69:
            java.util.List r5 = (java.util.List) r5
            com.avito.android.remote.model.TypedResult$Success r1 = new com.avito.android.remote.model.TypedResult$Success
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r5 = kotlin.collections.C42745f0.h0(r5, r0)
            java.util.ArrayList r5 = kotlin.collections.C42745f0.C(r5)
            r1.<init>(r5)
            goto L94
        L81:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L95
            com.avito.android.remote.model.TypedResult$Error r1 = new com.avito.android.remote.model.TypedResult$Error
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r0 = r5.getError()
            java.lang.Throwable r5 = r5.getCause()
            r1.<init>(r0, r5)
        L94:
            return r1
        L95:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.domain.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
