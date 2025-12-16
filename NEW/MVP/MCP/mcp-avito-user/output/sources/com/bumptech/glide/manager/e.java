package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.manager.c;
import j.N;

/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes5.dex */
final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    public final Context f339495b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f339496c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f339497d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f339498e;

    /* renamed from: f, reason: collision with root package name */
    public final BroadcastReceiver f339499f = new a();

    /* compiled from: DefaultConnectivityMonitor.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@N Context context, Intent intent) {
            e eVar = e.this;
            boolean z12 = eVar.f339497d;
            boolean zD2 = e.d(context);
            eVar.f339497d = zD2;
            if (z12 != zD2) {
                Log.isLoggable("ConnectivityMonitor", 3);
                eVar.f339496c.a(eVar.f339497d);
            }
        }
    }

    public e(@N Context context, @N c.a aVar) {
        this.f339495b = context.getApplicationContext();
        this.f339496c = aVar;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean d(@N Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        com.bumptech.glide.util.k.c(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
        if (this.f339498e) {
            return;
        }
        Context context = this.f339495b;
        this.f339497d = d(context);
        try {
            context.registerReceiver(this.f339499f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f339498e = true;
        } catch (SecurityException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStop() {
        if (this.f339498e) {
            this.f339495b.unregisterReceiver(this.f339499f);
            this.f339498e = false;
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
    }
}
