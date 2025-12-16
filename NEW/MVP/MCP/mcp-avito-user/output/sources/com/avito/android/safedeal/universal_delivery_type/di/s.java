package com.avito.android.safedeal.universal_delivery_type.di;

import com.avito.android.analytics.screens.UniversalDeliveryTypeScreen;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.safedeal.universal_delivery_type.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f256614a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f256615b;

    public s(dagger.internal.l lVar, Provider provider) {
        this.f256614a = provider;
        this.f256615b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.f) this.f256614a).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f256615b.f393949a;
        q.f256613a.getClass();
        return interfaceC28481c.b(UniversalDeliveryTypeScreen.f90537d, rVar);
    }
}
