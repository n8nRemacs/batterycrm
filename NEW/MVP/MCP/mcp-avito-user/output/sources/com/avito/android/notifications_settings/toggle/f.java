package com.avito.android.notifications_settings.toggle;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationsSettingsTogglePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.d<NotificationsSettingsToggleItem>> f208193a;

    /* renamed from: b, reason: collision with root package name */
    public final l f208194b;

    public f(l lVar, Provider provider) {
        this.f208193a = provider;
        this.f208194b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f208193a.get(), (Y41.l) this.f208194b.f393949a);
    }
}
