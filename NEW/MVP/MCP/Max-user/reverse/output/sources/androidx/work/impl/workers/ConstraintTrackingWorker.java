package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.cei;
import defpackage.ha8;
import defpackage.ike;
import defpackage.ma8;
import defpackage.n4i;
import defpackage.vy1;
import defpackage.xt3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Lma8;", "Ln4i;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends ma8 implements n4i {
    public final WorkerParameters a;
    public final Object b;
    public volatile boolean c;
    public final ike d;
    public ma8 o;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = workerParameters;
        this.b = new Object();
        this.d = new ike();
    }

    @Override // defpackage.n4i
    public final void d(ArrayList arrayList) {
        cei.g().c(xt3.a, "Constraints changed for " + arrayList);
        synchronized (this.b) {
            this.c = true;
        }
    }

    @Override // defpackage.n4i
    public final void f(List list) {
    }

    @Override // defpackage.ma8
    public final void onStopped() {
        ma8 ma8Var = this.o;
        if (ma8Var == null || ma8Var.isStopped()) {
            return;
        }
        ma8Var.stop();
    }

    @Override // defpackage.ma8
    public final ha8 startWork() {
        getBackgroundExecutor().execute(new vy1(23, this));
        return this.d;
    }
}
