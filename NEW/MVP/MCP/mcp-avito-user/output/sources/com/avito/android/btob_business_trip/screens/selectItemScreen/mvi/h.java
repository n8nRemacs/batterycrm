package com.avito.android.btob_business_trip.screens.selectItemScreen.mvi;

import Bk.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: B2bBusinessTripSelectOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "LBk/b;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements t<B2bBusinessTripSelectInternalAction, Bk.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Bk.b b(B2bBusinessTripSelectInternalAction b2bBusinessTripSelectInternalAction) {
        Bk.b aVar;
        B2bBusinessTripSelectInternalAction b2bBusinessTripSelectInternalAction2 = b2bBusinessTripSelectInternalAction;
        if (b2bBusinessTripSelectInternalAction2 instanceof B2bBusinessTripSelectInternalAction.NavigateBack) {
            return b.c.f1647a;
        }
        if (b2bBusinessTripSelectInternalAction2 instanceof B2bBusinessTripSelectInternalAction.NavigateToSuccessScreen) {
            return b.d.f1648a;
        }
        if (b2bBusinessTripSelectInternalAction2 instanceof B2bBusinessTripSelectInternalAction.Error) {
            B2bBusinessTripSelectInternalAction.Error error = (B2bBusinessTripSelectInternalAction.Error) b2bBusinessTripSelectInternalAction2;
            aVar = new b.e(error.f108212c, error.f108211b);
        } else {
            if (b2bBusinessTripSelectInternalAction2 instanceof B2bBusinessTripSelectInternalAction.Exit) {
                return b.C0070b.f1646a;
            }
            if (!(b2bBusinessTripSelectInternalAction2 instanceof B2bBusinessTripSelectInternalAction.DeeplinkLaunch)) {
                return null;
            }
            aVar = new b.a(((B2bBusinessTripSelectInternalAction.DeeplinkLaunch) b2bBusinessTripSelectInternalAction2).f108210b);
        }
        return aVar;
    }
}
