package com.avito.android.remote.notification.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationGrafanaTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/analytics/NotificationPayloadEvent;", "", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationPayloadEvent {

    /* renamed from: c, reason: collision with root package name */
    public static final NotificationPayloadEvent f254037c;

    /* renamed from: d, reason: collision with root package name */
    public static final NotificationPayloadEvent f254038d;

    /* renamed from: e, reason: collision with root package name */
    public static final NotificationPayloadEvent f254039e;

    /* renamed from: f, reason: collision with root package name */
    public static final NotificationPayloadEvent f254040f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ NotificationPayloadEvent[] f254041g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f254042h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254043b;

    static {
        NotificationPayloadEvent notificationPayloadEvent = new NotificationPayloadEvent("HANDLE", 0, "handle");
        f254037c = notificationPayloadEvent;
        NotificationPayloadEvent notificationPayloadEvent2 = new NotificationPayloadEvent("FORBID_ANALYTICS", 1, "forbid_analytics");
        f254038d = notificationPayloadEvent2;
        NotificationPayloadEvent notificationPayloadEvent3 = new NotificationPayloadEvent("FORBID_NOT_NC", 2, "forbid_not_nc");
        f254039e = notificationPayloadEvent3;
        NotificationPayloadEvent notificationPayloadEvent4 = new NotificationPayloadEvent("OK", 3, "ok");
        f254040f = notificationPayloadEvent4;
        NotificationPayloadEvent[] notificationPayloadEventArr = {notificationPayloadEvent, notificationPayloadEvent2, notificationPayloadEvent3, notificationPayloadEvent4};
        f254041g = notificationPayloadEventArr;
        f254042h = c.a(notificationPayloadEventArr);
    }

    public NotificationPayloadEvent(String str, int i12, String str2) {
        this.f254043b = str2;
    }

    public static NotificationPayloadEvent valueOf(String str) {
        return (NotificationPayloadEvent) Enum.valueOf(NotificationPayloadEvent.class, str);
    }

    public static NotificationPayloadEvent[] values() {
        return (NotificationPayloadEvent[]) f254041g.clone();
    }
}
