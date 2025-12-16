package com.avito.android.notifications_permission_messenger;

import com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationPermissionMessengerDialogData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/a;", "", "_avito_notifications-permission-messenger-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final NotificationPermissionMessengerDialogDeeplink f207901a;

    public a(@Y61.l NotificationPermissionMessengerDialogDeeplink notificationPermissionMessengerDialogDeeplink) {
        this.f207901a = notificationPermissionMessengerDialogDeeplink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f207901a, ((a) obj).f207901a);
    }

    public final int hashCode() {
        NotificationPermissionMessengerDialogDeeplink notificationPermissionMessengerDialogDeeplink = this.f207901a;
        if (notificationPermissionMessengerDialogDeeplink == null) {
            return 0;
        }
        return notificationPermissionMessengerDialogDeeplink.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "NotificationPermissionMessengerDialogData(availableDeeplink=" + this.f207901a + ')';
    }
}
