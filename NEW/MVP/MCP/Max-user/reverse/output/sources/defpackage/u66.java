package defpackage;

/* loaded from: classes.dex */
public final class u66 extends a1 {
    public final b1g c;
    public final int d;
    public final int o;

    public u66(i66 i66Var, b1g b1gVar, int i, int i2) {
        super(i66Var);
        this.c = b1gVar;
        this.d = i;
        this.o = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i66
    public final void g(q76 q76Var) {
        i66 i66Var = this.b;
        boolean z = i66Var instanceof drf;
        b1g b1gVar = this.c;
        if (!z) {
            i66Var.c(new t66(q76Var, b1gVar, this.d, this.o));
            return;
        }
        try {
            Object obj = ((drf) i66Var).get();
            xd5 xd5Var = xd5.a;
            if (obj == null) {
                q76Var.d(xd5Var);
                q76Var.b();
                return;
            }
            try {
                mqc mqcVar = (mqc) b1gVar.apply(obj);
                if (!(mqcVar instanceof drf)) {
                    ((i66) mqcVar).e(q76Var);
                    return;
                }
                try {
                    Object obj2 = ((drf) mqcVar).get();
                    if (obj2 != null) {
                        q76Var.d(new nyd(q76Var, obj2));
                    } else {
                        q76Var.d(xd5Var);
                        q76Var.b();
                    }
                } catch (Throwable th) {
                    raj.c(th);
                    xd5.a(th, q76Var);
                }
            } catch (Throwable th2) {
                raj.c(th2);
                xd5.a(th2, q76Var);
            }
        } catch (Throwable th3) {
            raj.c(th3);
            xd5.a(th3, q76Var);
        }
    }
}
