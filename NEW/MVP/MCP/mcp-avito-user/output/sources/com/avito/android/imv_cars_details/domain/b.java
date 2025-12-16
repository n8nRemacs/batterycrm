package com.avito.android.imv_cars_details.domain;

import Y61.k;
import Y61.l;
import com.avito.android.remote.imv_cars_details.models.ImvCarsDetailsResponse;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import qk0.InterfaceC47409a;

/* compiled from: ImvCarsDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/domain/b;", "Lcom/avito/android/imv_cars_details/domain/a;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC47409a f169960a;

    @Inject
    public b(@k InterfaceC47409a interfaceC47409a) {
        this.f169960a = interfaceC47409a;
    }

    @Override // com.avito.android.imv_cars_details.domain.a
    @l
    public final Object a(@k String str, @k String str2, @k Continuation<? super TypedResult<ImvCarsDetailsResponse>> continuation) {
        return this.f169960a.b(str2, str, continuation);
    }

    @Override // com.avito.android.imv_cars_details.domain.a
    @l
    public final Object b(@k String str, @k Continuation<? super TypedResult<ImvCarsDetailsResponse>> continuation) {
        return this.f169960a.a(str, continuation);
    }
}
