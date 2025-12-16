package com.avito.android.notification;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.os.Build;
import androidx.core.app.E;
import kotlin.Metadata;

/* compiled from: NotificationManagerExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-app_core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l {
    public static final boolean a(@Y61.k E e12, @Y61.k String str) {
        NotificationChannel notificationChannel;
        String group;
        NotificationChannelGroup notificationChannelGroupC;
        NotificationManager notificationManager = e12.f44481b;
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(str);
        if (notificationChannel2 == null) {
            return true;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            if (notificationChannel2.getImportance() != 0 && ((notificationChannel = notificationManager.getNotificationChannel(str)) == null || i12 < 28 || (group = notificationChannel.getGroup()) == null || (notificationChannelGroupC = e12.c(group)) == null || !notificationChannelGroupC.isBlocked())) {
                return true;
            }
        } else if (notificationChannel2.getImportance() != 0) {
            return true;
        }
        return false;
    }
}
