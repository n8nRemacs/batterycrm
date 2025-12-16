package one.me.sdk.tasks;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.a3g;
import defpackage.bj5;
import defpackage.c6i;
import defpackage.gsa;
import defpackage.hfd;
import defpackage.j0e;
import defpackage.ja8;
import defpackage.la8;
import defpackage.llc;
import defpackage.lqc;
import defpackage.m0g;
import defpackage.n0g;
import defpackage.ota;
import defpackage.pb3;
import defpackage.qq0;
import defpackage.raj;
import defpackage.she;
import defpackage.t8j;
import defpackage.tsa;
import defpackage.ue3;
import defpackage.ulc;
import defpackage.w4e;
import defpackage.wqi;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.onelog.impl.BuildConfig;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"one/me/sdk/tasks/TaskMonitor$TaskMonitorWorker", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "La3g;", "taskRepository", "Lm0g;", "schedulers", "Lc6i;", "workerService", "Lpb3;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;La3g;Lm0g;Lc6i;Lpb3;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TaskMonitor$TaskMonitorWorker extends Worker {
    public final qq0 X;
    public final a3g b;
    public final m0g c;
    public final c6i d;
    public final pb3 o;

    public TaskMonitor$TaskMonitorWorker(Context context, WorkerParameters workerParameters, a3g a3gVar, m0g m0gVar, c6i c6iVar, pb3 pb3Var) {
        super(context, workerParameters);
        this.b = a3gVar;
        this.c = m0gVar;
        this.d = c6iVar;
        this.o = pb3Var;
        this.X = new qq0(1);
    }

    @Override // androidx.work.Worker
    public final la8 a() {
        Boolean bool;
        Throwable th;
        wqi.c("x2g", "work %s started at %s", getId(), Integer.valueOf(System.identityHashCode(this)));
        if (!b()) {
            wqi.c("x2g", "work " + getId() + " No tasks to be executed", new Object[0]);
            return la8.b();
        }
        ((w4e) this.o).A(true);
        she.v(this.d);
        lqc lqcVar = this.b.c;
        hfd hfdVar = new hfd(8, this);
        lqcVar.getClass();
        tsa tsaVar = new tsa(lqcVar, hfdVar, 1);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0e j0eVar = (j0e) ((n0g) this.c).c.getValue();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVar, "scheduler is null");
        ota otaVar = new ota(tsaVar, BuildConfig.SILENCE_TIME_TO_UPLOAD, j0eVar, 1);
        ulc ulcVar = new ulc(8, this);
        qq0 qq0Var = this.X;
        Objects.requireNonNull(qq0Var, "observer is null");
        try {
            otaVar.a(new gsa(qq0Var, ulcVar, 1));
            try {
                if (qq0Var.getCount() != 0) {
                    try {
                        qq0Var.await();
                    } catch (InterruptedException e) {
                        qq0Var.dispose();
                        throw bj5.d(e);
                    }
                }
                th = qq0Var.b;
            } catch (Throwable th2) {
                wqi.e("x2g", "work " + getId() + " Exception", th2);
                bool = null;
            }
            if (th != null) {
                throw bj5.d(th);
            }
            bool = (Boolean) qq0Var.a;
            if (bool == null) {
                wqi.e("x2g", "work " + getId() + " result null. Set failure state", null);
                return la8.a();
            }
            if (bool.booleanValue()) {
                wqi.c("x2g", "work " + getId() + " finished", new Object[0]);
                return la8.b();
            }
            wqi.q("x2g", "work " + getId() + " Timeout. Set retry state", new Object[0]);
            return new ja8();
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th3) {
            raj.c(th3);
            t8j.a(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    public final boolean b() throws IOException {
        a3g a3gVar = this.b;
        int iK = a3gVar.k();
        wqi.c("x2g", "work " + getId() + " Task count to be executed = " + iK, new Object[0]);
        if (1 <= iK && iK < 10) {
            String strN = ue3.N(a3gVar.m(), "; ", null, null, new llc(28), 30);
            wqi.c("x2g", "work " + getId() + " Last task to execute: " + strN, new Object[0]);
        }
        return iK > 0;
    }

    @Override // defpackage.ma8
    public final void onStopped() {
        wqi.c("x2g", "work " + getId() + " requested to stop " + System.identityHashCode(this), new Object[0]);
        qq0 qq0Var = this.X;
        qq0Var.dispose();
        qq0Var.countDown();
        wqi.c("x2g", "work " + getId() + " stopped " + System.identityHashCode(this), new Object[0]);
    }
}
