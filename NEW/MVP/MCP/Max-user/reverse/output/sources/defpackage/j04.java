package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class j04 extends yac {
    public final boolean g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final k18 l;
    public final k18 m;
    public kh3 n;
    public final ai3 o;
    public final Object p;
    public final Object q;
    public final iw4 r;
    public final k18 s;
    public final tcf t;

    public j04(long j, ContextScope contextScope, boolean z) {
        super(j);
        this.g = z;
        fdc fdcVar = fdc.a;
        k18 k18VarD = fdcVar.d();
        this.h = k18VarD;
        this.i = fdcVar.b();
        bwf bwfVarD = fdcVar.getAccessor().d(208);
        this.j = bwfVarD;
        this.k = fdcVar.getAccessor().d(332);
        this.l = fdcVar.getAccessor().d(329);
        this.m = fdcVar.getAccessor().d(331);
        k18 k18VarE = fdcVar.e();
        this.o = new ai3(0);
        this.p = ipi.b(3, new ps3(6));
        this.q = ipi.b(3, new ps3(7));
        iw4 iw4VarA = ((kcc) fdcVar.getAccessor().c(606)).a(j);
        this.r = iw4VarA;
        this.s = fdcVar.getAccessor().d(150);
        tcf tcfVarA = ucf.a(hd5.a);
        this.t = tcfVarA;
        kh3 kh3Var = new kh3(j);
        this.n = kh3Var;
        gw0.w(new g56(kh3Var.i, new f04(this, null), 1), contextScope);
        int i = 4;
        gw0.w(gw0.u(new g56(gw0.i(new d53(gw0.s(((l24) k18VarD.getValue()).c(j), new h04(this, j, null)), 12), new hbd(((h8c) ((i8c) bwfVarD.getValue()).a.getValue()).c().b(j)), new hbd(tcfVarA), new g04(this, (Continuation) null)), new zr0(2, this, j04.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", i, 15), 1), ((q2b) ((lzf) k18VarE.getValue())).a()), contextScope);
        gw0.w(gw0.u(new g56(new gbd(iw4VarA.d), new zr0(2, this, j04.class, "handleProfileEvent", "handleProfileEvent(Lone/me/profile/viewmodel/logic/DialogProfileEvent;)V", i, 16), 1), ((q2b) ((lzf) k18VarE.getValue())).a()), contextScope);
    }

    @Override // defpackage.yac
    public final qqg C(onc oncVar) {
        ((w04) this.m.getValue()).a(this.a);
        return qqg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0173  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.imb D(defpackage.ku3 r19) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j04.D(ku3):imb");
    }

    public final ku3 E() {
        return (ku3) ((l24) this.h.getValue()).c(this.a).a.getValue();
    }

    public final pb2 F() {
        return ((w63) this.i.getValue()).n(this.a);
    }

    @Override // defpackage.yac
    public final qqg a(wmc wmcVar) {
        ((su3) this.l.getValue()).a(this.a);
        return qqg.a;
    }

    @Override // defpackage.yac
    public final void d() {
        iw4 iw4Var = this.r;
        iw4Var.b.f(iw4Var);
        kh3 kh3Var = this.n;
        if (kh3Var != null) {
            t9f t9fVar = kh3Var.l;
            bh3 bh3Var = (bh3) kh3Var.e.getValue();
            bh3Var.a.f(bh3Var);
            yy7[] yy7VarArr = kh3.m;
            qt7 qt7Var = (qt7) t9fVar.D(kh3Var, yy7VarArr[0]);
            if (qt7Var != null) {
                qt7Var.cancel(null);
            }
            t9fVar.O(kh3Var, yy7VarArr[0], null);
        }
        this.n = null;
    }

    @Override // defpackage.yac
    public final id0 e() {
        return new rkc(this.a, pdc.d);
    }

    @Override // defpackage.yac
    public final String h() {
        ku3 ku3VarE = E();
        if (ku3VarE != null) {
            return ku3VarE.i();
        }
        return null;
    }

    @Override // defpackage.yac
    public final Long i() {
        pb2 pb2VarF = F();
        if (pb2VarF != null) {
            return Long.valueOf(pb2VarF.a);
        }
        return null;
    }

    @Override // defpackage.yac
    public final Long j() {
        pb2 pb2VarF = F();
        if (pb2VarF != null) {
            return Long.valueOf(pb2VarF.b.a);
        }
        return null;
    }

    @Override // defpackage.yac
    public final int k() {
        return 2;
    }

    @Override // defpackage.yac
    public final pdc l() {
        return pdc.d;
    }

    @Override // defpackage.yac
    public final Object n(dtf dtfVar) {
        return ((w63) this.i.getValue()).p(this.a, dtfVar);
    }

    @Override // defpackage.yac
    public final String o() {
        ku3 ku3VarE = E();
        if (ku3VarE != null) {
            return Long.valueOf(ku3VarE.q()).toString();
        }
        return null;
    }

    @Override // defpackage.yac
    public final boolean r() {
        return true;
    }

    @Override // defpackage.yac
    public final void s() {
        kh3 kh3Var = this.n;
        if (kh3Var != null) {
            kh3Var.l.O(kh3Var, kh3.m[0], svi.e(kh3Var.k, null, i84.b, new ih3(kh3Var, null), 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.yac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.i04
            if (r0 == 0) goto L13
            r0 = r5
            i04 r0 = (defpackage.i04) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L1a
        L13:
            i04 r0 = new i04
            q44 r5 = (defpackage.q44) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.g8j.b(r5)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.g8j.b(r5)
            k18 r5 = r4.k
            java.lang.Object r5 = r5.getValue()
            ou3 r5 = (defpackage.ou3) r5
            r0.X = r2
            long r0 = r4.a
            r5.a(r0)
            qqg r5 = defpackage.qqg.a
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L48
            return r0
        L48:
            kmc r5 = new kmc
            int r0 = defpackage.yud.n
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            int r0 = defpackage.x8b.G0
            n5g r2 = new n5g
            r2.<init>(r0)
            r5.<init>(r2, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j04.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.yac
    public final boolean w() {
        kh3 kh3Var = this.n;
        if (kh3Var == null) {
            return false;
        }
        sh3 sh3Var = (sh3) kh3Var.h.getValue();
        nh3 nh3Var = sh3Var instanceof nh3 ? (nh3) sh3Var : null;
        return nh3Var != null && nh3Var.b;
    }

    @Override // defpackage.yac
    public final ei4 x() {
        kkc.c.getClass();
        return new ei4(":profile/avatars?id=" + this.a + "&type=contact");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // defpackage.yac
    public final lmc y() {
        bbc bbcVar;
        CharSequence charSequence;
        vac vacVar = (vac) this.f.a.getValue();
        if (vacVar == null || (bbcVar = vacVar.a) == null || (charSequence = bbcVar.e) == null) {
            return null;
        }
        return ((mcc) this.q.getValue()).a(2, charSequence, false);
    }
}
