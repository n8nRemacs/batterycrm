package com.avito.android.wallet.pin.impl.settings.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletSecuritySettingsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.pin.impl.settings.mvi.component.m f328895a;

    public q(com.avito.android.wallet.pin.impl.settings.mvi.component.m mVar) {
        this.f328895a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((com.avito.android.wallet.pin.impl.settings.mvi.component.l) this.f328895a.get(), null, 2, null);
    }
}
