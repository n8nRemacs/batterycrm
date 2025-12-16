package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;
import com.yandex.mobile.ads.impl.xc1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class pi0 implements pp0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f388849a;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ga1 f388851c;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final r30 f388853e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final x6 f388854f;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private s30 f388856h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f388857i;

    /* renamed from: j, reason: collision with root package name */
    private int f388858j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f388859k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f388860l;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final b f388850b = new b(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ArrayList f388852d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final q21 f388855g = q21.b();

    @j.k0
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f388861a;

        /* renamed from: b, reason: collision with root package name */
        long f388862b;

        /* renamed from: c, reason: collision with root package name */
        int f388863c;

        /* renamed from: d, reason: collision with root package name */
        Long f388864d;

        public a(int i12, long j12, String str) {
            this.f388861a = str;
            this.f388862b = j12;
            this.f388863c = i12;
        }
    }

    @j.k0
    public static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            pi0 pi0Var;
            int i12 = message.what;
            if (i12 == 1) {
                Pair pair = (Pair) message.obj;
                pi0 pi0Var2 = (pi0) ((WeakReference) pair.first).get();
                if (pi0Var2 != null) {
                    a aVar = (a) pair.second;
                    xc1 xc1VarA = pi0.a(pi0Var2, aVar);
                    pi0.a(pi0Var2, aVar, xc1VarA);
                    if (xc1VarA.e() != xc1.a.f391685b) {
                        aVar.f388864d = null;
                        pi0Var2.b();
                        return;
                    } else {
                        pi0Var2.f388852d.remove(aVar);
                        if (pi0Var2.f388852d.isEmpty()) {
                            pi0Var2.a(xc1VarA.c());
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (i12 == 2 && (pi0Var = (pi0) ((WeakReference) message.obj).get()) != null) {
                pi0Var.f388852d.size();
                int size = pi0Var.f388852d.size();
                for (int i13 = 0; i13 < size; i13++) {
                    a aVar2 = (a) pi0Var.f388852d.get(i13);
                    xc1 xc1VarA2 = pi0.a(pi0Var, aVar2);
                    if (xc1VarA2.e() == xc1.a.f391685b) {
                        if (aVar2.f388864d == null) {
                            aVar2.f388864d = Long.valueOf(SystemClock.elapsedRealtime());
                        }
                        if (SystemClock.elapsedRealtime() - aVar2.f388864d.longValue() >= aVar2.f388862b) {
                            pi0Var.f388850b.sendMessage(Message.obtain(pi0Var.f388850b, 1, new Pair(new WeakReference(pi0Var), aVar2)));
                        }
                        pi0Var.b(xc1VarA2.d());
                    } else {
                        aVar2.f388864d = null;
                        pi0Var.a(xc1VarA2);
                    }
                }
                if (pi0.c(pi0Var)) {
                    pi0Var.f388850b.sendMessageDelayed(Message.obtain(pi0Var.f388850b, 2, new WeakReference(pi0Var)), 200L);
                }
            }
        }
    }

    public pi0(@j.N Context context, @j.N n2 n2Var, @j.N r30 r30Var, @j.N ga1 ga1Var, @j.N String str) {
        this.f388849a = context;
        this.f388851c = ga1Var;
        this.f388853e = r30Var;
        this.f388854f = new x6(context, n2Var);
    }

    public static void a(pi0 pi0Var, a aVar, xc1 xc1Var) {
        synchronized (pi0Var) {
            try {
                if (xc1Var.e() == xc1.a.f391685b) {
                    pi0Var.f388854f.a(aVar.f388861a);
                } else {
                    pi0Var.a(xc1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean c(pi0 pi0Var) {
        boolean z12;
        synchronized (pi0Var) {
            z12 = pi0Var.f388852d.size() > 0;
        }
        return z12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r6.f388852d.size() <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r6.f388850b.hasMessages(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        r0 = r6.f388850b;
        r0.sendMessage(android.os.Message.obtain(r0, 2, new java.lang.ref.WeakReference(r6)));
     */
    @Override // com.yandex.mobile.ads.impl.pp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b() {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            monitor-enter(r6)
            com.yandex.mobile.ads.impl.ns0 r2 = com.yandex.mobile.ads.impl.ns0.a()     // Catch: java.lang.Throwable -> L28
            android.content.Context r3 = r6.f388849a     // Catch: java.lang.Throwable -> L28
            boolean r2 = r2.b(r3)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L52
            java.util.ArrayList r2 = r6.f388852d     // Catch: java.lang.Throwable -> L28
            java.util.Collection[] r3 = new java.util.Collection[r1]     // Catch: java.lang.Throwable -> L28
            r3[r0] = r2     // Catch: java.lang.Throwable -> L28
            java.util.Collection[] r3 = (java.util.Collection[]) r3     // Catch: java.lang.Throwable -> L28
            int r2 = r3.length     // Catch: java.lang.Throwable -> L28
            r4 = r0
        L19:
            if (r4 >= r2) goto L2a
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L52
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L26
            goto L52
        L26:
            int r4 = r4 + r1
            goto L19
        L28:
            r0 = move-exception
            goto L54
        L2a:
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r2 = r6.f388852d     // Catch: java.lang.Throwable -> L4f
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L4f
            if (r2 <= 0) goto L34
            r0 = r1
        L34:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L52
            com.yandex.mobile.ads.impl.pi0$b r0 = r6.f388850b     // Catch: java.lang.Throwable -> L28
            r1 = 2
            boolean r0 = r0.hasMessages(r1)     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L52
            com.yandex.mobile.ads.impl.pi0$b r0 = r6.f388850b     // Catch: java.lang.Throwable -> L28
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L28
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L28
            android.os.Message r1 = android.os.Message.obtain(r0, r1, r2)     // Catch: java.lang.Throwable -> L28
            r0.sendMessage(r1)     // Catch: java.lang.Throwable -> L28
            goto L52
        L4f:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L28
            throw r0     // Catch: java.lang.Throwable -> L28
        L52:
            monitor-exit(r6)
            return
        L54:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L28
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pi0.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0019 A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.pp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayList r0 = r10.f388852d     // Catch: java.lang.Throwable -> L34
            r0.size()     // Catch: java.lang.Throwable -> L34
            r10.a()     // Catch: java.lang.Throwable -> L34
            com.yandex.mobile.ads.impl.ky0$b r0 = com.yandex.mobile.ads.impl.ky0.b.f387322w     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L34
            r2 = 0
            r10.f388860l = r2     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r3 = r10.f388852d     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L34
        L19:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto La8
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L34
            com.yandex.mobile.ads.impl.pi0$a r4 = (com.yandex.mobile.ads.impl.pi0.a) r4     // Catch: java.lang.Throwable -> L34
            com.yandex.mobile.ads.impl.q21 r5 = r10.f388855g     // Catch: java.lang.Throwable -> L34
            android.content.Context r6 = r10.f388849a     // Catch: java.lang.Throwable -> L34
            com.yandex.mobile.ads.impl.v11 r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L37
            boolean r5 = r5.K()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r0 = move-exception
            goto Lc3
        L37:
            r5 = r2
        L38:
            if (r5 == 0) goto L43
            com.yandex.mobile.ads.impl.ga1 r5 = r10.f388851c     // Catch: java.lang.Throwable -> L34
            int r6 = r4.f388863c     // Catch: java.lang.Throwable -> L34
            com.yandex.mobile.ads.impl.xc1 r5 = r5.b(r6)     // Catch: java.lang.Throwable -> L34
            goto L4b
        L43:
            com.yandex.mobile.ads.impl.ga1 r5 = r10.f388851c     // Catch: java.lang.Throwable -> L34
            int r6 = r4.f388863c     // Catch: java.lang.Throwable -> L34
            com.yandex.mobile.ads.impl.xc1 r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L34
        L4b:
            com.yandex.mobile.ads.impl.xc1$a r6 = r5.e()     // Catch: java.lang.Throwable -> L34
            r6.getClass()     // Catch: java.lang.Throwable -> L34
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L34
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L87
            com.yandex.mobile.ads.impl.xc1$a r6 = r5.e()     // Catch: java.lang.Throwable -> L6a
            com.yandex.mobile.ads.impl.xc1$a r7 = com.yandex.mobile.ads.impl.xc1.a.f391685b     // Catch: java.lang.Throwable -> L6a
            r8 = 1
            if (r6 != r7) goto L5f
            r6 = r8
            goto L60
        L5f:
            r6 = r2
        L60:
            if (r6 == 0) goto L6c
            com.yandex.mobile.ads.impl.x6 r6 = r10.f388854f     // Catch: java.lang.Throwable -> L6a
            java.lang.String r9 = r4.f388861a     // Catch: java.lang.Throwable -> L6a
            r6.a(r9)     // Catch: java.lang.Throwable -> L6a
            goto L6f
        L6a:
            r0 = move-exception
            goto La4
        L6c:
            r10.a(r5)     // Catch: java.lang.Throwable -> L6a
        L6f:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L87
            boolean r6 = r10.f388860l     // Catch: java.lang.Throwable -> L87
            if (r6 != 0) goto L89
            com.yandex.mobile.ads.impl.xc1$a r6 = r5.e()     // Catch: java.lang.Throwable -> L87
            if (r6 != r7) goto L7c
            r6 = r8
            goto L7d
        L7c:
            r6 = r2
        L7d:
            if (r6 != 0) goto L89
            com.yandex.mobile.ads.impl.r30 r6 = r10.f388853e     // Catch: java.lang.Throwable -> L87
            r6.a(r5)     // Catch: java.lang.Throwable -> L87
            r10.f388860l = r8     // Catch: java.lang.Throwable -> L87
            goto L89
        L87:
            r0 = move-exception
            goto La6
        L89:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L34
            com.yandex.mobile.ads.impl.xc1$a r6 = r5.e()     // Catch: java.lang.Throwable -> L34
            if (r6 != r7) goto L91
            goto L92
        L91:
            r8 = r2
        L92:
            if (r8 == 0) goto L19
            r1.add(r4)     // Catch: java.lang.Throwable -> L34
            com.yandex.mobile.ads.impl.ky0$b r0 = r5.c()     // Catch: java.lang.Throwable -> L34
            com.yandex.mobile.ads.impl.ky0$b r4 = r5.d()     // Catch: java.lang.Throwable -> L34
            r10.b(r4)     // Catch: java.lang.Throwable -> L34
            goto L19
        La4:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L87
        La6:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.lang.Throwable -> L34
        La8:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lbe
            java.util.ArrayList r2 = r10.f388852d     // Catch: java.lang.Throwable -> L34
            r2.removeAll(r1)     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r1 = r10.f388852d     // Catch: java.lang.Throwable -> L34
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto Lbe
            r10.a(r0)     // Catch: java.lang.Throwable -> L34
        Lbe:
            r10.b()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r10)
            return
        Lc3:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L34
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pi0.c():void");
    }

    @Override // com.yandex.mobile.ads.impl.pp0
    public final synchronized void a(@j.N AdResponse adResponse, @j.N List<q31> list) {
        this.f388853e.a(adResponse);
        this.f388852d.clear();
        this.f388858j = 0;
        this.f388857i = false;
        this.f388859k = false;
        this.f388860l = false;
        a();
        synchronized (this) {
            for (q31 q31Var : list) {
                String strB = q31Var.b();
                long jA2 = q31Var.a();
                this.f388852d.add(new a(q31Var.c(), jA2, strB));
            }
        }
    }

    @j.k0
    public final synchronized void b(@j.N ky0.b bVar) {
        if (!this.f388859k) {
            this.f388853e.a(bVar);
            this.f388859k = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.pp0
    public final synchronized void a() {
        this.f388850b.removeMessages(2);
        this.f388850b.removeMessages(1);
        Iterator it = this.f388852d.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f388864d = null;
        }
    }

    public static xc1 a(pi0 pi0Var, a aVar) {
        xc1 xc1VarB = pi0Var.f388851c.b(aVar.f388863c);
        xc1VarB.e().getClass();
        return xc1VarB;
    }

    @Override // com.yandex.mobile.ads.impl.pp0
    public final synchronized void a(@j.N Intent intent, boolean z12) {
        char c12;
        try {
            String action = intent.getAction();
            action.getClass();
            int iHashCode = action.hashCode();
            if (iHashCode != -2128145023) {
                if (iHashCode != -1454123155) {
                    c12 = (iHashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) ? (char) 2 : (char) 65535;
                } else if (action.equals("android.intent.action.SCREEN_ON")) {
                    c12 = 1;
                }
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                c12 = 0;
            }
            if (c12 == 0) {
                a();
            } else if ((c12 == 1 || c12 == 2) && z12) {
                b();
            }
        } finally {
        }
    }

    @j.k0
    public final synchronized void a(ky0.b bVar) {
        HashMap map = new HashMap();
        map.put("failure_tracked", Boolean.valueOf(this.f388857i));
        this.f388853e.a(bVar, map);
        s30 s30Var = this.f388856h;
        if (s30Var != null) {
            s30Var.f();
        }
    }

    @j.k0
    public final synchronized void a(xc1 xc1Var) {
        int i12 = this.f388858j + 1;
        this.f388858j = i12;
        if (i12 == 20) {
            this.f388853e.b(xc1Var);
            this.f388857i = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.pp0
    public final void a(@j.N n30 n30Var) {
        this.f388856h = n30Var;
    }
}
