package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacFinishedMicRequestScreenReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f166807a;

    public q(Provider<InterfaceC28373a> provider) {
        this.f166807a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f166807a.get());
    }
}
