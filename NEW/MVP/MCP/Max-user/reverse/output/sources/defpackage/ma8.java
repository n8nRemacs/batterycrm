package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ma8 {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public ma8(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public ha8 getForegroundInfoAsync() {
        ike ikeVar = new ike();
        ikeVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return ikeVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final yd4 getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public t2g getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.c;
    }

    public z5i getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final ha8 setForegroundAsync(qe6 qe6Var) {
        u4i u4iVar = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        u4iVar.getClass();
        ike ikeVar = new ike();
        u4iVar.a.c(new tv8(u4iVar, ikeVar, id, qe6Var, applicationContext, 3));
        return ikeVar;
    }

    public ha8 setProgressAsync(yd4 yd4Var) {
        l5i l5iVar = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        l5iVar.getClass();
        ike ikeVar = new ike();
        l5iVar.b.c(new b6i(l5iVar, id, yd4Var, ikeVar, 8));
        return ikeVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ha8 startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
