package com.avito.android.str_insurance.screen.di;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.str_insurance.screen.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrInsuranceFragmentTrackerModule_ProvidesScreenTrackerFactory$_avito_str_insurance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final h f288717a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f288718b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f288719c;

    /* renamed from: d, reason: collision with root package name */
    public final u f288720d;

    public n(h hVar, Provider provider, dagger.internal.l lVar, u uVar) {
        this.f288717a = hVar;
        this.f288718b = provider;
        this.f288719c = lVar;
        this.f288720d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481cB = ((a.c.e) this.f288718b).f288693a.b();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f288719c.f393949a;
        Screen screen = (Screen) this.f288720d.get();
        this.f288717a.getClass();
        return interfaceC28481cB.b(screen, rVar);
    }
}
