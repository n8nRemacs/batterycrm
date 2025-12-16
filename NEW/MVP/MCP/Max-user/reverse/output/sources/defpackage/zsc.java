package defpackage;

/* loaded from: classes3.dex */
public final class zsc extends n2 {
    public final /* synthetic */ int d;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zsc(ysc yscVar, n2 n2Var, int i) {
        super(n2Var);
        this.d = i;
        this.o = yscVar;
    }

    @Override // defpackage.plb
    public final void h(btc btcVar, bj bjVar) {
        switch (this.d) {
            case 0:
                ysc yscVar = (ysc) this.o;
                byte[] bArrK = btcVar.k();
                if (yscVar.Q0.e.b().stream().anyMatch(new pr3(0, bArrK))) {
                    a0(btcVar, bjVar);
                    return;
                }
                yscVar.c.error("Dropping packet because dcid " + uwi.a(bArrK) + " is not an active connection ID.");
                F(btcVar, "with unknown destination connection ID");
                return;
            case 1:
                if (!utb.a(((ysc) this.o).A0)) {
                    a0(btcVar, bjVar);
                    return;
                }
                int i = ((ysc) this.o).A0;
                if (i == 0) {
                    throw null;
                }
                if (i != 4) {
                    F(btcVar, "in draining state");
                    return;
                }
                ysc yscVar2 = (ysc) this.o;
                if (btcVar.c.stream().filter(new kk8(9)).findAny().isPresent()) {
                    yscVar2.A0 = 5;
                    return;
                }
                moc mocVar = yscVar2.B0;
                int i2 = mocVar.b + 1;
                mocVar.b = i2;
                if (i2 == mocVar.a) {
                    yscVar2.L0.f(yscVar2.C0, btcVar.l(), rde.A);
                    mocVar.a *= 2;
                    return;
                }
                return;
            case 2:
                a0(btcVar, bjVar);
                ((ysc) this.o).L0.k();
                return;
            default:
                if (btcVar.n() != null) {
                    r55 r55Var = ((r55[]) this.o)[btcVar.n().ordinal()];
                    r55Var.getClass();
                    Long lM = btcVar.m();
                    int iLongValue = (int) (lM.longValue() % r55Var.b);
                    long jLongValue = lM.longValue();
                    long[] jArr = r55Var.c;
                    if (jLongValue <= jArr[iLongValue]) {
                        F(btcVar, "duplicate packet");
                        return;
                    }
                    jArr[iLongValue] = lM.longValue();
                }
                a0(btcVar, bjVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsc(hk6 hk6Var) {
        super(hk6Var);
        this.d = 3;
        int[] iArr = {32, 32, 1024};
        this.o = new r55[m5c.values().length];
        for (m5c m5cVar : m5c.values()) {
            ((r55[]) this.o)[m5cVar.ordinal()] = new r55(iArr[m5cVar.ordinal()], 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsc(ysc yscVar, ysc yscVar2, bh8 bh8Var) {
        super(yscVar2, bh8Var);
        this.d = 1;
        this.o = yscVar;
    }
}
