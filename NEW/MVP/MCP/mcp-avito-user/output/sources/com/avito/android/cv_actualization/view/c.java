package com.avito.android.cv_actualization.view;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import st.InterfaceC48411b;

/* compiled from: JsxCvActualizationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/c;", "Lst/b;", "Lcom/avito/android/cv_actualization/view/code_input/e;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements InterfaceC48411b, com.avito.android.cv_actualization.view.code_input.e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<DP.a> f131115a;

    @Inject
    public c(@k h31.e<DP.a> eVar) {
        this.f131115a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.cv_actualization.view.code_input.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.cv_actualization.view.a
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.cv_actualization.view.a r0 = (com.avito.android.cv_actualization.view.a) r0
            int r1 = r0.f131111s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131111s = r1
            goto L18
        L13:
            com.avito.android.cv_actualization.view.a r0 = new com.avito.android.cv_actualization.view.a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f131109q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f131111s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            h31.e<DP.a> r7 = r4.f131115a
            java.lang.Object r7 = r7.get()
            DP.a r7 = (DP.a) r7
            r0.f131111s = r3
            java.lang.Object r7 = r7.c(r6, r5, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L57
            com.avito.android.util.P2$b r5 = new com.avito.android.util.P2$b
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r6 = r7.getResult()
            r5.<init>(r6)
            goto L66
        L57:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L9a
            com.avito.android.util.P2$a r5 = new com.avito.android.util.P2$a
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r6 = r7.getError()
            r5.<init>(r6)
        L66:
            boolean r6 = r5 instanceof com.avito.android.util.P2.b
            if (r6 == 0) goto L80
            com.avito.android.cv_actualization.view.code_input.a$b r6 = new com.avito.android.cv_actualization.view.code_input.a$b
            java.lang.Object r5 = com.avito.android.util.T2.a(r5)
            EP.a r5 = (EP.a) r5
            if (r5 == 0) goto L7a
            java.lang.String r5 = r5.getText()
            if (r5 != 0) goto L7c
        L7a:
            java.lang.String r5 = ""
        L7c:
            r6.<init>(r5)
            goto L93
        L80:
            boolean r6 = r5 instanceof com.avito.android.util.P2.a
            if (r6 == 0) goto L94
            com.avito.android.cv_actualization.view.code_input.a$a r6 = new com.avito.android.cv_actualization.view.code_input.a$a
            com.avito.android.util.P2$a r5 = (com.avito.android.util.P2.a) r5
            com.avito.android.remote.error.ApiError r5 = r5.f318719a
            java.lang.String r7 = r5.getF244063c()
            boolean r0 = r5 instanceof com.avito.android.remote.error.ApiError.BadRequest
            r6.<init>(r7, r0, r5)
        L93:
            return r6
        L94:
            java.lang.UnknownError r5 = new java.lang.UnknownError
            r5.<init>()
            throw r5
        L9a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cv_actualization.view.c.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // st.InterfaceC48411b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.cv_actualization.view.b
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.cv_actualization.view.b r0 = (com.avito.android.cv_actualization.view.b) r0
            int r1 = r0.f131114s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131114s = r1
            goto L18
        L13:
            com.avito.android.cv_actualization.view.b r0 = new com.avito.android.cv_actualization.view.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f131112q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f131114s
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
            h31.e<DP.a> r6 = r4.f131115a
            java.lang.Object r6 = r6.get()
            DP.a r6 = (DP.a) r6
            r0.f131114s = r3
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L57
            com.avito.android.util.P2$b r5 = new com.avito.android.util.P2$b
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            r5.<init>(r6)
            goto L66
        L57:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L99
            com.avito.android.util.P2$a r5 = new com.avito.android.util.P2$a
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r6 = r6.getError()
            r5.<init>(r6)
        L66:
            boolean r6 = r5 instanceof com.avito.android.util.P2.b
            if (r6 == 0) goto L7f
            st.a$b r6 = new st.a$b
            java.lang.Object r5 = com.avito.android.util.T2.a(r5)
            GP.a r5 = (GP.a) r5
            if (r5 == 0) goto L79
            long r0 = r5.getNextTryTime()
            goto L7b
        L79:
            r0 = 0
        L7b:
            r6.<init>(r0)
            goto L92
        L7f:
            boolean r6 = r5 instanceof com.avito.android.util.P2.a
            if (r6 == 0) goto L93
            st.a$a r6 = new st.a$a
            com.avito.android.util.P2$a r5 = (com.avito.android.util.P2.a) r5
            com.avito.android.remote.error.ApiError r5 = r5.f318719a
            java.lang.String r0 = r5.getF244063c()
            boolean r1 = r5 instanceof com.avito.android.remote.error.ApiError.BadRequest
            r6.<init>(r0, r1, r5)
        L92:
            return r6
        L93:
            java.lang.UnknownError r5 = new java.lang.UnknownError
            r5.<init>()
            throw r5
        L99:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cv_actualization.view.c.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
