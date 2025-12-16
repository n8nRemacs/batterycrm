package com.avito.android.onboarding.step;

import com.avito.android.onboarding.model.BxOnboardingStep;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BxOnboardingReplaceMainExitStepInteractorImpl.kt */
@com.avito.android.onboarding.D
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/step/A;", "Lcom/avito/android/onboarding/E;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A implements com.avito.android.onboarding.E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.business360.d f209147a;

    @Inject
    public A(@Y61.k com.avito.android.bxcontent.business360.d dVar) {
        this.f209147a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.onboarding.E
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.onboarding.step.z
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.onboarding.step.z r0 = (com.avito.android.onboarding.step.z) r0
            int r1 = r0.f209258s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209258s = r1
            goto L18
        L13:
            com.avito.android.onboarding.step.z r0 = new com.avito.android.onboarding.step.z
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f209256q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f209258s
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
            r0.f209258s = r3
            com.avito.android.bxcontent.business360.d r5 = r4.f209147a
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding r5 = (com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding) r5
            if (r5 != 0) goto L45
            r5 = 0
            return r5
        L45:
            com.avito.android.onboarding.model.BxOnboardingStep$ShowReplaceMainExitOnboarding r0 = new com.avito.android.onboarding.model.BxOnboardingStep$ShowReplaceMainExitOnboarding
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.step.A.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final BxOnboardingStep a(@Y61.k BxOnboardingStep bxOnboardingStep) {
        return bxOnboardingStep;
    }
}
