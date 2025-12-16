package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MultiUrgencyFlow.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_urgency/use_case/s;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43172j<com.avito.android.user_advert.advert.delegate.multi_urgency.e> f308754a;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@Y61.k InterfaceC43172j<? super com.avito.android.user_advert.advert.delegate.multi_urgency.e> interfaceC43172j) {
        this.f308754a = interfaceC43172j;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.remote.model.TypedResult r7, @Y61.k com.avito.android.user_advert.advert.items.multi_urgency.c r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.r
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.r r0 = (com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.r) r0
            int r1 = r0.f308753u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308753u = r1
            goto L18
        L13:
            com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.r r0 = new com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.r
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f308751s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f308753u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r9)
            goto L9f
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            com.avito.android.user_advert.advert.items.multi_urgency.c r8 = r0.f308750r
            com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.s r7 = r0.f308749q
            kotlin.C42729a0.b(r9)
            goto L8a
        L3f:
            kotlin.C42729a0.b(r9)
            goto L62
        L43:
            kotlin.C42729a0.b(r9)
            boolean r9 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            kotlinx.coroutines.flow.j<com.avito.android.user_advert.advert.delegate.multi_urgency.e> r2 = r6.f308754a
            if (r9 == 0) goto L65
            com.avito.android.user_advert.advert.delegate.multi_urgency.e$a r8 = new com.avito.android.user_advert.advert.delegate.multi_urgency.e$a
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            com.avito.android.user_advert.advert.items.multi_urgency.c r7 = (com.avito.android.user_advert.advert.items.multi_urgency.c) r7
            r8.<init>(r7)
            r0.f308753u = r5
            java.lang.Object r7 = r2.emit(r8, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L65:
            boolean r9 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r9 == 0) goto La2
            com.avito.android.user_advert.advert.delegate.multi_urgency.e$b r9 = new com.avito.android.user_advert.advert.delegate.multi_urgency.e$b
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r5 = r7.getError()
            com.avito.android.remote.error.ApiError r7 = r7.getError()
            java.lang.String r7 = com.avito.android.error.z.k(r7)
            r9.<init>(r5, r7)
            r0.f308749q = r6
            r0.f308750r = r8
            r0.f308753u = r4
            java.lang.Object r7 = r2.emit(r9, r0)
            if (r7 != r1) goto L89
            return r1
        L89:
            r7 = r6
        L8a:
            kotlinx.coroutines.flow.j<com.avito.android.user_advert.advert.delegate.multi_urgency.e> r7 = r7.f308754a
            com.avito.android.user_advert.advert.delegate.multi_urgency.e$a r9 = new com.avito.android.user_advert.advert.delegate.multi_urgency.e$a
            r9.<init>(r8)
            r8 = 0
            r0.f308749q = r8
            r0.f308750r = r8
            r0.f308753u = r3
            java.lang.Object r7 = r7.emit(r9, r0)
            if (r7 != r1) goto L9f
            return r1
        L9f:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        La2:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.s.a(com.avito.android.remote.model.TypedResult, com.avito.android.user_advert.advert.items.multi_urgency.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
