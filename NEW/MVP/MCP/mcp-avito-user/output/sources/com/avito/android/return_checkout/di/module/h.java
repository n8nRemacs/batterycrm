package com.avito.android.return_checkout.di.module;

import com.avito.android.analytics.screens.DeliveryReturnCheckoutScreen;
import com.avito.android.analytics.screens.Screen;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryReturnCheckoutTrackerModule_ProvidesScreenFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<Screen> {

    /* compiled from: DeliveryReturnCheckoutTrackerModule_ProvidesScreenFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f255289a = new h();
    }

    public static h a() {
        return a.f255289a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g.f255288a.getClass();
        DeliveryReturnCheckoutScreen deliveryReturnCheckoutScreen = DeliveryReturnCheckoutScreen.f90338d;
        t.d(deliveryReturnCheckoutScreen);
        return deliveryReturnCheckoutScreen;
    }
}
