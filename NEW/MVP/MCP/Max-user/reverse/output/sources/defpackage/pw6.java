package defpackage;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final /* synthetic */ class pw6 implements lva, nva, kva {
    public final /* synthetic */ tw6 a;

    @Override // defpackage.kva
    public void b() {
        tw6 tw6Var = this.a;
        wqi.c(tw6Var.e, "startRetriever: canceled", new Object[0]);
        tw6Var.h = null;
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        tw6 tw6Var = this.a;
        wqi.g(tw6Var.e, new l84("startRetriever: failed", exc), null, new Object[0]);
        tw6Var.h = null;
    }

    @Override // defpackage.lva
    public void p(Task task) {
        tw6 tw6Var = this.a;
        wqi.c(tw6Var.e, "retriever is complete", new Object[0]);
        tw6Var.h = null;
    }
}
