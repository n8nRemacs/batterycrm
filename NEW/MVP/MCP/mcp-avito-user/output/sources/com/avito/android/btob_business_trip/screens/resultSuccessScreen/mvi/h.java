package com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi;

import Ak.InterfaceC13045b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi.entity.B2bBusinessTripSuccessScreenInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: B2bBusinessTripSuccessScreenOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction;", "LAk/b;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements t<B2bBusinessTripSuccessScreenInternalAction, InterfaceC13045b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13045b b(B2bBusinessTripSuccessScreenInternalAction b2bBusinessTripSuccessScreenInternalAction) {
        B2bBusinessTripSuccessScreenInternalAction b2bBusinessTripSuccessScreenInternalAction2 = b2bBusinessTripSuccessScreenInternalAction;
        if (b2bBusinessTripSuccessScreenInternalAction2 instanceof B2bBusinessTripSuccessScreenInternalAction.NavigateBack) {
            return InterfaceC13045b.C0024b.f595a;
        }
        if (b2bBusinessTripSuccessScreenInternalAction2 instanceof B2bBusinessTripSuccessScreenInternalAction.LaunchDeeplink) {
            return new InterfaceC13045b.a(((B2bBusinessTripSuccessScreenInternalAction.LaunchDeeplink) b2bBusinessTripSuccessScreenInternalAction2).f108107b);
        }
        if (b2bBusinessTripSuccessScreenInternalAction2 instanceof B2bBusinessTripSuccessScreenInternalAction.Init) {
            return InterfaceC13045b.c.f596a;
        }
        return null;
    }
}
