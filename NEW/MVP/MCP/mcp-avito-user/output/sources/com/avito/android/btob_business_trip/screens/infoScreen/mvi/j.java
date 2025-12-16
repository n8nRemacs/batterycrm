package com.avito.android.btob_business_trip.screens.infoScreen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.btob_business_trip.models.OnboardingInfo;
import com.avito.android.btob_business_trip.screens.infoScreen.mvi.entity.B2bBusinessTripInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import zk.C50579c;

/* compiled from: B2bBusinessTripInfoReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction;", "Lzk/c;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements u<B2bBusinessTripInfoInternalAction, C50579c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C50579c a(B2bBusinessTripInfoInternalAction b2bBusinessTripInfoInternalAction, C50579c c50579c) {
        B2bBusinessTripInfoInternalAction b2bBusinessTripInfoInternalAction2 = b2bBusinessTripInfoInternalAction;
        C50579c c50579c2 = c50579c;
        if (b2bBusinessTripInfoInternalAction2 instanceof B2bBusinessTripInfoInternalAction.Loading) {
            return C50579c.a(c50579c2, C50579c.b.C12972b.f444208a);
        }
        if (!(b2bBusinessTripInfoInternalAction2 instanceof B2bBusinessTripInfoInternalAction.ShowContent)) {
            if (!(b2bBusinessTripInfoInternalAction2 instanceof B2bBusinessTripInfoInternalAction.Error)) {
                return c50579c2;
            }
            B2bBusinessTripInfoInternalAction.Error error = (B2bBusinessTripInfoInternalAction.Error) b2bBusinessTripInfoInternalAction2;
            return C50579c.a(c50579c2, new C50579c.b.a(error.f108002c, error.f108001b));
        }
        B2bBusinessTripInfoInternalAction.ShowContent showContent = (B2bBusinessTripInfoInternalAction.ShowContent) b2bBusinessTripInfoInternalAction2;
        OnboardingInfo onboardingInfo = showContent.f108007b;
        return new C50579c(onboardingInfo, showContent.f108008c, new C50579c.b.C12973c(onboardingInfo.f107861e, onboardingInfo.f107858b.f107849b, onboardingInfo.f107859c, onboardingInfo.f107860d));
    }
}
