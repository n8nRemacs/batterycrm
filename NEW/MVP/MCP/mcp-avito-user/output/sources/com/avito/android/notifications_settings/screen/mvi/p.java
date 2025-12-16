package com.avito.android.notifications_settings.screen.mvi;

import Ek0.InterfaceC13498a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationsSettingsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13498a> f208161a;

    public p(Provider<InterfaceC13498a> provider) {
        this.f208161a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f208161a.get());
    }
}
