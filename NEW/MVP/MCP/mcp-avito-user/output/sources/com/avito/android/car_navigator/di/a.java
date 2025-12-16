package com.avito.android.car_navigator.di;

import Dm.InterfaceC13414a;
import Y41.l;
import Y61.k;
import com.avito.android.car_navigator.link.CarNavigatorSettings;
import com.avito.android.car_navigator.presentation.CarNavigatorFragment;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CarNavigatorComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/car_navigator/di/a;", "", "a", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CarNavigatorComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/car_navigator/di/a$a;", "", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.car_navigator.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3356a {
        @k
        InterfaceC3356a a(@k InterfaceC39417a interfaceC39417a);

        @h31.b
        @k
        InterfaceC3356a b(@k CarNavigatorSettings carNavigatorSettings);

        @k
        a build();

        @k
        InterfaceC3356a c(@k b bVar);

        @h31.b
        @k
        InterfaceC3356a w(@k l<? super InterfaceC13414a, G0> lVar);
    }

    void a(@k CarNavigatorFragment carNavigatorFragment);
}
