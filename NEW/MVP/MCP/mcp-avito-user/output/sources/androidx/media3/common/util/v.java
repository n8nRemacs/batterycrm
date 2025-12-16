package androidx.media3.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import j.P;
import j.X;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: NetworkTypeObserver.java */
@J
/* loaded from: classes.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    @P
    public static v f47948e;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f47949a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<c>> f47950b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final Object f47951c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @j.B
    public int f47952d = 0;

    /* compiled from: NetworkTypeObserver.java */
    @X
    public static final class b {

        /* compiled from: NetworkTypeObserver.java */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            public final v f47953a;

            public a(v vVar) {
                this.f47953a = vVar;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                v.a(this.f47953a, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }
    }

    /* compiled from: NetworkTypeObserver.java */
    public interface c {
        void a(int i12);
    }

    /* compiled from: NetworkTypeObserver.java */
    public final class d extends BroadcastReceiver {
        public d(a aVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onReceive(android.content.Context r9, android.content.Intent r10) {
            /*
                r8 = this;
                java.lang.String r10 = "connectivity"
                java.lang.Object r10 = r9.getSystemService(r10)
                android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
                r0 = 5
                r1 = 0
                if (r10 != 0) goto Ld
                goto L50
            Ld:
                android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L50
                r2 = 1
                if (r10 == 0) goto L4f
                boolean r3 = r10.isConnected()
                if (r3 != 0) goto L1b
                goto L4f
            L1b:
                int r3 = r10.getType()
                r4 = 2
                r5 = 9
                r6 = 6
                r7 = 4
                if (r3 == 0) goto L39
                if (r3 == r2) goto L37
                if (r3 == r7) goto L39
                if (r3 == r0) goto L39
                if (r3 == r6) goto L35
                if (r3 == r5) goto L33
                r1 = 8
                goto L50
            L33:
                r1 = 7
                goto L50
            L35:
                r1 = r0
                goto L50
            L37:
                r1 = r4
                goto L50
            L39:
                int r10 = r10.getSubtype()
                switch(r10) {
                    case 1: goto L4c;
                    case 2: goto L4c;
                    case 3: goto L4a;
                    case 4: goto L4a;
                    case 5: goto L4a;
                    case 6: goto L4a;
                    case 7: goto L4a;
                    case 8: goto L4a;
                    case 9: goto L4a;
                    case 10: goto L4a;
                    case 11: goto L4a;
                    case 12: goto L4a;
                    case 13: goto L35;
                    case 14: goto L4a;
                    case 15: goto L4a;
                    case 16: goto L40;
                    case 17: goto L4a;
                    case 18: goto L37;
                    case 19: goto L40;
                    case 20: goto L42;
                    default: goto L40;
                }
            L40:
                r1 = r6
                goto L50
            L42:
                int r10 = androidx.media3.common.util.M.f47887a
                r2 = 29
                if (r10 < r2) goto L50
                r1 = r5
                goto L50
            L4a:
                r1 = r7
                goto L50
            L4c:
                r10 = 3
                r1 = r10
                goto L50
            L4f:
                r1 = r2
            L50:
                int r10 = androidx.media3.common.util.M.f47887a
                r2 = 31
                androidx.media3.common.util.v r3 = androidx.media3.common.util.v.this
                if (r10 < r2) goto L79
                if (r1 != r0) goto L79
                java.lang.String r10 = "phone"
                java.lang.Object r10 = r9.getSystemService(r10)     // Catch: java.lang.RuntimeException -> L75
                android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.RuntimeException -> L75
                r10.getClass()     // Catch: java.lang.RuntimeException -> L75
                androidx.media3.common.util.v$b$a r1 = new androidx.media3.common.util.v$b$a     // Catch: java.lang.RuntimeException -> L75
                r1.<init>(r3)     // Catch: java.lang.RuntimeException -> L75
                java.util.concurrent.Executor r9 = androidx.media.p.n(r9)     // Catch: java.lang.RuntimeException -> L75
                androidx.credentials.provider.r.u(r10, r9, r1)     // Catch: java.lang.RuntimeException -> L75
                androidx.credentials.provider.r.t(r10, r1)     // Catch: java.lang.RuntimeException -> L75
                goto L7c
            L75:
                androidx.media3.common.util.v.a(r3, r0)
                goto L7c
            L79:
                androidx.media3.common.util.v.a(r3, r1)
            L7c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.v.d.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    public v(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(null), intentFilter);
    }

    public static void a(v vVar, int i12) {
        synchronized (vVar.f47951c) {
            try {
                if (vVar.f47952d == i12) {
                    return;
                }
                vVar.f47952d = i12;
                Iterator<WeakReference<c>> it = vVar.f47950b.iterator();
                while (it.hasNext()) {
                    WeakReference<c> next = it.next();
                    c cVar = next.get();
                    if (cVar != null) {
                        cVar.a(i12);
                    } else {
                        vVar.f47950b.remove(next);
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized v b(Context context) {
        try {
            if (f47948e == null) {
                f47948e = new v(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f47948e;
    }

    public final int c() {
        int i12;
        synchronized (this.f47951c) {
            i12 = this.f47952d;
        }
        return i12;
    }

    public final void d(c cVar) {
        CopyOnWriteArrayList<WeakReference<c>> copyOnWriteArrayList = this.f47950b;
        Iterator<WeakReference<c>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<c> next = it.next();
            if (next.get() == null) {
                copyOnWriteArrayList.remove(next);
            }
        }
        copyOnWriteArrayList.add(new WeakReference<>(cVar));
        this.f47949a.post(new J11.c(9, this, cVar));
    }
}
