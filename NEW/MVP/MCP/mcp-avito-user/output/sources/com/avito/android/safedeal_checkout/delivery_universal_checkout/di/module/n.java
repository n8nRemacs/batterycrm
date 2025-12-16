package com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module;

import com.avito.android.analytics.screens.DeliveryUniversalCheckoutScreen;
import com.avito.android.analytics.screens.Screen;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryUniversalCheckoutTrackerModule_ProvidesScreenFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<Screen> {

    /* compiled from: DeliveryUniversalCheckoutTrackerModule_ProvidesScreenFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f257043a = new n();
    }

    public static n a() {
        return a.f257043a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m.f257042a.getClass();
        DeliveryUniversalCheckoutScreen deliveryUniversalCheckoutScreen = DeliveryUniversalCheckoutScreen.f90339d;
        t.d(deliveryUniversalCheckoutScreen);
        return deliveryUniversalCheckoutScreen;
    }
}
