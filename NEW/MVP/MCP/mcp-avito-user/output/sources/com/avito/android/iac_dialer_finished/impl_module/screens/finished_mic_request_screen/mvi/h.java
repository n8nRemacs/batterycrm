package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.permissions.z;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: IacFinishedMicRequestScreenActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z> f166786a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f166787b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f166788c;

    public h(Provider<z> provider, Provider<InterfaceC28373a> provider2, Provider<InterfaceC47842z> provider3) {
        this.f166786a = provider;
        this.f166787b = provider2;
        this.f166788c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f166786a.get(), this.f166787b.get(), this.f166788c.get());
    }
}
