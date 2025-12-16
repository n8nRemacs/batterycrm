package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacFinishedFeedbackScreenActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f166681a;

    public d(Provider<InterfaceC28373a> provider) {
        this.f166681a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f166681a.get());
    }
}
