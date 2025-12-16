package defpackage;

/* loaded from: classes.dex */
public final class sq4 extends wq4 implements Comparable {
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final int o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final boolean w0;

    public sq4(int i, lfg lfgVar, int i2, nq4 nq4Var, int i3, String str, String str2) {
        int iD;
        super(i, lfgVar, i2);
        int i4 = 0;
        this.X = tk0.k(i3, false);
        int i5 = this.d.e;
        int i6 = nq4Var.y;
        wg7 wg7Var = nq4Var.v;
        int i7 = i5 & (~i6);
        this.Y = (i7 & 1) != 0;
        this.Z = (i7 & 2) != 0;
        wg7 wg7VarM = str2 != null ? wg7.m(str2) : wg7Var.isEmpty() ? wg7.m("") : wg7Var;
        int i8 = 0;
        while (true) {
            if (i8 >= wg7VarM.size()) {
                iD = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iD = ar4.d(this.d, (String) wg7VarM.get(i8), nq4Var.z);
                if (iD > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.s0 = i8;
        this.t0 = iD;
        int i9 = str2 != null ? 1088 : nq4Var.w;
        int i10 = this.d.f;
        ijb ijbVar = ar4.k;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.u0 = iBitCount;
        this.w0 = (1088 & this.d.f) != 0;
        int iD2 = ar4.d(this.d, str, ar4.g(str) == null);
        this.v0 = iD2;
        boolean z = iD > 0 || (wg7Var.isEmpty() && iBitCount > 0) || this.Y || (this.Z && iD2 > 0);
        if (tk0.k(i3, nq4Var.t0) && z) {
            i4 = 1;
        }
        this.o = i4;
    }

    @Override // defpackage.wq4
    public final int a() {
        return this.o;
    }

    @Override // defpackage.wq4
    public final /* bridge */ /* synthetic */ boolean c(wq4 wq4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(sq4 sq4Var) {
        cj3 cj3VarD = cj3.a.d(this.X, sq4Var.X);
        Integer numValueOf = Integer.valueOf(this.s0);
        Integer numValueOf2 = Integer.valueOf(sq4Var.s0);
        yca ycaVar = yca.b;
        yca ycaVar2 = yca.c;
        cj3 cj3VarC = cj3VarD.c(numValueOf, numValueOf2, ycaVar2);
        int i = sq4Var.t0;
        int i2 = this.t0;
        cj3 cj3VarA = cj3VarC.a(i2, i);
        int i3 = sq4Var.u0;
        int i4 = this.u0;
        cj3 cj3VarD2 = cj3VarA.a(i4, i3).d(this.Y, sq4Var.Y);
        Boolean boolValueOf = Boolean.valueOf(this.Z);
        Boolean boolValueOf2 = Boolean.valueOf(sq4Var.Z);
        if (i2 != 0) {
            ycaVar = ycaVar2;
        }
        cj3 cj3VarA2 = cj3VarD2.c(boolValueOf, boolValueOf2, ycaVar).a(this.v0, sq4Var.v0);
        if (i4 == 0) {
            cj3VarA2 = cj3VarA2.e(this.w0, sq4Var.w0);
        }
        return cj3VarA2.f();
    }
}
