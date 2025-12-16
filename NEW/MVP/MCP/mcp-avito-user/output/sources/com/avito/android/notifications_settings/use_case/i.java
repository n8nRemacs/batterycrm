package com.avito.android.notifications_settings.use_case;

import Ek0.InterfaceC13498a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetDisabledPushNotificationSettingsUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13498a> f208203a;

    public i(Provider<InterfaceC13498a> provider) {
        this.f208203a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f208203a.get());
    }
}
