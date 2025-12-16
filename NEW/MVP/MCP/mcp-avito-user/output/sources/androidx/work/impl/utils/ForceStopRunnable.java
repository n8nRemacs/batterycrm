package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.core.util.InterfaceC22791e;
import androidx.work.C23538b;
import androidx.work.impl.Y;
import java.util.concurrent.TimeUnit;

@RestrictTo
/* loaded from: classes10.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final long f55938f;

    /* renamed from: b, reason: collision with root package name */
    public final Context f55939b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f55940c;

    /* renamed from: d, reason: collision with root package name */
    public final C23610u f55941d;

    /* renamed from: e, reason: collision with root package name */
    public int f55942e = 0;

    @RestrictTo
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            androidx.work.G.b("ForceStopRunnable$Rcvr");
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@j.N Context context, @j.P Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            androidx.work.G.a().getClass();
            ForceStopRunnable.b(context);
        }
    }

    static {
        androidx.work.G.b("ForceStopRunnable");
        f55938f = TimeUnit.DAYS.toMillis(3650L);
    }

    public ForceStopRunnable(@j.N Context context, @j.N Y y12) {
        this.f55939b = context.getApplicationContext();
        this.f55940c = y12;
        this.f55941d = y12.f55563h;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i12 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i12);
        long jCurrentTimeMillis = System.currentTimeMillis() + f55938f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab  */
    @j.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA2;
        Y y12 = this.f55940c;
        try {
            C23538b c23538b = y12.f55558c;
            boolean zIsEmpty = TextUtils.isEmpty(c23538b.f55456j);
            Context context = this.f55939b;
            if (zIsEmpty) {
                androidx.work.G.a().getClass();
                zA2 = true;
            } else {
                zA2 = v.a(context, c23538b);
                androidx.work.G.a().getClass();
            }
            if (zA2) {
                while (true) {
                    try {
                        androidx.work.impl.J.a(context);
                        androidx.work.G.a().getClass();
                        try {
                            a();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e12) {
                            int i12 = this.f55942e + 1;
                            this.f55942e = i12;
                            if (i12 >= 3) {
                                String str = androidx.core.os.N.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                androidx.work.G.a().getClass();
                                IllegalStateException illegalStateException = new IllegalStateException(str, e12);
                                InterfaceC22791e<Throwable> interfaceC22791e = y12.f55558c.f55454h;
                                if (interfaceC22791e == null) {
                                    throw illegalStateException;
                                }
                                androidx.work.G.a().getClass();
                                interfaceC22791e.accept(illegalStateException);
                            } else {
                                androidx.work.G.a().getClass();
                                try {
                                    Thread.sleep(this.f55942e * 300);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    } catch (SQLiteException e13) {
                        androidx.work.G.a().getClass();
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e13);
                        InterfaceC22791e<Throwable> interfaceC22791e2 = y12.f55558c.f55454h;
                        if (interfaceC22791e2 == null) {
                            throw illegalStateException2;
                        }
                        interfaceC22791e2.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            y12.h();
        }
    }
}
