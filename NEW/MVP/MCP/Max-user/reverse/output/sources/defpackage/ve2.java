package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.Symbol;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.exception.ChatNotFoundException;
import ru.ok.tamtam.exception.UserNotFoundException;

/* loaded from: classes2.dex */
public final class ve2 implements si2 {
    public static final o00 I = new o00(8);
    public static final o00 J = new o00(9);
    public static final EnumSet K;
    public static final EnumSet L;
    public static final EnumSet M;
    public static final uy0 N;
    public final kz4 A;
    public final k18 B;
    public final k18 C;
    public final lzf D;
    public final kz4 E;
    public final us F;
    public ue2 G;
    public final ReentrantLock H;
    public final tcf a = ucf.a(null);
    public final n9a b;
    public final n8a c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public final ConcurrentHashMap g;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public volatile boolean k;
    public final rt7 l;
    public final kz4 m;
    public final tw0 n;
    public final z7c o;
    public final kz4 p;
    public final kz4 q;
    public final kz4 r;
    public final kz4 s;
    public final kz4 t;
    public final k18 u;
    public final kz4 v;
    public final kz4 w;
    public final kz4 x;
    public final kz4 y;
    public final kz4 z;

    static {
        of2 of2Var = of2.X;
        of2 of2Var2 = of2.Y;
        of2 of2Var3 = of2.b;
        of2[] of2VarArr = {of2Var3, of2.c, of2.o, of2.d, of2Var, of2Var2};
        of2 of2Var4 = of2.a;
        K = EnumSet.of(of2Var4, of2VarArr);
        L = EnumSet.of(of2Var4, of2Var3);
        M = EnumSet.of(of2Var4);
        N = new uy0(27);
    }

    public ve2(kz4 kz4Var, tw0 tw0Var, z7c z7cVar, kz4 kz4Var2, kz4 kz4Var3, kz4 kz4Var4, kz4 kz4Var5, kz4 kz4Var6, kz4 kz4Var7, kz4 kz4Var8, kz4 kz4Var9, kz4 kz4Var10, kz4 kz4Var11, kz4 kz4Var12, kz4 kz4Var13, k18 k18Var, lzf lzfVar, k18 k18Var2, k18 k18Var3) {
        Symbol symbol = o9a.a;
        this.b = new n9a();
        this.c = new n8a(40);
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = false;
        this.l = new rt7(null);
        this.F = new us(0);
        this.H = new ReentrantLock();
        this.m = kz4Var;
        this.n = tw0Var;
        this.o = z7cVar;
        this.p = kz4Var2;
        this.E = kz4Var11;
        this.q = kz4Var3;
        this.r = kz4Var4;
        this.s = kz4Var5;
        this.t = kz4Var6;
        this.v = kz4Var7;
        this.w = kz4Var8;
        this.x = kz4Var9;
        this.y = kz4Var10;
        this.z = kz4Var12;
        this.A = kz4Var13;
        this.B = k18Var;
        this.D = lzfVar;
        this.u = k18Var2;
        this.C = k18Var3;
    }

    public static void A(af2 af2Var) {
        hf2 hf2Var = af2Var.o;
        if (hf2Var == null) {
            hf2Var = hf2.h;
        }
        gf2 gf2VarA = hf2Var.a();
        gf2VarA.e = 0L;
        af2Var.o = new hf2(gf2VarA);
    }

