package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class a55 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d55 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a55(d55 d55Var, f55 f55Var, int i) {
        this.a = i;
        this.b = d55Var;
        this.c = f55Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f55, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [f55, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [f55, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d55 d55Var = this.b;
                this.c.B(d55Var.a, d55Var.b);
                break;
            case 1:
                d55 d55Var2 = this.b;
                this.c.w(d55Var2.a, d55Var2.b);
                break;
            default:
                d55 d55Var3 = this.b;
                this.c.z(d55Var3.a, d55Var3.b);
                break;
        }
    }
}
