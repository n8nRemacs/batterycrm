package defpackage;

/* loaded from: classes.dex */
public class w16 implements h9e {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;

    public w16(x16 x16Var, long j) {
        this.c = x16Var;
        this.b = j;
    }

    @Override // defpackage.h9e
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.h9e
    public final f9e e(long j) {
        switch (this.a) {
            case 0:
                x16 x16Var = (x16) this.c;
                fsi.e((h79) x16Var.l);
                h79 h79Var = (h79) x16Var.l;
                long[] jArr = (long[]) h79Var.b;
                long[] jArr2 = (long[]) h79Var.c;
                int iE = xxg.e(jArr, xxg.j((x16Var.f * j) / 1000000, 0L, x16Var.k - 1), false);
                long j2 = iE == -1 ? 0L : jArr[iE];
                long j3 = iE != -1 ? jArr2[iE] : 0L;
                int i = x16Var.f;
                long j4 = (j2 * 1000000) / i;
                long j5 = this.b;
                l9e l9eVar = new l9e(j4, j3 + j5);
                if (j4 == j || iE == jArr.length - 1) {
                    return new f9e(l9eVar, l9eVar);
                }
                int i2 = iE + 1;
                return new f9e(l9eVar, new l9e((jArr[i2] * 1000000) / i, j5 + jArr2[i2]));
            default:
                return (f9e) this.c;
        }
    }

    @Override // defpackage.h9e
    public final long f() {
        switch (this.a) {
            case 0:
                return ((x16) this.c).c();
            default:
                return this.b;
        }
    }

    public w16(long j) {
        this(j, 0L);
    }

    public w16(long j, long j2) {
        this.b = j;
        l9e l9eVar = j2 == 0 ? l9e.c : new l9e(0L, j2);
        this.c = new f9e(l9eVar, l9eVar);
    }
}
