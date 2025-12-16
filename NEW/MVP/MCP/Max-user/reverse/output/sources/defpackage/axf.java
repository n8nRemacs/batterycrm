package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class axf implements k0e {
    public static final String o = cei.m("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final c5i c;
    public final zwf d;

    public axf(Context context, c5i c5iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        zwf zwfVar = new zwf(context);
        this.a = context;
        this.c = c5iVar;
        this.b = jobScheduler;
        this.d = zwfVar;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            cei.g().f(o, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            cei.g().f(o, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static v4i f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new v4i(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.k0e
    public final boolean b() {
        return true;
    }

    @Override // defpackage.k0e
    public final void c(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList arrayListD = d(context, jobScheduler);
        if (arrayListD == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                v4i v4iVarF = f(jobInfo);
                if (v4iVarF != null && str.equals(v4iVarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a(jobScheduler, ((Integer) it2.next()).intValue());
        }
        ywf ywfVarU = this.c.c.u();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ywfVarU.a;
        workDatabase_Impl.b();
        crd crdVar = (crd) ywfVarU.d;
        vk6 vk6VarA = crdVar.a();
        if (str == null) {
            vk6VarA.S(1);
        } else {
            vk6VarA.f(1, str);
        }
        workDatabase_Impl.c();
        try {
            vk6VarA.w();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.k();
            crdVar.r(vk6VarA);
        }
    }

    @Override // defpackage.k0e
    public final void e(r5i... r5iVarArr) {
        int iIntValue;
        c5i c5iVar = this.c;
        WorkDatabase workDatabase = c5iVar.c;
        final qc7 qc7Var = new qc7(workDatabase);
        for (r5i r5iVar : r5iVarArr) {
            workDatabase.c();
            try {
                s5i s5iVarX = workDatabase.x();
                String str = r5iVar.a;
                r5i r5iVarP = s5iVarX.p(str);
                String str2 = o;
                if (r5iVarP == null) {
                    cei.g().o(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.q();
                } else if (r5iVarP.b != w4i.a) {
                    cei.g().o(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.q();
                } else {
                    v4i v4iVarD = nsi.d(r5iVar);
                    xwf xwfVarO = workDatabase.u().o(v4iVarD);
                    if (xwfVarO != null) {
                        iIntValue = xwfVarO.c;
                    } else {
                        c5iVar.b.getClass();
                        final int i = c5iVar.b.g;
                        iIntValue = ((Number) qc7Var.a.o(new Callable() { // from class: pc7
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = qc7Var.a;
                                Long lV = workDatabase2.t().v("next_job_scheduler_id");
                                int i2 = 0;
                                int iLongValue = lV != null ? (int) lV.longValue() : 0;
                                workDatabase2.t().y(new r7c("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i) {
                                    workDatabase2.t().y(new r7c("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i2 = iLongValue;
                                }
                                return Integer.valueOf(i2);
                            }
                        })).intValue();
                    }
                    if (xwfVarO == null) {
                        c5iVar.c.u().p(new xwf(v4iVarD.a, v4iVarD.b, iIntValue));
                    }
                    g(r5iVar, iIntValue);
                    workDatabase.q();
                }
            } finally {
                workDatabase.k();
            }
        }
    }

    public final void g(r5i r5iVar, int i) {
        int i2;
        int i3;
        JobScheduler jobScheduler = this.b;
        zwf zwfVar = this.d;
        zwfVar.getClass();
        bu3 bu3Var = r5iVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = r5iVar.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", r5iVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", r5iVar.d());
        JobInfo.Builder builder = new JobInfo.Builder(i, zwfVar.a);
        boolean z = bu3Var.b;
        Set<au3> set = bu3Var.h;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = bu3Var.c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        int i4 = bu3Var.a;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30 || i4 != 6) {
            int iV = az1.v(i4);
            if (iV == 0) {
                i2 = 0;
            } else if (iV != 1) {
                i2 = 2;
                if (iV != 2) {
                    i2 = 3;
                    if (iV != 3) {
                        i2 = 4;
                        if (iV != 4) {
                            cei.g().c(zwf.b, "API version too low. Cannot convert network type value ".concat(vb9.o(i4)));
                            i2 = 1;
                        }
                    }
                }
            } else {
                i2 = 1;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z2) {
            extras.setBackoffCriteria(r5iVar.m, r5iVar.l == eg0.b ? 0 : 1);
        }
        long jMax = Math.max(r5iVar.a() - System.currentTimeMillis(), 0L);
        if (i5 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!r5iVar.q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (au3 au3Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(au3Var.a, au3Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(bu3Var.f);
            extras.setTriggerContentMaxDelay(bu3Var.g);
        }
        extras.setPersisted(false);
        int i6 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(bu3Var.d);
        extras.setRequiresStorageNotLow(bu3Var.e);
        boolean z3 = r5iVar.k > 0;
        boolean z4 = jMax > 0;
        if (i6 >= 31 && r5iVar.q && !z3 && !z4) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        String str2 = o;
        cei.g().c(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            try {
                if (jobScheduler.schedule(jobInfoBuild) == 0) {
                    cei.g().o(str2, "Unable to schedule work ID " + str);
                    if (r5iVar.q) {
                        if (r5iVar.r == ujb.a) {
                            i3 = 0;
                            try {
                                r5iVar.q = false;
                                cei.g().c(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                                g(r5iVar, i);
                            } catch (IllegalStateException e) {
                                e = e;
                                ArrayList arrayListD = d(this.a, jobScheduler);
                                int size = arrayListD != null ? arrayListD.size() : i3;
                                Locale locale = Locale.getDefault();
                                Integer numValueOf = Integer.valueOf(size);
                                c5i c5iVar = this.c;
                                String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(c5iVar.c.x().m().size()), Integer.valueOf(c5iVar.b.h));
                                cei.g().e(str2, str3);
                                IllegalStateException illegalStateException = new IllegalStateException(str3, e);
                                c5iVar.b.getClass();
                                throw illegalStateException;
                            }
                        }
                    }
                }
            } catch (IllegalStateException e2) {
                e = e2;
                i3 = 0;
            }
        } catch (Throwable th) {
            cei.g().f(str2, "Unable to schedule " + r5iVar, th);
        }
    }
}
