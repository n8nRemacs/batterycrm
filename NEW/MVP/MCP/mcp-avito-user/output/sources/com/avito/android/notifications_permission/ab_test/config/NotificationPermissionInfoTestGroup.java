package com.avito.android.notifications_permission.ab_test.config;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationPermissionDialogTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_permission/ab_test/config/NotificationPermissionInfoTestGroup;", "", "Lu3/j;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationPermissionInfoTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final NotificationPermissionInfoTestGroup f207820c;

    /* renamed from: d, reason: collision with root package name */
    public static final NotificationPermissionInfoTestGroup f207821d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ NotificationPermissionInfoTestGroup[] f207822e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f207823f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f207824b;

    static {
        NotificationPermissionInfoTestGroup notificationPermissionInfoTestGroup = new NotificationPermissionInfoTestGroup("CONTROL", 0, "control");
        f207820c = notificationPermissionInfoTestGroup;
        NotificationPermissionInfoTestGroup notificationPermissionInfoTestGroup2 = new NotificationPermissionInfoTestGroup("DIALOG", 1, "dialog");
        f207821d = notificationPermissionInfoTestGroup2;
        NotificationPermissionInfoTestGroup[] notificationPermissionInfoTestGroupArr = {notificationPermissionInfoTestGroup, notificationPermissionInfoTestGroup2};
        f207822e = notificationPermissionInfoTestGroupArr;
        f207823f = c.a(notificationPermissionInfoTestGroupArr);
    }

    public NotificationPermissionInfoTestGroup(String str, int i12, String str2) {
        this.f207824b = str2;
    }

    public static NotificationPermissionInfoTestGroup valueOf(String str) {
        return (NotificationPermissionInfoTestGroup) Enum.valueOf(NotificationPermissionInfoTestGroup.class, str);
    }

    public static NotificationPermissionInfoTestGroup[] values() {
        return (NotificationPermissionInfoTestGroup[]) f207822e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF207824b() {
        return this.f207824b;
    }
}
