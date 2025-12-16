package com.avito.android.btob_business_trip.screens.infoScreen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.btob_business_trip.screens.infoScreen.mvi.entity.B2bBusinessTripInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import zk.InterfaceC50578b;

/* compiled from: B2bBusinessTripInfoOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction;", "Lzk/b;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements t<B2bBusinessTripInfoInternalAction, InterfaceC50578b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC50578b b(B2bBusinessTripInfoInternalAction b2bBusinessTripInfoInternalAction) {
        B2bBusinessTripInfoInternalAction b2bBusinessTripInfoInternalAction2 = b2bBusinessTripInfoInternalAction;
        if (b2bBusinessTripInfoInternalAction2 instanceof B2bBusinessTripInfoInternalAction.NavigateBack) {
            return InterfaceC50578b.a.f444199a;
        }
        if (b2bBusinessTripInfoInternalAction2 instanceof B2bBusinessTripInfoInternalAction.NavigateToSelectItems) {
            return new InterfaceC50578b.C12971b(((B2bBusinessTripInfoInternalAction.NavigateToSelectItems) b2bBusinessTripInfoInternalAction2).f108006b);
        }
        return null;
    }
}
