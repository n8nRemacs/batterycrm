package defpackage;

/* loaded from: classes2.dex */
public abstract class ghe extends hge {
    public final boolean X;
    public final String Y;
    public long Z;
    public final String b = getClass().getName();
    public final long c;
    public final sk9 d;
    public final long o;
    public final ss4 s0;

    public ghe(long j, sk9 sk9Var, long j2, boolean z, String str, ss4 ss4Var) {
        this.c = j;
        this.d = sk9Var;
        this.o = j2;
        this.X = z;
        this.Y = str;
        this.s0 = ss4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0226  */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.Collection] */
    @Override // defpackage.hge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u() {
        /*
            Method dump skipped, instructions count: 1690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghe.u():void");
    }

    public abstract ri9 v();

    public long w(pb2 pb2Var, long j) {
        long jP;
        long j2 = pb2Var.b.a;
        long jS = ((w4e) i()).s();
        if (pb2Var.Q()) {
            if (pb2Var.b.e(jS)) {
                jP = jS;
            } else {
                ku3 ku3VarN = pb2Var.n();
                jP = ku3VarN != null ? ku3VarN.p() : 0L;
            }
            if (jP != 0) {
                j2 = 0;
            }
        } else {
            jP = 0;
        }
        long j3 = pb2Var.a;
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        nxg nxgVar = (nxg) igeVar.I.getValue();
        ige igeVar2 = this.a;
        if (igeVar2 == null) {
            igeVar2 = null;
        }
        svi.e(nxgVar, ((q2b) ((lzf) igeVar2.J.getValue())).b(), null, new hhe(this, j3, null), 2);
        if (!pb2Var.b.e(jS)) {
            ve2 ve2VarB = b();
            long j4 = this.c;
            ve2VarB.getClass();
            ve2VarB.r(j4, false, new ke2(false, 1));
        }
        String str = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, vb9.e(j, "Service task finish process and call msgSend, msgId = "), null);
            }
        }
        hwa hwaVarA = a();
        long j5 = pb2Var.a;
        long j6 = this.o;
        long j7 = jP;
        boolean z = this.X;
        if (hwaVarA.k(j)) {
            return hwaVarA.u().c(new p5a(hwaVarA.t().a.k(), j, j5, j2, j7, z, 0L), false, j6, 1);
        }
        return 0L;
    }

    public ghe(fhe fheVar) {
        this.c = fheVar.a;
        this.d = fheVar.b;
        this.o = fheVar.c;
        this.X = fheVar.d;
        this.Y = fheVar.e;
        this.s0 = fheVar.f;
    }
}
