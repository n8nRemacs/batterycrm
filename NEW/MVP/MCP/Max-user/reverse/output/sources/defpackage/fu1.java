package defpackage;

/* loaded from: classes.dex */
public final class fu1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gvf b;

    public /* synthetic */ fu1(gvf gvfVar, gvf gvfVar2, int i) {
        this.a = i;
        this.b = gvfVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.d();
                break;
            default:
                this.b.d();
                break;
        }
    }
}
