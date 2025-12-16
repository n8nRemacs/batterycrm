package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class yt7 extends JobServiceEngine implements ut7 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public JobParameters c;
    public final bu7 d;

    public yt7(swd swdVar) {
        super(swdVar);
        this.b = new Object();
        this.d = swdVar;
    }

    @Override // defpackage.ut7
    public final IBinder a() {
        switch (this.a) {
        }
        return getBinder();
    }

    @Override // defpackage.ut7
    public final wt7 b() {
        JobWorkItem jobWorkItemDequeueWork;
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        JobParameters jobParameters = this.c;
                        if (jobParameters == null) {
                            return null;
                        }
                        JobWorkItem jobWorkItemDequeueWork2 = jobParameters.dequeueWork();
                        if (jobWorkItemDequeueWork2 == null) {
                            return null;
                        }
                        jobWorkItemDequeueWork2.getIntent().setExtrasClassLoader(this.d.getClassLoader());
                        return new xt7(this, jobWorkItemDequeueWork2, 0);
                    } finally {
                    }
                }
            default:
                synchronized (this.b) {
                    JobParameters jobParameters2 = this.c;
                    if (jobParameters2 == null) {
                        return null;
                    }
                    try {
                        jobWorkItemDequeueWork = jobParameters2.dequeueWork();
                    } catch (SecurityException e) {
                        e.printStackTrace();
                        jobWorkItemDequeueWork = null;
                    }
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(((swd) this.d).getClassLoader());
                    return new xt7(this, jobWorkItemDequeueWork, 1);
                }
        }
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        switch (this.a) {
            case 0:
                this.c = jobParameters;
                this.d.ensureProcessorRunningLocked(false);
                break;
            default:
                this.c = jobParameters;
                ((swd) this.d).ensureProcessorRunningLocked(false);
                break;
        }
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        switch (this.a) {
            case 0:
                boolean zDoStopCurrentWork = this.d.doStopCurrentWork();
                synchronized (this.b) {
                    this.c = null;
                }
                return zDoStopCurrentWork;
            default:
                boolean zDoStopCurrentWork2 = ((swd) this.d).doStopCurrentWork();
                synchronized (this.b) {
                    this.c = null;
                }
                return zDoStopCurrentWork2;
        }
    }

    public yt7(bu7 bu7Var) {
        super(bu7Var);
        this.b = new Object();
        this.d = bu7Var;
    }
}
