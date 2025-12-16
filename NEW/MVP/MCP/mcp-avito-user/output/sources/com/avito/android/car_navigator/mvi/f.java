package com.avito.android.car_navigator.mvi;

import Dm.InterfaceC13415b;
import com.avito.android.arch.mvi.t;
import com.avito.android.car_navigator.mvi.entity.CarNavigatorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CarNavigatorOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/car_navigator/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorInternalAction;", "LDm/b;", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements t<CarNavigatorInternalAction, InterfaceC13415b> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13415b b(CarNavigatorInternalAction carNavigatorInternalAction) {
        CarNavigatorInternalAction carNavigatorInternalAction2 = carNavigatorInternalAction;
        if (carNavigatorInternalAction2 instanceof CarNavigatorInternalAction.OpenDeeplink) {
            CarNavigatorInternalAction.OpenDeeplink openDeeplink = (CarNavigatorInternalAction.OpenDeeplink) carNavigatorInternalAction2;
            return new InterfaceC13415b.C0190b(openDeeplink.f115204b, openDeeplink.f115205c);
        }
        if (carNavigatorInternalAction2 instanceof CarNavigatorInternalAction.OpenExternalUri) {
            return new InterfaceC13415b.c(((CarNavigatorInternalAction.OpenExternalUri) carNavigatorInternalAction2).f115206b);
        }
        if (carNavigatorInternalAction2 instanceof CarNavigatorInternalAction.CancelScreen) {
            return InterfaceC13415b.a.f3426a;
        }
        return null;
    }
}
