package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.ac0;
import defpackage.awg;
import defpackage.ka5;
import defpackage.mig;
import defpackage.o9c;
import defpackage.qe5;
import defpackage.qz5;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt(LogFactory.PRIORITY_KEY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        mig.b(getApplicationContext());
        ka5 ka5VarA = ac0.a();
        ka5VarA.p(string);
        ka5VarA.c = o9c.b(i);
        if (string2 != null) {
            ka5VarA.b = Base64.decode(string2, 0);
        }
        awg awgVar = mig.a().d;
        awgVar.e.execute(new qe5(awgVar, ka5VarA.e(), i2, new qz5(this, 16, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
