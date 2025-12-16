package com.avito.android.btob_business_trip.screens.common.interactors;

import Y61.k;
import com.avito.android.btob_business_trip.screens.infoScreen.mvi.entity.B2bBusinessTripInfoInternalAction;
import com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: B2bBusinessTripInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/common/interactors/a;", "", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {
    @k
    InterfaceC43160i<B2bBusinessTripSelectInternalAction> a(@k List<Long> list);

    @k
    InterfaceC43160i<B2bBusinessTripInfoInternalAction> b();
}
