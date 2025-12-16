package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.b;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class tv6 extends uv6 {
    public static final Object c = new Object();
    public static final tv6 d = new tv6();

    public static AlertDialog e(Activity activity, int i, jbi jbiVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(abi.c(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = abi.b(activity, i);
        if (strB != null) {
            builder.setPositiveButton(strB, jbiVar);
        }
        String strD = abi.d(activity, i);
        if (strD != null) {
            builder.setTitle(strD);
        }
        Log.w("GoogleApiAvailability", ho7.f(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof b) {
                ti6 ti6VarZ = ((b) activity).z();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                s5j.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                supportErrorDialogFragment.y1 = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.z1 = onCancelListener;
                }
                supportErrorDialogFragment.x0(ti6VarZ, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        bh5 bh5Var = new bh5();
        s5j.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bh5Var.a = alertDialog;
        if (onCancelListener != null) {
            bh5Var.b = onCancelListener;
        }
        bh5Var.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i, new jbi(super.b(googleApiActivity, "d", i), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i2;
        Log.w("GoogleApiAvailability", wy1.e(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new mbi(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strF = i == 6 ? abi.f(context, "common_google_play_services_resolution_required_title") : abi.d(context, i);
        if (strF == null) {
            strF = context.getResources().getString(g5d.common_google_play_services_notification_ticker);
        }
        String strE = (i == 6 || i == 19) ? abi.e(context, "common_google_play_services_resolution_required_text", abi.a(context)) : abi.c(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        s5j.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        nla nlaVar = new nla(context, null);
        nlaVar.u = true;
        nlaVar.f(16, true);
        nlaVar.e = nla.c(strF);
        lla llaVar = new lla(0);
        llaVar.f = nla.c(strE);
        nlaVar.i(llaVar);
        PackageManager packageManager = context.getPackageManager();
        if (d9j.a == null) {
            d9j.a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (d9j.a.booleanValue()) {
            nlaVar.F.icon = context.getApplicationInfo().icon;
            nlaVar.k = 2;
            if (d9j.b(context)) {
                nlaVar.b.add(new zka(kxc.common_full_open_on_phone, resources.getString(g5d.common_open_on_phone), pendingIntent));
            } else {
                nlaVar.g = pendingIntent;
            }
        } else {
            nlaVar.F.icon = R.drawable.stat_sys_warning;
            nlaVar.F.tickerText = nla.c(resources.getString(g5d.common_google_play_services_notification_ticker));
            nlaVar.F.when = System.currentTimeMillis();
            nlaVar.g = pendingIntent;
            nlaVar.d(strE);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(g5d.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        nlaVar.z = "com.google.android.gms.availability";
        Notification notificationA = nlaVar.a();
        if (i == 1 || i == 2 || i == 3) {
            lw6.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }

    public final void h(Activity activity, c48 c48Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i, new jbi(super.b(activity, "d", i), c48Var, 1), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
