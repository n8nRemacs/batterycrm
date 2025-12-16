package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: SyncTask.java */
/* loaded from: classes6.dex */
class H implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f361776b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f361777c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f361778d;

    /* renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    @SuppressLint({"ThreadPoolCreation"})
    public final ThreadPoolExecutor f361779e = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.b("firebase-iid-executor"));

    /* compiled from: SyncTask.java */
    @VisibleForTesting
    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public H f361780a;

        public final void a() {
            Log.isLoggable("FirebaseMessaging", 3);
            this.f361780a.f361778d.f361755d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            H h12 = this.f361780a;
            if (h12 != null && h12.a()) {
                Log.isLoggable("FirebaseMessaging", 3);
                H h13 = this.f361780a;
                h13.f361778d.getClass();
                FirebaseMessaging.b(0L, h13);
                this.f361780a.f361778d.f361755d.unregisterReceiver(this);
                this.f361780a = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public H(FirebaseMessaging firebaseMessaging, long j12) {
        this.f361778d = firebaseMessaging;
        this.f361776b = j12;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f361755d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f361777c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f361778d.f361755d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public final boolean b() throws IOException {
        try {
            if (this.f361778d.a() == null) {
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e12) {
            String message = e12.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e12.getMessage();
                return false;
            }
            if (e12.getMessage() == null) {
                return false;
            }
            throw e12;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        D dA2 = D.a();
        FirebaseMessaging firebaseMessaging = this.f361778d;
        boolean zC2 = dA2.c(firebaseMessaging.f361755d);
        PowerManager.WakeLock wakeLock = this.f361777c;
        if (zC2) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f361763l = true;
                }
            } catch (IOException e12) {
                e12.getMessage();
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f361763l = false;
                    if (!D.a().c(firebaseMessaging.f361755d)) {
                        return;
                    }
                }
            }
            if (!firebaseMessaging.f361762k.c()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f361763l = false;
                }
                if (D.a().c(firebaseMessaging.f361755d)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (D.a().b(firebaseMessaging.f361755d) && !a()) {
                a aVar = new a();
                aVar.f361780a = this;
                aVar.a();
                if (D.a().c(firebaseMessaging.f361755d)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (b()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f361763l = false;
                }
            } else {
                firebaseMessaging.g(this.f361776b);
            }
            if (!D.a().c(firebaseMessaging.f361755d)) {
                return;
            }
            wakeLock.release();
        } catch (Throwable th2) {
            if (D.a().c(firebaseMessaging.f361755d)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
