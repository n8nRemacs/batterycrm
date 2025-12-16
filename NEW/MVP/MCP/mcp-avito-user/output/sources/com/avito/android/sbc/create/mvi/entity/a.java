package com.avito.android.sbc.create.mvi.entity;

import Y61.l;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.Metadata;

/* compiled from: CreateDiscountDispatchState.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_sbc_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    public static final boolean a(@l CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar) {
        if (dVar != null) {
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState autoDispatchToggleState = CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.f259647b;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState autoDispatchToggleState2 = dVar.f259664a;
            if (autoDispatchToggleState2 == autoDispatchToggleState || autoDispatchToggleState2 == CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.f259649d) {
                return true;
            }
        }
        return false;
    }
}
