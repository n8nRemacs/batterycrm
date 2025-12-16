package com.avito.android.imv_cars_details.domain;

import Y61.k;
import com.avito.android.remote.model.PricePoll;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ImvCarsDetailsPollInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/domain/d;", "", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface d {
    boolean a();

    @k
    List<com.avito.conveyor_item.a> b(@k List<? extends com.avito.conveyor_item.a> list, @k PricePoll pricePoll, int i12);
}
