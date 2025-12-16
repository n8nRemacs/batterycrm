package defpackage;

/* loaded from: classes.dex */
public final class r66 extends i66 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ r66(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.i66
    public final void g(q76 q76Var) {
        Object obj;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                try {
                    obj = ((kn6) obj2).a;
                } catch (Throwable th) {
                    th = th;
                    raj.c(th);
                }
                if (obj == null) {
                    throw bj5.a("Callable returned a null Throwable.");
                }
                aj5 aj5Var = bj5.a;
                th = (Throwable) obj;
                xd5.a(th, q76Var);
                return;
            case 1:
                q76Var.d(new x66(q76Var, (Object[]) obj2));
                return;
            case 2:
                ((sra) obj2).a(new y66(q76Var));
                return;
            case 3:
                qr8 qr8Var = new qr8(q76Var, (or8[]) obj2);
                q76Var.d(qr8Var);
                qr8Var.d();
                return;
            default:
                ((e2f) obj2).k(new r3f(q76Var));
                return;
        }
    }
}
