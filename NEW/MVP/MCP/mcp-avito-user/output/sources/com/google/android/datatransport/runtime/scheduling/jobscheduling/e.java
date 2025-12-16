package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import j.X;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* compiled from: JobInfoScheduler.java */
@X
/* loaded from: classes10.dex */
public class e implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f343191a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.persistence.d f343192b;

    /* renamed from: c, reason: collision with root package name */
    public final SchedulerConfig f343193c;

    public e(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, SchedulerConfig schedulerConfig) {
        this.f343191a = context;
        this.f343192b = dVar;
        this.f343193c = schedulerConfig;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.m
    public final void a(r rVar, int i12, boolean z12) {
        Context context = this.f343191a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(rVar.b().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(ByteBuffer.allocate(4).putInt(HX0.a.a(rVar.d())).array());
        if (rVar.c() != null) {
            adler32.update(rVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z12) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i13 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i13 >= i12) {
                        DX0.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", rVar);
                        return;
                    }
                }
            }
        }
        long jS2 = this.f343192b.s2(rVar);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority priorityD = rVar.d();
        SchedulerConfig schedulerConfig = this.f343193c;
        builder.setMinimumLatency(schedulerConfig.c(priorityD, jS2, i12));
        Set<SchedulerConfig.Flag> setB = schedulerConfig.d().get(priorityD).b();
        if (setB.contains(SchedulerConfig.Flag.f343176b)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(SchedulerConfig.Flag.f343178d)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(SchedulerConfig.Flag.f343177c)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i12);
        persistableBundle.putString("backendName", rVar.b());
        persistableBundle.putInt("priority", HX0.a.a(rVar.d()));
        if (rVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(rVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {rVar, Integer.valueOf(value), Long.valueOf(schedulerConfig.c(rVar.d(), jS2, i12)), Long.valueOf(jS2), Integer.valueOf(i12)};
        if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        }
        jobScheduler.schedule(builder.build());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.m
    public final void b(r rVar, int i12) {
        a(rVar, i12, false);
    }
}
