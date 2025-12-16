package com.avito.android.di.module;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.car_navigator.presentation.CarNavigatorFragment;
import com.avito.android.car_navigator.presentation.CarNavigatorOpenParams;
import com.avito.android.car_navigator.presentation.CarNavigatorScreenTabData;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;

/* compiled from: DataTabFragmentFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class W8 implements InterfaceC28898u {
    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final Class<?> a() {
        return CarNavigatorScreenTabData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final TabBaseFragment b(@Y61.k TabFragmentFactory.Data data) {
        CarNavigatorScreenTabData carNavigatorScreenTabData = (CarNavigatorScreenTabData) data;
        CarNavigatorFragment.f115212D0.getClass();
        CarNavigatorFragment carNavigatorFragment = new CarNavigatorFragment();
        CarNavigatorOpenParams carNavigatorOpenParams = new CarNavigatorOpenParams(carNavigatorScreenTabData.f115236b, carNavigatorScreenTabData.f115237c);
        carNavigatorFragment.f115223z0.setValue(carNavigatorFragment, CarNavigatorFragment.f115213E0[0], carNavigatorOpenParams);
        return carNavigatorFragment;
    }
}
