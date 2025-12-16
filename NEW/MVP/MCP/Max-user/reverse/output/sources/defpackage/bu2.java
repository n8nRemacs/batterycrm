package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class bu2 extends yac {
    public final i5i g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final String l;
    public final k18 m;
    public final bwf n;
    public final bwf o;
    public final k18 p;
    public final k18 q;
    public final Object r;
    public final Object s;
    public final k18 t;
    public final AtomicLong u;

    public bu2(long j, ContextScope contextScope, i5i i5iVar) {
        super(j);
        this.g = i5iVar;
        fdc fdcVar = fdc.a;
        k18 k18VarB = fdcVar.b();
        this.h = k18VarB;
        this.i = fdcVar.d();
        k18 k18VarE = fdcVar.e();
        this.j = k18VarE;
        this.k = fdcVar.f();
        fdcVar.c();
        this.l = bu2.class.getName();
        this.m = fdcVar.getAccessor().d(142);
        this.n = new bwf(new zb2(24));
        this.o = new bwf(new zb2(25));
        this.p = fdcVar.getAccessor().d(225);
        this.q = fdcVar.a();
        this.r = ipi.b(3, new zb2(26));
        this.s = ipi.b(3, new zb2(27));
        this.t = fdcVar.getAccessor().d(600);
        this.u = new AtomicLong();
        gw0.w(gw0.u(new g56(new d53(new x3(new mwd(new au2(new d53(((w63) k18VarB.getValue()).j(j), 12), null, contextScope, this)), this, 19), 12), new zr0(2, this, bu2.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 10), 1), ((q2b) ((lzf) k18VarE.getValue())).a()), contextScope);
    }

    @Override // defpackage.yac
    public final qqg C(onc oncVar) {
        return qqg.a;
    }

    public final pb2 D() {
        return (pb2) ((w63) this.h.getValue()).j(this.a).a.getValue();
    }

    @Override // defpackage.yac
    public final qqg a(wmc wmcVar) {
        return qqg.a;
    }

    @Override // defpackage.yac
    public final boolean b() {
        pb2 pb2VarD = D();
        if (pb2VarD != null) {
            return pb2VarD.a();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // defpackage.yac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r10, android.graphics.RectF r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.ut2
            if (r0 == 0) goto L14
            r0 = r12
            ut2 r0 = (defpackage.ut2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            ut2 r0 = new ut2
            q44 r12 = (defpackage.q44) r12
            r0.<init>(r9, r12)
            goto L12
        L1c:
            java.lang.Object r12 = r6.o
            int r0 = r6.Y
            qqg r7 = defpackage.qqg.a
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            java.util.concurrent.atomic.AtomicLong r10 = r6.d
            defpackage.g8j.b(r12)
            goto L61
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.g8j.b(r12)
            pb2 r12 = r9.D()
            if (r12 != 0) goto L3f
            return r7
        L3f:
            n10 r5 = defpackage.qfi.a(r11)
            k18 r11 = r9.p
            java.lang.Object r11 = r11.getValue()
            y72 r11 = (defpackage.y72) r11
            long r2 = r12.a
            java.util.concurrent.atomic.AtomicLong r12 = r9.u
            r6.d = r12
            r6.Y = r1
            r4 = r10
            r1 = r11
            java.lang.Object r10 = r1.a(r2, r4, r5, r6)
            g84 r11 = defpackage.g84.a
            if (r10 != r11) goto L5e
            return r11
        L5e:
            r8 = r12
            r12 = r10
            r10 = r8
        L61:
            java.lang.Number r12 = (java.lang.Number) r12
            long r11 = r12.longValue()
            r10.set(r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu2.c(java.lang.String, android.graphics.RectF, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.yac
    public final void d() {
    }

    @Override // defpackage.yac
    public final id0 e() {
        return new rkc(this.a, pdc.b);
    }

    @Override // defpackage.yac
    public final long g() {
        return this.u.get();
    }

    @Override // defpackage.yac
    public final String h() {
        rf2 rf2Var;
        pb2 pb2VarD = D();
        if (pb2VarD == null || (rf2Var = pb2VarD.b) == null) {
            return null;
        }
        return rf2Var.I;
    }

    @Override // defpackage.yac
    public final Long i() {
        return Long.valueOf(this.a);
    }

    @Override // defpackage.yac
    public final Long j() {
        pb2 pb2VarD = D();
        if (pb2VarD != null) {
            return Long.valueOf(pb2VarD.b.a);
        }
        return null;
    }

    @Override // defpackage.yac
    public final int k() {
        pb2 pb2VarD = D();
        return (pb2VarD == null || !pb2VarD.M()) ? 1 : 3;
    }

    @Override // defpackage.yac
    public final pdc l() {
        return pdc.b;
    }

    @Override // defpackage.yac
    public final long m() {
        return this.a;
    }

    @Override // defpackage.yac
    public final Object n(dtf dtfVar) {
        return D();
    }

    @Override // defpackage.yac
    public final boolean p() {
        pb2 pb2VarD = D();
        return pb2VarD != null && pb2VarD.M();
    }

    @Override // defpackage.yac
    public final boolean q() {
        pb2 pb2VarD = D();
        return pb2VarD != null && pb2VarD.i0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.yac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.vt2
            if (r0 == 0) goto L13
            r0 = r6
            vt2 r0 = (defpackage.vt2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L1a
        L13:
            vt2 r0 = new vt2
            q44 r6 = (defpackage.q44) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r2) goto L2b
            defpackage.g8j.b(r6)
            return r6
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.g8j.b(r6)
            return r3
        L37:
            defpackage.g8j.b(r6)
            pb2 r6 = r5.D()
            if (r6 == 0) goto L47
            boolean r6 = r6.W()
            if (r6 != r4) goto L47
            goto L53
        L47:
            pb2 r6 = r5.D()
            if (r6 == 0) goto L75
            boolean r6 = r6.c()
            if (r6 != r4) goto L75
        L53:
            pb2 r6 = r5.D()
            if (r6 == 0) goto L60
            rf2 r6 = r6.b
            if (r6 == 0) goto L60
            java.lang.String r6 = r6.I
            goto L61
        L60:
            r6 = r3
        L61:
            k18 r1 = r5.t
            java.lang.Object r1 = r1.getValue()
            vu7 r1 = (defpackage.vu7) r1
            r0.X = r4
            java.lang.Object r6 = r1.a(r6, r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L74
            return r0
        L74:
            return r3
        L75:
            r0.X = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu2.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.yac
    public final qqg u() {
        pb2 pb2VarD = D();
        vac vacVar = (vac) this.f.a.getValue();
        qqg qqgVar = qqg.a;
        if (pb2VarD != null && vacVar != null) {
            bbc bbcVar = vacVar.a;
            f(vac.a(vacVar, new bbc(bbcVar.a, bbcVar.b, pb2VarD.j(), pb2VarD.i(il0.b, hl0.a), bbcVar.e, bbcVar.f, bbcVar.g, bbcVar.h, bbcVar.i, bbcVar.j, bbcVar.k), null, 6));
        }
        return qqgVar;
    }

    @Override // defpackage.yac
    public final Object v(long j, boolean z, knc kncVar) {
        Object objI = svi.i(((q2b) ((lzf) this.j.getValue())).b(), new wt2(this, j, z, null), kncVar);
        return objI == g84.a ? objI : qqg.a;
    }

    @Override // defpackage.yac
    public final ei4 x() {
        kkc.c.getClass();
        return new ei4(":profile/avatars?id=" + this.a + "&type=local_chat");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    @Override // defpackage.yac
    public final lmc y() {
        bbc bbcVar;
        CharSequence charSequence;
        vac vacVar = (vac) this.f.a.getValue();
        if (vacVar == null || (bbcVar = vacVar.a) == null || (charSequence = bbcVar.e) == null) {
            return null;
        }
        int iK = k();
        pb2 pb2VarD = D();
        ?? r4 = this.s;
        if (pb2VarD == null || !pb2VarD.d()) {
            mcc mccVar = (mcc) r4.getValue();
            pb2 pb2VarD2 = D();
            return mccVar.a(iK, charSequence, pb2VarD2 != null && pb2VarD2.g0());
        }
        mcc mccVar2 = (mcc) r4.getValue();
        mccVar2.getClass();
        int iV = az1.v(iK);
        if (iV == 0) {
            p5g p5gVar = new p5g(x8b.o1, ys.D(new Object[]{charSequence}));
            o98 o98VarD = ve3.d();
            o98VarD.add(new pq3(v8b.T, new n5g(x8b.l1), 1, 56));
            o98VarD.add(new pq3(v8b.z, new n5g(x8b.m1), 3, 56));
            return new fmc(p5gVar, null, ve3.a(o98VarD), null);
        }
        if (iV == 1) {
            return mccVar2.c();
        }
        if (iV != 2) {
            if (iV == 3) {
                return mccVar2.c();
            }
            throw new NoWhenBranchMatchedException();
        }
        p5g p5gVar2 = new p5g(x8b.k1, ys.D(new Object[]{charSequence}));
        n5g n5gVar = new n5g(x8b.j1);
        o98 o98VarD2 = ve3.d();
        o98VarD2.add(new pq3(v8b.T, new n5g(x8b.l1), 1, 56));
        o98VarD2.add(new pq3(v8b.z, new n5g(x8b.m1), 3, 56));
        return new fmc(p5gVar2, n5gVar, ve3.a(o98VarD2), null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    @Override // defpackage.yac
    public final lmc z(long j) {
        String strE;
        ku3 ku3Var = (ku3) ((l24) this.i.getValue()).c(j).a.getValue();
        if (ku3Var == null || (strE = ku3Var.e()) == null) {
            return null;
        }
        mcc mccVar = (mcc) this.s.getValue();
        int iK = k();
        mccVar.getClass();
        int iV = az1.v(iK);
        if (iV == 0) {
            return new fmc(new p5g(x8b.m2, ys.D(new Object[]{strE})), null, ve3.j(new pq3(v8b.F0, new n5g(x8b.h2), 1, 56), new pq3(v8b.H0, new n5g(x8b.i2), 1, 56), new pq3(v8b.G0, new n5g(mvd.p), 2, 56)), gwi.b(new imb("profile:participant_id_for_action", Long.valueOf(j))));
        }
        if (iV == 1 || iV == 2 || iV == 3) {
            return mccVar.c();
        }
        throw new NoWhenBranchMatchedException();
    }
}
