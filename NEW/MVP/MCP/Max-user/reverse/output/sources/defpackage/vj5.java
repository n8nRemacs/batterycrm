package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class vj5 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ vj5(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            case 1:
                this.b.run();
                break;
            case 2:
                this.b.run();
                break;
            default:
                this.b.run();
                break;
        }
        return qqg.a;
    }
}
