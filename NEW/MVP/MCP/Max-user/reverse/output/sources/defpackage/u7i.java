package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class u7i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7i b;

    public /* synthetic */ u7i(w7i w7iVar, int i) {
        this.a = i;
        this.b = w7iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        w7i w7iVar = this.b;
        switch (i) {
            case 0:
                w7iVar.requestLayout();
                w7iVar.invalidate();
                break;
            default:
                int i2 = w7i.C0;
                op5.d(w7i.class, Integer.valueOf(w7iVar.hashCode()), "onRelease: view %x");
                xr4 xr4Var = (xr4) w7iVar.B0;
                xr4Var.c = false;
                xr4Var.reset();
                break;
        }
    }
}
