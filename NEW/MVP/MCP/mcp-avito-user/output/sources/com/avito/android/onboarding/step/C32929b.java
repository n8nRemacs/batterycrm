package com.avito.android.onboarding.step;

import com.avito.android.onboarding.model.BxOnboardingStep;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BxOnboardingAskNotificationStepInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/step/b;", "Lcom/avito/android/onboarding/E;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.onboarding.step.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32929b implements com.avito.android.onboarding.E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification.h f209193a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding.E f209194b;

    @Inject
    public C32929b(@Y61.k com.avito.android.notification.h hVar, @com.avito.android.onboarding.B @Y61.k com.avito.android.onboarding.E e12) {
        this.f209193a = hVar;
        this.f209194b = e12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.onboarding.E
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.android.onboarding.step.C32928a
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.onboarding.step.a r0 = (com.avito.android.onboarding.step.C32928a) r0
            int r1 = r0.f209192t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209192t = r1
            goto L18
        L13:
            com.avito.android.onboarding.step.a r0 = new com.avito.android.onboarding.step.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f209190r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f209192t
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r7)
            goto L66
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            com.avito.android.onboarding.step.b r2 = r0.f209189q
            kotlin.C42729a0.b(r7)
            goto L53
        L3b:
            kotlin.C42729a0.b(r7)
            com.avito.android.notification.h r7 = r6.f209193a
            boolean r2 = r7.a()
            if (r2 != 0) goto L47
            return r5
        L47:
            r0.f209189q = r6
            r0.f209192t = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            com.avito.android.notification.a r7 = (com.avito.android.notification.a) r7
            boolean r4 = r7 instanceof com.avito.android.notification.a.C6183a
            if (r4 == 0) goto L67
            com.avito.android.onboarding.E r7 = r2.f209194b
            r0.f209189q = r5
            r0.f209192t = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            return r7
        L67:
            boolean r0 = r7 instanceof com.avito.android.notification.a.d
            if (r0 == 0) goto L6c
            goto L75
        L6c:
            boolean r0 = r7 instanceof com.avito.android.notification.a.c
            if (r0 == 0) goto L71
            goto L75
        L71:
            boolean r7 = r7 instanceof com.avito.android.notification.a.b
            if (r7 == 0) goto L76
        L75:
            return r5
        L76:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.step.C32929b.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final BxOnboardingStep a(@Y61.k BxOnboardingStep bxOnboardingStep) {
        return bxOnboardingStep;
    }
}
