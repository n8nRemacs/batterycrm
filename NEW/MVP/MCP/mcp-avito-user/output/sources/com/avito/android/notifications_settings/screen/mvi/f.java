package com.avito.android.notifications_settings.screen.mvi;

import Pz.C14860a;
import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationsSettingsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f208131a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l41.g<C14860a>> f208132b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f208133c;

    public f(Provider<l> provider, Provider<l41.g<C14860a>> provider2, Provider<InterfaceC35741a1> provider3) {
        this.f208131a = provider;
        this.f208132b = provider2;
        this.f208133c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f208131a.get(), this.f208132b.get(), this.f208133c.get());
    }
}
