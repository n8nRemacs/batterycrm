package com.avito.android.notificationdeeplink.di;

import Y61.k;
import Y61.l;
import com.avito.android.AnalyticParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.notificationdeeplink.NotificationDeepLinkActivity;
import com.avito.android.remote.model.notification.Payload;
import com.avito.android.remote.notification.NotificationIdentifier;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: NotificationDeepLinkComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notificationdeeplink/di/b;", "", "a", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: NotificationDeepLinkComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notificationdeeplink/di/b$a;", "", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k NotificationDeepLinkActivity notificationDeepLinkActivity, @h31.b @l DeepLink deepLink, @h31.b @l NotificationIdentifier notificationIdentifier, @h31.b @l Payload payload, @h31.b @l AnalyticParams analyticParams, @h31.b @l String str, @h31.b boolean z12);
    }

    void a(@k NotificationDeepLinkActivity notificationDeepLinkActivity);
}
