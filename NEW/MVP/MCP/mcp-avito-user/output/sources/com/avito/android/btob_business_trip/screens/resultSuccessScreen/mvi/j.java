package com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi;

import Ak.C13046c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.btob_business_trip.models.ActionApi;
import com.avito.android.btob_business_trip.models.SuccessScreenInfo;
import com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi.entity.B2bBusinessTripSuccessScreenInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: B2bBusinessTripSuccessScreenReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction;", "LAk/c;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements u<B2bBusinessTripSuccessScreenInternalAction, C13046c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C13046c a(B2bBusinessTripSuccessScreenInternalAction b2bBusinessTripSuccessScreenInternalAction, C13046c c13046c) {
        B2bBusinessTripSuccessScreenInternalAction b2bBusinessTripSuccessScreenInternalAction2 = b2bBusinessTripSuccessScreenInternalAction;
        C13046c c13046c2 = c13046c;
        if (!(b2bBusinessTripSuccessScreenInternalAction2 instanceof B2bBusinessTripSuccessScreenInternalAction.Init)) {
            return c13046c2;
        }
        SuccessScreenInfo successScreenInfo = ((B2bBusinessTripSuccessScreenInternalAction.Init) b2bBusinessTripSuccessScreenInternalAction2).f108106b;
        String str = successScreenInfo.f107873c;
        ActionApi actionApi = successScreenInfo.f107872b;
        String str2 = actionApi.f107848c;
        return new C13046c(new C13046c.b.C0025b(str, actionApi.f107847b, successScreenInfo.f107874d, successScreenInfo.f107875e, str2), c13046c2.f600c);
    }
}
