package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import com.avito.android.search.filter.RunnableC34589p;
import com.google.android.exoplayer2.upstream.InterfaceC36574d;
import com.google.android.exoplayer2.util.B;
import com.google.android.exoplayer2.util.InterfaceC36589e;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import j.P;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DefaultBandwidthMeter.java */
/* loaded from: classes6.dex */
public final class s implements InterfaceC36574d, M {

    /* renamed from: n, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f347957n = AbstractC37401r1.K(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: o, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f347958o = AbstractC37401r1.K(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f347959p = AbstractC37401r1.K(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: q, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f347960q = AbstractC37401r1.K(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f347961r = AbstractC37401r1.K(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f347962s = AbstractC37401r1.K(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: t, reason: collision with root package name */
    @P
    public static s f347963t;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC37412t1<Integer, Long> f347964a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36574d.a.C10611a f347965b;

    /* renamed from: c, reason: collision with root package name */
    public final I f347966c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC36589e f347967d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f347968e;

    /* renamed from: f, reason: collision with root package name */
    public int f347969f;

    /* renamed from: g, reason: collision with root package name */
    public long f347970g;

    /* renamed from: h, reason: collision with root package name */
    public long f347971h;

    /* renamed from: i, reason: collision with root package name */
    public int f347972i;

    /* renamed from: j, reason: collision with root package name */
    public long f347973j;

    /* renamed from: k, reason: collision with root package name */
    public long f347974k;

    /* renamed from: l, reason: collision with root package name */
    public long f347975l;

    /* renamed from: m, reason: collision with root package name */
    public long f347976m;

    /* compiled from: DefaultBandwidthMeter.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final Context f347977a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f347978b;

        /* renamed from: c, reason: collision with root package name */
        public final int f347979c;

        /* renamed from: d, reason: collision with root package name */
        public final com.google.android.exoplayer2.util.L f347980d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f347981e;

