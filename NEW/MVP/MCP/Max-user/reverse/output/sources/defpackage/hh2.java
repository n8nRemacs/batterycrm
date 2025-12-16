package defpackage;

/* loaded from: classes2.dex */
public final class hh2 extends sm implements j1g {
    public final long X;
    public final long Y;
    public final String Z;
    public final long d;
    public final long o;
    public final int s0;
    public final int t0;
    public final long u0;
    public final boolean v0;
    public final rs4 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh2(long j, long j2, long j3, long j4, long j5, long j6, rs4 rs4Var, int i) {
        super(j);
        int i2 = (i & 64) != 0 ? 0 : 40;
        int i3 = (i & 256) != 0 ? 0 : 40;
        long j7 = (i & 512) != 0 ? 0L : j6;
        this.d = j2;
        this.o = j3;
        this.X = j4;
        this.Y = j5;
        this.Z = null;
        this.s0 = i2;
        this.t0 = i3;
        this.u0 = j7;
        this.v0 = true;
        this.w0 = rs4Var;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        ih2 ih2Var = (ih2) l0gVar;
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        nxg nxgVar = (nxg) tmVar.Z.getValue();
        tm tmVar2 = this.c;
        if (tmVar2 == null) {
            tmVar2 = null;
        }
        svi.e(nxgVar, ((q2b) ((lzf) tmVar2.Y.getValue())).a(), null, new gh2(this, ih2Var, null), 2);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        ku3 ku3VarN;
        String str = pzfVar.b;
        boolean zEquals = "client.task.ignored".equals(str);
        long j = this.Y;
        if (zEquals) {
            if (j != 0) {
                r().d(j);
                return;
            }
            return;
        }
        if ("not.found".equals(str)) {
            pb2 pb2VarM = l().M(this.d);
            if (pb2VarM != null && pb2VarM.Q() && (ku3VarN = pb2VarM.n()) != null) {
                m().o(ku3VarN.p());
            }
        } else {
            k().c(new rj0(this.a, pzfVar));
        }
        if (j != 0) {
            if (pzfVar instanceof hzf) {
                r().n(j, c3g.b);
            } else {
                r().d(j);
            }
        }
    }

    @Override // defpackage.sm
    public final n2 i() {
        return new fh2(this.o, this.X, this.s0, 0L, this.t0, this.u0, this.v0, this.Z, this.w0);
    }
}
