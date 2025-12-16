package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C38783ei;
import com.yandex.metrica.impl.ob.C39057pi;
import com.yandex.metrica.impl.ob.C39081qi;
import com.yandex.metrica.impl.ob.Mg;
import com.yandex.metrica.networktasks.api.NetworkTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ri, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39104ri {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f381764a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final I3 f381765b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC39032oi f381766c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39057pi.b f381767d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private volatile NetworkTask f381768e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private C38808fi f381769f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f381770g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final I f381771h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final Rh f381772i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final C38942l3 f381773j;

    /* renamed from: com.yandex.metrica.impl.ob.ri$a */
    public class a implements Y41.a<I> {
        public a() {
        }

        @Override // Y41.a
        public I invoke() {
            return C39104ri.this.f381771h;
        }
    }

    public C39104ri(@j.N Context context, @j.N String str, @j.N Mg.b bVar, @j.N InterfaceC39032oi interfaceC39032oi) {
        this(context, new E3(str), bVar, interfaceC39032oi, new C39057pi.b(context), new Pl(context), new com.yandex.metrica.coreutils.services.e(), F0.g().d(), new Rh(), C38942l3.a());
    }

    @j.N
    public Context b() {
        return this.f381764a;
    }

    @j.P
    public synchronized NetworkTask c() {
        try {
            if (!e()) {
                return null;
            }
            if (this.f381768e == null) {
                this.f381768e = C39099rd.a(this, this.f381769f.b());
            }
            return this.f381768e;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.N
    public C39057pi d() {
        return this.f381769f.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean e() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.metrica.impl.ob.fi r0 = r5.f381769f     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.pi r0 = r0.d()     // Catch: java.lang.Throwable -> L2d
            boolean r1 = com.yandex.metrica.impl.ob.C39007ni.b(r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L30
            boolean r1 = com.yandex.metrica.impl.ob.C39007ni.a(r0)     // Catch: java.lang.Throwable -> L2d
            r2 = r1 ^ 1
            if (r1 == 0) goto L2f
            com.yandex.metrica.impl.ob.Rh r1 = r5.f381772i     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.fi r3 = r5.f381769f     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.Eg r3 = r3.b()     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.Mg r3 = (com.yandex.metrica.impl.ob.Mg) r3     // Catch: java.lang.Throwable -> L2d
            java.util.Map r3 = r3.C()     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.I r4 = r5.f381771h     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r1.a(r3, r0, r4)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L2f
            r1 = 1
            goto L30
        L2d:
            r0 = move-exception
            goto L32
        L2f:
            r1 = r2
        L30:
            monitor-exit(r5)
            return r1
        L32:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C39104ri.e():boolean");
    }

    private void a(@j.N Pl pl2, @j.N C38759dj c38759dj, @j.N C39057pi c39057pi) {
        C39057pi.a aVarA = c39057pi.a();
        if (!C39007ni.a(c39057pi.V())) {
            aVarA = aVarA.k(c38759dj.a().f379795a);
        }
        String strA = pl2.a();
        if (!C39007ni.a(c39057pi.i())) {
            aVarA = aVarA.c(strA).d("");
        }
        C39057pi c39057piA = aVarA.a();
        b(c39057piA);
        a(c39057piA);
    }

    private synchronized void b(@j.N C39057pi c39057pi) {
        this.f381769f.a(c39057pi);
        this.f381767d.a(c39057pi);
        F0.g().a(c39057pi);
        this.f381773j.a((C38992n3) new C39066q3(this.f381765b.b(), c39057pi));
    }

    private C39104ri(@j.N Context context, @j.N I3 i32, @j.N Mg.b bVar, @j.N InterfaceC39032oi interfaceC39032oi, @j.N C39057pi.b bVar2, @j.N Pl pl2, @j.N com.yandex.metrica.coreutils.services.f fVar, @j.N I i12, @j.N Rh rh2, @j.N C38942l3 c38942l3) {
        this(context, i32, bVar, interfaceC39032oi, bVar2, bVar2.a(), pl2, fVar, i12, rh2, c38942l3);
    }

    private C39104ri(@j.N Context context, @j.N I3 i32, @j.N Mg.b bVar, @j.N InterfaceC39032oi interfaceC39032oi, @j.N C39057pi.b bVar2, @j.N C39057pi c39057pi, @j.N Pl pl2, @j.N com.yandex.metrica.coreutils.services.f fVar, @j.N I i12, @j.N Rh rh2, @j.N C38942l3 c38942l3) {
        this(context, i32, interfaceC39032oi, bVar2, c39057pi, pl2, new C38808fi(new Mg.c(context, i32.b()), c39057pi, bVar), fVar, i12, rh2, C38784ej.a(context).a(context, new C38883ij(bVar2)), c38942l3);
    }

    @j.k0
    public C39104ri(@j.N Context context, @j.N I3 i32, @j.N InterfaceC39032oi interfaceC39032oi, @j.N C39057pi.b bVar, @j.N C39057pi c39057pi, @j.N Pl pl2, @j.N C38808fi c38808fi, @j.N com.yandex.metrica.coreutils.services.f fVar, @j.N I i12, @j.N Rh rh2, @j.N C38759dj c38759dj, @j.N C38942l3 c38942l3) {
        this.f381764a = context;
        this.f381765b = i32;
        this.f381766c = interfaceC39032oi;
        this.f381767d = bVar;
        this.f381769f = c38808fi;
        this.f381770g = fVar;
        this.f381771h = i12;
        this.f381772i = rh2;
        this.f381773j = c38942l3;
        a(pl2, c38759dj, c39057pi);
    }

    @j.N
    public I3 a() {
        return this.f381765b;
    }

    public void a(@j.N EnumC38833gi enumC38833gi) {
        ArrayList arrayList;
        synchronized (this) {
            this.f381768e = null;
        }
        InterfaceC39032oi interfaceC39032oi = this.f381766c;
        String strB = this.f381765b.b();
        C39057pi c39057piD = this.f381769f.d();
        C38783ei.a aVar = (C38783ei.a) interfaceC39032oi;
        synchronized (C38783ei.this.f380497b) {
            try {
                Collection collectionA = C38783ei.this.f380496a.a(strB);
                if (collectionA == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collectionA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC38932ki) it.next()).a(enumC38833gi, c39057piD);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(@j.N com.yandex.metrica.impl.ob.Ui r6, @j.N com.yandex.metrica.impl.ob.Mg r7, @j.P java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.yandex.metrica.impl.ob.A2.b(r8)     // Catch: java.lang.Throwable -> L33
            r1 = 0
            if (r0 != 0) goto L35
            java.lang.String r0 = "Date"
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L33
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L33
            boolean r0 = com.yandex.metrica.impl.ob.A2.b(r8)     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L35
            r0 = 0
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L35
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L35
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L35
            java.util.Date r8 = r0.parse(r8)     // Catch: java.lang.Throwable -> L35
            long r2 = r8.getTime()     // Catch: java.lang.Throwable -> L35
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L35
            goto L36
        L33:
            r6 = move-exception
            goto L61
        L35:
            r8 = r1
        L36:
            r2 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            if (r8 != 0) goto L3f
            r8 = r0
        L3f:
            java.lang.Long r0 = r6.N()     // Catch: java.lang.Throwable -> L33
            com.yandex.metrica.impl.ob.fm r2 = com.yandex.metrica.impl.ob.C38812fm.c()     // Catch: java.lang.Throwable -> L33
            long r3 = r8.longValue()     // Catch: java.lang.Throwable -> L33
            r2.a(r3, r0)     // Catch: java.lang.Throwable -> L33
            com.yandex.metrica.impl.ob.pi r6 = r5.a(r6, r7, r8)     // Catch: java.lang.Throwable -> L33
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L33
            r5.f381768e = r1     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            r5.b(r6)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            r5.a(r6)
            return
        L5e:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L61:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C39104ri.a(com.yandex.metrica.impl.ob.Ui, com.yandex.metrica.impl.ob.Mg, java.util.Map):void");
    }

    @j.N
    @j.k0
    public C39057pi a(@j.N Ui ui2, @j.N Mg mg2, @j.P Long l12) {
        boolean zEquals;
        String strC = Tl.c(mg2.C());
        Map<String, String> mapB = mg2.B().b();
        String strN = ui2.n();
        String strN2 = this.f381769f.d().n();
        if (!Tl.d(Tl.a(strN))) {
            strN = Tl.d(Tl.a(strN2)) ? strN2 : null;
        }
        String strI = this.f381769f.d().i();
        if (TextUtils.isEmpty(strI)) {
            strI = ui2.i();
        }
        C39057pi.a aVarH = new C39057pi.a(new C39081qi.b(ui2.e())).c(strI).d(ui2.h()).c(this.f381770g.c()).k(this.f381769f.d().V()).f(ui2.o()).c(ui2.G()).b(mg2.J()).i(ui2.y()).e(ui2.r()).i(ui2.x()).j(ui2.D()).a(ui2.d()).a(ui2.j()).g(ui2.t()).a(ui2.g()).e(strN).h(strC);
        this.f381772i.getClass();
        Map<String, String> mapA = Tl.a(strN);
        if (A2.b(mapB)) {
            zEquals = A2.b(mapA);
        } else {
            zEquals = mapA.equals(mapB);
        }
        C39057pi.a aVarA = aVarH.c(zEquals).g(Tl.c(mapB)).a(ui2.E()).d(ui2.q()).j(ui2.z()).b(ui2.f()).a(ui2.w()).h(ui2.v()).a(ui2.C()).a(ui2.H()).a(true);
        Long lValueOf = Long.valueOf((System.currentTimeMillis() / 1000) * 1000);
        if (l12 != null) {
            lValueOf = l12;
        }
        return aVarA.b(lValueOf.longValue()).a(this.f381769f.b().a(l12.longValue())).b(false).a(ui2.p()).a(ui2.B()).a(ui2.L()).b(ui2.K()).c(ui2.M()).a(ui2.J()).a(ui2.I()).a(ui2.c()).a(ui2.k()).f(ui2.s()).a(ui2.b()).a(ui2.a()).a(ui2.l()).a(ui2.m()).a(ui2.F()).b(ui2.u()).a();
    }

    private void a(@j.N C39057pi c39057pi) {
        ArrayList arrayList;
        InterfaceC39032oi interfaceC39032oi = this.f381766c;
        String strB = this.f381765b.b();
        C38783ei.a aVar = (C38783ei.a) interfaceC39032oi;
        synchronized (C38783ei.this.f380497b) {
            try {
                C38783ei.this.f380498c = c39057pi;
                Collection collectionA = C38783ei.this.f380496a.a(strB);
                if (collectionA == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collectionA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC38932ki) it.next()).a(c39057pi);
        }
    }

    public synchronized boolean a(@j.P List<String> list, @j.N Map<String, String> map) {
        return !C39007ni.a(this.f381769f.d(), list, map, new a());
    }

    public synchronized void a(@j.N Mg.b bVar) {
        boolean z12;
        try {
            this.f381769f.a(bVar);
            Mg mgB = this.f381769f.b();
            if (mgB.K()) {
                List<String> listG = mgB.G();
                boolean z13 = true;
                C39057pi.a aVarB = null;
                if (!A2.b(listG) || A2.b(mgB.J())) {
                    z12 = false;
                } else {
                    aVarB = this.f381769f.d().a().b((List<String>) null);
                    z12 = true;
                }
                if (A2.b(listG) || A2.a(listG, mgB.J())) {
                    z13 = z12;
                } else {
                    aVarB = this.f381769f.d().a().b(listG);
                }
                if (z13) {
                    C39057pi c39057piA = aVarB.a();
                    b(c39057piA);
                    a(c39057piA);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
