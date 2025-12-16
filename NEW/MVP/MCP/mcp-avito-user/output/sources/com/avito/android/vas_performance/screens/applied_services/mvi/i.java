package com.avito.android.vas_performance.screens.applied_services.mvi;

import IL0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppliedServicesOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "LIL0/b;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements t<AppliedServicesInternalAction, IL0.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final IL0.b b(AppliedServicesInternalAction appliedServicesInternalAction) {
        AppliedServicesInternalAction appliedServicesInternalAction2 = appliedServicesInternalAction;
        if (appliedServicesInternalAction2 instanceof AppliedServicesInternalAction.ShowRemovalError) {
            return new b.C0461b(((AppliedServicesInternalAction.ShowRemovalError) appliedServicesInternalAction2).f320278b);
        }
        if (!(appliedServicesInternalAction2 instanceof AppliedServicesInternalAction.OpenDeepLink)) {
            return null;
        }
        AppliedServicesInternalAction.OpenDeepLink openDeepLink = (AppliedServicesInternalAction.OpenDeepLink) appliedServicesInternalAction2;
        return new b.a(openDeepLink.f320275b, openDeepLink.f320276c);
    }
}
