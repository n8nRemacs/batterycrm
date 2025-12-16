package com.avito.android.brandspace.di;

import com.avito.android.analytics.screens.BrandspaceScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.brandspace.di.q;
import dagger.internal.x;
import dagger.internal.y;
import dj.InterfaceC39737b;
import javax.inject.Provider;
import pk.C47105c;
import pk.InterfaceC47104b;

/* compiled from: BrandspaceFragmentModule_ProvideBrandspaceTracker$_avito_brandspace_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<InterfaceC47104b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f107685a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC39737b> f107686b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f107687c;

    public f(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f107685a = provider;
        this.f107686b = provider2;
        this.f107687c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((q.b.g) this.f107685a).get();
        InterfaceC39737b interfaceC39737b = (InterfaceC39737b) ((q.b.C3222b) this.f107686b).get();
        r rVar = (r) this.f107687c.f393949a;
        d dVar = d.f107680a;
        return new C47105c(interfaceC28481c, rVar, BrandspaceScreen.f90302d, interfaceC39737b);
    }
}
