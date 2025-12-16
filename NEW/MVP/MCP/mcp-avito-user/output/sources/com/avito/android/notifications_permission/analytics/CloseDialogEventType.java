package com.avito.android.notifications_permission.analytics;

import Y61.k;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationPermissionInfoDialogClosedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_permission/analytics/CloseDialogEventType;", "", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CloseDialogEventType {

    /* renamed from: c, reason: collision with root package name */
    public static final CloseDialogEventType f207825c;

    /* renamed from: d, reason: collision with root package name */
    public static final CloseDialogEventType f207826d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CloseDialogEventType[] f207827e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f207828f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f207829b;

    static {
        CloseDialogEventType closeDialogEventType = new CloseDialogEventType("ACCEPT", 0, "turn_on");
        f207825c = closeDialogEventType;
        CloseDialogEventType closeDialogEventType2 = new CloseDialogEventType("CLOSE", 1, "x");
        f207826d = closeDialogEventType2;
        CloseDialogEventType[] closeDialogEventTypeArr = {closeDialogEventType, closeDialogEventType2};
        f207827e = closeDialogEventTypeArr;
        f207828f = kotlin.enums.c.a(closeDialogEventTypeArr);
    }

    public CloseDialogEventType(String str, int i12, String str2) {
        this.f207829b = str2;
    }

    public static CloseDialogEventType valueOf(String str) {
        return (CloseDialogEventType) Enum.valueOf(CloseDialogEventType.class, str);
    }

    public static CloseDialogEventType[] values() {
        return (CloseDialogEventType[]) f207827e.clone();
    }
}
