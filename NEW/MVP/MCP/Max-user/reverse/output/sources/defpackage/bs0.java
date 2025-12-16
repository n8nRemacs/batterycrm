package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class bs0 extends yac {
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final k18 l;
    public final Object m;
    public final iw4 n;

    public bs0(long j, ContextScope contextScope) {
        super(j);
        fdc fdcVar = fdc.a;
        k18 k18VarD = fdcVar.d();
        this.g = k18VarD;
        this.h = fdcVar.b();
        this.i = fdcVar.getAccessor().d(388);
        this.j = fdcVar.getAccessor().d(389);
        k18 k18VarE = fdcVar.e();
        this.k = fdcVar.getAccessor().d(47);
        this.l = fdcVar.f();
        this.m = ipi.b(3, new l(23));
        iw4 iw4VarA = ((kcc) fdcVar.getAccessor().c(606)).a(j);
        this.n = iw4VarA;
        int i = 4;
        gw0.w(gw0.u(new g56(new x3(new d53(((l24) k18VarD.getValue()).c(j), 12), this, 5), new zr0(2, this, bs0.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", i, 0), 1), ((q2b) ((lzf) k18VarE.getValue())).a()), contextScope);
        gw0.w(gw0.u(new g56(new gbd(iw4VarA.d), new zr0(2, this, bs0.class, "handleProfileEvent", "handleProfileEvent(Lone/me/profile/viewmodel/logic/DialogProfileEvent;)V", i, 1), 1), ((q2b) ((lzf) k18VarE.getValue())).a()), contextScope);
    }

    @Override // defpackage.yac
    public final Object A(mnc mncVar) {
        Long lI = i();
        if (lI != null) {
            Object objA = ((gaf) this.i.getValue()).a(lI.longValue(), null, mncVar);
            if (objA == g84.a) {
                return objA;
            }
        }
        return qqg.a;
    }

    @Override // defpackage.yac
    public final Object B(nnc nncVar) {
        Long lI = i();
        if (lI != null) {
            Object objA = ((vsf) this.j.getValue()).a(lI.longValue(), nncVar);
            if (objA == g84.a) {
                return objA;
            }
        }
        return qqg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vac D(defpackage.ku3 r20) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.D(ku3):vac");
    }

    public final pb2 E() {
        return ((w63) this.h.getValue()).n(this.a);
    }

    @Override // defpackage.yac
    public final void d() {
        iw4 iw4Var = this.n;
        iw4Var.b.f(iw4Var);
    }

    @Override // defpackage.yac
    public final String h() {
        ku3 ku3Var = (ku3) ((l24) this.g.getValue()).c(this.a).a.getValue();
        if (ku3Var != null) {
            return ku3Var.i();
        }
        return null;
    }

    @Override // defpackage.yac
    public final Long i() {
        pb2 pb2VarE = E();
        if (pb2VarE != null) {
            return Long.valueOf(pb2VarE.a);
        }
        return null;
    }

    @Override // defpackage.yac
    public final Long j() {
        pb2 pb2VarE = E();
        if (pb2VarE != null) {
            return Long.valueOf(pb2VarE.b.a);
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
        return ((w63) this.h.getValue()).p(this.a, dtfVar);
    }

    @Override // defpackage.yac
    public final ei4 x() {
        kkc.c.getClass();
        return new ei4(":profile/avatars?id=" + this.a + "&type=contact");
    }
}
