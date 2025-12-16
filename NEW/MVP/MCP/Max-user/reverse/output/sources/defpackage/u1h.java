package defpackage;

/* loaded from: classes2.dex */
public final class u1h extends sm implements j1g {
    public final String X;
    public final long d;
    public final boolean o;

    public u1h(long j, long j2, boolean z) {
        super(j);
        this.d = j2;
        this.o = z;
        this.X = u1h.class.getName();
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        v1h v1hVar = (v1h) l0gVar;
        lz7 lz7Var = new lz7();
        long j = 0;
        long j2 = 0;
        for (t91 t91Var : v1hVar.c) {
            ve2 ve2VarL = l();
            long j3 = t91Var.a;
            fh9 fh9Var = t91Var.b;
            pb2 pb2VarJ = ve2VarL.J(j3);
            if (j == 0 || fh9Var.b < j) {
                j = fh9Var.b;
            }
            if (j2 == 0 || fh9Var.b > j2) {
                j2 = fh9Var.b;
            }
            if (pb2VarJ != null) {
                tm tmVar = this.c;
                if (tmVar == null) {
                    tmVar = null;
                }
                ((ie4) tmVar.R.getValue()).c.e(pb2VarJ.a, p().a.s(), fh9Var);
            } else {
                lz7Var.a(Long.valueOf(t91Var.a), Long.valueOf(fh9Var.a));
            }
        }
        String strA = d8j.a(Long.valueOf(j));
        String strA2 = d8j.a(Long.valueOf(j2));
        int iB = lz7Var.b();
        StringBuilder sbL = wy1.l("onSuccess: startTime: ", strA, " endTime: ", strA2, " missedMessages: ");
        sbL.append(iB);
        wqi.c(this.X, sbL.toString(), new Object[0]);
        k().c(new w1h(this.a, j, j2, v1hVar.d, v1hVar.o, v1hVar.X, lz7Var));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        k().c(new rj0(this.a, pzfVar));
    }

    @Override // defpackage.sm
    public final n2 i() {
        zf8 zf8Var = new zf8((xhb) null, 29);
        long j = this.d;
        if (j > 0) {
            zf8Var.t(j, "marker");
        }
        zf8Var.j(100, "count");
        zf8Var.i("forward", this.o);
        return zf8Var;
    }
}
