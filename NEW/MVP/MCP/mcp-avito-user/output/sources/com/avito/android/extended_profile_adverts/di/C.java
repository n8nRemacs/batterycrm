package com.avito.android.extended_profile_adverts.di;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.extended_profile_adverts.di.C30488a;
import javax.inject.Provider;

/* compiled from: PublicProfileAdvertsTrackerModule_ProvidesScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class C implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f150598a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f150599b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f150600c;

    public C(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f150598a = provider;
        this.f150599b = lVar;
        this.f150600c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C30488a.c.v) this.f150598a).get();
        Screen screen = (Screen) this.f150599b.f393949a;
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f150600c.f393949a;
        y.f150835a.getClass();
        return interfaceC28481c.b(screen, rVar);
    }
}
