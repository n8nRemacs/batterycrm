package com.avito.android.onboarding.step;

import com.avito.android.iac_problems.public_module.deeplink.IacMiuiDisplayOnLockedScreenPermissionLink;
import com.avito.android.onboarding.model.BxOnboardingStep;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import nM.InterfaceC44291a;

/* compiled from: BxOnboardingMiuiStepInteractorImpl.kt */
@com.avito.android.onboarding.A
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/step/o;", "Lcom/avito/android/onboarding/E;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements com.avito.android.onboarding.E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44291a f209222a;

    @Inject
    public o(@Y61.k InterfaceC44291a interfaceC44291a) {
        this.f209222a = interfaceC44291a;
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final Object b(@Y61.k ContinuationImpl continuationImpl) {
        IacMiuiDisplayOnLockedScreenPermissionLink iacMiuiDisplayOnLockedScreenPermissionLinkA = this.f209222a.a();
        if (iacMiuiDisplayOnLockedScreenPermissionLinkA != null) {
            return new BxOnboardingStep.MiuiProblemSheet(iacMiuiDisplayOnLockedScreenPermissionLinkA);
        }
        return null;
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final BxOnboardingStep a(@Y61.k BxOnboardingStep bxOnboardingStep) {
        return bxOnboardingStep;
    }
}