    public static rf2 D(long j, long j2, int i, long j3, Map map, long j4, int i2, long j5, long j6, hfd hfdVar) {
        af2 af2Var = new af2();
        F(af2Var, j, j2, i, j3, map, j4, i2, j5, j6, "", "", hfdVar);
        return new rf2(af2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void F(defpackage.af2 r9, long r10, long r12, int r14, long r15, java.util.Map r17, long r18, int r20, long r21, long r23, java.lang.String r25, java.lang.String r26, defpackage.hfd r27) {
        /*
            r2 = r15
            r4 = r27
            r5 = 0
            r7 = 2
            if (r14 == r7) goto Lc
            int r8 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r8 == 0) goto Le
        Lc:
            r9.l = r12
        Le:
            if (r14 == r7) goto L14
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 == 0) goto L16
        L14:
            r9.a = r10
        L16:
            int r10 = defpackage.az1.v(r14)
            r11 = 3
            r0 = 1
            if (r10 == r0) goto L2f
            if (r10 == r7) goto L2c
            if (r10 == r11) goto L29
            r1 = 4
            if (r10 == r1) goto L26
            goto L2c
        L26:
            pf2 r10 = defpackage.pf2.d
            goto L31
        L29:
            pf2 r10 = defpackage.pf2.c
            goto L31
        L2c:
            pf2 r10 = defpackage.pf2.b
            goto L31
        L2f:
            pf2 r10 = defpackage.pf2.a
        L31:
            r9.b = r10
            if (r14 != r11) goto L5a
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.util.List r10 = java.util.Collections.singletonList(r10)
            r9.I = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            ye2 r11 = new ye2
            r11.<init>()
            r11.b = r2
            r1 = 4095(0xfff, float:5.738E-42)
            r11.a = r1
            ze2 r1 = new ze2
            r1.<init>(r11)
            java.util.Map r10 = java.util.Collections.singletonMap(r10, r1)
            r9.d(r10)
        L5a:
            if (r20 == 0) goto L67
            int r10 = defpackage.az1.v(r20)
            if (r10 == r0) goto L63
            goto L64
        L63:
            r7 = r0
        L64:
            r9.o0 = r7
            goto L69
        L67:
            r9.o0 = r7
        L69:
            of2 r10 = defpackage.of2.Y
            r9.c = r10
            r9.d = r2
            int r10 = r17.size()
            r9.G = r10
            java.util.Map r10 = r9.c()
            r11 = r17
            r10.putAll(r11)
            r10 = r18
            r9.k = r10
            r10 = r21
            r9.m0 = r10
            r10 = r23
            r9.n0 = r10
            r10 = r25
            r9.g = r10
            r10 = r26
            r9.h = r10
            if (r4 == 0) goto La1
            java.lang.Object r10 = r4.b
            long[] r10 = (long[]) r10
            int r11 = r10.length
            if (r11 <= 0) goto La1
            if2 r11 = new if2
            r11.<init>(r10)
            goto La2
        La1:
            r11 = 0
        La2:
            r9.D = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve2.F(af2, long, long, int, long, java.util.Map, long, int, long, long, java.lang.String, java.lang.String, hfd):void");
    }

    public static df2 R(rf2 rf2Var, Set set) {
        if (s00.C0.equals(set)) {
            df2 df2Var = rf2Var.p;
            return df2Var != null ? df2Var : df2.g;
        }
        if (s00.D0.equals(set)) {
            df2 df2Var2 = rf2Var.q;
            return df2Var2 != null ? df2Var2 : df2.g;
        }
        if (s00.E0.equals(set)) {
            df2 df2Var3 = rf2Var.r;
            return df2Var3 != null ? df2Var3 : df2.g;
        }
        if (s00.F0.equals(set)) {
            df2 df2Var4 = rf2Var.s;
            return df2Var4 != null ? df2Var4 : df2.g;
        }
        if (s00.G0.equals(set)) {
            df2 df2Var5 = rf2Var.t;
            return df2Var5 != null ? df2Var5 : df2.g;
        }
        if (s00.H0.equals(set)) {
            df2 df2Var6 = rf2Var.u;
            return df2Var6 != null ? df2Var6 : df2.g;
        }
        if (s00.I0.equals(set)) {
            df2 df2Var7 = rf2Var.v;
            return df2Var7 != null ? df2Var7 : df2.g;
        }
        if (s00.J0.equals(set)) {
            df2 df2Var8 = rf2Var.w;
            return df2Var8 != null ? df2Var8 : df2.g;
        }
        df2 df2Var9 = df2.f;
        return new df2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
    }

    public static /* synthetic */ String l(String str) {
        return ho7.i("syncSelf(", str, "): unlocked");
    }

    public static void t0(af2 af2Var, si9 si9Var) {
        if (si9Var.u()) {
            return;
        }
        af2Var.j = si9Var.a;
        long j = af2Var.k;
        long j2 = si9Var.c;
        if (j2 > j) {
            af2Var.k = j2;
            return;
        }
        long j3 = si9Var.u0;
        if (j3 > j) {
            af2Var.k = j3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean w(defpackage.pb2 r9, java.util.Set r10, boolean r11) {
        /*
            rf2 r0 = r9.b
            pf2 r1 = r0.b
            pf2 r2 = defpackage.pf2.c
            r3 = 0
            r5 = 1
            r6 = 0
            if (r1 != r2) goto L5a
            boolean r10 = r9.M()
            if (r10 == 0) goto L24
            boolean r10 = r9.m0()
            if (r10 != 0) goto L24
            hf2 r10 = r0.a()
            long r0 = r10.e
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 != 0) goto L24
            goto L93
        L24:
            if (r11 == 0) goto L53
            boolean r10 = r9.B()
            if (r10 != 0) goto L43
            boolean r10 = r9.i0()
            if (r10 != 0) goto L43
            long r10 = r9.X
            int r10 = r9.g(r10)
            r11 = 512(0x200, float:7.17E-43)
            boolean r10 = defpackage.ppi.d(r10, r11)
            if (r10 == 0) goto L41
            goto L43
        L41:
            r10 = r6
            goto L44
        L43:
            r10 = r5
        L44:
            boolean r11 = r9.A()
            if (r11 != 0) goto L4c
            if (r10 == 0) goto L93
        L4c:
            boolean r9 = r9.F()
            if (r9 == 0) goto L93
            goto L76
        L53:
            boolean r9 = r9.h0()
            if (r9 == 0) goto L93
            goto L76
        L5a:
            of2 r1 = r0.c
            if (r11 != 0) goto L77
            boolean r11 = r9.N()
            if (r11 == 0) goto L77
            boolean r11 = r9.j0()
            if (r11 == 0) goto L77
            boolean r11 = r9.i0()
            if (r11 != 0) goto L77
            boolean r11 = r9.P()
            if (r11 == 0) goto L77
        L76:
            return r5
        L77:
            boolean r11 = r9.N()
            if (r11 == 0) goto L94
            boolean r11 = r9.j0()
            if (r11 != 0) goto L94
            boolean r9 = r9.F()
            if (r9 == 0) goto L94
            hf2 r9 = r0.a()
            long r7 = r9.e
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L94
        L93:
            return r6
        L94:
            boolean r9 = r10.contains(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve2.w(pb2, java.util.Set, boolean):boolean");
    }

    public final int B(long j, long j2) throws Throwable {
        wqi.c("ve2", "clearMessagesInChat id=%d, time=%d", Long.valueOf(j), Long.valueOf(j2));
        qi9 qi9Var = (qi9) this.t.get();
        qi9Var.getClass();
        int iD = qi9Var.d(j, j2, rs4.REGULAR);
        G(j, null, j2);
        H(j);
        return iD;
    }

    public final void C() {
        if (this.k && !this.h.isEmpty()) {
            for (pb2 pb2Var : this.h.values()) {
                pb2Var.t0 = null;
                pb2Var.u0 = null;
                pb2Var.w0 = null;
                pb2Var.v0.set(null);
            }
            this.n.c(new n73(Collections.EMPTY_LIST, true));
        }
    }

    public final pb2 E() throws Throwable {
        Object obj;
        si9 si9VarB;
        tcf tcfVar = this.a;
        if (tcfVar.getValue() != null) {
            return (pb2) tcfVar.getValue();
        }
        if (this.o.a.s() == -1) {
            throw new UserNotFoundException("no user id");
        }
        long jU = U();
        kz4 kz4Var = this.m;
        jrd jrdVar = ((ie4) kz4Var.get()).b;
        jrdVar.getClass();
        sf2 sf2Var = (sf2) ((OneMeRoomDatabase) jrdVar.a.l()).o(new frd(0, new j63(jrdVar, jU, 2)));
        if (sf2Var == null) {
            obj = null;
            rf2 rf2VarD = D(0L, 0L, 2, jU, Collections.singletonMap(Long.valueOf(jU), 0L), 0L, 3, 0L, 0L, null);
            si9VarB = null;
            sf2Var = new sf2(((ie4) kz4Var.get()).b.e(rf2VarD), rf2VarD);
        } else {
            obj = null;
            bsd bsdVar = ((ie4) kz4Var.get()).c;
            gj9 gj9VarD = bsdVar.d().d(sf2Var.b.j);
            si9VarB = gj9VarD != null ? bsdVar.b(gj9VarD) : null;
        }
        this.f.put(Long.valueOf(sf2Var.a), sf2Var);
        tcfVar.m(obj, q(sf2Var, si9VarB));
        return (pb2) tcfVar.getValue();
    }

    public final void G(long j, af2 af2Var, long j2) throws Throwable {
        if (j2 == BuildConfig.MAX_TIME_TO_UPLOAD) {
            j2--;
        }
        si9 si9VarN = ((qi9) this.t.get()).n(j, 1 + j2);
        wqi.c("ve2", "findAndUpdateFirstMessage, chatId = %d, time = %s, message = %s", Long.valueOf(j), d8j.a(Long.valueOf(j2)), si9VarN);
        if (af2Var == null) {
            r(j, false, new be2(si9VarN != null ? si9VarN.a : 0L, 2));
        } else {
            af2Var.x = si9VarN != null ? si9VarN.a : 0L;
        }
    }

    public final void H(long j) {
        qi9 qi9Var = (qi9) this.t.get();
        qi9Var.getClass();
        s0(j, qi9Var.a.c.m(j, rs4.REGULAR), true);
    }

    public final ArrayList I(uy0 uy0Var) {
        return N(L, false, new ny1(this.o.a.s(), uy0Var, 1));
    }

    public final pb2 J(long j) {
        Long lValueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = this.i;
        pb2 pb2Var = (pb2) concurrentHashMap.get(lValueOf);
        if (pb2Var != null) {
            return pb2Var;
        }
        p();
        return (pb2) concurrentHashMap.get(Long.valueOf(j));
    }

    public final sf2 K(long j) {
        sf2 sf2Var = (sf2) this.f.get(Long.valueOf(j));
        return (sf2Var != null || this.k) ? sf2Var : h0(j);
    }

    public final sf2 L(long j) {
        sf2 sf2Var = (sf2) this.g.get(Long.valueOf(j));
        return (sf2Var != null || this.k) ? sf2Var : ((ie4) this.m.get()).b.g(j);
    }

    public final pb2 M(long j) {
        Long lValueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = this.h;
        pb2 pb2Var = (pb2) concurrentHashMap.get(lValueOf);
        if (pb2Var != null) {
            return x(pb2Var);
        }
        p();
        return x((pb2) concurrentHashMap.get(Long.valueOf(j)));
    }

    public final ArrayList N(Set set, boolean z, n7c n7cVar) {
        boolean zF;
        p();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.h.entrySet().iterator();
        while (it.hasNext()) {
            pb2 pb2Var = (pb2) ((Map.Entry) it.next()).getValue();
            if (n7cVar != null) {
                try {
                    zF = n7cVar.f(pb2Var);
                } catch (Exception unused) {
                }
            } else {
                zF = true;
            }
            if (zF) {
                gu5 gu5Var = this.o.e;
                if (w(pb2Var, set, z)) {
                    arrayList.add(pb2Var);
                }
            }
        }
        return arrayList;
    }

    public final List O(Comparator comparator) {
        ArrayList arrayListI = I(null);
        Collections.sort(arrayListI, comparator);
        return Collections.unmodifiableList(arrayListI);
    }

    public final pb2 P(long j) {
        return (pb2) this.e.get(Long.valueOf(j ^ U()));
    }

    public final int Q() {
        Iterator it = this.h.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((pb2) it.next()).b.a().e != 0) {
                i++;
            }
        }
        return i;
    }

    public final f9a S(long j) {
        Long lValueOf = Long.valueOf(j);
        us usVar = this.F;
        Object objA = usVar.get(lValueOf);
        if (objA == null) {
            objA = ucf.a(null);
            usVar.put(lValueOf, objA);
        }
        return (f9a) objA;
    }

    public final tcf T() {
        tcf tcfVar = this.a;
        if (tcfVar.getValue() == null) {
            ((y3b) ((yi5) this.p.get())).a(new te2("ONEME-21606", null, null));
        }
        return tcfVar;
    }

    public final long U() {
        return this.o.a.s();
    }

    public final boolean V(long j, bf2 bf2Var) {
        pb2 pb2VarM = M(j);
        return pb2VarM != null && pb2VarM.b.B.contains(bf2Var);
    }

    public final si9 W(long j, fh9 fh9Var) throws Throwable {
        wqi.c("ve2", "insertMessageIfNeeded", new Object[0]);
        if (fh9Var == null) {
            return null;
        }
        long j2 = fh9Var.X;
        kz4 kz4Var = this.t;
        si9 si9VarI = ((qi9) kz4Var.get()).i(j, fh9Var.a);
        if (si9VarI != null) {
            return si9VarI;
        }
        if (j2 != 0) {
            bsd bsdVar = ((qi9) kz4Var.get()).a.c;
            gj9 gj9VarH = bsdVar.d().h(j, j2);
            si9 si9VarB = gj9VarH != null ? bsdVar.b(gj9VarH) : null;
            if (si9VarB != null && si9VarB.b == 0) {
                wqi.c("ve2", "last message for chat %d founded by cid %d. Update it", Long.valueOf(j), Long.valueOf(j2));
                bsd bsdVar2 = ((ie4) this.m.get()).c;
                List list = xi9.b;
                bsdVar2.t(j, this.o.a.s(), fh9Var, null, false);
                ((qi9) kz4Var.get()).s(si9VarB, po8.e(fh9Var.Z, (m4e) this.r.get()));
                return ((qi9) kz4Var.get()).m(si9VarB.a);
            }
        }
        wqi.c("ve2", "insertMessageIfNeeded: insert message, cid = %d, chatId = %d, chatId = %d", Long.valueOf(j2), Long.valueOf(j), Long.valueOf(fh9Var.b));
        return ((qi9) kz4Var.get()).m(((qi9) kz4Var.get()).f(j, U(), fh9Var));
    }

    public final void X() {
        kmb kmbVar;
        p();
        if (this.h.isEmpty()) {
            return;
        }
        Iterator it = this.h.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                this.n.c(new n73(Collections.EMPTY_LIST, true));
                return;
            }
            pb2 pb2Var = (pb2) it.next();
            boolean z = pb2Var.t0 != null;
            boolean z2 = pb2Var.u0 != null;
            boolean z3 = pb2Var.w0 != null;
            boolean z4 = pb2Var.v0.get() != null;
            pb2Var.t0 = null;
            pb2Var.u0 = null;
            pb2Var.w0 = null;
            pb2Var.v0.set(null);
            if (z) {
                pb2Var.p0();
            }
            if (z2) {
                pb2Var.o0();
            }
            if (z3) {
                pb2Var.q0();
            }
            if (z4 && (kmbVar = (kmb) pb2Var.v0.updateAndGet(new nb2(pb2Var, 0))) != null) {
            }
        }
    }

    public final boolean Y(pb2 pb2Var) {
        pb2 pb2Var2;
        if (pb2Var == null || (pb2Var2 = (pb2) T().getValue()) == null) {
            return false;
        }
        return pb2Var == pb2Var2 || pb2Var.a == pb2Var2.a;
    }

    public final void Z(long j) {
        long j2;
        long jC;
        final pb2 pb2VarM = M(j);
        if (pb2VarM != null) {
            r(j, false, new iu3() { // from class: fe2
                @Override // defpackage.iu3
                public final void accept(Object obj) {
                    af2 af2Var = (af2) obj;
                    ve2 ve2Var = this.a;
                    ve2Var.getClass();
                    Map mapC = af2Var.c();
                    z7c z7cVar = ve2Var.o;
                    mapC.remove(Long.valueOf(z7cVar.a.s()));
                    if (pb2VarM.g0()) {
                        Iterator it = Collections.singletonList(Long.valueOf(z7cVar.a.s())).iterator();
                        while (it.hasNext()) {
                            af2Var.R.remove((Long) it.next());
                        }
                    }
                    ve2.A(af2Var);
                    af2Var.x = 0L;
                }
            });
        }
        pb2 pb2VarS = s(j, of2.b);
        dkb dkbVar = (dkb) this.w.get();
        rf2 rf2Var = pb2VarS.b;
        long j3 = rf2Var.a;
        dkbVar.getClass();
        dkb.a(j3);
        hwa hwaVar = (hwa) this.q.get();
        long j4 = rf2Var.a;
        if (hwaVar.j(j)) {
            j2 = j;
            jC = hwaVar.u().c(new ui2(hwaVar.t().a.k(), j2, j4), false, 0L, (12 & 8) != 0 ? 0 : 1);
        } else {
            jC = 0;
            j2 = j;
        }
        k18 k18Var = this.B;
        if (k18Var.getValue() != null) {
            ((va4) k18Var.getValue()).getClass();
        }
        n73 n73Var = new n73(Collections.singletonList(Long.valueOf(j2)), true);
        tw0 tw0Var = this.n;
        tw0Var.c(n73Var);
        tw0Var.c(new vi2(jC, j2));
    }

    public final void a0(long j, af2 af2Var, si9 si9Var) {
        Long lValueOf = Long.valueOf(af2Var.a);
        d10 d10VarK = si9Var.k();
        long j2 = si9Var.o;
        wqi.c("ve2", "onControlMessage, chatId = %d, messageDb.event = %s", lValueOf, d10VarK.a);
        d10 d10VarK2 = si9Var.k();
        c10 c10Var = d10VarK2.a;
        long j3 = d10VarK2.b;
        int iOrdinal = c10Var.ordinal();
        bf2 bf2Var = bf2.c;
        switch (iOrdinal) {
            case 1:
            case 2:
                Iterator it = d10VarK2.c.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    if (!V(j, bf2Var)) {
                        af2Var.c().put(l, 0L);
                    }
                }
                break;
            case 3:
                if (!V(j, bf2Var)) {
                    af2Var.c().remove(Long.valueOf(j3));
                }
                if (j3 == U()) {
                    af2Var.c = of2.b;
                    break;
                }
                break;
            case 4:
                af2Var.c().remove(Long.valueOf(j2));
                if (j2 == U()) {
                    af2Var.c = of2.d;
                    break;
                }
                break;
            case 5:
                if (!V(j, bf2.a)) {
                    af2Var.g = d10VarK2.d;
                    break;
                }
                break;
            case 6:
                if (!V(j, bf2.b)) {
                    af2Var.h = d10VarK2.f;
                    break;
                }
                break;
        }
    }

    public final pb2 b0(final long j, final long j2, final si9 si9Var) {
        StringBuilder sbL = az1.l(j, "onMsgSend, chatId = ", ", serverChatId = ");
        sbL.append(j2);
        sbL.append(", messageDb = ");
        sbL.append(si9Var);
        wqi.c("ve2", sbL.toString(), new Object[0]);
        return r(j, true, new iu3() { // from class: yd2
            /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
            @Override // defpackage.iu3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r23) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 364
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.yd2.accept(java.lang.Object):void");
            }
        });
    }

    public final pb2 c0(final long j, final boolean z, final si9 si9Var, final boolean z2, final long j2) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                StringBuilder sbL = az1.l(j, "onNotifMessage: chatId=", ",message=");
                sbL.append(si9Var.a);
                sbL.append(",updateNewMessage=");
                sbL.append(z2);
                l6bVar.c(lg8Var, "ve2", sbL.toString(), null);
            }
        }
        return r(j, true, new iu3() { // from class: zd2
            @Override // defpackage.iu3
            public final void accept(Object obj) throws Throwable {
                long j3;
                boolean z3;
                long j4;
                si9 si9VarI;
                Long l;
                af2 af2Var = (af2) obj;
                ve2 ve2Var = this.a;
                kz4 kz4Var = ve2Var.t;
                z7c z7cVar = ve2Var.o;
                si9 si9Var2 = si9Var;
                boolean zU = si9Var2.u();
                rs4 rs4Var = si9Var2.R0;
                long j5 = si9Var2.b;
                long j6 = si9Var2.a;
                si9 si9Var3 = si9Var2.A0;
                long j7 = si9Var2.o;
                long j8 = si9Var2.c;
                if (zU) {
                    return;
                }
                if (j8 > z7cVar.a.v()) {
                    z7cVar.a.x(j8);
                }
                if (j8 > af2Var.k) {
                    af2Var.k = j8;
                }
                if (af2Var.j != 0) {
                    j3 = j8;
                    si9 si9VarM = ((qi9) kz4Var.get()).m(af2Var.j);
                    if (si9VarM != null && j3 > si9VarM.c) {
                        af2Var.j = j6;
                    }
                } else {
                    j3 = j8;
                    af2Var.j = j6;
                }
                if (j7 != ve2Var.U()) {
                    List list = si9Var2.N0;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (((cj9) it.next()).a == ve2Var.U()) {
                                af2Var.h0 = j5;
                                break;
                            }
                        }
                    }
                    if (si9Var3 != null && si9Var2.y0 == 1 && si9Var3.o == ve2Var.U()) {
                        af2Var.h0 = j5;
                    }
                }
                boolean z4 = z;
                long j9 = j;
                if (!z4 && z2) {
                    if (af2Var.c().containsKey(Long.valueOf(ve2Var.U())) && ((Long) af2Var.c().get(Long.valueOf(ve2Var.U()))).longValue() < j3) {
                        af2Var.m++;
                        af2Var.N = (si9Var2.y() && si9Var3.o == ve2Var.U()) | af2Var.N;
                    } else if (ve2Var.M(j9).I()) {
                        af2Var.m++;
                        af2Var.N = (si9Var2.y() && si9Var3.o == 0) | af2Var.N;
                    }
                }
                if (!z4 && (l = (Long) af2Var.c().get(Long.valueOf(j7))) != null && l.longValue() < j3) {
                    af2Var.c().put(Long.valueOf(j7), Long.valueOf(j3));
                }
                if (si9Var2.D()) {
                    ve2Var.a0(j9, af2Var, si9Var2);
                }
                long j10 = j2;
                if (j10 <= 0 || (si9VarI = ((qi9) kz4Var.get()).i(j9, j10)) == null || !p4j.d(af2Var.n, si9VarI.c, si9Var2.c, si9Var2.R0)) {
                    long j11 = j3;
                    jf2 jf2VarF = p4j.f(j11, af2Var.n.d(rs4Var));
                    if (jf2VarF != null) {
                        long j12 = jf2VarF.a;
                        z3 = z4;
                        j4 = jf2VarF.b;
                        if (j12 == j4) {
                        }
                        p4j.h(af2Var.n, j11, rs4Var);
                        wqi.c("ve2", "onNotifMessage: prevMesssage not found, load history to backwardTime=" + j4, new Object[0]);
                        mh2 mh2Var = (mh2) ve2Var.E.get();
                        long j13 = af2Var.a;
                        long j14 = si9Var2.c;
                        rs4 rs4Var2 = si9Var2.R0;
                        mh2Var.getClass();
                        mh2.c(mh2Var, j9, j13, j14, j4, 0L, rs4Var2);
                    } else {
                        z3 = z4;
                    }
                    j4 = 0;
                    p4j.h(af2Var.n, j11, rs4Var);
                    wqi.c("ve2", "onNotifMessage: prevMesssage not found, load history to backwardTime=" + j4, new Object[0]);
                    mh2 mh2Var2 = (mh2) ve2Var.E.get();
                    long j132 = af2Var.a;
                    long j142 = si9Var2.c;
                    rs4 rs4Var22 = si9Var2.R0;
                    mh2Var2.getClass();
                    mh2.c(mh2Var2, j9, j132, j142, j4, 0L, rs4Var22);
                } else {
                    wqi.c("ve2", "onNotifMessage: prevMesssage found, extend its chunk", new Object[0]);
                    z3 = z4;
                }
                if (z3) {
                    long jM = si9Var2.m();
                    if (af2Var.Z < jM) {
                        af2Var.Z = jM;
                    }
                }
            }
        });
    }

    public final void d0(long j, pb2 pb2Var, boolean z) {
        Long lValueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = this.h;
        boolean zContainsKey = concurrentHashMap.containsKey(lValueOf);
        concurrentHashMap.put(Long.valueOf(j), pb2Var);
        long jU = U();
        rf2 rf2Var = pb2Var.b;
        boolean zE = rf2Var.e(jU);
        if (!zE) {
            this.e.put(Long.valueOf(rf2Var.l), pb2Var);
        }
        if (zE || rf2Var.a != 0) {
            this.i.put(Long.valueOf(rf2Var.a), pb2Var);
        }
        boolean zC = l8g.c(rf2Var.I);
        ConcurrentHashMap concurrentHashMap2 = this.j;
        if (zC) {
            concurrentHashMap2.remove(Long.valueOf(j));
        } else {
            concurrentHashMap2.put(Long.valueOf(j), pb2Var);
        }
        if (zContainsKey && z) {
            this.n.c(new n73(Collections.singletonList(Long.valueOf(j)), false, false, rs4.REGULAR, null, true, rd5.a));
            List listSingletonList = Collections.singletonList(pb2Var);
            ue2 ue2Var = this.G;
            if (ue2Var != null) {
                ue2Var.a(listSingletonList);
            }
        }
    }

    public final void e0(long j, sf2 sf2Var) {
        this.f.put(Long.valueOf(j), sf2Var);
        rf2 rf2Var = sf2Var.b;
        long j2 = rf2Var.a;
        if (j2 != 0 || rf2Var.e(this.o.a.s())) {
            this.g.put(Long.valueOf(j2), sf2Var);
        }
        this.d.put(Long.valueOf(sf2Var.b.l), sf2Var);
    }

    public final void f0(long j, boolean z) {
        wy1.q(j, "removeFromFavorites: ", "ve2");
        j0(j, 0L, z);
    }

    public final void g0(long j, bf2 bf2Var) {
        if (V(j, bf2Var)) {
            r(j, false, new ie2(bf2Var, 1));
        }
    }

    public final sf2 h0(long j) {
        jrd jrdVar = ((ie4) this.m.get()).b;
        jrdVar.getClass();
        return (sf2) svi.g(bd5.a, new grd(jrdVar, j, null));
    }

    public final void i0(long j, boolean z) {
        wqi.c("ve2", "setChatSubscribedToUpdates: chatId=%d, subscribed=%b", Long.valueOf(j), Boolean.valueOf(z));
        try {
            k0(j, new ke2(z, 2));
        } catch (Throwable th) {
            wqi.e("ve2", "setChatSubscribedToUpdates fail!", th);
        }
    }

    public final void j0(long j, long j2, boolean z) {
        r(j, false, new be2(j2, 1));
        if (z) {
            ((hwa) this.q.get()).m(j);
        }
        this.n.c(new n73(Collections.singletonList(Long.valueOf(j)), true));
    }

    public final pb2 k0(long j, ke2 ke2Var) {
        pb2 pb2VarM = M(j);
        if (pb2VarM == null) {
            wqi.c("ve2", "changeChatField: chat with id = " + j + " not found", new Object[0]);
            return null;
        }
        rf2 rf2Var = pb2VarM.b;
        ke2Var.accept(pb2VarM);
        sf2 sf2VarK = K(j);
        e0(j, sf2VarK != null ? new sf2(sf2VarK.a, rf2Var) : new sf2(j, rf2Var));
        d0(j, pb2VarM, false);
        ((ie4) this.m.get()).b.i(pb2VarM.a, rf2Var);
        return pb2VarM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024d  */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v8, types: [af2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pb2 l0(defpackage.qb2 r51, defpackage.fy2 r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve2.l0(qb2, fy2):pb2");
    }

    public final pb2 m(pf2 pf2Var, List list, String str, String str2) {
        sf2 sf2Var;
        lg8 lg8Var = lg8.d;
        if (pf2Var == pf2.a) {
            Long l = (Long) list.get(0);
            long jLongValue = l.longValue();
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ve2", vb9.e(jLongValue, "insertDialog contactId="), null);
            }
            long jU = U();
            long jU2 = U() ^ jLongValue;
            us usVar = new us(2);
            usVar.put(Long.valueOf(jU), 0L);
            usVar.put(l, 0L);
            rf2 rf2VarD = D(jU2, jU2, 2, jU, usVar, 0L, 3, 0L, 0L, null);
            pb2 pb2VarP = P(jLongValue);
            if (pb2VarP != null) {
                ((ie4) this.m.get()).b.i(pb2VarP.a, rf2VarD);
                sf2Var = new sf2(pb2VarP.a, pb2VarP.b);
            } else {
                sf2Var = new sf2(((ie4) this.m.get()).b.e(rf2VarD), rf2VarD);
            }
        } else {
            long jU3 = U();
            long jNanoTime = System.nanoTime();
            us usVar2 = new us(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                usVar2.put((Long) it.next(), 0L);
            }
            usVar2.put(Long.valueOf(jU3), 0L);
            af2 af2Var = new af2();
            F(af2Var, 0L, jNanoTime, 3, jU3, usVar2, 0L, 3, 0L, 0L, str, str2, null);
            rf2 rf2Var = new rf2(af2Var);
            sf2Var = new sf2(((ie4) this.m.get()).b.e(rf2Var), rf2Var);
        }
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, "ve2", "add chat; chatId=" + sf2Var.a + ",type=" + pf2Var, null);
        }
        e0(sf2Var.a, sf2Var);
        return q0(sf2Var.a, false);
    }

    public final n8a m0(List list) {
        return n0(list, null, 20);
    }

    public final void n(long j, bf2 bf2Var) {
        if (V(j, bf2Var)) {
            return;
        }
        r(j, false, new ie2(bf2Var, 0));
    }

    public final n8a n0(List list, Map map, int i) {
        return (list == null || list.isEmpty()) ? new n8a((Object) null) : (n8a) p0("storeChatsFromServer", new bd0(this, list, map, i, 2));
    }

    public final void o(long j, List list) {
        pb2 pb2VarM = M(j);
        if (pb2VarM != null) {
            r(j, false, new je2(0, list));
            this.n.c(new n73(Collections.singletonList(Long.valueOf(pb2VarM.a)), false));
        }
    }

    public final void o0(xs xsVar, rs4 rs4Var) {
        wqi.c("ve2", "syncMessages, itemType = %s, chatIds size = %d", rs4Var.name(), Integer.valueOf(xsVar.c));
        qs qsVar = new qs(xsVar);
        while (qsVar.hasNext()) {
            Long l = (Long) qsVar.next();
            wqi.c("ve2", "syncMessages, itemType = %s, chatId = %d", rs4Var.name(), l);
            rs4 rs4Var2 = rs4Var;
            ((a3g) this.v.get()).g(new rhe(this.o.a.k(), l.longValue(), 0, rs4Var2), 0L, 0);
            rs4Var = rs4Var2;
        }
        she.v((c6i) this.x.get());
    }

    public final void p() {
        if (this.k) {
            return;
        }
        p0("awaitLoading", new i62(5, new ae2(this, 0)));
    }

    public final Object p0(String str, frf frfVar) {
        l6b l6bVar;
        lg8 lg8Var = lg8.d;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, "ve2", "syncSelf(" + str + ')', null);
        }
        if (this.H.isLocked() && (l6bVar = wqi.a) != null) {
            lg8 lg8Var2 = lg8.X;
            if (l6bVar.b(lg8Var2)) {
                StringBuilder sbN = az1.n("syncSelf(", str, "): self is locked! ");
                sbN.append(this.H.getHoldCount());
                l6bVar.c(lg8Var2, "ve2", sbN.toString(), null);
            }
        }
        this.H.lock();
        try {
            Object obj = frfVar.get();
            this.H.unlock();
            l6b l6bVar3 = wqi.a;
            if (l6bVar3 == null || !l6bVar3.b(lg8Var)) {
                return obj;
            }
            l6bVar3.c(lg8Var, "ve2", l(str), null);
            return obj;
        } catch (Throwable th) {
            this.H.unlock();
            l6b l6bVar4 = wqi.a;
            if (l6bVar4 != null && l6bVar4.b(lg8Var)) {
                l6bVar4.c(lg8Var, "ve2", l(str), null);
            }
            throw th;
        }
    }

    public final pb2 q(sf2 sf2Var, si9 si9Var) {
        pb2 pb2VarB = ((vg2) this.y.get()).b(sf2Var, si9Var);
        d0(sf2Var.a, pb2VarB, true);
        return pb2VarB;
    }

    public final pb2 q0(long j, boolean z) {
        si9 si9VarI;
        pb2 pb2VarM = M(j);
        sf2 sf2VarK = K(j);
        if (sf2VarK == null) {
            throw new ChatNotFoundException(vb9.e(j, "chat is null for #"));
        }
        rf2 rf2Var = sf2VarK.b;
        pb2 pb2VarA = null;
        if (pb2VarM == null || z) {
            return q(sf2VarK, null);
        }
        long j2 = rf2Var.j;
        rf2 rf2Var2 = pb2VarM.b;
        boolean z2 = j2 == rf2Var2.j;
        boolean z3 = rf2Var.L == rf2Var2.L;
        boolean z4 = rf2Var.g0 == rf2Var2.g0;
        if (!z2 || !z3 || !z4) {
            return q(sf2VarK, null);
        }
        eh9 eh9Var = pb2VarM.c;
        boolean zJ = pb2VarM.J();
        kz4 kz4Var = this.y;
        if (zJ && eh9Var == null && (si9VarI = ((qi9) this.t.get()).i(j, rf2Var.j)) != null) {
            pb2VarA = ((vg2) kz4Var.get()).b(sf2VarK, si9VarI);
        }
        if (pb2VarA == null) {
            pb2VarA = ((vg2) kz4Var.get()).a(j, this.o.a.s(), sf2VarK.b, eh9Var, pb2VarM.d, pb2VarM.o);
            pb2VarA.t0((qv3) this.s.get());
        }
        d0(j, pb2VarA, true);
        return pb2VarA;
    }

    public final pb2 r(long j, boolean z, iu3 iu3Var) {
        if (K(j) == null) {
            p();
        }
        sf2 sf2VarK = K(j);
        if (sf2VarK == null) {
            wqi.c("ve2", "changeChatField: chat with id = " + j + " not found", new Object[0]);
            return null;
        }
        af2 af2VarH = sf2VarK.b.h();
        try {
            iu3Var.accept(af2VarH);
            e0(j, new sf2(j, new rf2(af2VarH)));
            ((c6i) this.x.get()).b(new ohe(j));
            return q0(j, z);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final void r0(long j, rf2 rf2Var, long j2) {
        wqi.c("ve2", "updateChatWriteTime: chatId=%d, chatWriteTime=%d", Long.valueOf(j), Long.valueOf(j2));
        if (rf2Var == null || rf2Var.Z >= j2) {
            return;
        }
        r(j, false, new be2(j2, 6));
    }

    public final pb2 s(long j, of2 of2Var) {
        return r(j, false, new ee2(of2Var));
    }

    public final pb2 s0(final long j, final si9 si9Var, final boolean z) {
        if (si9Var != null && si9Var.u()) {
            return M(j);
        }
        wqi.c("ve2", "updateLastMessage: chatId = " + j + ", messageDb = " + si9Var + ", force = " + z, new Object[0]);
        return r(j, true, new iu3() { // from class: ne2
            @Override // defpackage.iu3
            public final void accept(Object obj) throws Throwable {
                af2 af2Var = (af2) obj;
                ve2 ve2Var = this.a;
                si9 si9Var2 = si9Var;
                if (si9Var2 == null) {
                    af2Var.j = 0L;
                } else {
                    si9 si9VarM = ((qi9) ve2Var.t.get()).m(af2Var.j);
                    if (z || si9VarM == null || si9Var2.c > si9VarM.c) {
                        ve2.t0(af2Var, si9Var2);
                    }
                }
                ve2Var.n.c(new n73(Collections.singletonList(Long.valueOf(j)), true));
            }
        });
    }

    public final void t(long j, of2 of2Var) {
        wqi.c("ve2", "changeDialogStatus, contactId = " + j + ", status = " + of2Var, new Object[0]);
        pb2 pb2VarP = P(j);
        if (pb2VarP != null) {
            long j2 = pb2VarP.a;
            s(j2, of2Var);
            this.n.c(new n73(Collections.singletonList(Long.valueOf(j2)), true));
        }
    }

    public final void u(long j, long j2, p3b p3bVar) {
        wqi.c("ve2", "Change draft: %d, draft = %s draftUpdateTime = %d", Long.valueOf(j), p3bVar, Long.valueOf(j2));
        r(j, false, new ge2(this, p3bVar, j2, 0));
        this.n.c(new n73(Collections.singletonList(Long.valueOf(j)), true));
    }

    public final void u0(final String str, long j, final long j2, final long j3) {
        wqi.c("ve2", "updateLastPushMessage %d", Long.valueOf(j));
        pb2 pb2VarJ = J(j);
        if (pb2VarJ == null) {
            wqi.o("ve2", null, "updateLastPushMessage: chat not found! %d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
            return;
        }
        long j4 = pb2VarJ.a;
        r(j4, true, new iu3() { // from class: pe2
            @Override // defpackage.iu3
            public final void accept(Object obj) {
                af2 af2Var = (af2) obj;
                af2Var.getClass();
                af2Var.j0 = new mf2(j3, j2, str);
            }
        });
        this.n.c(new n73(Collections.singletonList(Long.valueOf(j4)), true));
    }

    public final void v(pb2 pb2Var, long j) {
        StringBuilder sb = new StringBuilder("changeMuteUntil, chatId = ");
        long j2 = pb2Var.a;
        sb.append(j2);
        sb.append(", dontDisturbUntil = ");
        sb.append(j);
        wqi.c("ve2", sb.toString(), new Object[0]);
        r(j2, false, new be2(j, 0));
        this.n.c(new n73(Collections.singletonList(Long.valueOf(j2)), false));
    }

    public final void v0(int i, long j) {
        wqi.c("ve2", "updateNewMessages, chatId = " + j + ", count = " + i, new Object[0]);
        r(j, false, new le2(this, i));
        this.n.c(new n73(Collections.singletonList(Long.valueOf(j)), false));
    }

    public final void w0(long j) {
        wqi.c("ve2", "updatePinMessage: chatId = %d", Long.valueOf(j));
        q0(j, true);
    }

    public final pb2 x(pb2 pb2Var) throws Throwable {
        if (pb2Var == null) {
            return null;
        }
        rf2 rf2Var = pb2Var.b;
        if (pb2Var.c != null || rf2Var.j == 0) {
            return pb2Var;
        }
        sf2 sf2VarH0 = h0(pb2Var.a);
        si9 si9VarM = ((qi9) this.t.get()).m(rf2Var.j);
        if (si9VarM == null) {
            return pb2Var;
        }
        wqi.o("ve2", null, "checkChat! lastMessage is null but chat.data.getLastMessageId() not 0", Arrays.copyOf(new Object[0], 0));
        ((y3b) ((yi5) this.p.get())).a(new IllegalStateException("check.chat.error"));
        e0(sf2VarH0.a, sf2VarH0);
        return q(sf2VarH0, si9VarM);
    }

    public final pb2 x0(long j, final long j2, final long j3, final int i, final boolean z) {
        wqi.c("ve2", "updateReadMark: chatId=%d, userId=%d, mark=%d, newMessages=%d, notifySelfReadMarkChangedListener=%b", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), Boolean.valueOf(z));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        pb2 pb2VarR = r(j, false, new iu3() { // from class: re2
            @Override // defpackage.iu3
            public final void accept(Object obj) {
                af2 af2Var = (af2) obj;
                ve2 ve2Var = this.a;
                ve2Var.getClass();
                Map mapC = af2Var.c();
                long j4 = j2;
                Long l = (Long) mapC.get(Long.valueOf(j4));
                if (l == null) {
                    return;
                }
                long jLongValue = l.longValue();
                long j5 = j3;
                boolean z2 = false;
                boolean z3 = jLongValue != j5;
                if (z3) {
                    mapC.put(Long.valueOf(j4), Long.valueOf(j5));
                }
                int i2 = i;
                if (i2 >= 0) {
                    af2Var.m = i2;
                }
                if (z && z3 && j4 == ve2Var.U()) {
                    z2 = true;
                }
                atomicBoolean.set(z2);
            }
        });
        if (atomicBoolean.get()) {
            kz4 kz4Var = this.A;
            if (kz4Var.get() != null) {
                ((loa) kz4Var.get()).e(j, j3);
            }
        }
        return pb2VarR;
    }

    public final void y(long j, long j2) throws Throwable {
        wqi.c("ve2", "clearChatInternal: id=%d, time=%d", Long.valueOf(j), Long.valueOf(j2));
        pb2 pb2VarM = M(j);
        if (pb2VarM != null) {
            dkb dkbVar = (dkb) this.w.get();
            long j3 = pb2VarM.b.a;
            dkbVar.getClass();
            dkb.a(j3);
        }
        S(j).setValue(null);
        r(j, false, new be2(1 + j2, 5));
        B(j, j2);
        r(j, false, new be2(j2, 4));
        q4a q4aVar = new q4a(j, 0L, j2, rs4.REGULAR);
        tw0 tw0Var = this.n;
        tw0Var.c(q4aVar);
        tw0Var.c(new n73(Collections.singletonList(Long.valueOf(j)), false));
    }

    public final void z(long j) {
        wqi.c("ve2", "clearDraft, chatId = %d", Long.valueOf(j));
        pb2 pb2VarM = M(j);
        if (pb2VarM == null) {
            wqi.o("ve2", null, "clearDraft: chat is null", Arrays.copyOf(new Object[0], 0));
        } else {
            u(j, pb2VarM.b.d0, null);
        }
    }
}
