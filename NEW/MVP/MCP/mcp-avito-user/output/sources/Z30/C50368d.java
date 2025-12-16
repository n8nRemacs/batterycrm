package z30;

import Y61.k;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.core.app.E;
import com.avito.android.R;
import com.avito.android.notification.p;
import com.avito.android.notification.s;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SetupNotificationChannelsTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz30/d;", "Lcom/avito/android/notification/p;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z30.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C50368d implements p {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f443824a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final s f443825b;

    @Inject
    public C50368d(@k Application application, @k s sVar) {
        this.f443824a = application;
        this.f443825b = sVar;
    }

    @Override // com.avito.android.notification.p
    public final void a(@k E e12) {
        Application application = this.f443824a;
        String string = application.getString(R.string.notification_channel_messenger_id);
        NotificationManager notificationManager = e12.f44481b;
        if (notificationManager.getNotificationChannel(string) != null) {
            notificationManager.deleteNotificationChannel(application.getString(R.string.notification_channel_messenger_id));
        }
        NotificationChannel notificationChannel = new NotificationChannel(application.getString(R.string.notification_channel_messenger_id_2), application.getString(R.string.notification_channel_messenger_name), 4);
        notificationChannel.enableVibration(true);
        e12.b(notificationChannel);
        String string2 = application.getString(R.string.notification_channel_messenger_id);
        s sVar = this.f443825b;
        sVar.b(string2, "android_avito_system_settings_notifications_channel_messenger");
        e12.b(new NotificationChannel(application.getString(R.string.notification_channel_id_default), application.getString(R.string.notification_channel_name_default), 3));
        sVar.b(application.getString(R.string.notification_channel_id_default), "android_avito_system_settings_notifications_channel_default");
        e12.b(new NotificationChannel(application.getString(R.string.notification_channel_id_service), application.getString(R.string.notification_channel_name_service), 2));
        sVar.b(application.getString(R.string.notification_channel_id_service), "android_avito_system_settings_notifications_channel_service");
    }
}
