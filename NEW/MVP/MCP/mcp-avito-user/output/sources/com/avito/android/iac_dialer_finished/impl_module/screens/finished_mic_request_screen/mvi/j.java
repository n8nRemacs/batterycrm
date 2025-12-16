package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi;

import com.avito.android.permissions.z;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacFinishedMicRequestScreenBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z> f166793a;

    public j(Provider<z> provider) {
        this.f166793a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f166793a.get());
    }
}
