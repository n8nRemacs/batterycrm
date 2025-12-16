package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hsf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lsf b;
    public final /* synthetic */ vb0 c;

    public /* synthetic */ hsf(lsf lsfVar, vb0 vb0Var, int i) {
        this.a = i;
        this.b = lsfVar;
        this.c = vb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(this.c);
                break;
            default:
                this.b.g(this.c);
                break;
        }
    }
}
