package com.avito.android.theme_settings.viewmodel;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nE0.InterfaceC44242a;

/* compiled from: ThemeSettingsViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.lib.util.darkTheme.a> f301375a;

    /* renamed from: b, reason: collision with root package name */
    public final u f301376b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC44242a> f301377c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f301378d;

    public g(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f301375a = provider;
        this.f301376b = uVar;
        this.f301377c = provider2;
        this.f301378d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f301375a.get(), (b) this.f301376b.get(), this.f301377c.get(), this.f301378d.get());
    }
}
