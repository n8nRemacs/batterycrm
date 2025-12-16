package com.avito.android.imv_cars_details.domain;

import Y61.k;
import Y61.l;
import com.avito.android.remote.imv_cars_details.models.ImvCarsDetailsResponse;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ImvCarsDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/domain/a;", "", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {
    @l
    Object a(@k String str, @k String str2, @k Continuation<? super TypedResult<ImvCarsDetailsResponse>> continuation);

    @l
    Object b(@k String str, @k Continuation<? super TypedResult<ImvCarsDetailsResponse>> continuation);
}
