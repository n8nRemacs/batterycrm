package defpackage;

/* loaded from: classes.dex */
public final class p66 extends i66 {
    public final /* synthetic */ int b;
    public final Object c;
    public final tm6 d;

    public /* synthetic */ p66(Object obj, tm6 tm6Var, int i) {
        this.b = i;
        this.c = obj;
        this.d = tm6Var;
    }

    @Override // defpackage.i66
    public final void g(q76 q76Var) {
        switch (this.b) {
            case 0:
                ((r66) this.c).c(new o66(q76Var, (fgf) this.d));
                break;
            default:
                try {
                    mqc mqcVar = (mqc) ((b1g) this.d).apply(this.c);
                    if (!(mqcVar instanceof drf)) {
                        ((i66) mqcVar).e(q76Var);
                        break;
                    } else {
                        try {
                            Object obj = ((drf) mqcVar).get();
                            if (obj != null) {
                                q76Var.d(new nyd(q76Var, obj));
                                break;
                            } else {
                                q76Var.d(xd5.a);
                                q76Var.b();
                                break;
                            }
                        } catch (Throwable th) {
                            raj.c(th);
                            xd5.a(th, q76Var);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    raj.c(th2);
                    xd5.a(th2, q76Var);
                    return;
                }
        }
    }
}
