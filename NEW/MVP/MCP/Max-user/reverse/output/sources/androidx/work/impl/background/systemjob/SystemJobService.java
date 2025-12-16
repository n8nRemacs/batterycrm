package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import defpackage.acf;
import defpackage.bxf;
import defpackage.c5i;
import defpackage.cei;
import defpackage.cxf;
import defpackage.hc8;
import defpackage.ij5;
import defpackage.jac;
import defpackage.qkf;
import defpackage.ssb;
import defpackage.v4i;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements ij5 {
    public static final String d = cei.m("SystemJobService");
    public c5i a;
    public final HashMap b = new HashMap();
    public final ssb c = new ssb(9);

    public static v4i b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new v4i(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.ij5
    public final void a(v4i v4iVar, boolean z) {
        JobParameters jobParameters;
        cei.g().c(d, v4iVar.a + " executed on JobScheduler");
        synchronized (this.b) {
            jobParameters = (JobParameters) this.b.remove(v4iVar);
        }
        this.c.v(v4iVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            c5i c5iVarD = c5i.d(getApplicationContext());
            this.a = c5iVarD;
            c5iVarD.f.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            cei.g().o(d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        c5i c5iVar = this.a;
        if (c5iVar != null) {
            c5iVar.f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.a == null) {
            cei.g().c(d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        v4i v4iVarB = b(jobParameters);
        if (v4iVarB == null) {
            cei.g().e(d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.b) {
            try {
                if (this.b.containsKey(v4iVarB)) {
                    cei.g().c(d, "Job is already being executed by SystemJobService: " + v4iVarB);
                    return false;
                }
                cei.g().c(d, "onStartJob for " + v4iVarB);
                this.b.put(v4iVarB, jobParameters);
                int i = Build.VERSION.SDK_INT;
                hc8 hc8Var = new hc8(19);
                if (bxf.b(jobParameters) != null) {
                    hc8Var.c = Arrays.asList(bxf.b(jobParameters));
                }
                if (bxf.a(jobParameters) != null) {
                    hc8Var.b = Arrays.asList(bxf.a(jobParameters));
                }
                if (i >= 28) {
                    hc8Var.d = cxf.a(jobParameters);
                }
                this.a.h(this.c.A(v4iVarB), hc8Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.a == null) {
            cei.g().c(d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        v4i v4iVarB = b(jobParameters);
        if (v4iVarB == null) {
            cei.g().e(d, "WorkSpec id not found!");
            return false;
        }
        cei.g().c(d, "onStopJob for " + v4iVarB);
        synchronized (this.b) {
            this.b.remove(v4iVarB);
        }
        acf acfVarV = this.c.v(v4iVarB);
        if (acfVarV != null) {
            c5i c5iVar = this.a;
            c5iVar.d.c(new qkf(c5iVar, acfVarV, false));
        }
        jac jacVar = this.a.f;
        String str = v4iVarB.a;
        synchronized (jacVar.v0) {
            zContains = jacVar.t0.contains(str);
        }
        return !zContains;
    }
}
