package com.google.android.gms.common;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.app.z;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C0;
import com.google.android.gms.common.api.internal.D0;
import com.google.android.gms.common.api.internal.InterfaceC36656m;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: com.google.android.gms.common.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36687f extends C36688g {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f349286d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final C36687f f349287e = new C36687f();

    /* renamed from: c, reason: collision with root package name */
    public static final int f349285c = C36688g.f349288a;

    @j.P
    public static AlertDialog f(@j.N Activity activity, int i12, @j.P com.google.android.gms.common.internal.P p12, @j.P DialogInterface.OnCancelListener onCancelListener) {
        if (i12 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(com.google.android.gms.common.internal.L.c(i12, activity));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = com.google.android.gms.common.internal.L.b(i12, activity);
        if (strB != null) {
            builder.setPositiveButton(strB, p12);
        }
        String strD = com.google.android.gms.common.internal.L.d(i12, activity);
        if (strD != null) {
            builder.setTitle(strD);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    @ResultIgnorabilityUnspecified
    @j.P
    public static D0 g(Context context, C0 c02) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        D0 d02 = new D0(c02);
        zao.zaa(context, d02, intentFilter);
        d02.f348984a = context;
        if (C36690i.c(context)) {
            return d02;
        }
        c02.a();
        d02.a();
        return null;
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, @j.P DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC22955m) {
                FragmentManager supportFragmentManager = ((ActivityC22955m) activity).getSupportFragmentManager();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                C36729v.k(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                supportErrorDialogFragment.f348883f0 = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.f348884g0 = onCancelListener;
                }
                supportErrorDialogFragment.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC36684c dialogFragmentC36684c = new DialogFragmentC36684c();
        C36729v.k(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC36684c.f349264b = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC36684c.f349265c = onCancelListener;
        }
        dialogFragmentC36684c.show(fragmentManager, str);
    }

    @ResultIgnorabilityUnspecified
    public final void e(@j.N GoogleApiActivity googleApiActivity, int i12, @j.P GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogF = f(googleApiActivity, i12, com.google.android.gms.common.internal.P.b(super.b(googleApiActivity, i12, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogF == null) {
            return;
        }
        h(googleApiActivity, alertDialogF, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    @TargetApi(20)
    public final void i(Context context, int i12, @j.P PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i13;
        new IllegalArgumentException();
        if (i12 == 18) {
            new HandlerC36754v(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strF = i12 == 6 ? com.google.android.gms.common.internal.L.f(context, "common_google_play_services_resolution_required_title") : com.google.android.gms.common.internal.L.d(i12, context);
        if (strF == null) {
            strF = context.getResources().getString(com.avito.android.R.string.common_google_play_services_notification_ticker);
        }
        String strE = (i12 == 6 || i12 == 19) ? com.google.android.gms.common.internal.L.e(context, "common_google_play_services_resolution_required_text", com.google.android.gms.common.internal.L.a(context)) : com.google.android.gms.common.internal.L.c(i12, context);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService(NotificationsSettings.Section.SECTION_PAID_SERVICES);
        C36729v.j(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        z.n nVar = new z.n(context, null);
        nVar.f44598r = true;
        nVar.g(16, true);
        nVar.f44585e = z.n.c(strF);
        z.l lVar = new z.l();
        lVar.f44576d = z.n.c(strE);
        nVar.j(lVar);
        if (com.google.android.gms.common.util.l.a(context)) {
            nVar.f44578B.icon = context.getApplicationInfo().icon;
            nVar.f44591k = 2;
            if (com.google.android.gms.common.util.l.b(context)) {
                nVar.f44582b.add(new z.b(IconCompat.f("", null, com.avito.android.R.drawable.common_full_open_on_phone), resources.getString(com.avito.android.R.string.common_open_on_phone), pendingIntent));
            } else {
                nVar.f44587g = pendingIntent;
            }
        } else {
            nVar.f44578B.icon = R.drawable.stat_sys_warning;
            nVar.f44578B.tickerText = z.n.c(resources.getString(com.avito.android.R.string.common_google_play_services_notification_ticker));
            nVar.f44578B.when = System.currentTimeMillis();
            nVar.f44587g = pendingIntent;
            nVar.d(strE);
        }
        synchronized (f349286d) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.avito.android.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        nVar.f44603w = "com.google.android.gms.availability";
        Notification notificationB = nVar.b();
        if (i12 == 1 || i12 == 2 || i12 == 3) {
            C36690i.f349291a.set(false);
            i13 = 10436;
        } else {
            i13 = 39789;
        }
        notificationManager.notify(i13, notificationB);
    }

    @ResultIgnorabilityUnspecified
    public final void j(@j.N Activity activity, @j.N InterfaceC36656m interfaceC36656m, int i12, @j.P DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogF = f(activity, i12, com.google.android.gms.common.internal.P.c(super.b(activity, i12, "d"), interfaceC36656m), onCancelListener);
        if (alertDialogF == null) {
            return;
        }
        h(activity, alertDialogF, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
