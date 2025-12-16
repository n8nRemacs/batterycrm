package com.avito.android.notifications_settings.screen.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationsSettingsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final u f208166a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f208167b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<I30.d> f208168c;

    public t(u uVar, Provider provider, Provider provider2) {
        this.f208166a = uVar;
        this.f208167b = provider;
        this.f208168c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((com.avito.android.notifications_settings.screen.i) this.f208166a.get(), this.f208167b.get(), this.f208168c.get());
    }
}
