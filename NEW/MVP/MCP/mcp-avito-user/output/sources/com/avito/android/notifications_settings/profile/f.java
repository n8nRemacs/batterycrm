package com.avito.android.notifications_settings.profile;

import Ek0.InterfaceC13498a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationsSettingsMessengerHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13498a> f208023a;

    public f(Provider<InterfaceC13498a> provider) {
        this.f208023a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f208023a.get());
    }
}
