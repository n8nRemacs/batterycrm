package com.avito.android.vacancy_call_action.domain;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VacancyCallActionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vacancy_call_action/domain/b;", "", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final OQ.a f319222a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f319223b;

    @Inject
    public b(@k OQ.a aVar, @k e eVar) {
        this.f319222a = aVar;
        this.f319223b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r13, @Y61.k java.lang.String r15, @Y61.l java.lang.String r16, @Y61.l java.lang.Boolean r17, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r12 = this;
            r0 = r12
            r1 = r18
            boolean r2 = r1 instanceof com.avito.android.vacancy_call_action.domain.a
            if (r2 == 0) goto L16
            r2 = r1
            com.avito.android.vacancy_call_action.domain.a r2 = (com.avito.android.vacancy_call_action.domain.a) r2
            int r3 = r2.f319221t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f319221t = r3
            goto L1b
        L16:
            com.avito.android.vacancy_call_action.domain.a r2 = new com.avito.android.vacancy_call_action.domain.a
            r2.<init>(r12, r1)
        L1b:
            java.lang.Object r1 = r2.f319219r
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f319221t
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2e
            com.avito.android.vacancy_call_action.domain.b r2 = r2.f319218q
            kotlin.C42729a0.b(r1)
            goto L53
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            kotlin.C42729a0.b(r1)
            PQ.d r1 = new PQ.d
            r6 = r1
            r7 = r16
            r8 = r17
            r9 = r15
            r10 = r13
            r6.<init>(r7, r8, r9, r10)
            r2.f319218q = r0
            r2.f319221t = r5
            OQ.a r4 = r0.f319222a
            java.lang.Object r1 = r4.a(r1, r2)
            if (r1 != r3) goto L52
            return r3
        L52:
            r2 = r0
        L53:
            com.avito.android.remote.model.TypedResult r1 = (com.avito.android.remote.model.TypedResult) r1
            com.avito.android.vacancy_call_action.domain.e r2 = r2.f319223b
            r2.getClass()
            boolean r2 = r1 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r2 == 0) goto L89
            com.avito.android.remote.model.TypedResult$Success r1 = (com.avito.android.remote.model.TypedResult.Success) r1
            java.lang.Object r1 = r1.getResult()
            com.avito.android.job.vacancy_call_action.generated.api.vacancy_call_action_v_3.VacancyCallActionV3Response r1 = (com.avito.android.job.vacancy_call_action.generated.api.vacancy_call_action_v_3.VacancyCallActionV3Response) r1
            com.avito.android.job.vacancy_call_action.generated.api.vacancy_call_action_v_3.VacancyCallActionV3Response$Action r2 = r1.getAction()
            com.avito.android.job.vacancy_call_action.generated.api.vacancy_call_action_v_3.VacancyCallActionV3Response$Action r3 = com.avito.android.job.vacancy_call_action.generated.api.vacancy_call_action_v_3.VacancyCallActionV3Response.Action.Bypass
            if (r2 != r3) goto L71
            com.avito.android.vacancy_call_action.domain.c$a r1 = com.avito.android.vacancy_call_action.domain.c.a.f319224a
            goto L99
        L71:
            com.avito.android.deep_linking.links.DeepLink r2 = r1.getDeeplink()
            if (r2 == 0) goto L82
            com.avito.android.vacancy_call_action.domain.c$c r2 = new com.avito.android.vacancy_call_action.domain.c$c
            com.avito.android.deep_linking.links.DeepLink r1 = r1.getDeeplink()
            r2.<init>(r1)
        L80:
            r1 = r2
            goto L99
        L82:
            com.avito.android.vacancy_call_action.domain.c$b r1 = new com.avito.android.vacancy_call_action.domain.c$b
            r2 = 0
            r1.<init>(r2)
            goto L99
        L89:
            boolean r2 = r1 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto L9a
            com.avito.android.vacancy_call_action.domain.c$b r2 = new com.avito.android.vacancy_call_action.domain.c$b
            com.avito.android.remote.model.TypedResult$Error r1 = (com.avito.android.remote.model.TypedResult.Error) r1
            java.lang.Throwable r1 = r1.getCause()
            r2.<init>(r1)
            goto L80
        L99:
            return r1
        L9a:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vacancy_call_action.domain.b.a(long, java.lang.String, java.lang.String, java.lang.Boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
