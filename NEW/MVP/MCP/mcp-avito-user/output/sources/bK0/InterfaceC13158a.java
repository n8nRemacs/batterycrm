package Bk0;

import Y61.k;
import com.avito.android.remote.notification.analytics.NotificationClickEvent;
import com.avito.android.remote.notification.analytics.NotificationEvent;
import com.avito.android.remote.notification.analytics.NotificationImageLoadEvent;
import com.avito.android.remote.notification.analytics.NotificationMessengerIconLoadEvent;
import com.avito.android.remote.notification.analytics.NotificationPayloadEvent;
import kotlin.Metadata;

/* compiled from: NotificationGrafanaTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBk0/a;", "", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bk0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC13158a {
    void a(@k NotificationPayloadEvent notificationPayloadEvent);

    void b(@k e eVar);

    void c(@k NotificationImageLoadEvent notificationImageLoadEvent);

    void d(@k NotificationEvent notificationEvent);

    void e(@k NotificationClickEvent notificationClickEvent);

    void f(@k NotificationMessengerIconLoadEvent notificationMessengerIconLoadEvent);

    void g(@k String str);

    void h();
}
