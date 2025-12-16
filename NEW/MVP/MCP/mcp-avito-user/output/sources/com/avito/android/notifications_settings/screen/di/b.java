package com.avito.android.notifications_settings.screen.di;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.C;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.notifications_settings.screen.NotificationsSettingsActivity;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: NotificationsSettingsComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/screen/di/b;", "", "a", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
@C
@InterfaceC30272y
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: NotificationsSettingsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_settings/screen/di/b$a;", "", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k Resources resources, @h31.b boolean z12, @h31.b @k C28478k c28478k, @h31.b @k l lVar);
    }

    void a(@k NotificationsSettingsActivity notificationsSettingsActivity);
}
