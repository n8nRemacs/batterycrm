package com.avito.android.remote.notification.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationGrafanaTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/analytics/NotificationMessengerIconLoadEvent;", "", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationMessengerIconLoadEvent {

    /* renamed from: c, reason: collision with root package name */
    public static final NotificationMessengerIconLoadEvent f254029c;

    /* renamed from: d, reason: collision with root package name */
    public static final NotificationMessengerIconLoadEvent f254030d;

    /* renamed from: e, reason: collision with root package name */
    public static final NotificationMessengerIconLoadEvent f254031e;

    /* renamed from: f, reason: collision with root package name */
    public static final NotificationMessengerIconLoadEvent f254032f;

    /* renamed from: g, reason: collision with root package name */
    public static final NotificationMessengerIconLoadEvent f254033g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ NotificationMessengerIconLoadEvent[] f254034h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f254035i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254036b;

    static {
        NotificationMessengerIconLoadEvent notificationMessengerIconLoadEvent = new NotificationMessengerIconLoadEvent("CALLED", 0, "called");
        f254029c = notificationMessengerIconLoadEvent;
        NotificationMessengerIconLoadEvent notificationMessengerIconLoadEvent2 = new NotificationMessengerIconLoadEvent("ERROR", 1, "error");
        f254030d = notificationMessengerIconLoadEvent2;
        NotificationMessengerIconLoadEvent notificationMessengerIconLoadEvent3 = new NotificationMessengerIconLoadEvent("ERROR_SHOWING_NOTIFICATION", 2, "error_showing_notification");
        f254031e = notificationMessengerIconLoadEvent3;
        NotificationMessengerIconLoadEvent notificationMessengerIconLoadEvent4 = new NotificationMessengerIconLoadEvent("STATE_OK", 3, "state.ok");
        f254032f = notificationMessengerIconLoadEvent4;
        NotificationMessengerIconLoadEvent notificationMessengerIconLoadEvent5 = new NotificationMessengerIconLoadEvent("STATE_ERROR", 4, "state.error");
        f254033g = notificationMessengerIconLoadEvent5;
        NotificationMessengerIconLoadEvent[] notificationMessengerIconLoadEventArr = {notificationMessengerIconLoadEvent, notificationMessengerIconLoadEvent2, notificationMessengerIconLoadEvent3, notificationMessengerIconLoadEvent4, notificationMessengerIconLoadEvent5};
        f254034h = notificationMessengerIconLoadEventArr;
        f254035i = c.a(notificationMessengerIconLoadEventArr);
    }

    public NotificationMessengerIconLoadEvent(String str, int i12, String str2) {
        this.f254036b = str2;
    }

    public static NotificationMessengerIconLoadEvent valueOf(String str) {
        return (NotificationMessengerIconLoadEvent) Enum.valueOf(NotificationMessengerIconLoadEvent.class, str);
    }

    public static NotificationMessengerIconLoadEvent[] values() {
        return (NotificationMessengerIconLoadEvent[]) f254034h.clone();
    }
}
