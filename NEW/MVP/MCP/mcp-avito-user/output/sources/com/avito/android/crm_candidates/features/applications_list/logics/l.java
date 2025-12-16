package com.avito.android.crm_candidates.features.applications_list.logics;

import kotlin.Metadata;

/* compiled from: JobCrmApplicationsListLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/logics/l;", "", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l f129560a = new l();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j r9, @Y61.k Os.InterfaceC14731a r10, @Y61.k java.lang.String r11, @Y61.k java.lang.String r12, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.avito.android.crm_candidates.features.applications_list.logics.i
            if (r0 == 0) goto L13
            r0 = r13
            com.avito.android.crm_candidates.features.applications_list.logics.i r0 = (com.avito.android.crm_candidates.features.applications_list.logics.i) r0
            int r1 = r0.f129542w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129542w = r1
            goto L18
        L13:
            com.avito.android.crm_candidates.features.applications_list.logics.i r0 = new com.avito.android.crm_candidates.features.applications_list.logics.i
            r0.<init>(r8, r13)
        L18:
            java.lang.Object r13 = r0.f129540u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f129542w
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L46
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.C42729a0.b(r13)
            goto Lbf
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.C42729a0.b(r13)
            goto La0
        L40:
            kotlinx.coroutines.flow.j r9 = r0.f129536q
            kotlin.C42729a0.b(r13)
            goto L7e
        L46:
            java.lang.String r12 = r0.f129539t
            java.lang.String r11 = r0.f129538s
            Os.a r10 = r0.f129537r
            kotlinx.coroutines.flow.j r9 = r0.f129536q
            kotlin.C42729a0.b(r13)
            goto L6d
        L52:
            kotlin.C42729a0.b(r13)
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowLoading r13 = new com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowLoading
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$LoadType r2 = com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction.LoadType.f129484f
            r13.<init>(r2)
            r0.f129536q = r9
            r0.f129537r = r10
            r0.f129538s = r11
            r0.f129539t = r12
            r0.f129542w = r6
            java.lang.Object r13 = r9.emit(r13, r0)
            if (r13 != r1) goto L6d
            return r1
        L6d:
            r0.f129536q = r9
            r0.f129537r = r7
            r0.f129538s = r7
            r0.f129539t = r7
            r0.f129542w = r5
            java.lang.Object r13 = r10.g(r11, r12, r0)
            if (r13 != r1) goto L7e
            return r1
        L7e:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            boolean r10 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r10 == 0) goto La3
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowContent r10 = new com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowContent
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$LoadType r11 = com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction.LoadType.f129484f
            com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
            java.lang.Object r12 = r13.getResult()
            java.util.List r12 = java.util.Collections.singletonList(r12)
            r10.<init>(r11, r12)
            r0.f129536q = r7
            r0.f129542w = r4
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto La0
            return r1
        La0:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        La3:
            boolean r10 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r10 == 0) goto Lc2
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowError r10 = new com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowError
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$LoadType r11 = com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction.LoadType.f129484f
            com.avito.android.remote.model.TypedResult$Error r13 = (com.avito.android.remote.model.TypedResult.Error) r13
            com.avito.android.remote.error.ApiError r12 = r13.getError()
            r10.<init>(r11, r12)
            r0.f129536q = r7
            r0.f129542w = r3
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto Lbf
            return r1
        Lbf:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        Lc2:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.features.applications_list.logics.l.a(kotlinx.coroutines.flow.j, Os.a, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j r9, @Y61.k Os.InterfaceC14731a r10, @Y61.k com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.avito.android.crm_candidates.features.applications_list.logics.k
            if (r0 == 0) goto L13
            r0 = r12
            com.avito.android.crm_candidates.features.applications_list.logics.k r0 = (com.avito.android.crm_candidates.features.applications_list.logics.k) r0
            int r1 = r0.f129559v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129559v = r1
            goto L18
        L13:
            com.avito.android.crm_candidates.features.applications_list.logics.k r0 = new com.avito.android.crm_candidates.features.applications_list.logics.k
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f129557t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f129559v
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L50
            if (r2 == r6) goto L46
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.C42729a0.b(r12)
            goto Lb9
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.C42729a0.b(r12)
            goto L9a
        L40:
            kotlinx.coroutines.flow.j r9 = r0.f129554q
            kotlin.C42729a0.b(r12)
            goto L78
        L46:
            com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem r11 = r0.f129556s
            Os.a r10 = r0.f129555r
            kotlinx.coroutines.flow.j r9 = r0.f129554q
            kotlin.C42729a0.b(r12)
            goto L69
        L50:
            kotlin.C42729a0.b(r12)
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowLoading r12 = new com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowLoading
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$LoadType r2 = com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction.LoadType.f129483e
            r12.<init>(r2)
            r0.f129554q = r9
            r0.f129555r = r10
            r0.f129556s = r11
            r0.f129559v = r6
            java.lang.Object r12 = r9.emit(r12, r0)
            if (r12 != r1) goto L69
            return r1
        L69:
            r0.f129554q = r9
            r0.f129555r = r7
            r0.f129556s = r7
            r0.f129559v = r5
            java.lang.Object r12 = r10.q(r11, r0)
            if (r12 != r1) goto L78
            return r1
        L78:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r10 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r10 == 0) goto L9d
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowContent r10 = new com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowContent
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$LoadType r11 = com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction.LoadType.f129483e
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r12 = r12.getResult()
            java.util.List r12 = java.util.Collections.singletonList(r12)
            r10.<init>(r11, r12)
            r0.f129554q = r7
            r0.f129559v = r4
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L9a
            return r1
        L9a:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L9d:
            boolean r10 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r10 == 0) goto Lbc
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowError r10 = new com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$ShowError
            com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction$LoadType r11 = com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction.LoadType.f129483e
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r12 = r12.getError()
            r10.<init>(r11, r12)
            r0.f129554q = r7
            r0.f129559v = r3
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto Lb9
            return r1
        Lb9:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        Lbc:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.features.applications_list.logics.l.b(kotlinx.coroutines.flow.j, Os.a, com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
