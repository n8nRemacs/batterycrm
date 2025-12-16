package com.avito.android.remote.notification.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationGrafanaTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/analytics/NotificationEvent;", "", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationEvent {

    /* renamed from: c, reason: collision with root package name */
    public static final NotificationEvent f254003c;

    /* renamed from: d, reason: collision with root package name */
    public static final NotificationEvent f254004d;

    /* renamed from: e, reason: collision with root package name */
    public static final NotificationEvent f254005e;

    /* renamed from: f, reason: collision with root package name */
    public static final NotificationEvent f254006f;

    /* renamed from: g, reason: collision with root package name */
    public static final NotificationEvent f254007g;

    /* renamed from: h, reason: collision with root package name */
    public static final NotificationEvent f254008h;

    /* renamed from: i, reason: collision with root package name */
    public static final NotificationEvent f254009i;

    /* renamed from: j, reason: collision with root package name */
    public static final NotificationEvent f254010j;

    /* renamed from: k, reason: collision with root package name */
    public static final NotificationEvent f254011k;

    /* renamed from: l, reason: collision with root package name */
    public static final NotificationEvent f254012l;

    /* renamed from: m, reason: collision with root package name */
    public static final NotificationEvent f254013m;

    /* renamed from: n, reason: collision with root package name */
    public static final NotificationEvent f254014n;

    /* renamed from: o, reason: collision with root package name */
    public static final NotificationEvent f254015o;

    /* renamed from: p, reason: collision with root package name */
    public static final NotificationEvent f254016p;

    /* renamed from: q, reason: collision with root package name */
    public static final NotificationEvent f254017q;

    /* renamed from: r, reason: collision with root package name */
    public static final NotificationEvent f254018r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ NotificationEvent[] f254019s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a f254020t;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254021b;

    static {
        NotificationEvent notificationEvent = new NotificationEvent("HANDLE", 0, "handle");
        f254003c = notificationEvent;
        NotificationEvent notificationEvent2 = new NotificationEvent("FORBID_SILENT", 1, "forbid_silent");
        f254004d = notificationEvent2;
        NotificationEvent notificationEvent3 = new NotificationEvent("FORBID_VOIP", 2, "forbid_voip");
        f254005e = notificationEvent3;
        NotificationEvent notificationEvent4 = new NotificationEvent("FORBID_LINK", 3, "forbid_link");
        f254006f = notificationEvent4;
        NotificationEvent notificationEvent5 = new NotificationEvent("FORBID_URI", 4, "forbid_uri");
        f254007g = notificationEvent5;
        NotificationEvent notificationEvent6 = new NotificationEvent("FORBID_JSON", 5, "forbid_json");
        f254008h = notificationEvent6;
        NotificationEvent notificationEvent7 = new NotificationEvent("FORBID_PARSE", 6, "forbid_parse");
        f254009i = notificationEvent7;
        NotificationEvent notificationEvent8 = new NotificationEvent("FORBID_NOTIFICATION_DISABLED", 7, "forbid_notification_disabled");
        f254010j = notificationEvent8;
        NotificationEvent notificationEvent9 = new NotificationEvent("FORBID_NOTIFICATION_CHANNEL_DISABLED", 8, "forbid_notification_channel_disabled");
        f254011k = notificationEvent9;
        NotificationEvent notificationEvent10 = new NotificationEvent("FORBID_ANALYTICS", 9, "forbid_analytics");
        f254012l = notificationEvent10;
        NotificationEvent notificationEvent11 = new NotificationEvent("FORBID_FOREGROUND", 10, "forbid_foreground");
        f254013m = notificationEvent11;
        NotificationEvent notificationEvent12 = new NotificationEvent("FORBID_INTERCEPTED", 11, "forbid_intercepted");
        f254014n = notificationEvent12;
        NotificationEvent notificationEvent13 = new NotificationEvent("SHOW_TEXT", 12, "show.text");
        f254015o = notificationEvent13;
        NotificationEvent notificationEvent14 = new NotificationEvent("SHOW_BIG_IMAGE", 13, "show.big_image");
        f254016p = notificationEvent14;
        NotificationEvent notificationEvent15 = new NotificationEvent("SHOW_MESSENGER_ICON", 14, "show.msg_icon");
        f254017q = notificationEvent15;
        NotificationEvent notificationEvent16 = new NotificationEvent("PUSH_DELIVERY_TRACKING_FAILED", 15, "push_delivery_tracking_failed");
        f254018r = notificationEvent16;
        NotificationEvent[] notificationEventArr = {notificationEvent, notificationEvent2, notificationEvent3, notificationEvent4, notificationEvent5, notificationEvent6, notificationEvent7, notificationEvent8, notificationEvent9, notificationEvent10, notificationEvent11, notificationEvent12, notificationEvent13, notificationEvent14, notificationEvent15, notificationEvent16};
        f254019s = notificationEventArr;
        f254020t = c.a(notificationEventArr);
    }

    public NotificationEvent(String str, int i12, String str2) {
        this.f254021b = str2;
    }

    public static NotificationEvent valueOf(String str) {
        return (NotificationEvent) Enum.valueOf(NotificationEvent.class, str);
    }

    public static NotificationEvent[] values() {
        return (NotificationEvent[]) f254019s.clone();
    }
}
