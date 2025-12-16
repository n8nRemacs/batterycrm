package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.yandex.mobile.ads.exo.scheduler.Requirements;

/* loaded from: classes8.dex */
public final class fz0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f385529a;

    /* renamed from: b, reason: collision with root package name */
    private final b f385530b;

    /* renamed from: c, reason: collision with root package name */
    private final Requirements f385531c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f385532d;

    /* renamed from: e, reason: collision with root package name */
    private int f385533e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private c f385534f;

    public class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            fz0.a(fz0.this);
        }

        public /* synthetic */ a(fz0 fz0Var, int i12) {
            this();
        }
    }

    public interface b {
        void a(fz0 fz0Var, int i12);
    }

    @j.X
    public final class c extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        private boolean f385536a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f385537b;

        private c() {
        }

        private void c() {
            fz0.this.f385532d.post(new E0(this, 1));
        }

        private void d() {
            fz0.this.f385532d.post(new E0(this, 0));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z12) {
            if (z12) {
                return;
            }
            d();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f385536a && this.f385537b == zHasCapability) {
                if (zHasCapability) {
                    d();
                }
            } else {
                this.f385536a = true;
                this.f385537b = zHasCapability;
                c();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            c();
        }

        public /* synthetic */ c(fz0 fz0Var, int i12) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (fz0.this.f385534f != null) {
                fz0.a(fz0.this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            if (fz0.this.f385534f != null) {
                fz0.d(fz0.this);
            }
        }
    }

    public fz0(Context context, b bVar) {
        Requirements requirements = com.yandex.mobile.ads.exo.offline.c.f383102j;
        this.f385529a = context.getApplicationContext();
        this.f385530b = bVar;
        this.f385531c = requirements;
        this.f385532d = pc1.b();
    }

    public static void d(fz0 fz0Var) {
        int iA2;
        if ((fz0Var.f385533e & 3) == 0 || fz0Var.f385533e == (iA2 = fz0Var.f385531c.a(fz0Var.f385529a))) {
            return;
        }
        fz0Var.f385533e = iA2;
        fz0Var.f385530b.a(fz0Var, iA2);
    }

    public final int a() {
        this.f385533e = this.f385531c.a(this.f385529a);
        IntentFilter intentFilter = new IntentFilter();
        int i12 = 0;
        if (this.f385531c.e()) {
            if (pc1.f388768a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f385529a.getSystemService("connectivity");
                connectivityManager.getClass();
                c cVar = new c(this, i12);
                this.f385534f = cVar;
                connectivityManager.registerDefaultNetworkCallback(cVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f385531c.c()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f385531c.d()) {
            if (pc1.f388768a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.f385531c.f()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f385529a.registerReceiver(new a(this, i12), intentFilter, null, this.f385532d);
        return this.f385533e;
    }

    public static void a(fz0 fz0Var) {
        int iA2 = fz0Var.f385531c.a(fz0Var.f385529a);
        if (fz0Var.f385533e != iA2) {
            fz0Var.f385533e = iA2;
            fz0Var.f385530b.a(fz0Var, iA2);
        }
    }
}
