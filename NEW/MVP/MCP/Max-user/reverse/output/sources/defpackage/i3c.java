package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class i3c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ och b;

    public /* synthetic */ i3c(och ochVar, int i) {
        this.a = i;
        this.b = ochVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            case 1:
                this.b.b();
                break;
            default:
                this.b.onFirstFrameRendered();
                break;
        }
    }
}
