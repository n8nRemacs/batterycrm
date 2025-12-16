package com.avito.android.wallet.pin.impl.settings.mvi.component;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletSecuritySettingsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final o f328833a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.wallet_biometry.f> f328834b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f328835c;

    public j(o oVar, Provider provider, Provider provider2) {
        this.f328833a = oVar;
        this.f328834b = provider;
        this.f328835c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((n) this.f328833a.get(), this.f328834b.get(), this.f328835c.get());
    }
}
