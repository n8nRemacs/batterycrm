package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class fm5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fm5(sm5 sm5Var, int i, boolean z) {
        this.d = sm5Var;
        this.c = i;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sm5 sm5Var = (sm5) this.d;
                nj4 nj4Var = sm5Var.H0;
                pld[] pldVarArr = sm5Var.a;
                final int i = this.c;
                final int i2 = ((tk0) pldVarArr[i].e).b;
                final id idVarH = nj4Var.H();
                final boolean z = this.b;
                nj4Var.I(idVarH, 1033, new pa8() { // from class: xi4
                    @Override // defpackage.pa8, defpackage.oa8
                    public final void invoke(Object obj) {
                        ((jd) obj).q0(idVarH, i, i2, z);
                    }
                });
                break;
            default:
                ((w9a) this.d).N0(this.c, this.b);
                break;
        }
    }

    public /* synthetic */ fm5(w9a w9aVar, boolean z, int i) {
        this.d = w9aVar;
        this.b = z;
        this.c = i;
    }
}
