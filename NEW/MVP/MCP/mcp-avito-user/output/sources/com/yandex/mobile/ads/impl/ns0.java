package com.yandex.mobile.ads.impl;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class ns0 extends BroadcastReceiver {

    /* renamed from: d, reason: collision with root package name */
    private static volatile ns0 f388360d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f388361e = new Object();

    /* renamed from: c, reason: collision with root package name */
    private WeakHashMap<a, Object> f388364c = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private int f388363b = 3;

    /* renamed from: a, reason: collision with root package name */
    private boolean f388362a = false;

    public interface a {
        void a(@j.N Intent intent);
    }

    private ns0() {
    }

    public static ns0 a() {
        if (f388360d == null) {
            synchronized (f388361e) {
                try {
                    if (f388360d == null) {
                        f388360d = new ns0();
                    }
                } finally {
                }
            }
        }
        return f388360d;
    }

    public final synchronized void b(Context context, a aVar) {
        if (context != null) {
            this.f388364c.remove(aVar);
            try {
                if (this.f388362a && this.f388364c.isEmpty()) {
                    context.getApplicationContext().unregisterReceiver(this);
                    this.f388362a = false;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                intent.getAction();
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    this.f388363b = 2;
                } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                    this.f388363b = 3;
                } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                    this.f388363b = 1;
                }
                synchronized (this) {
                    Iterator<a> it = this.f388364c.keySet().iterator();
                    while (it.hasNext()) {
                        it.next().a(intent);
                    }
                }
            } finally {
            }
        }
    }

    public final synchronized boolean b(Context context) {
        boolean zIsInteractive;
        synchronized (this) {
            zIsInteractive = ((PowerManager) context.getSystemService("power")).isInteractive();
        }
        v11 v11VarA = q21.b().a(context);
        if (v11VarA == null || !v11VarA.S()) {
            return zIsInteractive && !a(context);
        }
        return zIsInteractive;
    }

    public final synchronized void a(Context context, a aVar) {
        if (context != null) {
            try {
                this.f388364c.put(aVar, null);
                if (!this.f388362a) {
                    Context applicationContext = context.getApplicationContext();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                    applicationContext.registerReceiver(this, intentFilter);
                    this.f388362a = true;
                }
            } catch (Exception unused) {
                b(context, aVar);
            }
        }
    }

    private synchronized boolean a(Context context) {
        boolean zIsKeyguardLocked;
        try {
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (keyguardManager != null) {
                zIsKeyguardLocked = keyguardManager.isKeyguardLocked();
            } else {
                zIsKeyguardLocked = this.f388363b == 2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zIsKeyguardLocked;
    }
}
