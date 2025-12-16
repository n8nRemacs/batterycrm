package defpackage;

/* loaded from: classes2.dex */
public final class xk6 {
    public static final /* synthetic */ yy7[] f;
    public final x38 a;
    public final long b;
    public final gf1 c;
    public final gf1 d;
    public final t9f e = c7j.c();

    static {
        z8a z8aVar = new z8a(xk6.class, "cameraNotStartedJob", "getCameraNotStartedJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        f = new yy7[]{z8aVar};
    }

    public xk6(x38 x38Var, long j, gf1 gf1Var, gf1 gf1Var2) {
        this.a = x38Var;
        this.b = j;
        this.c = gf1Var;
        this.d = gf1Var2;
    }

    public final void a() {
        yy7[] yy7VarArr = f;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.e;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
    }
}
