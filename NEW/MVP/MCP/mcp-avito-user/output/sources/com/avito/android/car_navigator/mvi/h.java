package com.avito.android.car_navigator.mvi;

import Dm.C13416c;
import com.avito.android.arch.mvi.u;
import com.avito.android.car_navigator.mvi.entity.CarNavigatorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CarNavigatorReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/car_navigator/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction;", "LDm/c;", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements u<CarNavigatorInternalAction, C13416c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C13416c a(CarNavigatorInternalAction carNavigatorInternalAction, C13416c c13416c) {
        CarNavigatorInternalAction carNavigatorInternalAction2 = carNavigatorInternalAction;
        C13416c c13416c2 = c13416c;
        return carNavigatorInternalAction2.equals(CarNavigatorInternalAction.ShowContent.f115207b) ? C13416c.a(c13416c2, false, false) : carNavigatorInternalAction2.equals(CarNavigatorInternalAction.ShowLoading.f115208b) ? C13416c.a(c13416c2, true, false) : carNavigatorInternalAction2.equals(CarNavigatorInternalAction.ShowLoadingError.f115209b) ? C13416c.a(c13416c2, false, true) : c13416c2;
    }
}
