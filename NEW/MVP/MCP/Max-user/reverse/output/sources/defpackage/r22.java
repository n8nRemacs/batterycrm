package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class r22 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s22 b;
    public final /* synthetic */ String c;

    public /* synthetic */ r22(s22 s22Var, String str, int i) {
        this.a = i;
        this.b = s22Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b.onCameraAvailable(this.c);
                break;
            default:
                this.b.b.onCameraUnavailable(this.c);
                break;
        }
    }
}
