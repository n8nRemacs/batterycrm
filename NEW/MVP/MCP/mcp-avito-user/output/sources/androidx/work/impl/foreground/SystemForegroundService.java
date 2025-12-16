package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.view.ServiceC22988V;
import androidx.work.G;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import j.K;
import j.N;
import j.P;
import j.X;
import j.a0;

@RestrictTo
/* loaded from: classes10.dex */
public class SystemForegroundService extends ServiceC22988V implements SystemForegroundDispatcher.Callback {
    private static final String TAG = G.b("SystemFgService");

    @P
    private static SystemForegroundService sForegroundService = null;
    SystemForegroundDispatcher mDispatcher;
    private boolean mIsShutdown;
    NotificationManager mNotificationManager;

    @X
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void startForeground(Service service, int i12, Notification notification, int i13) {
            service.startForeground(i12, notification, i13);
        }
    }

    @X
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static void startForeground(Service service, int i12, Notification notification, int i13) {
            try {
                service.startForeground(i12, notification, i13);
            } catch (ForegroundServiceStartNotAllowedException unused) {
                G gA2 = G.a();
                String unused2 = SystemForegroundService.TAG;
                gA2.getClass();
            } catch (SecurityException unused3) {
                G gA3 = G.a();
                String unused4 = SystemForegroundService.TAG;
                gA3.getClass();
            }
        }
    }

    @P
    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    @K
    private void initializeDispatcher() {
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService(NotificationsSettings.Section.SECTION_PAID_SERVICES);
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.mDispatcher = systemForegroundDispatcher;
        systemForegroundDispatcher.setCallback(this);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @K
    public void cancelNotification(int i12) {
        this.mNotificationManager.cancel(i12);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @K
    @a0
    public void notify(int i12, @N Notification notification) {
        this.mNotificationManager.notify(i12, notification);
    }

    @Override // androidx.view.ServiceC22988V, android.app.Service
    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    @Override // androidx.view.ServiceC22988V, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.onDestroy();
    }

    @Override // androidx.view.ServiceC22988V, android.app.Service
    public int onStartCommand(@P Intent intent, int i12, int i13) {
        super.onStartCommand(intent, i12, i13);
        if (this.mIsShutdown) {
            G.a().getClass();
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.onStartCommand(intent);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i12) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.mDispatcher.onTimeout(i12, 2048);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @K
    public void startForeground(int i12, int i13, @N Notification notification) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 31) {
            Api31Impl.startForeground(this, i12, notification, i13);
        } else if (i14 >= 29) {
            Api29Impl.startForeground(this, i12, notification, i13);
        } else {
            startForeground(i12, notification);
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @K
    public void stop() {
        this.mIsShutdown = true;
        G.a().getClass();
        stopForeground(true);
        sForegroundService = null;
        stopSelf();
    }

    public void onTimeout(int i12, int i13) {
        this.mDispatcher.onTimeout(i12, i13);
    }
}
