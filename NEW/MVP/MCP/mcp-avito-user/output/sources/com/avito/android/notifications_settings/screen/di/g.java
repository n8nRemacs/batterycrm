package com.avito.android.notifications_settings.screen.di;

import com.avito.android.notifications_settings.toggle.NotificationsSettingsToggleItem;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationsSettingsModule_ProvideNotificationsSettingsToggleItemConsumerFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<com.jakewharton.rxrelay3.d<NotificationsSettingsToggleItem>> {

    /* compiled from: NotificationsSettingsModule_ProvideNotificationsSettingsToggleItemConsumerFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f208089a = new g();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = d.f208084a;
        return new com.jakewharton.rxrelay3.c();
    }
}
