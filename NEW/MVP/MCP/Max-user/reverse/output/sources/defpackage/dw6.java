package defpackage;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final /* synthetic */ class dw6 implements lva, nva {
    public final /* synthetic */ qf8 a;

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        this.a.t(exc);
    }

    @Override // defpackage.lva
    public void p(Task task) {
        boolean zH = task.h();
        qf8 qf8Var = this.a;
        if (zH) {
            qf8Var.s();
        } else {
            qf8Var.t(null);
        }
    }
}
