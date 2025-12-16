package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class v50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object o;

    public /* synthetic */ v50(int i, int i2, long j, long j2, Object obj) {
        this.a = i2;
        this.o = obj;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.o;
        switch (i) {
            case 0:
                yl5 yl5Var = (yl5) ((xo8) obj).c;
                String str = zxg.a;
                nj4 nj4Var = yl5Var.a.D0;
                final id idVarH = nj4Var.H();
                final int i2 = 0;
                final int i3 = this.b;
                final long j = this.c;
                final long j2 = this.d;
                nj4Var.I(idVarH, 1011, new pa8() { // from class: gj4
                    @Override // defpackage.pa8, defpackage.oa8
                    public final void invoke(Object obj2) {
                        switch (i2) {
                            case 0:
                                ((jd) obj2).x0(idVarH, i3, j, j2);
                                break;
                            default:
                                ((jd) obj2).z0(idVarH, i3, j, j2);
                                break;
                        }
                    }
                });
                break;
            default:
                nj4 nj4Var2 = ((ah0) obj).b;
                ra3 ra3Var = nj4Var2.d;
                final id idVarE = nj4Var2.E(((wg7) ra3Var.b).isEmpty() ? null : (d99) uni.c((wg7) ra3Var.b));
                final int i4 = 1;
                final int i5 = this.b;
                final long j3 = this.c;
                final long j4 = this.d;
                nj4Var2.I(idVarE, 1006, new pa8() { // from class: gj4
                    @Override // defpackage.pa8, defpackage.oa8
                    public final void invoke(Object obj2) {
                        switch (i4) {
                            case 0:
                                ((jd) obj2).x0(idVarE, i5, j3, j4);
                                break;
                            default:
                                ((jd) obj2).z0(idVarE, i5, j3, j4);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
