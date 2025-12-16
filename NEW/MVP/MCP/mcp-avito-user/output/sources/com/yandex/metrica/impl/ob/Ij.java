package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.If;
import java.util.Collection;

/* loaded from: classes7.dex */
class Ij extends AbstractC39082qj {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final TelephonyManager f378508a;

    /* renamed from: b, reason: collision with root package name */
    private PhoneStateListener f378509b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f378510c;

    /* renamed from: d, reason: collision with root package name */
    private C39057pi f378511d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private C38976mc f378512e;

    /* renamed from: f, reason: collision with root package name */
    private final G<Zj> f378513f;

    /* renamed from: g, reason: collision with root package name */
    private final G<Collection<C39177uj>> f378514g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f378515h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f378516i;

    /* renamed from: j, reason: collision with root package name */
    private final C39225wj f378517j;

    /* renamed from: k, reason: collision with root package name */
    private final Uj f378518k;

    /* renamed from: l, reason: collision with root package name */
    private final C39105rj f378519l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final Ed f378520m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private C39267yd f378521n;

    /* renamed from: o, reason: collision with root package name */
    @j.N
    private Lj f378522o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    private final InterfaceC39291zd f378523p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    private final C38942l3 f378524q;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Ij.this.f378509b = new d(Ij.this, null);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Ij.this.f378510c) {
                return;
            }
            Ij.this.f378510c = true;
            if (Ij.this.f378509b == null || Ij.this.f378508a == null) {
                return;
            }
            try {
                Ij.this.f378508a.listen(Ij.this.f378509b, 256);
            } catch (Throwable unused) {
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Ij.this.f378510c) {
                Ij.this.f378510c = false;
                Ij.this.f378524q.a(Ij.this);
                if (Ij.this.f378509b == null || Ij.this.f378508a == null) {
                    return;
                }
                try {
                    Ij.this.f378508a.listen(Ij.this.f378509b, 0);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public class d extends PhoneStateListener {
        private d() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            Ij.a(Ij.this, signalStrength);
        }

        public /* synthetic */ d(Ij ij2, a aVar) {
            this();
        }
    }

    public Ij(@j.N Context context, @j.N ICommonExecutor iCommonExecutor) {
        this(context, new Ed(), iCommonExecutor);
    }

    public Context e() {
        return this.f378516i;
    }

    @j.P
    public TelephonyManager f() {
        return this.f378508a;
    }

    @j.k0
    public synchronized Zj g() {
        C39177uj c39177ujB;
        try {
            if (this.f378513f.b() || this.f378513f.d()) {
                Zj zj2 = new Zj(this.f378517j, this.f378518k, this.f378519l);
                C39177uj c39177ujB2 = zj2.b();
                if (c39177ujB2 != null && c39177ujB2.p() == null && !this.f378513f.b() && (c39177ujB = this.f378513f.a().b()) != null) {
                    zj2.b().a(c39177ujB.p());
                }
                this.f378513f.a(zj2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f378513f.a();
    }

    public Ij(@j.N Context context, @j.N Ed ed2, @j.N ICommonExecutor iCommonExecutor) {
        this(context, ed2, new C39267yd(ed2.a()), iCommonExecutor, A2.a(17) ? new C39129sj() : new C39153tj(), new G1(), C38942l3.a());
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    public synchronized void b() {
        this.f378515h.execute(new c());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean c() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.yandex.metrica.impl.ob.mc r0 = r1.f378512e     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            boolean r0 = r0.f381048l     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Lb:
            r0 = move-exception
            goto L10
        Ld:
            r0 = 0
        Le:
            monitor-exit(r1)
            return r0
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Ij.c():boolean");
    }

    public synchronized boolean d() {
        C39057pi c39057pi;
        boolean z12;
        synchronized (this) {
            c39057pi = this.f378511d;
            z12 = false;
        }
        return z12;
        if ((c39057pi != null) && c39057pi.f().f379410s) {
            z12 = true;
        }
        return z12;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    public synchronized void a() {
        this.f378515h.execute(new b());
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    public synchronized void a(InterfaceC38685ak interfaceC38685ak) {
        if (interfaceC38685ak != null) {
            interfaceC38685ak.a(g());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055 A[Catch: all -> 0x0015, LOOP:0: B:34:0x0055->B:39:0x006c, LOOP_START, PHI: r5
  0x0055: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:33:0x0053, B:39:0x006c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0015, blocks: (B:5:0x0004, B:7:0x000c, B:51:0x0090, B:12:0x0018, B:14:0x0029, B:16:0x0033, B:25:0x0042, B:27:0x0045, B:32:0x004f, B:34:0x0055, B:36:0x005b, B:38:0x0069, B:39:0x006c, B:40:0x006f, B:41:0x0070, B:42:0x0071, B:44:0x0077, B:50:0x008d, B:47:0x0082, B:49:0x0088, B:17:0x0034, B:19:0x0039), top: B:63:0x0004, outer: #1, inners: #3 }] */
    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(com.yandex.metrica.impl.ob.InterfaceC39201vj r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 == 0) goto La3
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L9d
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f378514g     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L18
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f378514g     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L90
            goto L18
        L15:
            r9 = move-exception
            goto L9f
        L18:
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f378514g     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            r2 = 17
            boolean r2 = com.yandex.metrica.impl.ob.A2.a(r2)     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L71
            com.yandex.metrica.impl.ob.zd r2 = r8.f378523p     // Catch: java.lang.Throwable -> L15
            android.content.Context r5 = r8.f378516i     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.a(r5)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L71
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.mc r2 = r8.f378512e     // Catch: java.lang.Throwable -> L3f
            r5 = 0
            if (r2 == 0) goto L41
            boolean r2 = r2.f381047k     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L41
            r2 = r4
            goto L42
        L3f:
            r9 = move-exception
            goto L6f
        L41:
            r2 = r5
        L42:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L71
            android.telephony.TelephonyManager r2 = r8.f378508a     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L4e
            java.util.List r2 = r2.getAllCellInfo()     // Catch: java.lang.Throwable -> L4e
            goto L4f
        L4e:
            r2 = r3
        L4f:
            boolean r6 = com.yandex.metrica.impl.ob.A2.b(r2)     // Catch: java.lang.Throwable -> L15
            if (r6 != 0) goto L71
        L55:
            int r6 = r2.size()     // Catch: java.lang.Throwable -> L15
            if (r5 >= r6) goto L71
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L15
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.Lj r7 = r8.f378522o     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.uj r6 = r7.a(r6)     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L6c
            r1.add(r6)     // Catch: java.lang.Throwable -> L15
        L6c:
            int r5 = r5 + 1
            goto L55
        L6f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L15
            throw r9     // Catch: java.lang.Throwable -> L15
        L71:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L15
            if (r2 >= r4) goto L88
            com.yandex.metrica.impl.ob.Zj r1 = r8.g()     // Catch: java.lang.Throwable -> L15
            com.yandex.metrica.impl.ob.uj r1 = r1.b()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L82
            goto L8d
        L82:
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch: java.lang.Throwable -> L15
        L86:
            r3 = r1
            goto L8d
        L88:
            java.util.List r1 = com.yandex.metrica.impl.ob.A2.c(r1)     // Catch: java.lang.Throwable -> L15
            goto L86
        L8d:
            r0.a(r3)     // Catch: java.lang.Throwable -> L15
        L90:
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f378514g     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L15
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9d
            r9.a(r0)     // Catch: java.lang.Throwable -> L9d
            goto La3
        L9d:
            r9 = move-exception
            goto La1
        L9f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9d
            throw r9     // Catch: java.lang.Throwable -> L9d
        La1:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9d
            throw r9
        La3:
            monitor-exit(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Ij.a(com.yandex.metrica.impl.ob.vj):void");
    }

    public Ij(@j.N Context context, @j.N Ed ed2, @j.N C39267yd c39267yd, @j.N ICommonExecutor iCommonExecutor, @j.N Lj lj2, @j.N G1 g12, @j.N C38942l3 c38942l3) {
        TelephonyManager telephonyManager;
        this.f378510c = false;
        If.c cVar = G.f378154e;
        long j12 = cVar.f378344a;
        this.f378513f = new G<>(j12, j12 * 2);
        long j13 = cVar.f378344a;
        this.f378514g = new G<>(j13, 2 * j13);
        this.f378516i = context;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable unused) {
            telephonyManager = null;
        }
        this.f378508a = telephonyManager;
        this.f378523p = a(c39267yd, g12);
        this.f378515h = iCommonExecutor;
        iCommonExecutor.execute(new a());
        this.f378517j = new C39225wj(this, c39267yd);
        this.f378518k = new Uj(this, c39267yd);
        this.f378519l = new C39105rj(this);
        this.f378520m = ed2;
        this.f378521n = c39267yd;
        this.f378522o = lj2;
        this.f378524q = c38942l3;
    }

    public static void a(Ij ij2, SignalStrength signalStrength) {
        C39177uj c39177ujB;
        int evdoDbm;
        synchronized (ij2) {
            try {
                if (!ij2.f378513f.b() && !ij2.f378513f.d() && (c39177ujB = ij2.f378513f.a().b()) != null) {
                    if (signalStrength.isGsm()) {
                        evdoDbm = 99 == signalStrength.getGsmSignalStrength() ? -1 : (r4 * 2) - 113;
                    } else {
                        int cdmaDbm = signalStrength.getCdmaDbm();
                        evdoDbm = signalStrength.getEvdoDbm();
                        if (-120 == evdoDbm) {
                            evdoDbm = cdmaDbm;
                        } else if (-120 != cdmaDbm) {
                            evdoDbm = Math.min(cdmaDbm, evdoDbm);
                        }
                    }
                    c39177ujB.a(Integer.valueOf(evdoDbm));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    public void a(@j.N C39057pi c39057pi) {
        this.f378511d = c39057pi;
        this.f378520m.a(c39057pi);
        this.f378521n.a(this.f378520m.a());
        this.f378522o.a(c39057pi.f());
        if (c39057pi.d() != null) {
            this.f378513f.a(c39057pi.d().f379213a, c39057pi.d().f379213a * 2);
            this.f378514g.a(c39057pi.d().f379213a, c39057pi.d().f379213a * 2);
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39001nc
    public synchronized void a(@j.P C38976mc c38976mc) {
        this.f378512e = c38976mc;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    public void a(boolean z12) {
        this.f378520m.a(z12);
        this.f378521n.a(this.f378520m.a());
    }

    @j.N
    private static InterfaceC39291zd a(@j.N C39267yd c39267yd, @j.N G1 g12) {
        if (A2.a(29)) {
            return g12.c(c39267yd);
        }
        return g12.b(c39267yd);
    }
}
