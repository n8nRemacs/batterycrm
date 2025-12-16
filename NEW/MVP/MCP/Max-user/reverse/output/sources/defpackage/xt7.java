package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* loaded from: classes.dex */
public final class xt7 implements wt7 {
    public final /* synthetic */ int a;
    public final JobWorkItem b;
    public final /* synthetic */ JobServiceEngine c;

    public /* synthetic */ xt7(JobServiceEngine jobServiceEngine, JobWorkItem jobWorkItem, int i) {
        this.a = i;
        this.c = jobServiceEngine;
        this.b = jobWorkItem;
    }

    @Override // defpackage.wt7
    public final void a() {
        switch (this.a) {
            case 0:
                synchronized (((yt7) this.c).b) {
                    try {
                        JobParameters jobParameters = ((yt7) this.c).c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (((yt7) this.c).b) {
                    JobParameters jobParameters2 = ((yt7) this.c).c;
                    if (jobParameters2 != null) {
                        try {
                            jobParameters2.completeWork(this.b);
                        } catch (IllegalArgumentException | SecurityException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return;
        }
    }

    @Override // defpackage.wt7
    public final Intent getIntent() {
        switch (this.a) {
        }
        return this.b.getIntent();
    }
}
