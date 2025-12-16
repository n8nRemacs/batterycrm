package defpackage;

/* loaded from: classes2.dex */
public final class sd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf7 b;
    public final /* synthetic */ ld3 c;
    public final /* synthetic */ zd3 d;
    public final /* synthetic */ pd7 o;

    public /* synthetic */ sd3(rf7 rf7Var, ld3 ld3Var, zd3 zd3Var, pd7 pd7Var, int i) {
        this.a = i;
        this.b = rf7Var;
        this.c = ld3Var;
        this.d = zd3Var;
        this.o = pd7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rf7 rf7Var = this.b;
                if (rf7Var != null) {
                    pe4 pe4VarB = zk6.e().b(rf7Var, null);
                    ld3 ld3Var = this.c;
                    ld3Var.d = pe4VarB;
                    zd3 zd3Var = this.d;
                    if (zd3Var.e) {
                        ((r0) pe4VarB).l(new td3(zd3Var, this.o, ld3Var), yu1.a);
                        break;
                    }
                }
                break;
            default:
                rf7 rf7Var2 = this.b;
                if (rf7Var2 != null) {
                    pe4 pe4VarB2 = zk6.e().b(rf7Var2, null);
                    ld3 ld3Var2 = this.c;
                    ld3Var2.d = pe4VarB2;
                    zd3 zd3Var2 = this.d;
                    if (zd3Var2.e) {
                        ((r0) pe4VarB2).l(new td3(zd3Var2, this.o, ld3Var2), yu1.a);
                        break;
                    }
                }
                break;
        }
    }
}
