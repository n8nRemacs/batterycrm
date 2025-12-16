package com.avito.android.onboarding.step;

import com.avito.android.onboarding.model.BxOnboardingStep;
import javax.inject.Inject;
import kotlin.Metadata;
import sZ.InterfaceC48136b;

/* compiled from: BxOnboardingUnreadMessagesStepInteractorImpl.kt */
@com.avito.android.onboarding.I
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/step/D;", "Lcom/avito/android/onboarding/E;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class D implements com.avito.android.onboarding.E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48136b f209152a;

    @Inject
    public D(@Y61.k InterfaceC48136b interfaceC48136b) {
        this.f209152a = interfaceC48136b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.onboarding.E
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.avito.android.onboarding.step.C
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.onboarding.step.C r0 = (com.avito.android.onboarding.step.C) r0
            int r1 = r0.f209151s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209151s = r1
            goto L18
        L13:
            com.avito.android.onboarding.step.C r0 = new com.avito.android.onboarding.step.C
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f209149q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f209151s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r10)
            goto L43
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L31:
            kotlin.C42729a0.b(r10)
            sZ.b r10 = r9.f209152a
            kotlinx.coroutines.flow.internal.m r10 = r10.a()
            r0.f209151s = r3
            java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.y(r10, r0)
            if (r10 != r1) goto L43
            return r1
        L43:
            sZ.a r10 = (sZ.AbstractC48135a) r10
            boolean r0 = r10 instanceof sZ.AbstractC48135a.b
            if (r0 == 0) goto L5e
            com.avito.android.onboarding.model.BxOnboardingStep$View$Tooltip r0 = new com.avito.android.onboarding.model.BxOnboardingStep$View$Tooltip
            com.avito.android.bottom_navigation.NavigationTab r2 = com.avito.android.bottom_navigation.NavigationTab.f106973i
            sZ.a$b r10 = (sZ.AbstractC48135a.b) r10
            java.lang.String r3 = r10.f437723a
            r8 = 0
            r6 = 0
            java.lang.Integer r4 = r10.f437724b
            java.lang.Integer r5 = r10.f437725c
            r7 = 16
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L67
        L5e:
            sZ.a$a r0 = sZ.AbstractC48135a.C12619a.f437722a
            boolean r10 = kotlin.jvm.internal.L.f(r10, r0)
            if (r10 == 0) goto L68
            r0 = 0
        L67:
            return r0
        L68:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.step.D.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final BxOnboardingStep a(@Y61.k BxOnboardingStep bxOnboardingStep) {
        return bxOnboardingStep;
    }
}
