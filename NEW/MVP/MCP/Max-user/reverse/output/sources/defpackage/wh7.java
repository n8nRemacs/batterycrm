package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class wh7 implements lva, nva, kva {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh7 b;

    public /* synthetic */ wh7(xh7 xh7Var, int i) {
        this.a = i;
        this.b = xh7Var;
    }

    @Override // defpackage.kva
    public void b() {
        if (this.b.d != null) {
            qha.t();
        }
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        if (this.b.d != null) {
            qha.t();
        }
    }

    @Override // defpackage.lva
    public void p(Task task) {
        uh7 uh7VarG;
        int i = this.a;
        xh7 xh7Var = this.b;
        switch (i) {
            case 0:
                if (task.h()) {
                    xh7Var.c = (gqd) task.f();
                    break;
                }
                break;
            default:
                if (xh7Var.d != null && (uh7VarG = t1b.a.g()) != null) {
                    List list = uh7.p;
                    uh7VarG.c(1, null);
                    break;
                }
                break;
        }
    }
}
