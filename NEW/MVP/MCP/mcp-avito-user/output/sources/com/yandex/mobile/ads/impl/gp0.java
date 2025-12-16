package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class gp0 {

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private static gp0 f385797e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f385798a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<b>> f385799b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Object f385800c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @j.B
    private int f385801d = 0;

    @j.X
    public static final class a {

        /* renamed from: com.yandex.mobile.ads.impl.gp0$a$a, reason: collision with other inner class name */
        public static final class C10977a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            private final gp0 f385802a;

            public C10977a(gp0 gp0Var) {
                this.f385802a = gp0Var;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                gp0.a(this.f385802a, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, gp0 gp0Var) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                C10977a c10977a = new C10977a(gp0Var);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), c10977a);
                telephonyManager.unregisterTelephonyCallback(c10977a);
            } catch (RuntimeException unused) {
                gp0.a(gp0Var, 5);
            }
        }
    }

    public interface b {
        void a(int i12);
    }

    public final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int iA2 = gp0.a(context);
            if (pc1.f388768a < 31 || iA2 != 5) {
                gp0.a(gp0.this, iA2);
            } else {
                a.a(context, gp0.this);
            }
        }

        public /* synthetic */ c(gp0 gp0Var, int i12) {
            this();
        }
    }

    private gp0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c(this, 0), intentFilter);
    }

    public static synchronized gp0 b(Context context) {
        try {
            if (f385797e == null) {
                f385797e = new gp0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f385797e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        bVar.a(a());
    }

    public final int a() {
        int i12;
        synchronized (this.f385800c) {
            i12 = this.f385801d;
        }
        return i12;
    }

    public final void b(b bVar) {
        Iterator<WeakReference<b>> it = this.f385799b.iterator();
        while (it.hasNext()) {
            WeakReference<b> next = it.next();
            if (next.get() == null) {
                this.f385799b.remove(next);
            }
        }
        this.f385799b.add(new WeakReference<>(bVar));
        this.f385798a.post(new H(14, this, bVar));
    }

    public static void a(gp0 gp0Var, int i12) {
        synchronized (gp0Var.f385800c) {
            try {
                if (gp0Var.f385801d == i12) {
                    return;
                }
                gp0Var.f385801d = i12;
                Iterator<WeakReference<b>> it = gp0Var.f385799b.iterator();
                while (it.hasNext()) {
                    WeakReference<b> next = it.next();
                    b bVar = next.get();
                    if (bVar != null) {
                        bVar.a(i12);
                    } else {
                        gp0Var.f385799b.remove(next);
                    }
                }
            } finally {
            }
        }
    }

    public static int a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type == 9) {
                                return 7;
                            }
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    return 8;
                                }
                            }
                            return 5;
                        }
                        return 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            return 3;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            return 4;
                        case 13:
                            return 5;
                        case 16:
                        case 19:
                        default:
                            return 6;
                        case 18:
                            return 2;
                        case 20:
                            if (pc1.f388768a >= 29) {
                                return 9;
                            }
                            break;
                    }
                } else {
                    return 1;
                }
            } catch (SecurityException unused) {
            }
        }
        return 0;
    }
}
