package defpackage;

/* loaded from: classes2.dex */
public final class eh8 extends sm implements j1g {
    public final long X;
    public final long Y;
    public final String Z;
    public final String d;
    public final long o;
    public final long s0;
    public final long t0;
    public final long u0;
    public final long v0;
    public final byte[] w0;
    public final String x0;
    public final i1g y0;

    public eh8(long j, String str, long j2, long j3, long j4, String str2, long j5, long j6, long j7, long j8, byte[] bArr) {
        super(j);
        this.d = str;
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = str2;
        this.s0 = j5;
        this.t0 = j6;
        this.u0 = j7;
        this.v0 = j8;
        this.w0 = bArr;
        this.x0 = eh8.class.getName();
        this.y0 = new i1g();
    }

    @Override // defpackage.j1g
    public final i1g b() {
        return this.y0;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        gh8 gh8Var = (gh8) l0gVar;
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        nxg nxgVar = (nxg) tmVar.Z.getValue();
        tm tmVar2 = this.c;
        if (tmVar2 == null) {
            tmVar2 = null;
        }
        svi.e(nxgVar, ((q2b) ((lzf) tmVar2.Y.getValue())).a(), null, new dh8(this, gh8Var, null), 2);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        ((sh8) tmVar.n.getValue()).a(pzfVar, this.w0);
    }

    @Override // defpackage.sm
    public final n2 i() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        return new fh8(this.d, ((lv4) tmVar.c.getValue()).d(), this.w0, this.o, this.X, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0);
    }
}
