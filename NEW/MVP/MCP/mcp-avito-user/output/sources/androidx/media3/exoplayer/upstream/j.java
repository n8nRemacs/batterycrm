package androidx.media3.exoplayer.upstream;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.util.D;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.util.J;
import androidx.media3.common.util.v;
import androidx.media3.datasource.B;
import androidx.media3.exoplayer.upstream.d;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import j.P;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DefaultBandwidthMeter.java */
@J
/* loaded from: classes.dex */
public final class j implements d, B {

    /* renamed from: n, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f50128n = AbstractC37401r1.K(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* renamed from: o, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f50129o = AbstractC37401r1.K(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f50130p = AbstractC37401r1.K(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* renamed from: q, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f50131q = AbstractC37401r1.K(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f50132r = AbstractC37401r1.K(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC37401r1<Long> f50133s = AbstractC37401r1.K(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* renamed from: t, reason: collision with root package name */
    @P
    public static j f50134t;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC37412t1<Integer, Long> f50135a;

    /* renamed from: b, reason: collision with root package name */
    public final d.a.C1840a f50136b;

    /* renamed from: c, reason: collision with root package name */
    public final p f50137c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC23115f f50138d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f50139e;

    /* renamed from: f, reason: collision with root package name */
    public int f50140f;

    /* renamed from: g, reason: collision with root package name */
    public long f50141g;

    /* renamed from: h, reason: collision with root package name */
    public long f50142h;

    /* renamed from: i, reason: collision with root package name */
    public int f50143i;

    /* renamed from: j, reason: collision with root package name */
    public long f50144j;

    /* renamed from: k, reason: collision with root package name */
    public long f50145k;

    /* renamed from: l, reason: collision with root package name */
    public long f50146l;

    /* renamed from: m, reason: collision with root package name */
    public long f50147m;

