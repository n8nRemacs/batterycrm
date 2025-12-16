package com.avito.android.remote.notification.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationGrafanaTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/analytics/NotificationImageLoadEvent;", "", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationImageLoadEvent {

    /* renamed from: c, reason: collision with root package name */
    public static final NotificationImageLoadEvent f254022c;

    /* renamed from: d, reason: collision with root package name */
    public static final NotificationImageLoadEvent f254023d;

    /* renamed from: e, reason: collision with root package name */
    public static final NotificationImageLoadEvent f254024e;

    /* renamed from: f, reason: collision with root package name */
    public static final NotificationImageLoadEvent f254025f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ NotificationImageLoadEvent[] f254026g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f254027h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254028b;

    static {
        NotificationImageLoadEvent notificationImageLoadEvent = new NotificationImageLoadEvent("CALLED", 0, "called");
        f254022c = notificationImageLoadEvent;
        NotificationImageLoadEvent notificationImageLoadEvent2 = new NotificationImageLoadEvent("ERROR", 1, "error");
        f254023d = notificationImageLoadEvent2;
        NotificationImageLoadEvent notificationImageLoadEvent3 = new NotificationImageLoadEvent("ERROR_IMAGE_LOADING", 2, "error_image_loading");
        NotificationImageLoadEvent notificationImageLoadEvent4 = new NotificationImageLoadEvent("STATE_OK", 3, "state.ok");
        f254024e = notificationImageLoadEvent4;
        NotificationImageLoadEvent notificationImageLoadEvent5 = new NotificationImageLoadEvent("STATE_ERROR", 4, "state.error");
        f254025f = notificationImageLoadEvent5;
        NotificationImageLoadEvent[] notificationImageLoadEventArr = {notificationImageLoadEvent, notificationImageLoadEvent2, notificationImageLoadEvent3, notificationImageLoadEvent4, notificationImageLoadEvent5, new NotificationImageLoadEvent("ERROR_NO_IMAGE", 5, "image_loading_worker.no_image"), new NotificationImageLoadEvent("ERROR_NO_NOTIFICATION_PARAMETERS", 6, "image_loading_worker.no_notification_parameters"), new NotificationImageLoadEvent("ERROR_NO_PUSH_IN_STORAGE", 7, "image_loading_worker.no_push_in_storage")};
        f254026g = notificationImageLoadEventArr;
        f254027h = c.a(notificationImageLoadEventArr);
    }

    public NotificationImageLoadEvent(String str, int i12, String str2) {
        this.f254028b = str2;
    }

    public static NotificationImageLoadEvent valueOf(String str) {
        return (NotificationImageLoadEvent) Enum.valueOf(NotificationImageLoadEvent.class, str);
    }

    public static NotificationImageLoadEvent[] values() {
        return (NotificationImageLoadEvent[]) f254026g.clone();
    }
}
