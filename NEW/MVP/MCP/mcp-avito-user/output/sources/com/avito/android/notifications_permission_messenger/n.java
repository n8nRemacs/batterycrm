package com.avito.android.notifications_permission_messenger;

import android.content.Context;
import com.avito.android.component.toast.c;
import com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink;
import kotlin.Metadata;

/* compiled from: NotificationPermissionMessengerDialogViewFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/n;", "", "_avito_notifications-permission-messenger-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface n {
    @Y61.k
    c.a.b a();

    @Y61.k
    com.avito.android.lib.design.modal.a b(@Y61.k Context context, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2);

    @Y61.k
    NotificationPermissionMessengerDialogFragment c(@Y61.k NotificationPermissionMessengerDialogDeeplink notificationPermissionMessengerDialogDeeplink, @Y61.k String str);
}
