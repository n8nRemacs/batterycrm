package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final /* synthetic */ class jd7 implements eh6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jd7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.eh6
    public final void a(fh6 fh6Var) {
        eh6 eh6Var;
        switch (this.a) {
            case 0:
                ld7 ld7Var = (ld7) ((WeakReference) ((kd7) this.b).o).get();
                if (ld7Var != null) {
                    ld7Var.D0.execute(new gq5(10, ld7Var));
                    return;
                }
                return;
            default:
                ov8 ov8Var = (ov8) this.b;
                synchronized (ov8Var.a) {
                    try {
                        int i = ov8Var.b - 1;
                        ov8Var.b = i;
                        if (ov8Var.c && i == 0) {
                            ov8Var.close();
                        }
                        eh6Var = (eh6) ov8Var.X;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (eh6Var != null) {
                    eh6Var.a(fh6Var);
                    return;
                }
                return;
        }
    }
}
