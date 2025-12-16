package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.avito.android.search.filter.RunnableC34589p;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.v;
import j.X;

@X
/* loaded from: classes10.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f343175b = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i12 = jobParameters.getExtras().getInt("priority");
        int i13 = jobParameters.getExtras().getInt("attemptNumber");
        v.b(getApplicationContext());
        r.a aVarA = r.a();
        aVarA.b(string);
        aVarA.d(HX0.a.b(i12));
        if (string2 != null) {
            aVarA.c(Base64.decode(string2, 0));
        }
        i iVar = v.a().f343296d;
        r rVarA = aVarA.a();
        RunnableC34589p runnableC34589p = new RunnableC34589p(22, this, jobParameters);
        iVar.getClass();
        iVar.f343208e.execute(new com.avito.android.checkable_image.d(i13, iVar, 2, rVarA, runnableC34589p));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
