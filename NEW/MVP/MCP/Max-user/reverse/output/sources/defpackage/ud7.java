package defpackage;

/* loaded from: classes2.dex */
public final class ud7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd7 b;

    public /* synthetic */ ud7(zd7 zd7Var, int i) {
        this.a = i;
        this.b = zd7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                break;
            case 1:
                this.b.setRemoteImageState(sd7.a);
                break;
            case 2:
                this.b.setRemoteImageState(sd7.a);
                break;
            case 3:
                this.b.setRemoteImageState(sd7.a);
                break;
            case 4:
                this.b.setRemoteImageState(sd7.a);
                break;
            case 5:
                zd7 zd7Var = this.b;
                if (zd7Var.getShowProgress()) {
                    zd7Var.setRemoteImageState(rd7.a);
                    break;
                }
                break;
            case 6:
                zd7 zd7Var2 = this.b;
                if (zd7Var2.getShowProgress()) {
                    zd7Var2.setRemoteImageState(rd7.a);
                    break;
                }
                break;
            case 7:
                this.b.setRemoteImageState(qd7.a);
                break;
            default:
                this.b.setRemoteImageState(qd7.a);
                break;
        }
    }
}
