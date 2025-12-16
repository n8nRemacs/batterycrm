package androidx.work;

import android.content.Context;
import defpackage.cu7;
import defpackage.d7j;
import defpackage.eoi;
import defpackage.ep4;
import defpackage.gy4;
import defpackage.ha8;
import defpackage.ike;
import defpackage.j84;
import defpackage.k84;
import defpackage.ma8;
import defpackage.rt7;
import defpackage.svi;
import defpackage.u5i;
import defpackage.uee;
import defpackage.vy1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lma8;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ma8 {
    public final rt7 a;
    public final ike b;
    public final ep4 c;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = eoi.a();
        ike ikeVar = new ike();
        this.b = ikeVar;
        ikeVar.d(new vy1(25, this), (uee) ((u5i) getTaskExecutor()).a);
        this.c = gy4.a;
    }

    public abstract Object doWork(Continuation continuation);

    @Override // defpackage.ma8
    public final ha8 getForegroundInfoAsync() {
        rt7 rt7VarA = eoi.a();
        ContextScope contextScopeA = d7j.a(this.c.plus(rt7VarA));
        cu7 cu7Var = new cu7(rt7VarA);
        svi.e(contextScopeA, null, null, new j84(cu7Var, this, null), 3);
        return cu7Var;
    }

    @Override // defpackage.ma8
    public final void onStopped() {
        this.b.cancel(false);
    }

    @Override // defpackage.ma8
    public final ha8 startWork() {
        svi.e(d7j.a(this.c.plus(this.a)), null, null, new k84(this, null), 3);
        return this.b;
    }
}