    /* compiled from: DefaultBandwidthMeter.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final Context f50148a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f50149b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50150c;

        /* renamed from: d, reason: collision with root package name */
        public final D f50151d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f50152e;

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
                r9.f50148a = r0
                int r0 = androidx.media3.common.util.M.f47887a
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
                int[] r10 = androidx.media3.exoplayer.upstream.j.h(r10)
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
                com.google.common.collect.r1<java.lang.Long> r4 = androidx.media3.exoplayer.upstream.j.f50128n
                r5 = r10[r1]
                java.lang.Object r5 = r4.get(r5)
                java.lang.Long r5 = (java.lang.Long) r5
                r0.put(r3, r5)
                r3 = 3
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.r1<java.lang.Long> r6 = androidx.media3.exoplayer.upstream.j.f50129o
                r7 = 1
                r8 = r10[r7]
                java.lang.Object r6 = r6.get(r8)
                java.lang.Long r6 = (java.lang.Long) r6
                r0.put(r5, r6)
                r5 = 4
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                com.google.common.collect.r1<java.lang.Long> r8 = androidx.media3.exoplayer.upstream.j.f50130p
                r2 = r10[r2]
                java.lang.Object r2 = r8.get(r2)
                java.lang.Long r2 = (java.lang.Long) r2
                r0.put(r6, r2)
                r2 = 5
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                com.google.common.collect.r1<java.lang.Long> r8 = androidx.media3.exoplayer.upstream.j.f50131q
                r3 = r10[r3]
                java.lang.Object r3 = r8.get(r3)
                java.lang.Long r3 = (java.lang.Long) r3
                r0.put(r6, r3)
                r3 = 10
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.r1<java.lang.Long> r6 = androidx.media3.exoplayer.upstream.j.f50132r
                r5 = r10[r5]
                java.lang.Object r5 = r6.get(r5)
                java.lang.Long r5 = (java.lang.Long) r5
                r0.put(r3, r5)
                r3 = 9
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.r1<java.lang.Long> r5 = androidx.media3.exoplayer.upstream.j.f50133s
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
                r9.f50149b = r0
                r10 = 2000(0x7d0, float:2.803E-42)
                r9.f50150c = r10
                androidx.media3.common.util.D r10 = androidx.media3.common.util.InterfaceC23115f.f47901a
                r9.f50151d = r10
                r9.f50152e = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.j.b.<init>(android.content.Context):void");
        }
    }

    public j() {
        throw null;
    }

    public j(Context context, Map map, int i12, InterfaceC23115f interfaceC23115f, boolean z12, a aVar) {
        this.f50135a = AbstractC37412t1.c(map);
        this.f50136b = new d.a.C1840a();
        this.f50137c = new p(i12);
        this.f50138d = interfaceC23115f;
        this.f50139e = z12;
        if (context == null) {
            this.f50143i = 0;
            this.f50146l = i(0);
            return;
        }
        v vVarB = v.b(context);
        int iC2 = vVarB.c();
        this.f50143i = iC2;
        this.f50146l = i(iC2);
        vVarB.d(new i(this, 0));
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
            Method dump skipped, instructions count: 8588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.j.h(java.lang.String):int[]");
    }

    @Override // androidx.media3.exoplayer.upstream.d
    public final void a(d.a aVar) {
        this.f50136b.c(aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.d
    public final void b(Handler handler, androidx.media3.exoplayer.analytics.a aVar) {
        aVar.getClass();
        this.f50136b.a(handler, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // androidx.media3.datasource.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(androidx.media3.datasource.d r1, androidx.media3.datasource.o r2, boolean r3, int r4) {
        /*
            r0 = this;
            monitor-enter(r0)
            if (r3 == 0) goto Ld
            r1 = 8
            boolean r1 = r2.c(r1)     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 != 0) goto L12
            monitor-exit(r0)
            return
        L12:
            long r1 = r0.f50142h     // Catch: java.lang.Throwable -> L1a
            long r3 = (long) r4     // Catch: java.lang.Throwable -> L1a
            long r1 = r1 + r3
            r0.f50142h = r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.j.e(androidx.media3.datasource.d, androidx.media3.datasource.o, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    @Override // androidx.media3.datasource.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(androidx.media3.datasource.d r1, androidx.media3.datasource.o r2, boolean r3) {
        /*
            r0 = this;
            monitor-enter(r0)
            r1 = 1
            if (r3 == 0) goto Le
            r3 = 8
            boolean r2 = r2.c(r3)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto Le
            r2 = r1
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 != 0) goto L13
            monitor-exit(r0)
            return
        L13:
            int r2 = r0.f50140f     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            androidx.media3.common.util.f r2 = r0.f50138d     // Catch: java.lang.Throwable -> L20
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L20
            r0.f50141g = r2     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r1 = move-exception
            goto L29
        L22:
            int r2 = r0.f50140f     // Catch: java.lang.Throwable -> L20
            int r2 = r2 + r1
            r0.f50140f = r2     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.j.f(androidx.media3.datasource.d, androidx.media3.datasource.o, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    @Override // androidx.media3.datasource.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(androidx.media3.datasource.d r12, androidx.media3.datasource.o r13, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            r12 = 0
            r0 = 1
            if (r14 == 0) goto Lf
            r14 = 8
            boolean r13 = r13.c(r14)     // Catch: java.lang.Throwable -> L59
            if (r13 != 0) goto Lf
            r13 = r0
            goto L10
        Lf:
            r13 = r12
        L10:
            if (r13 != 0) goto L14
            monitor-exit(r11)
            return
        L14:
            int r13 = r11.f50140f     // Catch: java.lang.Throwable -> L59
            if (r13 <= 0) goto L19
            r12 = r0
        L19:
            androidx.media3.common.util.C23110a.g(r12)     // Catch: java.lang.Throwable -> L59
            androidx.media3.common.util.f r12 = r11.f50138d     // Catch: java.lang.Throwable -> L59
            long r12 = r12.a()     // Catch: java.lang.Throwable -> L59
            long r1 = r11.f50141g     // Catch: java.lang.Throwable -> L59
            long r1 = r12 - r1
            int r4 = (int) r1     // Catch: java.lang.Throwable -> L59
            long r1 = r11.f50144j     // Catch: java.lang.Throwable -> L59
            long r5 = (long) r4     // Catch: java.lang.Throwable -> L59
            long r1 = r1 + r5
            r11.f50144j = r1     // Catch: java.lang.Throwable -> L59
            long r1 = r11.f50145k     // Catch: java.lang.Throwable -> L59
            long r5 = r11.f50142h     // Catch: java.lang.Throwable -> L59
            long r1 = r1 + r5
            r11.f50145k = r1     // Catch: java.lang.Throwable -> L59
            if (r4 <= 0) goto L82
            float r14 = (float) r5     // Catch: java.lang.Throwable -> L59
            r1 = 1174011904(0x45fa0000, float:8000.0)
            float r14 = r14 * r1
            float r1 = (float) r4     // Catch: java.lang.Throwable -> L59
            float r14 = r14 / r1
            androidx.media3.exoplayer.upstream.p r1 = r11.f50137c     // Catch: java.lang.Throwable -> L59
            double r2 = (double) r5     // Catch: java.lang.Throwable -> L59
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L59
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L59
            r1.a(r14, r2)     // Catch: java.lang.Throwable -> L59
            long r1 = r11.f50144j     // Catch: java.lang.Throwable -> L59
            r5 = 2000(0x7d0, double:9.88E-321)
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 >= 0) goto L5b
            long r1 = r11.f50145k     // Catch: java.lang.Throwable -> L59
            r5 = 524288(0x80000, double:2.590327E-318)
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 < 0) goto L64
            goto L5b
        L59:
            r12 = move-exception
            goto L89
        L5b:
            androidx.media3.exoplayer.upstream.p r14 = r11.f50137c     // Catch: java.lang.Throwable -> L59
            float r14 = r14.b()     // Catch: java.lang.Throwable -> L59
            long r1 = (long) r14     // Catch: java.lang.Throwable -> L59
            r11.f50146l = r1     // Catch: java.lang.Throwable -> L59
        L64:
            long r5 = r11.f50142h     // Catch: java.lang.Throwable -> L59
            long r7 = r11.f50146l     // Catch: java.lang.Throwable -> L59
            r1 = 0
            if (r4 != 0) goto L77
            int r14 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r14 != 0) goto L77
            long r9 = r11.f50147m     // Catch: java.lang.Throwable -> L59
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 != 0) goto L77
            goto L7e
        L77:
            r11.f50147m = r7     // Catch: java.lang.Throwable -> L59
            androidx.media3.exoplayer.upstream.d$a$a r3 = r11.f50136b     // Catch: java.lang.Throwable -> L59
            r3.b(r4, r5, r7)     // Catch: java.lang.Throwable -> L59
        L7e:
            r11.f50141g = r12     // Catch: java.lang.Throwable -> L59
            r11.f50142h = r1     // Catch: java.lang.Throwable -> L59
        L82:
            int r12 = r11.f50140f     // Catch: java.lang.Throwable -> L59
            int r12 = r12 - r0
            r11.f50140f = r12     // Catch: java.lang.Throwable -> L59
            monitor-exit(r11)
            return
        L89:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L59
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.j.g(androidx.media3.datasource.d, androidx.media3.datasource.o, boolean):void");
    }

    public final long i(int i12) {
        Integer numValueOf = Integer.valueOf(i12);
        AbstractC37412t1<Integer, Long> abstractC37412t1 = this.f50135a;
        Long l12 = abstractC37412t1.get(numValueOf);
        if (l12 == null) {
            l12 = abstractC37412t1.get(0);
        }
        if (l12 == null) {
            l12 = 1000000L;
        }
        return l12.longValue();
    }

    @Override // androidx.media3.exoplayer.upstream.d
    public final B c() {
        return this;
    }

    @Override // androidx.media3.datasource.B
    public final void d(androidx.media3.datasource.d dVar, androidx.media3.datasource.o oVar, boolean z12) {
    }
}
