package com.avito.android.notifications_permission_messenger.ab_test.config;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationPermissionMessengerDialogTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/ab_test/config/NotificationPermissionMessengerTestGroup;", "", "Lu3/j;", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationPermissionMessengerTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final NotificationPermissionMessengerTestGroup f207902c;

    /* renamed from: d, reason: collision with root package name */
    public static final NotificationPermissionMessengerTestGroup f207903d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ NotificationPermissionMessengerTestGroup[] f207904e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f207905f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f207906b;

    static {
        NotificationPermissionMessengerTestGroup notificationPermissionMessengerTestGroup = new NotificationPermissionMessengerTestGroup("CONTROL", 0, "control");
        f207902c = notificationPermissionMessengerTestGroup;
        NotificationPermissionMessengerTestGroup notificationPermissionMessengerTestGroup2 = new NotificationPermissionMessengerTestGroup("TEST", 1, "test");
        f207903d = notificationPermissionMessengerTestGroup2;
        NotificationPermissionMessengerTestGroup[] notificationPermissionMessengerTestGroupArr = {notificationPermissionMessengerTestGroup, notificationPermissionMessengerTestGroup2};
        f207904e = notificationPermissionMessengerTestGroupArr;
        f207905f = c.a(notificationPermissionMessengerTestGroupArr);
    }

    public NotificationPermissionMessengerTestGroup(String str, int i12, String str2) {
        this.f207906b = str2;
    }

    public static NotificationPermissionMessengerTestGroup valueOf(String str) {
        return (NotificationPermissionMessengerTestGroup) Enum.valueOf(NotificationPermissionMessengerTestGroup.class, str);
    }

    public static NotificationPermissionMessengerTestGroup[] values() {
        return (NotificationPermissionMessengerTestGroup[]) f207904e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF207906b() {
        return this.f207906b;
    }
}
