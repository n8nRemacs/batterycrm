package com.avito.android.crm_candidates.features.inline_filters.logics;

import kotlin.Metadata;

/* compiled from: JobCrmInlineFiltersLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/inline_filters/logics/j;", "", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final j f129663a = new j();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j r9, @Y61.k Ss.InterfaceC15218a r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.avito.android.crm_candidates.features.inline_filters.logics.i
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.crm_candidates.features.inline_filters.logics.i r0 = (com.avito.android.crm_candidates.features.inline_filters.logics.i) r0
            int r1 = r0.f129662u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129662u = r1
            goto L18
        L13:
            com.avito.android.crm_candidates.features.inline_filters.logics.i r0 = new com.avito.android.crm_candidates.features.inline_filters.logics.i
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f129660s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f129662u
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4e
            if (r2 == r6) goto L46
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.C42729a0.b(r11)
            goto Lab
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.C42729a0.b(r11)
            goto L8e
        L40:
            kotlinx.coroutines.flow.j r9 = r0.f129658q
            kotlin.C42729a0.b(r11)
            goto L70
        L46:
            Ss.a r10 = r0.f129659r
            kotlinx.coroutines.flow.j r9 = r0.f129658q
            kotlin.C42729a0.b(r11)
            goto L63
        L4e:
            kotlin.C42729a0.b(r11)
            com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction$ShowLoading r11 = new com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction$ShowLoading
            r11.<init>()
            r0.f129658q = r9
            r0.f129659r = r10
            r0.f129662u = r6
            java.lang.Object r11 = r9.emit(r11, r0)
            if (r11 != r1) goto L63
            return r1
        L63:
            r0.f129658q = r9
            r0.f129659r = r7
            r0.f129662u = r5
            java.lang.Object r11 = r10.j(r0)
            if (r11 != r1) goto L70
            return r1
        L70:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
            boolean r10 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r10 == 0) goto L91
            com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction$ShowFilters r10 = new com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction$ShowFilters
            com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
            java.lang.Object r11 = r11.getResult()
            java.util.List r11 = (java.util.List) r11
            r10.<init>(r11)
            r0.f129658q = r7
            r0.f129662u = r4
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L8e
            return r1
        L8e:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L91:
            boolean r10 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r10 == 0) goto Lae
            com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction$ShowError r10 = new com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction$ShowError
            com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
            com.avito.android.remote.error.ApiError r11 = r11.getError()
            r10.<init>(r11)
            r0.f129658q = r7
            r0.f129662u = r3
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto Lab
            return r1
        Lab:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        Lae:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.features.inline_filters.logics.j.a(kotlinx.coroutines.flow.j, Ss.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
