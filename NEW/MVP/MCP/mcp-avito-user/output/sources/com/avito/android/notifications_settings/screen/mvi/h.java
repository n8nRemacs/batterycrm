package com.avito.android.notifications_settings.screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationsSettingsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f208142a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f208143b;

    public h(dagger.internal.l lVar, Provider provider) {
        this.f208142a = provider;
        this.f208143b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f208142a.get(), ((Boolean) this.f208143b.f393949a).booleanValue());
    }
}
