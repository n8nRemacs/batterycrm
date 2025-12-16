package defpackage;

/* loaded from: classes.dex */
public final class md4 extends r9g {
    public final long X;
    public final long Y;
    public final long Z;
    public final long b;
    public final long c;
    public final long d;
    public final int o;
    public final zc4 s0;
    public final i09 t0;
    public final xz8 u0;

    public md4(long j, long j2, long j3, int i, long j4, long j5, long j6, zc4 zc4Var, i09 i09Var, xz8 xz8Var) {
        fsi.d(zc4Var.d == (xz8Var != null));
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.o = i;
        this.X = j4;
        this.Y = j5;
        this.Z = j6;
        this.s0 = zc4Var;
        this.t0 = i09Var;
        this.u0 = xz8Var;
    }

    @Override // defpackage.r9g
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.o) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // defpackage.r9g
    public final l9g f(int i, l9g l9gVar, boolean z) {
        fsi.c(i, h());
        zc4 zc4Var = this.s0;
        String str = z ? zc4Var.b(i).a : null;
        Integer numValueOf = z ? Integer.valueOf(this.o + i) : null;
        long jD = zc4Var.d(i);
        long jB = xxg.B(zc4Var.b(i).b - zc4Var.b(0).b) - this.X;
        l9gVar.getClass();
        l9gVar.g(str, numValueOf, 0, jD, jB, u8.X, false);
        return l9gVar;
    }

    @Override // defpackage.r9g
    public final int h() {
        return this.s0.m.size();
    }

    @Override // defpackage.r9g
    public final Object l(int i) {
        fsi.c(i, h());
        return Integer.valueOf(this.o + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    @Override // defpackage.r9g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p9g m(int r24, defpackage.p9g r25, long r26) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md4.m(int, p9g, long):p9g");
    }

    @Override // defpackage.r9g
    public final int o() {
        return 1;
    }
}
