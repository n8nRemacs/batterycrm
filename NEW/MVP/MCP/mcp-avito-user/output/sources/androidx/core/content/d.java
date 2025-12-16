package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.RestrictTo;
import androidx.core.app.E;
import androidx.core.os.C22779g;
import androidx.core.os.C22782j;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.W;
import j.X;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* compiled from: ContextCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class d {
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f44628a = null;

    /* compiled from: ContextCompat.java */
    @X
    public static class a {
    }

    /* compiled from: ContextCompat.java */
    @X
    public static class b {
    }

    /* compiled from: ContextCompat.java */
    @X
    public static class c {
    }

    /* compiled from: ContextCompat.java */
    @X
    /* renamed from: androidx.core.content.d$d, reason: collision with other inner class name */
    public static class C1726d {
    }

    /* compiled from: ContextCompat.java */
    @X
    public static class e {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* compiled from: ContextCompat.java */
    @X
    public static class f {
        @N
        public static Context a(@N Context context, @P String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }

        public static Display c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Objects.toString(context);
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* compiled from: ContextCompat.java */
    @X
    public static class g {
    }

    /* compiled from: ContextCompat.java */
    public static final class h {
        static {
            HashMap map = new HashMap();
            map.put(SubscriptionManager.class, "telephony_subscription_service");
            map.put(UsageStatsManager.class, "usagestats");
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, "camera");
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, "bluetooth");
            map.put(DisplayManager.class, "display");
            map.put(UserManager.class, ChannelContext.UserToUser.TYPE);
            map.put(InputManager.class, "input");
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, "activity");
            map.put(AlarmManager.class, "alarm");
            map.put(AudioManager.class, MediaStreamTrack.AUDIO_TRACK_KIND);
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, "download");
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, "location");
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, NotificationsSettings.Section.SECTION_PAID_SERVICES);
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, SingleLineInputModel.STYLE_SEARCH);
            map.put(SensorManager.class, "sensor");
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, "phone");
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, "wifi");
            map.put(WindowManager.class, "window");
        }
    }

    /* compiled from: ContextCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface i {
    }

    public static int checkSelfPermission(@N Context context, @N String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new E(context).f44481b.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    @N
    public static Context createAttributionContext(@N Context context, @P String str) {
        return Build.VERSION.SDK_INT >= 30 ? f.a(context, str) : context;
    }

    @P
    public static Context createDeviceProtectedStorageContext(@N Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    @P
    public static String getAttributionTag(@N Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.b(context);
        }
        return null;
    }

    @N
    public static File getCodeCacheDir(@N Context context) {
        return context.getCodeCacheDir();
    }

    @InterfaceC42156l
    public static int getColor(@N Context context, @InterfaceC42158n int i12) {
        return context.getColor(i12);
    }

    @P
    public static ColorStateList getColorStateList(@N Context context, @InterfaceC42158n int i12) {
        return androidx.core.content.res.i.a(context.getResources(), i12, context.getTheme());
    }

    @N
    public static Context getContextForLanguage(@N Context context) {
        androidx.core.os.q qVarA = androidx.core.app.t.a(context);
        if (Build.VERSION.SDK_INT > 32 || qVarA.c()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        C22779g.b(configuration, qVarA);
        return context.createConfigurationContext(configuration);
    }

    @P
    public static File getDataDir(@N Context context) {
        return context.getDataDir();
    }

    @N
    public static Display getDisplayOrDefault(@N Context context) {
        return Build.VERSION.SDK_INT >= 30 ? f.c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @P
    public static Drawable getDrawable(@N Context context, @InterfaceC42165v int i12) {
        return context.getDrawable(i12);
    }

    @N
    @W
    @Deprecated
    public static File[] getExternalCacheDirs(@N Context context) {
        return context.getExternalCacheDirs();
    }

    @N
    @W
    @Deprecated
    public static File[] getExternalFilesDirs(@N Context context, @P String str) {
        return context.getExternalFilesDirs(str);
    }

    @N
    public static Executor getMainExecutor(@N Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.a(context) : C22782j.a(new Handler(context.getMainLooper()));
    }

    @P
    public static File getNoBackupFilesDir(@N Context context) {
        return context.getNoBackupFilesDir();
    }

    @N
    @W
    @Deprecated
    public static File[] getObbDirs(@N Context context) {
        return context.getObbDirs();
    }

    @N
    public static String getString(@N Context context, int i12) {
        return getContextForLanguage(context).getString(i12);
    }

    @P
    public static <T> T getSystemService(@N Context context, @N Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    @P
    public static String getSystemServiceName(@N Context context, @N Class<?> cls) {
        return context.getSystemServiceName(cls);
    }

    public static boolean isDeviceProtectedStorage(@N Context context) {
        return context.isDeviceProtectedStorage();
    }

    @P
    public static Intent registerReceiver(@N Context context, @P BroadcastReceiver broadcastReceiver, @N IntentFilter intentFilter, int i12) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i12);
    }

    public static boolean startActivities(@N Context context, @N Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @W
    @Deprecated
    public static void startActivity(@N Context context, @N Intent intent, @P Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(@N Context context, @N Intent intent) {
        context.startForegroundService(intent);
    }

    @P
    public static Intent registerReceiver(@N Context context, @P BroadcastReceiver broadcastReceiver, @N IntentFilter intentFilter, @P String str, @P Handler handler, int i12) {
        int i13 = i12 & 1;
        if (i13 != 0 && (i12 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i13 != 0) {
            i12 |= 2;
        }
        int i14 = i12;
        int i15 = i14 & 2;
        if (i15 == 0 && (i14 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i15 != 0 && (i14 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i14);
        }
        if ((i14 & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i14 & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (m.a(context, str2) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException(AK.c.k("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static boolean startActivities(@N Context context, @N Intent[] intentArr, @P Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
