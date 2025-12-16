package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.ContextScope;
import one.me.messages.list.loader.MessageModel;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class xw implements ro3 {
    public final ConcurrentHashMap.KeySetView A;
    public final tcf B;
    public final xt4 C;
    public final kce D;
    public final t9f E;
    public final long a;
    public final lzf b;
    public final iv6 c;
    public final sq9 d;
    public final bwf e;
    public final bwf f;
    public final a84 g;
    public final g2b h;
    public final h37 i;
    public final wu j;
    public final Object k;
    public final so3 l;
    public final int m;
    public final int n;
    public final k18 o;
    public final rt7 p;
    public final x74 q;
    public final ContextScope r;
    public final ContextScope s;
    public final x9f t;
    public final tcf u;
    public final k18 v;
    public final tcf w;
    public final a4 x;
    public final tcf y;
    public final hbd z;

    public xw(k18 k18Var, k18 k18Var2, long j, lzf lzfVar, iv6 iv6Var, sq9 sq9Var, bwf bwfVar, bwf bwfVar2, a84 a84Var, g2b g2bVar, h37 h37Var, wu wuVar, jkd jkdVar, so3 so3Var, int i, int i2) {
        this.a = j;
        this.b = lzfVar;
        this.c = iv6Var;
        this.d = sq9Var;
        this.e = bwfVar;
        this.f = bwfVar2;
        this.g = a84Var;
        this.h = g2bVar;
        this.i = h37Var;
        this.j = wuVar;
        this.k = jkdVar;
        this.l = so3Var;
        this.m = i;
        this.n = i2;
        String str = xw.class.getName() + "#" + j;
        this.o = k18Var;
        rt7 rt7VarA = eoi.a();
        this.p = rt7VarA;
        q2b q2bVar = (q2b) lzfVar;
        x74 x74VarPlus = q2bVar.a().plus(rt7VarA).plus(new zi5(this));
        this.q = x74VarPlus;
        ContextScope contextScopeA = d7j.a(x74VarPlus.plus(q2bVar.a().limitedParallelism(1, str)).plus(new rt7(rt7VarA)));
        this.r = contextScopeA;
        this.s = d7j.a(x74VarPlus.plus(q2bVar.b()).plus(new arf(rt7VarA)));
        tcf tcfVarA = ucf.a(null);
        this.u = tcfVarA;
        this.v = k18Var2;
        tcf tcfVarA2 = ucf.a(-1L);
        this.w = tcfVarA2;
        a4 a4Var = new a4(new tv(0, 0, xw.class, this, "historyBounds", "getHistoryBounds()Lru/ok/tamtam/loader/HistoryBounds;"));
        this.x = a4Var;
        tcf tcfVarA3 = ucf.a(hr9.d);
        this.y = tcfVarA3;
        this.z = new hbd(tcfVarA3);
        this.A = ConcurrentHashMap.newKeySet();
        tcf tcfVarA4 = ucf.a(nv.a);
        this.B = tcfVarA4;
        this.C = new xt4(iv6Var, 25, new jv(this, 0));
        this.D = new kce(3, this);
        this.E = new t9f(3, this);
        this.t = gw0.w(new mwd(new uw(tcfVarA4, null, this)), contextScopeA);
        gw0.w(new g56(gw0.m(gw0.i(a4Var, tcfVarA2, tcfVarA, new pw(this, null, 0))), new qw(this, null), 1), d7j.a(x74VarPlus));
        gw0.w(new g56((x26) sq9Var.f.getValue(), new rw(2, this, xw.class, "handleEvent", "handleEvent(Lone/me/messages/list/loader/events/MessageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0), 1), contextScopeA);
        so3Var.a(so3.c | so3.d, this);
        iv6Var.u("initialized @" + System.identityHashCode(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.xw r9, long r10, boolean r12, defpackage.q44 r13) {
        /*
            iv6 r0 = r9.c
            boolean r1 = r13 instanceof defpackage.lw
            if (r1 == 0) goto L16
            r1 = r13
            lw r1 = (defpackage.lw) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.s0 = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            lw r1 = new lw
            r1.<init>(r9, r13)
            goto L14
        L1c:
            java.lang.Object r13 = r7.Y
            int r1 = r7.s0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            xw r9 = r7.d
            defpackage.g8j.b(r13)
            goto Lc5
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            long r9 = r7.X
            boolean r12 = r7.o
            xw r11 = r7.d
            defpackage.g8j.b(r13)
            r4 = r9
            r9 = r11
            goto La9
        L43:
            defpackage.g8j.b(r13)
            java.lang.String r13 = defpackage.iv6.k(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "loadNext: "
            r1.<init>(r4)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.u(r13)
            r9.z()
            g37 r13 = r9.h()
            java.util.List r13 = r13.j()
            boolean r1 = r13.isEmpty()
            g84 r8 = defpackage.g84.a
            if (r1 != 0) goto Lb8
            java.lang.String r1 = "loadNext: Chunks not empty, started loading from datasources"
            r0.u(r1)
            java.util.List r0 = r9.i(r10, r3)
            j37 r0 = defpackage.gei.c(r0)
            if (r0 == 0) goto L84
            long r10 = r0.getC()
        L81:
            r4 = r10
            r10 = r3
            goto L93
        L84:
            long r0 = r9.f()
            d93 r13 = defpackage.k4j.d(r0, r13)
            if (r13 == 0) goto L81
            long r10 = r13.c()
            goto L81
        L93:
            wu r3 = r9.j
            r7.d = r9
            r7.o = r12
            r7.X = r4
            r7.s0 = r10
            t9f r6 = r9.E
            r2 = r9
            java.lang.Object r9 = r2.r(r3, r4, r6, r7)
            r13 = r2
            if (r9 != r8) goto La8
            goto Lc3
        La8:
            r9 = r13
        La9:
            if (r12 == 0) goto Lc5
            kotlinx.coroutines.internal.ContextScope r10 = r9.s
            mw r11 = new mw
            r12 = 0
            r11.<init>(r9, r4, r12)
            r13 = 3
            defpackage.svi.e(r10, r12, r12, r11, r13)
            goto Lc5
        Lb8:
            r13 = r9
            r7.d = r13
            r7.s0 = r2
            java.lang.Object r9 = r13.t(r10, r7)
            if (r9 != r8) goto Lc4
        Lc3:
            return r8
        Lc4:
            r9 = r13
        Lc5:
            iv6 r10 = r9.c
            a4 r9 = r9.x
            java.util.List r9 = r9.l()
            defpackage.iei.b(r10, r9)
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.b(xw, long, boolean, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.xw r8, long r9, boolean r11, defpackage.q44 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.nw
            if (r0 == 0) goto L14
            r0 = r12
            nw r0 = (defpackage.nw) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.s0 = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            nw r0 = new nw
            r0.<init>(r8, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.Y
            int r0 = r6.s0
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L41
            if (r0 == r2) goto L35
            if (r0 != r1) goto L2d
            xw r8 = r6.d
            defpackage.g8j.b(r12)
            goto Lc0
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            long r8 = r6.X
            boolean r11 = r6.o
            xw r10 = r6.d
            defpackage.g8j.b(r12)
            r3 = r8
            r8 = r10
            goto La4
        L41:
            defpackage.g8j.b(r12)
            iv6 r12 = r8.c
            java.lang.String r0 = defpackage.iv6.k(r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "loadPrev: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r12.u(r0)
            r8.z()
            g37 r12 = r8.h()
            java.util.List r12 = r12.j()
            boolean r0 = r12.isEmpty()
            g84 r7 = defpackage.g84.a
            if (r0 != 0) goto Lb3
            java.util.List r0 = r8.i(r9, r2)
            j37 r0 = defpackage.gei.b(r0)
            if (r0 == 0) goto L7f
            long r9 = r0.getC()
        L7c:
            r3 = r9
            r9 = r2
            goto L8e
        L7f:
            long r0 = r8.f()
            d93 r12 = defpackage.k4j.d(r0, r12)
            if (r12 == 0) goto L7c
            long r9 = r12.a()
            goto L7c
        L8e:
            wu r2 = r8.j
            r6.d = r8
            r6.o = r11
            r6.X = r3
            r6.s0 = r9
            kce r5 = r8.D
            r1 = r8
            java.lang.Object r8 = r1.p(r2, r3, r5, r6)
            r12 = r1
            if (r8 != r7) goto La3
            goto Lbe
        La3:
            r8 = r12
        La4:
            if (r11 == 0) goto Lc0
            kotlinx.coroutines.internal.ContextScope r9 = r8.s
            ow r10 = new ow
            r11 = 0
            r10.<init>(r8, r3, r11)
            r12 = 3
            defpackage.svi.e(r9, r11, r11, r10, r12)
            goto Lc0
        Lb3:
            r12 = r8
            r6.d = r12
            r6.s0 = r1
            java.lang.Object r8 = r12.t(r9, r6)
            if (r8 != r7) goto Lbf
        Lbe:
            return r7
        Lbf:
            r8 = r12
        Lc0:
            iv6 r9 = r8.c
            a4 r8 = r8.x
            java.util.List r8 = r8.l()
            defpackage.iei.b(r9, r8)
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.c(xw, long, boolean, q44):java.lang.Object");
    }

    public static List d(long j, List list) {
        int size = list.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j37 j37Var = (j37) list.get(i2);
            if ((j37Var instanceof i37) || i2 == ve3.i(list)) {
                if ((z && (j <= j37Var.getC() || j <= ((j37) list.get(i2 - 1)).getC())) || j == j37Var.getC()) {
                    return list.subList(i, i2 + 1);
                }
                if (z && i2 == ve3.i(list) && !(j37Var instanceof i37) && (j == BuildConfig.MAX_TIME_TO_UPLOAD || j >= j37Var.getC())) {
                    return list.subList(i, i2 + 1);
                }
                z = false;
                i = i2;
            } else if (j >= j37Var.getC() || (j <= j37Var.getC() && i2 == 0)) {
                z = true;
            }
        }
        return Collections.singletonList(new i37());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c1 -> B:38:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable A(defpackage.pb2 r11, java.util.List r12, defpackage.q44 r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.A(pb2, java.util.List, q44):java.io.Serializable");
    }

    @Override // defpackage.ro3
    public final void a() {
        svi.e(this.r, null, null, new vw(this, null), 3);
    }

    public final void e() {
        sq9 sq9Var = this.d;
        sq9Var.a.f(sq9Var);
        this.p.cancel((CancellationException) null);
        Set set = (Set) this.l.a.get(Integer.valueOf(so3.c | so3.d));
        if (set != null) {
            set.remove(this);
        }
        this.c.u("cleared @" + System.identityHashCode(this));
    }

    public final long f() {
        return ((Number) this.w.getValue()).longValue();
    }

    public final long g() {
        Long lValueOf;
        nz5 nz5Var = new nz5(lee.h(new at(2, ((hr9) this.y.getValue()).a), new n8(12)));
        if (nz5Var.hasNext()) {
            lValueOf = Long.valueOf(((MessageModel) nz5Var.next()).c);
            while (nz5Var.hasNext()) {
                Long lValueOf2 = Long.valueOf(((MessageModel) nz5Var.next()).c);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        return lValueOf != null ? lValueOf.longValue() : BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public final g37 h() {
        tcf tcfVar = this.u;
        g37 g37Var = (g37) tcfVar.getValue();
        if (g37Var != null) {
            return g37Var;
        }
        g37 g37VarN = this.i.n();
        tcfVar.setValue(g37VarN);
        return g37VarN;
    }

    public final List i(long j, boolean z) {
        boolean z2;
        Object next;
        Object next2;
        List<j37> listL = this.x.l();
        List listJ = h().j();
        if (listJ.isEmpty()) {
            return listL;
        }
        d93 d93VarD = k4j.d(j, listJ);
        if (d93VarD != null) {
            j37 j37Var = (j37) ue3.I(listL);
            j37 j37Var2 = (j37) ue3.Q(listL);
            if (!listL.isEmpty()) {
                for (j37 j37Var3 : listL) {
                    if (j37Var3 instanceof i37) {
                        if (j37Var3 == j37Var || j37Var3 == j37Var2) {
                        }
                    } else if (!(j37Var3 instanceof MessageModel) || ((MessageModel) j37Var3).b != 0) {
                        if (d93VarD.b(j37Var3.getC())) {
                        }
                    }
                }
            }
            return listL.isEmpty() ? h().h() == h().i() ? hd5.a : Collections.singletonList(new i37()) : listL;
        }
        if (d93VarD == null && !z) {
            Iterator it = listJ.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            long jA = ((d93) it.next()).a();
            while (it.hasNext()) {
                long jA2 = ((d93) it.next()).a();
                if (jA > jA2) {
                    jA = jA2;
                }
            }
            if (j < jA) {
                Iterator it2 = listJ.iterator();
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (it2.hasNext()) {
                        long jA3 = ((d93) next2).a();
                        do {
                            Object next3 = it2.next();
                            long jA4 = ((d93) next3).a();
                            if (jA3 > jA4) {
                                next2 = next3;
                                jA3 = jA4;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next2 = null;
                }
                d93 d93Var = (d93) next2;
                lValueOf = d93Var != null ? Long.valueOf(d93Var.a()) : null;
                z2 = true;
            } else {
                Iterator it3 = listJ.iterator();
                if (!it3.hasNext()) {
                    throw new NoSuchElementException();
                }
                long jC = ((d93) it3.next()).c();
                while (it3.hasNext()) {
                    long jC2 = ((d93) it3.next()).c();
                    if (jC < jC2) {
                        jC = jC2;
                    }
                }
                if (j > jC) {
                    Iterator it4 = listJ.iterator();
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (it4.hasNext()) {
                            long jC3 = ((d93) next).c();
                            do {
                                Object next4 = it4.next();
                                long jC4 = ((d93) next4).c();
                                if (jC3 < jC4) {
                                    next = next4;
                                    jC3 = jC4;
                                }
                            } while (it4.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    d93 d93Var2 = (d93) next;
                    if (d93Var2 != null) {
                        lValueOf = Long.valueOf(d93Var2.c());
                    }
                }
                z2 = false;
            }
            if (lValueOf != null) {
                List listD = d(lValueOf.longValue(), listL);
                if (listD.size() == 1 && (ue3.G(listD) instanceof i37)) {
                    return w(listD);
                }
                if (listD.size() > 1) {
                    if (z2 && !(ue3.G(listD) instanceof i37) && ((j37) ue3.G(listD)).getA() != h().g()) {
                        ArrayList arrayListK = ve3.k(new i37());
                        arrayListK.addAll(listD);
                        listD = arrayListK;
                    } else if (!z2 && !(ue3.P(listD) instanceof i37) && ((j37) ue3.P(listD)).getA() != h().h()) {
                        this.c.u("getHistoryItems: insert last GAP because wasn't last in bounds");
                        listD = ue3.U(listD, new i37());
                    }
                    return w(listD);
                }
            }
        }
        List listD2 = d(j, listL);
        if (!listD2.isEmpty() && z) {
            if (d93VarD == null) {
                listD2 = Collections.singletonList(new i37());
            } else if (listD2.size() != 1 || !(ue3.G(listD2) instanceof i37)) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listD2) {
                    j37 j37Var4 = (j37) obj;
                    if (d93VarD.b(j37Var4.getC()) || (j37Var4 instanceof i37)) {
                        arrayList.add(obj);
                    }
                }
                listD2 = arrayList.isEmpty() ? Collections.singletonList(new i37()) : arrayList;
            }
        }
        return w(listD2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.hj9 r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.j(hj9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.nj9 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.k(nj9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.util.List r24, long r25, boolean r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.l(java.util.List, long, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(java.util.List r7, long r8, boolean r10) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            if (r10 == 0) goto L45
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto Ld
        La:
            r10 = r1
            goto L84
        Ld:
            java.util.Iterator r7 = r7.iterator()
            r10 = r1
        L12:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r7.next()
            j37 r2 = (defpackage.j37) r2
            boolean r3 = r2 instanceof defpackage.i37
            if (r3 != 0) goto L12
            g37 r3 = r6.h()
            java.util.Comparator r3 = r3.e()
            long r4 = r2.getC()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            int r2 = r3.compare(r2, r4)
            if (r2 > 0) goto L12
            int r10 = r10 + 1
            if (r10 < 0) goto L41
            goto L12
        L41:
            defpackage.ve3.o()
            throw r0
        L45:
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L4c
            goto La
        L4c:
            java.util.Iterator r7 = r7.iterator()
            r10 = r1
        L51:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r7.next()
            j37 r2 = (defpackage.j37) r2
            boolean r3 = r2 instanceof defpackage.i37
            if (r3 != 0) goto L51
            g37 r3 = r6.h()
            java.util.Comparator r3 = r3.e()
            long r4 = r2.getC()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            int r2 = r3.compare(r2, r4)
            if (r2 < 0) goto L51
            int r10 = r10 + 1
            if (r10 < 0) goto L80
            goto L51
        L80:
            defpackage.ve3.o()
            throw r0
        L84:
            int r7 = r6.m
            int r8 = r6.n
            int r7 = java.lang.Math.min(r7, r8)
            if (r10 >= r7) goto L90
            r7 = 1
            return r7
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.m(java.util.List, long, boolean):boolean");
    }

    public final void n(long j) {
        if (j == f()) {
            return;
        }
        this.c.u("load around " + j);
        this.B.m(null, new ov(j, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(long r26, boolean r28, kotlin.coroutines.Continuation r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.o(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.wu r20, long r21, defpackage.mv r23, defpackage.q44 r24) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.p(wu, long, mv, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.jkd r19, long r20, boolean r22, defpackage.q44 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.q(jkd, long, boolean, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.wu r20, long r21, defpackage.mv r23, defpackage.q44 r24) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.r(wu, long, mv, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.jkd r17, long r18, boolean r20, defpackage.q44 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.s(jkd, long, boolean, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r14 == r10) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(long r12, defpackage.q44 r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.t(long, q44):java.lang.Object");
    }

    public final void u() {
        Object value;
        Object obj;
        pv pvVar = new pv(g(), false);
        tcf tcfVar = this.B;
        do {
            value = tcfVar.getValue();
            rv rvVar = (rv) value;
            obj = rvVar instanceof ov ? (ov) rvVar : null;
            if (obj == null) {
                obj = pvVar;
            }
        } while (!tcfVar.c(value, obj));
    }

    public final void v() {
        Long lValueOf;
        Object value;
        Object obj;
        nz5 nz5Var = new nz5(lee.h(new at(2, ((hr9) this.y.getValue()).a), new n8(11)));
        if (nz5Var.hasNext()) {
            lValueOf = Long.valueOf(((MessageModel) nz5Var.next()).c);
            while (nz5Var.hasNext()) {
                Long lValueOf2 = Long.valueOf(((MessageModel) nz5Var.next()).c);
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        qv qvVar = new qv(lValueOf != null ? lValueOf.longValue() : BuildConfig.MAX_TIME_TO_UPLOAD, false);
        tcf tcfVar = this.B;
        do {
            value = tcfVar.getValue();
            rv rvVar = (rv) value;
            obj = rvVar instanceof ov ? (ov) rvVar : null;
            if (obj == null) {
                obj = qvVar;
            }
        } while (!tcfVar.c(value, obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Collection, java.util.List] */
    public final List w(List list) {
        int i;
        ArrayList arrayList;
        List listL = this.x.l();
        List listJ = h().j();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listL.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            j37 j37Var = (j37) it.next();
            if (!(j37Var instanceof i37)) {
                boolean z = (j37Var instanceof MessageModel) && ((MessageModel) j37Var).b == 0;
                if (!z) {
                    Iterator it2 = listJ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((d93) it2.next()).b(j37Var.getC())) {
                            i = 1;
                            break;
                        }
                    }
                }
                if (z || i == 0) {
                    arrayList2.add(j37Var);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return list;
        }
        ?? arrayList3 = new ArrayList(list.size());
        Iterator it3 = list.iterator();
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (it3.hasNext()) {
            int i3 = i2 + 1;
            j37 j37Var2 = (j37) it3.next();
            if (j37Var2 instanceof i37) {
                if (i2 == 0) {
                    z2 = true;
                }
                if (i2 == ve3.i(list)) {
                    z3 = true;
                }
            } else {
                arrayList3.add(j37Var2);
            }
            i2 = i3;
        }
        Comparator comparatorC = h().c();
        Object obj = lcj.w0;
        int i4 = te3.a;
        os5 os5Var = lcj.v0;
        if (arrayList3.isEmpty()) {
            List listX = ue3.X(arrayList2, comparatorC);
            if (obj.equals(obj)) {
                arrayList3 = ue3.d0(ue3.g0(listX));
            } else if (obj.equals(os5Var)) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                arrayList = new ArrayList();
                for (Object obj2 : listX) {
                    if (setNewSetFromMap.add(obj2)) {
                        arrayList.add(obj2);
                    }
                }
                arrayList3 = arrayList;
            } else {
                arrayList3 = new ArrayList(listX.size());
                for (Object obj3 : listX) {
                    if (!arrayList3.isEmpty()) {
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            if (it4.next().equals(obj3)) {
                                break;
                            }
                        }
                    }
                    arrayList3.add(obj3);
                }
            }
        } else if (!arrayList2.isEmpty()) {
            List listX2 = ue3.X(arrayList2, comparatorC);
            boolean z4 = obj == os5Var;
            LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList2.size() + arrayList3.size());
            if (z4) {
                Collections.newSetFromMap(new IdentityHashMap());
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                linkedHashSet.add(it5.next());
            }
            arrayList = new ArrayList(arrayList2.size() + arrayList3.size());
            Object objG = ue3.G(arrayList3);
            int i5 = 0;
            while (i5 < listX2.size()) {
                Object obj4 = listX2.get(i5);
                if (comparatorC.compare(obj4, objG) > 0) {
                    break;
                }
                if (!obj4.equals(objG) && linkedHashSet.add(obj4)) {
                    arrayList.add(obj4);
                }
                i5++;
            }
            int size = arrayList3.size();
            while (i < size) {
                Object obj5 = arrayList3.get(i);
                arrayList.add(obj5);
                if (i < ve3.i(arrayList3)) {
                    Object obj6 = arrayList3.get(i + 1);
                    if (comparatorC.compare(obj5, obj6) <= 0) {
                        while (i5 < listX2.size()) {
                            Object obj7 = listX2.get(i5);
                            if (comparatorC.compare(obj7, obj5) >= 0) {
                                if (comparatorC.compare(obj7, obj6) <= 0) {
                                    if (!obj7.equals(obj5) && !obj7.equals(obj6) && linkedHashSet.add(obj7)) {
                                        arrayList.add(obj7);
                                    }
                                }
                            }
                            i5++;
                        }
                    }
                }
                i++;
            }
            while (i5 < listX2.size()) {
                int i6 = i5 + 1;
                Object obj8 = listX2.get(i5);
                if (linkedHashSet.add(obj8)) {
                    arrayList.add(obj8);
                }
                i5 = i6;
            }
            arrayList3 = arrayList;
        }
        if (!z2 && !z3) {
            return arrayList3;
        }
        iv6 iv6Var = this.c;
        if (z2 && z3) {
            ArrayList arrayList4 = new ArrayList(arrayList3.size() + 2);
            iv6Var.u("mergeVisibleWithOutliersPreservingEdges: insert first and last GAP");
            arrayList4.add(new i37());
            arrayList4.addAll(arrayList3);
            arrayList4.add(new i37());
            return arrayList4;
        }
        if (!z2) {
            iv6Var.u("mergeVisibleWithOutliersPreservingEdges: insert last GAP");
            return ue3.U(arrayList3, new i37());
        }
        ArrayList arrayList5 = new ArrayList(arrayList3.size() + 1);
        iv6Var.u("mergeVisibleWithOutliersPreservingEdges: insert first GAP");
        arrayList5.add(new i37());
        arrayList5.addAll(arrayList3);
        return arrayList5;
    }

    public final void x(long j, long j2, ArrayList arrayList) {
        StringBuilder sbL = az1.l(j, "removeGapsBetween: start:", ", end:");
        sbL.append(j2);
        this.c.u(sbL.toString());
        int size = arrayList.size();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            j37 j37Var = (j37) arrayList.get(i3);
            if (!(j37Var instanceof i37)) {
                long c = j37Var.getC();
                if (c >= j && c <= j2) {
                    if (i == -1) {
                        i = i3;
                    }
                    i2 = i3;
                }
            }
        }
        if (i == -1 || i2 == -1) {
            return;
        }
        while (i <= i2) {
            if (arrayList.get(i) instanceof i37) {
                int i4 = i + 1;
                while (i4 <= i2 && (arrayList.get(i4) instanceof i37)) {
                    i4++;
                }
                arrayList.subList(i, i4).clear();
                i2 -= i4 - i;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, jkd] */
    public final void y(f37 f37Var) {
        tcf tcfVar;
        Object value;
        g37 g37Var;
        do {
            tcfVar = this.u;
            value = tcfVar.getValue();
            g37Var = (g37) value;
            if (g37Var != null && !eei.a(f37Var, g37Var, this.c)) {
                this.k.b(f37Var);
                g37Var = f37Var;
            }
        } while (!tcfVar.c(value, g37Var));
    }

    public final boolean z() {
        long j;
        g37 g37VarH = h();
        g37 g37VarN = this.i.n();
        g37VarN.getClass();
        g37.a.getClass();
        y(new f37(g37VarN));
        g37 g37VarH2 = h();
        boolean zA = eei.a(g37VarH, g37VarH2, this.c);
        boolean z = !zA;
        String str = (String) this.c.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("updateHistoryBounds, changed: ", z), null);
            }
        }
        List listJ = h().j();
        long jG = g37VarH2.g();
        long jH = g37VarH2.h();
        a4 a4Var = this.x;
        while (true) {
            List listL = a4Var.l();
            ArrayList arrayList = new ArrayList(listL);
            if (!zA) {
                Iterator it = new fqd(arrayList).iterator();
                while (true) {
                    eqd eqdVar = (eqd) it;
                    if (!eqdVar.b.hasPrevious()) {
                        break;
                    }
                    j37 j37Var = (j37) eqdVar.b.previous();
                    if (!(j37Var instanceof i37)) {
                        if (j37Var instanceof MessageModel) {
                            j = jG;
                            if (((MessageModel) j37Var).b != 0) {
                            }
                            jG = j;
                        } else {
                            j = jG;
                        }
                        if (!k4j.b(j37Var.getC(), listJ) && j37Var.getA() != j && j37Var.getA() != jH) {
                            eqdVar.remove();
                        }
                        jG = j;
                    }
                }
            }
            long j2 = jG;
            a4.f(a4Var, arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!(((j37) it2.next()) instanceof i37)) {
                        g37 g37Var = (g37) ((tv) a4Var.c).get();
                        a4.j(a4Var, arrayList, g37Var);
                        a4.k(a4Var, arrayList, g37Var);
                        break;
                    }
                }
            }
            if (a4Var.c(listL, arrayList)) {
                break;
            }
            jG = j2;
        }
        if (!zA) {
            iei.c(this.c, g37VarH2);
        }
        return z;
    }
}
