package defpackage;

/* loaded from: classes.dex */
public class ge0 implements i9e {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ ge0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.i9e
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.i9e
    public final g9e e(long j) {
        switch (this.a) {
            case 0:
                he0 he0Var = (he0) this.c;
                g9e g9eVarB = he0Var.s0[0].b(j);
                int i = 1;
                while (true) {
                    i93[] i93VarArr = he0Var.s0;
                    if (i >= i93VarArr.length) {
                        return g9eVarB;
                    }
                    g9e g9eVarB2 = i93VarArr[i].b(j);
                    if (g9eVarB2.a.b < g9eVarB.a.b) {
                        g9eVarB = g9eVarB2;
                    }
                    i++;
                }
            case 1:
                x16 x16Var = (x16) this.c;
                hsi.h((s7c) x16Var.l);
                s7c s7cVar = (s7c) x16Var.l;
                long[] jArr = (long[]) s7cVar.a;
                long[] jArr2 = (long[]) s7cVar.b;
                int iE = zxg.e(jArr, zxg.j((x16Var.f * j) / 1000000, 0L, x16Var.k - 1), false);
                long j2 = iE == -1 ? 0L : jArr[iE];
                long j3 = iE != -1 ? jArr2[iE] : 0L;
                int i2 = x16Var.f;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.b;
                m9e m9eVar = new m9e(j4, j3 + j5);
                if (j4 == j || iE == jArr.length - 1) {
                    return new g9e(m9eVar, m9eVar);
                }
                int i3 = iE + 1;
                return new g9e(m9eVar, new m9e((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
            default:
                return (g9e) this.c;
        }
    }

    @Override // defpackage.i9e
    public final long f() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((x16) this.c).c();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ge0(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public ge0(long j, long j2) {
        this.a = 2;
        this.b = j;
        m9e m9eVar = j2 == 0 ? m9e.c : new m9e(0L, j2);
        this.c = new g9e(m9eVar, m9eVar);
    }
}
