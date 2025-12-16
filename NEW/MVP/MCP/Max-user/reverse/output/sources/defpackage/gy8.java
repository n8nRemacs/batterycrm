package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class gy8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly8 b;

    public /* synthetic */ gy8(ly8 ly8Var, int i) {
        this.a = i;
        this.b = ly8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ly8 ly8Var = this.b;
                ky8 ky8Var = ly8Var.m;
                if (ky8Var != null) {
                    ly8Var.d.unbindService(ky8Var);
                    ly8Var.m = null;
                }
                ly8Var.c.c.clear();
                break;
            default:
                ly8 ly8Var2 = this.b;
                q4c q4cVar = ly8Var2.C;
                if (q4cVar != null) {
                    ly8Var2.V(q4cVar, o4c.c);
                    break;
                }
                break;
        }
    }
}
