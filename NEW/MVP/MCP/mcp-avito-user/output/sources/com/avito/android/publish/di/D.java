package com.avito.android.publish.di;

import com.avito.android.analytics.screens.PublishContactsScreen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.publish.di.C33810a;
import javax.inject.Provider;

/* compiled from: PublishModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class D implements dagger.internal.h<com.avito.android.analytics.screens.tracker.H> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235124a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f235125b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f235126c;

    public D(C33824o c33824o, dagger.internal.l lVar, Provider provider) {
        this.f235124a = c33824o;
        this.f235125b = provider;
        this.f235126c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C33810a.c.v) this.f235125b).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f235126c.f393949a;
        this.f235124a.getClass();
        return interfaceC28481c.b(PublishContactsScreen.f90454d, rVar);
    }
}
