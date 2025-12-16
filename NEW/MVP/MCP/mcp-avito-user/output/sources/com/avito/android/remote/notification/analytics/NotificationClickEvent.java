package com.avito.android.remote.notification.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationGrafanaTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/analytics/NotificationClickEvent;", "", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationClickEvent {

    /* renamed from: c, reason: collision with root package name */
    public static final NotificationClickEvent f253995c;

    /* renamed from: d, reason: collision with root package name */
    public static final NotificationClickEvent f253996d;

    /* renamed from: e, reason: collision with root package name */
    public static final NotificationClickEvent f253997e;

    /* renamed from: f, reason: collision with root package name */
    public static final NotificationClickEvent f253998f;

    /* renamed from: g, reason: collision with root package name */
    public static final NotificationClickEvent f253999g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ NotificationClickEvent[] f254000h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f254001i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254002b;

    static {
        NotificationClickEvent notificationClickEvent = new NotificationClickEvent("HANDLE", 0, "handle");
        f253995c = notificationClickEvent;
        NotificationClickEvent notificationClickEvent2 = new NotificationClickEvent("FORBID_ANALYTICS", 1, "forbid_analytics");
        f253996d = notificationClickEvent2;
        NotificationClickEvent notificationClickEvent3 = new NotificationClickEvent("FORBID_EMPTY", 2, "forbid_empty");
        f253997e = notificationClickEvent3;
        NotificationClickEvent notificationClickEvent4 = new NotificationClickEvent("FORBID_BUTTON", 3, "forbid_button");
        f253998f = notificationClickEvent4;
        NotificationClickEvent notificationClickEvent5 = new NotificationClickEvent("OK", 4, "ok");
        f253999g = notificationClickEvent5;
        NotificationClickEvent[] notificationClickEventArr = {notificationClickEvent, notificationClickEvent2, notificationClickEvent3, notificationClickEvent4, notificationClickEvent5};
        f254000h = notificationClickEventArr;
        f254001i = c.a(notificationClickEventArr);
    }

    public NotificationClickEvent(String str, int i12, String str2) {
        this.f254002b = str2;
    }

    public static NotificationClickEvent valueOf(String str) {
        return (NotificationClickEvent) Enum.valueOf(NotificationClickEvent.class, str);
    }

    public static NotificationClickEvent[] values() {
        return (NotificationClickEvent[]) f254000h.clone();
    }
}
