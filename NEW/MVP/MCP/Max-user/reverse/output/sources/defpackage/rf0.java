package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class rf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a9 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rf0(a9 a9Var, Object obj, int i) {
        this.a = i;
        this.b = a9Var;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a9 a9Var = this.b;
                if (a9Var.a == 0) {
                    a9Var.J(this.c);
                    break;
                }
                break;
            default:
                a9 a9Var2 = this.b;
                int i = a9Var2.a - 1;
                a9Var2.a = i;
                if (i == 0) {
                    a9Var2.J(this.c);
                    break;
                }
                break;
        }
    }
}
