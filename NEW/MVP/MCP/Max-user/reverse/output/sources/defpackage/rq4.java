package defpackage;

/* loaded from: classes.dex */
public final class rq4 extends vq4 implements Comparable {
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final int o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final boolean w0;

    public rq4(int i, kfg kfgVar, int i2, mq4 mq4Var, int i3, String str) {
        int iB;
        super(i, kfgVar, i2);
        int i4 = 0;
        this.X = zq4.c(i3, false);
        int i5 = this.d.d;
        int i6 = mq4Var.J0;
        wg7 wg7Var = mq4Var.C0;
        int i7 = i5 & (~i6);
        this.Y = (i7 & 1) != 0;
        this.Z = (i7 & 2) != 0;
        wg7 wg7VarM = wg7Var.isEmpty() ? wg7.m("") : wg7Var;
        int i8 = 0;
        while (true) {
            if (i8 >= wg7VarM.size()) {
                iB = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iB = zq4.b(this.d, (String) wg7VarM.get(i8), mq4Var.E0);
                if (iB > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.s0 = i8;
        this.t0 = iB;
        int i9 = this.d.o;
        int i10 = mq4Var.D0;
        int iBitCount = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.u0 = iBitCount;
        this.w0 = (this.d.o & 1088) != 0;
        int iB2 = zq4.b(this.d, str, zq4.e(str) == null);
        this.v0 = iB2;
        boolean z = iB > 0 || (wg7Var.isEmpty() && iBitCount > 0) || this.Y || (this.Z && iB2 > 0);
        if (zq4.c(i3, mq4Var.T0) && z) {
            i4 = 1;
        }
        this.o = i4;
    }

    @Override // defpackage.vq4
    public final int a() {
        return this.o;
    }

    @Override // defpackage.vq4
    public final /* bridge */ /* synthetic */ boolean c(vq4 vq4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(rq4 rq4Var) {
        cj3 cj3VarD = cj3.a.d(this.X, rq4Var.X);
        Integer numValueOf = Integer.valueOf(this.s0);
        Integer numValueOf2 = Integer.valueOf(rq4Var.s0);
        yca ycaVar = yca.b;
        yca ycaVar2 = yca.c;
        cj3 cj3VarC = cj3VarD.c(numValueOf, numValueOf2, ycaVar2);
        int i = rq4Var.t0;
        int i2 = this.t0;
        cj3 cj3VarA = cj3VarC.a(i2, i);
        int i3 = rq4Var.u0;
        int i4 = this.u0;
        cj3 cj3VarD2 = cj3VarA.a(i4, i3).d(this.Y, rq4Var.Y);
        Boolean boolValueOf = Boolean.valueOf(this.Z);
        Boolean boolValueOf2 = Boolean.valueOf(rq4Var.Z);
        if (i2 != 0) {
            ycaVar = ycaVar2;
        }
        cj3 cj3VarA2 = cj3VarD2.c(boolValueOf, boolValueOf2, ycaVar).a(this.v0, rq4Var.v0);
        if (i4 == 0) {
            cj3VarA2 = cj3VarA2.e(this.w0, rq4Var.w0);
        }
        return cj3VarA2.f();
    }
}
