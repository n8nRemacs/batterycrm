package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class r50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo8 b;
    public final /* synthetic */ x50 c;

    public /* synthetic */ r50(xo8 xo8Var, x50 x50Var, int i) {
        this.a = i;
        this.b = xo8Var;
        this.c = x50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final x50 x50Var = this.c;
        xo8 xo8Var = this.b;
        switch (i) {
            case 0:
                yl5 yl5Var = (yl5) xo8Var.c;
                String str = zxg.a;
                nj4 nj4Var = yl5Var.a.D0;
                final id idVarH = nj4Var.H();
                final int i2 = 1;
                nj4Var.I(idVarH, 1031, new pa8() { // from class: ij4
                    @Override // defpackage.pa8, defpackage.oa8
                    public final void invoke(Object obj) {
                        switch (i2) {
                            case 0:
                                ((jd) obj).p0(idVarH, x50Var);
                                break;
                            default:
                                ((jd) obj).U(idVarH, x50Var);
                                break;
                        }
                    }
                });
                break;
            default:
                yl5 yl5Var2 = (yl5) xo8Var.c;
                String str2 = zxg.a;
                nj4 nj4Var2 = yl5Var2.a.D0;
                final id idVarH2 = nj4Var2.H();
                final int i3 = 0;
                nj4Var2.I(idVarH2, 1032, new pa8() { // from class: ij4
                    @Override // defpackage.pa8, defpackage.oa8
                    public final void invoke(Object obj) {
                        switch (i3) {
                            case 0:
                                ((jd) obj).p0(idVarH2, x50Var);
                                break;
                            default:
                                ((jd) obj).U(idVarH2, x50Var);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
