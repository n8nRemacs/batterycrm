package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import oH0.C44645a;

/* compiled from: MultiUrgencyToggleInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_urgency/use_case/c;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<J20.a> f308710a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C44645a f308711b;

    @Inject
    public c(@Y61.k h31.e<J20.a> eVar, @Y61.k C44645a c44645a) {
        this.f308710a = eVar;
        this.f308711b = c44645a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.user_advert.advert.items.multi_urgency.c r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.b
            if (r0 == 0) goto L14
            r0 = r10
            com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.b r0 = (com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.b) r0
            int r1 = r0.f308709t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f308709t = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.b r0 = new com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.b
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.f308707r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f308709t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.android.user_advert.advert.items.multi_urgency.c r9 = r7.f308706q
            kotlin.C42729a0.b(r10)
            goto L58
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.C42729a0.b(r10)
            h31.e<J20.a> r10 = r8.f308710a
            java.lang.Object r10 = r10.get()
            r1 = r10
            J20.a r1 = (J20.a) r1
            java.lang.String r10 = r9.f309639c
            long r3 = java.lang.Long.parseLong(r10)
            r7.f308706q = r9
            r7.f308709t = r2
            boolean r10 = r9.f309647k
            long r5 = r9.f309642f
            r2 = r3
            r4 = r10
            java.lang.Object r10 = r1.a(r2, r4, r5, r7)
            if (r10 != r0) goto L58
            return r0
        L58:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r0 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L6c
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r10 = r10.getResult()
            K20.c r10 = (K20.c) r10
            com.avito.android.remote.model.TypedResult$Success r10 = new com.avito.android.remote.model.TypedResult$Success
            r10.<init>(r9)
            goto L70
        L6c:
            boolean r9 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r9 == 0) goto L71
        L70:
            return r10
        L71:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.c.a(com.avito.android.user_advert.advert.items.multi_urgency.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
