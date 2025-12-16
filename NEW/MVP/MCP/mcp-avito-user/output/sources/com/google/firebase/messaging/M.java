package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import j.k0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: TopicsSyncTask.java */
/* loaded from: classes6.dex */
class M implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f361803g = new Object();

    /* renamed from: h, reason: collision with root package name */
    @j.B
    public static Boolean f361804h;

    /* renamed from: i, reason: collision with root package name */
    @j.B
    public static Boolean f361805i;

    /* renamed from: b, reason: collision with root package name */
    public final Context f361806b;

    /* renamed from: c, reason: collision with root package name */
    public final u f361807c;

    /* renamed from: d, reason: collision with root package name */
    public final PowerManager.WakeLock f361808d;

    /* renamed from: e, reason: collision with root package name */
    public final L f361809e;

    /* renamed from: f, reason: collision with root package name */
    public final long f361810f;

    /* compiled from: TopicsSyncTask.java */
    @k0
    public class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        @j.B
        @j.P
        public M f361811a;

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            M m12 = this.f361811a;
            if (m12 == null) {
                return;
            }
            if (m12.c()) {
                Log.isLoggable("FirebaseMessaging", 3);
                M m13 = this.f361811a;
                m13.f361809e.f361800f.schedule(m13, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f361811a = null;
            }
        }
    }

    public M(L l12, Context context, u uVar, long j12) {
        this.f361809e = l12;
        this.f361806b = context;
        this.f361810f = j12;
        this.f361807c = uVar;
        this.f361808d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f361803g) {
            try {
                Boolean bool = f361805i;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                f361805i = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (f361803g) {
            try {
                Boolean bool = f361804h;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                f361804h = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean c() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f361806b     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.M.c():boolean");
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        L l12 = this.f361809e;
        Context context = this.f361806b;
        boolean zB2 = b(context);
        PowerManager.WakeLock wakeLock = this.f361808d;
        if (zB2) {
            wakeLock.acquire(C37611e.f361853a);
        }
        try {
            try {
                l12.d(true);
            } catch (Throwable th2) {
                if (b(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException e12) {
            e12.getMessage();
            l12.d(false);
            if (!b(context)) {
                return;
            }
        }
        if (!this.f361807c.c()) {
            l12.d(false);
            if (b(context)) {
                try {
                    wakeLock.release();
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            }
            return;
        }
        if (!a(context) || c()) {
            if (l12.e()) {
                l12.d(false);
            } else {
                l12.f(this.f361810f);
            }
            if (!b(context)) {
                return;
            }
            try {
                wakeLock.release();
                return;
            } catch (RuntimeException unused3) {
                return;
            }
        }
        a aVar = new a();
        aVar.f361811a = this;
        Log.isLoggable("FirebaseMessaging", 3);
        context.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        if (b(context)) {
            try {
                wakeLock.release();
            } catch (RuntimeException unused4) {
            }
        }
    }
}