        /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(android.content.Context r10) {
            /*
                r9 = this;
                r9.<init>()
                if (r10 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                android.content.Context r0 = r10.getApplicationContext()
            Lb:
                r9.f347977a = r0
                int r0 = com.google.android.exoplayer2.util.U.f348106a
                if (r10 == 0) goto L2a
                java.lang.String r0 = "phone"
                java.lang.Object r10 = r10.getSystemService(r0)
                android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10
                if (r10 == 0) goto L2a
                java.lang.String r10 = r10.getNetworkCountryIso()
                boolean r0 = android.text.TextUtils.isEmpty(r10)
                if (r0 != 0) goto L2a
                java.lang.String r10 = com.google.common.base.C37257c.c(r10)
                goto L36
            L2a:
                java.util.Locale r10 = java.util.Locale.getDefault()
                java.lang.String r10 = r10.getCountry()
                java.lang.String r10 = com.google.common.base.C37257c.c(r10)
            L36:
                int[] r10 = com.google.android.exoplayer2.upstream.s.h(r10)
                java.util.HashMap r0 = new java.util.HashMap
                r1 = 8
                r0.<init>(r1)
                r1 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                r3 = 1000000(0xf4240, double:4.940656E-318)
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r0.put(r2, r3)
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                com.google.common.collect.r1<java.lang.Long> r4 = com.google.android.exoplayer2.upstream.s.f347957n
                r5 = r10[r1]
                java.lang.Object r5 = r4.get(r5)
                java.lang.Long r5 = (java.lang.Long) r5
                r0.put(r3, r5)
                r3 = 3
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.r1<java.lang.Long> r6 = com.google.android.exoplayer2.upstream.s.f347958o
                r7 = 1
                r8 = r10[r7]
                java.lang.Object r6 = r6.get(r8)
                java.lang.Long r6 = (java.lang.Long) r6
                r0.put(r5, r6)
                r5 = 4
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                com.google.common.collect.r1<java.lang.Long> r8 = com.google.android.exoplayer2.upstream.s.f347959p
                r2 = r10[r2]
                java.lang.Object r2 = r8.get(r2)
                java.lang.Long r2 = (java.lang.Long) r2
                r0.put(r6, r2)
                r2 = 5
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                com.google.common.collect.r1<java.lang.Long> r8 = com.google.android.exoplayer2.upstream.s.f347960q
                r3 = r10[r3]
                java.lang.Object r3 = r8.get(r3)
                java.lang.Long r3 = (java.lang.Long) r3
                r0.put(r6, r3)
                r3 = 10
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.r1<java.lang.Long> r6 = com.google.android.exoplayer2.upstream.s.f347961r
                r5 = r10[r5]
                java.lang.Object r5 = r6.get(r5)
                java.lang.Long r5 = (java.lang.Long) r5
                r0.put(r3, r5)
                r3 = 9
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.r1<java.lang.Long> r5 = com.google.android.exoplayer2.upstream.s.f347962s
                r2 = r10[r2]
                java.lang.Object r2 = r5.get(r2)
                java.lang.Long r2 = (java.lang.Long) r2
                r0.put(r3, r2)
                r2 = 7
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r10 = r10[r1]
                java.lang.Object r10 = r4.get(r10)
                java.lang.Long r10 = (java.lang.Long) r10
                r0.put(r2, r10)
                r9.f347978b = r0
                r10 = 2000(0x7d0, float:2.803E-42)
                r9.f347979c = r10
                com.google.android.exoplayer2.util.L r10 = com.google.android.exoplayer2.util.InterfaceC36589e.f348123a
                r9.f347980d = r10
                r9.f347981e = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.s.b.<init>(android.content.Context):void");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] h(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.s.h(java.lang.String):int[]");
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36574d
    public final synchronized long a() {
        return this.f347975l;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36574d
    public final void b(Handler handler, InterfaceC36574d.a aVar) {
        aVar.getClass();
        InterfaceC36574d.a.C10611a c10611a = this.f347965b;
        c10611a.getClass();
        CopyOnWriteArrayList<InterfaceC36574d.a.C10611a.C10612a> copyOnWriteArrayList = c10611a.f347907a;
        Iterator<InterfaceC36574d.a.C10611a.C10612a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC36574d.a.C10611a.C10612a next = it.next();
            if (next.f347909b == aVar) {
                next.f347910c = true;
                copyOnWriteArrayList.remove(next);
            }
        }
        copyOnWriteArrayList.add(new InterfaceC36574d.a.C10611a.C10612a(handler, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    @Override // com.google.android.exoplayer2.upstream.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(com.google.android.exoplayer2.upstream.p r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            if (r3 == 0) goto Le
            int r2 = r2.f347937i     // Catch: java.lang.Throwable -> L20
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto Lc
            goto Le
        Lc:
            r2 = r0
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 != 0) goto L13
            monitor-exit(r1)
            return
        L13:
            int r2 = r1.f347969f     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            com.google.android.exoplayer2.util.e r2 = r1.f347967d     // Catch: java.lang.Throwable -> L20
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L20
            r1.f347970g = r2     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r2 = move-exception
            goto L29
        L22:
            int r2 = r1.f347969f     // Catch: java.lang.Throwable -> L20
            int r2 = r2 + r0
            r1.f347969f = r2     // Catch: java.lang.Throwable -> L20
            monitor-exit(r1)
            return
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.s.d(com.google.android.exoplayer2.upstream.p, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    @Override // com.google.android.exoplayer2.upstream.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(com.google.android.exoplayer2.upstream.p r3, boolean r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r4 == 0) goto Ld
            int r3 = r3.f347937i     // Catch: java.lang.Throwable -> L1a
            r4 = 8
            r3 = r3 & r4
            if (r3 != r4) goto Lb
            goto Ld
        Lb:
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 != 0) goto L12
            monitor-exit(r2)
            return
        L12:
            long r3 = r2.f347971h     // Catch: java.lang.Throwable -> L1a
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L1a
            long r3 = r3 + r0
            r2.f347971h = r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return
        L1a:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.s.e(com.google.android.exoplayer2.upstream.p, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // com.google.android.exoplayer2.upstream.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(com.google.android.exoplayer2.upstream.p r11, boolean r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto Lf
            int r11 = r11.f347937i     // Catch: java.lang.Throwable -> L59
            r12 = 8
            r11 = r11 & r12
            if (r11 != r12) goto Ld
            goto Lf
        Ld:
            r11 = r1
            goto L10
        Lf:
            r11 = r0
        L10:
            if (r11 != 0) goto L14
            monitor-exit(r10)
            return
        L14:
            int r11 = r10.f347969f     // Catch: java.lang.Throwable -> L59
            if (r11 <= 0) goto L19
            r0 = r1
        L19:
            com.google.android.exoplayer2.util.C36585a.d(r0)     // Catch: java.lang.Throwable -> L59
            com.google.android.exoplayer2.util.e r11 = r10.f347967d     // Catch: java.lang.Throwable -> L59
            long r11 = r11.a()     // Catch: java.lang.Throwable -> L59
            long r2 = r10.f347970g     // Catch: java.lang.Throwable -> L59
            long r2 = r11 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L59
            long r2 = r10.f347973j     // Catch: java.lang.Throwable -> L59
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L59
            long r2 = r2 + r6
            r10.f347973j = r2     // Catch: java.lang.Throwable -> L59
            long r2 = r10.f347974k     // Catch: java.lang.Throwable -> L59
            long r6 = r10.f347971h     // Catch: java.lang.Throwable -> L59
            long r2 = r2 + r6
            r10.f347974k = r2     // Catch: java.lang.Throwable -> L59
            if (r5 <= 0) goto L72
            float r0 = (float) r6     // Catch: java.lang.Throwable -> L59
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L59
            float r0 = r0 / r2
            com.google.android.exoplayer2.upstream.I r2 = r10.f347966c     // Catch: java.lang.Throwable -> L59
            double r3 = (double) r6     // Catch: java.lang.Throwable -> L59
            double r3 = java.lang.Math.sqrt(r3)     // Catch: java.lang.Throwable -> L59
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L59
            r2.a(r0, r3)     // Catch: java.lang.Throwable -> L59
            long r2 = r10.f347973j     // Catch: java.lang.Throwable -> L59
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L5b
            long r2 = r10.f347974k     // Catch: java.lang.Throwable -> L59
            r6 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L64
            goto L5b
        L59:
            r11 = move-exception
            goto L79
        L5b:
            com.google.android.exoplayer2.upstream.I r0 = r10.f347966c     // Catch: java.lang.Throwable -> L59
            float r0 = r0.b()     // Catch: java.lang.Throwable -> L59
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L59
            r10.f347975l = r2     // Catch: java.lang.Throwable -> L59
        L64:
            long r6 = r10.f347971h     // Catch: java.lang.Throwable -> L59
            long r8 = r10.f347975l     // Catch: java.lang.Throwable -> L59
            r4 = r10
            r4.j(r5, r6, r8)     // Catch: java.lang.Throwable -> L59
            r10.f347970g = r11     // Catch: java.lang.Throwable -> L59
            r11 = 0
            r10.f347971h = r11     // Catch: java.lang.Throwable -> L59
        L72:
            int r11 = r10.f347969f     // Catch: java.lang.Throwable -> L59
            int r11 = r11 - r1
            r10.f347969f = r11     // Catch: java.lang.Throwable -> L59
            monitor-exit(r10)
            return
        L79:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L59
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.s.f(com.google.android.exoplayer2.upstream.p, boolean):void");
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36574d
    public final void g(InterfaceC36574d.a aVar) {
        CopyOnWriteArrayList<InterfaceC36574d.a.C10611a.C10612a> copyOnWriteArrayList = this.f347965b.f347907a;
        Iterator<InterfaceC36574d.a.C10611a.C10612a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC36574d.a.C10611a.C10612a next = it.next();
            if (next.f347909b == aVar) {
                next.f347910c = true;
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    public final long i(int i12) {
        Integer numValueOf = Integer.valueOf(i12);
        AbstractC37412t1<Integer, Long> abstractC37412t1 = this.f347964a;
        Long l12 = abstractC37412t1.get(numValueOf);
        if (l12 == null) {
            l12 = abstractC37412t1.get(0);
        }
        if (l12 == null) {
            l12 = 1000000L;
        }
        return l12.longValue();
    }

    public final void j(final int i12, final long j12, final long j13) {
        if (i12 == 0 && j12 == 0 && j13 == this.f347976m) {
            return;
        }
        this.f347976m = j13;
        Iterator<InterfaceC36574d.a.C10611a.C10612a> it = this.f347965b.f347907a.iterator();
        while (it.hasNext()) {
            final InterfaceC36574d.a.C10611a.C10612a next = it.next();
            if (!next.f347910c) {
                next.f347908a.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC36574d.a.C10611a.C10612a c10612a = next;
                        c10612a.f347909b.c(i12, j12, j13);
                    }
                });
            }
        }
    }

    @Deprecated
    public s() {
        this(null, AbstractC37412t1.n(), 2000, InterfaceC36589e.f348123a, false);
    }

    public s(@P Context context, Map<Integer, Long> map, int i12, InterfaceC36589e interfaceC36589e, boolean z12) {
        this.f347964a = AbstractC37412t1.c(map);
        this.f347965b = new InterfaceC36574d.a.C10611a();
        this.f347966c = new I(i12);
        this.f347967d = interfaceC36589e;
        this.f347968e = z12;
        if (context != null) {
            com.google.android.exoplayer2.util.B b12 = com.google.android.exoplayer2.util.B.b(context);
            int iC2 = b12.c();
            this.f347972i = iC2;
            this.f347975l = i(iC2);
            r rVar = new r(this);
            CopyOnWriteArrayList<WeakReference<B.c>> copyOnWriteArrayList = b12.f348054b;
            Iterator<WeakReference<B.c>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<B.c> next = it.next();
                if (next.get() == null) {
                    copyOnWriteArrayList.remove(next);
                }
            }
            copyOnWriteArrayList.add(new WeakReference<>(rVar));
            b12.f348053a.post(new RunnableC34589p(24, b12, rVar));
            return;
        }
        this.f347972i = 0;
        this.f347975l = i(0);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36574d
    public final M c() {
        return this;
    }
}
