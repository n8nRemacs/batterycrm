package com.avito.android.notification_center.list.di;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.notification_center.list.NotificationCenterListActivity;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: NotificationCenterListComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notification_center/list/di/b;", "", "a", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: NotificationCenterListComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/list/di/b$a;", "", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k Resources resources, @h31.b boolean z12, @h31.b @k C28478k c28478k, @h31.b @k l lVar, @h31.b @k S0 s02);
    }

    void a(@k NotificationCenterListActivity notificationCenterListActivity);
}
