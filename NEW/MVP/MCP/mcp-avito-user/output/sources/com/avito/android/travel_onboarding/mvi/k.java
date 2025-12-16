package com.avito.android.travel_onboarding.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.travel_onboarding.mvi.entity.TravelOnboardingInternalAction;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TravelOnboardingReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "LZE0/c;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements u<TravelOnboardingInternalAction, ZE0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f302325b;

    @Inject
    public k(@Y61.k m mVar) {
        this.f302325b = mVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final ZE0.c a(TravelOnboardingInternalAction travelOnboardingInternalAction, ZE0.c cVar) {
        TravelOnboardingInternalAction travelOnboardingInternalAction2 = travelOnboardingInternalAction;
        ZE0.c cVar2 = cVar;
        if (travelOnboardingInternalAction2 instanceof TravelOnboardingInternalAction.Init) {
            TravelOnboardingInternalAction.Init init = (TravelOnboardingInternalAction.Init) travelOnboardingInternalAction2;
            return ZE0.c.a(cVar2, init.f302307b, init.f302308c, null, null, 12);
        }
        boolean z12 = travelOnboardingInternalAction2 instanceof TravelOnboardingInternalAction.LoadingStarted;
        m mVar = this.f302325b;
        if (z12) {
            ZE0.c cVarA = ZE0.c.a(cVar2, null, null, P2.c.f318721a, null, 11);
            mVar.getClass();
            return m.a(cVarA);
        }
        if (travelOnboardingInternalAction2 instanceof TravelOnboardingInternalAction.LoadingComplete) {
            ZE0.c cVarA2 = ZE0.c.a(cVar2, null, null, new P2.b(((TravelOnboardingInternalAction.LoadingComplete) travelOnboardingInternalAction2).f302309b), null, 11);
            mVar.getClass();
            return m.a(cVarA2);
        }
        if (!(travelOnboardingInternalAction2 instanceof TravelOnboardingInternalAction.LoadingError)) {
            return cVar2;
        }
        ZE0.c cVarA3 = ZE0.c.a(cVar2, null, null, new P2.a(((TravelOnboardingInternalAction.LoadingError) travelOnboardingInternalAction2).f302310b), null, 11);
        mVar.getClass();
        return m.a(cVarA3);
    }
}
