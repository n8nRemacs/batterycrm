package com.avito.android.job.interview.mvi.logics;

import kotlin.Metadata;

/* compiled from: JobInterviewInvitationLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/interview/mvi/logics/k;", "", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final k f174629a = new k();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j r10, @Y61.k com.avito.android.job.interview.domain.e r11, @Y61.k com.avito.android.job.interview.domain.i r12, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.avito.android.job.interview.mvi.logics.i
            if (r0 == 0) goto L13
            r0 = r13
            com.avito.android.job.interview.mvi.logics.i r0 = (com.avito.android.job.interview.mvi.logics.i) r0
            int r1 = r0.f174623v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174623v = r1
            goto L18
        L13:
            com.avito.android.job.interview.mvi.logics.i r0 = new com.avito.android.job.interview.mvi.logics.i
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f174621t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f174623v
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L59
            if (r2 == r7) goto L4f
            if (r2 == r6) goto L49
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            kotlin.C42729a0.b(r13)
            goto Lbc
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            kotlin.C42729a0.b(r13)
            goto L9f
        L43:
            kotlinx.coroutines.flow.j r10 = r0.f174618q
            kotlin.C42729a0.b(r13)
            goto L92
        L49:
            kotlinx.coroutines.flow.j r10 = r0.f174618q
            kotlin.C42729a0.b(r13)
            goto L7f
        L4f:
            com.avito.android.job.interview.domain.i r12 = r0.f174620s
            com.avito.android.job.interview.domain.e r11 = r0.f174619r
            kotlinx.coroutines.flow.j r10 = r0.f174618q
            kotlin.C42729a0.b(r13)
            goto L70
        L59:
            kotlin.C42729a0.b(r13)
            com.avito.android.job.interview.mvi.entity.InternalAction$LoadingInvitation r13 = new com.avito.android.job.interview.mvi.entity.InternalAction$LoadingInvitation
            r13.<init>()
            r0.f174618q = r10
            r0.f174619r = r11
            r0.f174620s = r12
            r0.f174623v = r7
            java.lang.Object r13 = r10.emit(r13, r0)
            if (r13 != r1) goto L70
            return r1
        L70:
            r0.f174618q = r10
            r0.f174619r = r8
            r0.f174620s = r8
            r0.f174623v = r6
            java.lang.Object r13 = r11.b(r12, r0)
            if (r13 != r1) goto L7f
            return r1
        L7f:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            boolean r11 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r11 == 0) goto La2
            com.avito.android.job.interview.mvi.entity.InternalAction$LoadedInvitation r11 = com.avito.android.job.interview.mvi.entity.InternalAction.LoadedInvitation.f174585b
            r0.f174618q = r10
            r0.f174623v = r5
            java.lang.Object r11 = r10.emit(r11, r0)
            if (r11 != r1) goto L92
            return r1
        L92:
            com.avito.android.job.interview.mvi.entity.InternalAction$CloseFlow r11 = com.avito.android.job.interview.mvi.entity.InternalAction.CloseFlow.f174575b
            r0.f174618q = r8
            r0.f174623v = r4
            java.lang.Object r10 = r10.emit(r11, r0)
            if (r10 != r1) goto L9f
            return r1
        L9f:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        La2:
            boolean r11 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r11 == 0) goto Lbf
            com.avito.android.job.interview.mvi.entity.InternalAction$ErrorInvitation r11 = new com.avito.android.job.interview.mvi.entity.InternalAction$ErrorInvitation
            com.avito.android.remote.model.TypedResult$Error r13 = (com.avito.android.remote.model.TypedResult.Error) r13
            com.avito.android.remote.error.ApiError r12 = r13.getError()
            r11.<init>(r12)
            r0.f174618q = r8
            r0.f174623v = r3
            java.lang.Object r10 = r10.emit(r11, r0)
            if (r10 != r1) goto Lbc
            return r1
        Lbc:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        Lbf:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.job.interview.mvi.logics.k.a(kotlinx.coroutines.flow.j, com.avito.android.job.interview.domain.e, com.avito.android.job.interview.domain.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j r8, @Y61.k com.avito.android.job.interview.domain.e r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.avito.android.job.interview.mvi.logics.j
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.job.interview.mvi.logics.j r0 = (com.avito.android.job.interview.mvi.logics.j) r0
            int r1 = r0.f174628u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174628u = r1
            goto L18
        L13:
            com.avito.android.job.interview.mvi.logics.j r0 = new com.avito.android.job.interview.mvi.logics.j
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f174626s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f174628u
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            kotlin.C42729a0.b(r10)
            goto L8e
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlinx.coroutines.flow.j r8 = r0.f174624q
            kotlin.C42729a0.b(r10)
            goto L68
        L3e:
            com.avito.android.job.interview.domain.e r9 = r0.f174625r
            kotlinx.coroutines.flow.j r8 = r0.f174624q
            kotlin.C42729a0.b(r10)
            goto L5b
        L46:
            kotlin.C42729a0.b(r10)
            com.avito.android.job.interview.mvi.entity.InternalAction$LoadingDraft r10 = new com.avito.android.job.interview.mvi.entity.InternalAction$LoadingDraft
            r10.<init>()
            r0.f174624q = r8
            r0.f174625r = r9
            r0.f174628u = r6
            java.lang.Object r10 = r8.emit(r10, r0)
            if (r10 != r1) goto L5b
            return r1
        L5b:
            r0.f174624q = r8
            r0.f174625r = r3
            r0.f174628u = r5
            java.lang.Object r10 = r9.a(r0)
            if (r10 != r1) goto L68
            return r1
        L68:
            com.avito.android.job.interview.domain.j r10 = (com.avito.android.job.interview.domain.j) r10
            boolean r9 = r10 instanceof com.avito.android.job.interview.domain.j.b
            if (r9 == 0) goto L76
            com.avito.android.job.interview.mvi.entity.InternalAction$LoadedDraft r9 = new com.avito.android.job.interview.mvi.entity.InternalAction$LoadedDraft
            com.avito.android.job.interview.domain.j$b r10 = (com.avito.android.job.interview.domain.j.b) r10
            r9.<init>(r10)
            goto L83
        L76:
            boolean r9 = r10 instanceof com.avito.android.job.interview.domain.j.a
            if (r9 == 0) goto L91
            com.avito.android.job.interview.mvi.entity.InternalAction$ErrorDraft r9 = new com.avito.android.job.interview.mvi.entity.InternalAction$ErrorDraft
            com.avito.android.job.interview.domain.j$a r10 = (com.avito.android.job.interview.domain.j.a) r10
            com.avito.android.remote.error.ApiError r10 = r10.f174564a
            r9.<init>(r10)
        L83:
            r0.f174624q = r3
            r0.f174628u = r4
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L8e
            return r1
        L8e:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L91:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.job.interview.mvi.logics.k.b(kotlinx.coroutines.flow.j, com.avito.android.job.interview.domain.e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
