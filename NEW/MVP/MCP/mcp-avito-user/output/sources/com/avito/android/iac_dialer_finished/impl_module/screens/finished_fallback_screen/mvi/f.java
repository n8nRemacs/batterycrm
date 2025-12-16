package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi;

import com.avito.android.C29640d;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sc.InterfaceC48155d;

/* compiled from: IacFinishedFallbackScreenActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f166600a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.e f166601b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.f f166602c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C29640d> f166603d;

    public f(Provider provider, com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.e eVar, com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.f fVar, Provider provider2) {
        this.f166600a = provider;
        this.f166601b = eVar;
        this.f166602c = fVar;
        this.f166603d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f166600a.get(), (AW.b) this.f166601b.get(), (InterfaceC48155d) this.f166602c.get(), this.f166603d.get());
    }
}
