package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wp4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ msf b;

    public /* synthetic */ wp4(msf msfVar, int i) {
        this.a = i;
        this.b = msfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            default:
                this.b.g.cancel(true);
                break;
        }
    }
}
