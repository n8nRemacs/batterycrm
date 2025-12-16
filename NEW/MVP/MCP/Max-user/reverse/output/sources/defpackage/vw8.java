package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vw8 implements bx8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf6 b;

    public /* synthetic */ vw8(int i, hf6 hf6Var) {
        this.a = i;
        this.b = hf6Var;
    }

    @Override // defpackage.bx8
    public final int b(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    break;
                }
            default:
                pw8 pw8Var = (pw8) obj;
                String str = pw8Var.b;
                hf6 hf6Var = this.b;
                if ((str.equals(hf6Var.n) || str.equals(dx8.b(hf6Var))) && pw8Var.c(hf6Var, false) && pw8Var.d(hf6Var)) {
                }
                break;
        }
        return 0;
    }
}
