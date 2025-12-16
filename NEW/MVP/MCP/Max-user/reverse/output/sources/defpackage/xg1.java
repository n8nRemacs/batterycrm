package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class xg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u08 b;
    public final /* synthetic */ yg1 c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xg1(em6 em6Var, yg1 yg1Var, int i) {
        this.a = i;
        this.b = (u08) em6Var;
        this.c = yg1Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [em6, u08] */
    /* JADX WARN: Type inference failed for: r0v2, types: [em6, u08] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                break;
            default:
                this.b.invoke(this.c);
                break;
        }
    }
}
