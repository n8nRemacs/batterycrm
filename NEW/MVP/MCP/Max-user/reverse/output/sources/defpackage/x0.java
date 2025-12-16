package defpackage;

/* loaded from: classes.dex */
public final class x0 implements brf {
    public final /* synthetic */ i45 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ y0 e;

    public x0(y0 y0Var, i45 i45Var, String str, Object obj, int i) {
        this.e = y0Var;
        this.a = i45Var;
        this.b = str;
        this.c = obj;
        this.d = i;
    }

    @Override // defpackage.brf
    public final Object get() {
        qf7 qf7Var;
        y0 y0Var = this.e;
        i45 i45Var = this.a;
        String str = this.b;
        Object obj = this.c;
        int i = this.d;
        rf7 rf7Var = (rf7) obj;
        df7 df7Var = ((c2c) y0Var).m;
        int iV = az1.v(i);
        if (iV == 0) {
            qf7Var = qf7.FULL_FETCH;
        } else if (iV == 1) {
            qf7Var = qf7.DISK_CACHE;
        } else {
            if (iV != 2) {
                StringBuilder sb = new StringBuilder("Cache level");
                sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "BITMAP_MEMORY_CACHE" : "DISK_CACHE" : "FULL_FETCH");
                sb.append("is not supported. ");
                throw new RuntimeException(sb.toString());
            }
            qf7Var = qf7.BITMAP_MEMORY_CACHE;
        }
        qf7 qf7Var2 = qf7Var;
        if (i45Var instanceof b2c) {
            synchronized (((b2c) i45Var)) {
            }
        }
        return df7Var.a(rf7Var, null, qf7Var2, null, str);
    }

    public final String toString() {
        hc8 hc8VarC = yyi.c(this);
        hc8VarC.r(this.c.toString(), "request");
        return hc8VarC.toString();
    }
}
