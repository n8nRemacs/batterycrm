package com.avito.android.vacancy_call_action.deeplink;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VacancyCallActionDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vacancy_call_action/deeplink/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/vacancy_call_action/deeplink/VacancyCallActionDeepLink;", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<VacancyCallActionDeepLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.g f319209g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.vacancy_call_action.domain.b f319210h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f319211i;

    @Inject
    public b(@k R0 r02, @k a.g gVar, @k com.avito.android.vacancy_call_action.domain.b bVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        super(r02);
        this.f319209g = gVar;
        this.f319210h = bVar;
        this.f319211i = aVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((VacancyCallActionDeepLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.vacancy_call_action.deeplink.VacancyCallActionDeepLink r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.avito.android.vacancy_call_action.deeplink.a
            if (r0 == 0) goto L14
            r0 = r10
            com.avito.android.vacancy_call_action.deeplink.a r0 = (com.avito.android.vacancy_call_action.deeplink.a) r0
            int r1 = r0.f319208t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f319208t = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.avito.android.vacancy_call_action.deeplink.a r0 = new com.avito.android.vacancy_call_action.deeplink.a
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.f319206r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f319208t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.android.vacancy_call_action.deeplink.b r9 = r7.f319205q
            kotlin.C42729a0.b(r10)
            goto L59
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.C42729a0.b(r10)
            com.avito.android.deeplink_handler.view.a$g r10 = r8.f319209g
            com.avito.android.deeplink_handler.handler.bundle.a r1 = r8.d()
            r10.g(r1, r2)
            long r3 = r9.f319201b
            r7.f319205q = r8
            r7.f319208t = r2
            java.lang.String r5 = r9.f319204e
            java.lang.Boolean r6 = r9.f319203d
            com.avito.android.vacancy_call_action.domain.b r1 = r8.f319210h
            java.lang.String r9 = r9.f319202c
            r2 = r3
            r4 = r9
            java.lang.Object r10 = r1.a(r2, r4, r5, r6, r7)
            if (r10 != r0) goto L58
            return r0
        L58:
            r9 = r8
        L59:
            com.avito.android.vacancy_call_action.domain.c r10 = (com.avito.android.vacancy_call_action.domain.c) r10
            boolean r0 = r10 instanceof com.avito.android.vacancy_call_action.domain.c.a
            if (r0 == 0) goto L62
            com.avito.android.vacancy_call_action.deeplink.e$a r10 = com.avito.android.vacancy_call_action.deeplink.e.a.f319216b
            goto L85
        L62:
            boolean r0 = r10 instanceof com.avito.android.vacancy_call_action.domain.c.C9895c
            if (r0 == 0) goto L74
            com.avito.android.deeplink_handler.handler.composite.a r0 = r9.f319211i
            com.avito.android.vacancy_call_action.domain.c$c r10 = (com.avito.android.vacancy_call_action.domain.c.C9895c) r10
            com.avito.android.deep_linking.links.DeepLink r10 = r10.f319226a
            r1 = 6
            r2 = 0
            com.avito.android.deeplink_handler.handler.b.a.a(r0, r10, r2, r2, r1)
            com.avito.android.vacancy_call_action.deeplink.e$b r10 = com.avito.android.vacancy_call_action.deeplink.e.b.f319217b
            goto L85
        L74:
            boolean r0 = r10 instanceof com.avito.android.vacancy_call_action.domain.c.b
            if (r0 == 0) goto L95
            com.avito.android.util.V2 r0 = com.avito.android.util.V2.f318762a
            com.avito.android.vacancy_call_action.domain.c$b r10 = (com.avito.android.vacancy_call_action.domain.c.b) r10
            java.lang.Throwable r10 = r10.f319225a
            java.lang.String r1 = "Error on vacancy call action"
            r0.e(r1, r10)
            com.avito.android.vacancy_call_action.deeplink.e$a r10 = com.avito.android.vacancy_call_action.deeplink.e.a.f319216b
        L85:
            com.avito.android.deeplink_handler.view.a$g r0 = r9.f319209g
            com.avito.android.deeplink_handler.handler.bundle.a r1 = r9.d()
            r2 = 0
            r0.g(r1, r2)
            r9.j(r10)
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L95:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vacancy_call_action.deeplink.b.o(com.avito.android.vacancy_call_action.deeplink.VacancyCallActionDeepLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
