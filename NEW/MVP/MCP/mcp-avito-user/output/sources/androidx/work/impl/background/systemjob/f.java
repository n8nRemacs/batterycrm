package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.r;
import androidx.work.BackoffPolicy;
import androidx.work.C23538b;
import androidx.work.C23542f;
import androidx.work.G;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.InterfaceC23590u;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C23574p;
import androidx.work.impl.model.C23580w;
import androidx.work.impl.model.H;
import androidx.work.impl.model.o0;
import androidx.work.impl.utils.C23598h;
import androidx.work.impl.utils.CallableC23597g;
import j.N;
import j.P;
import j.X;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;

/* compiled from: SystemJobScheduler.java */
@RestrictTo
@X
/* loaded from: classes10.dex */
public class f implements InterfaceC23590u {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f55663g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f55664b;

    /* renamed from: c, reason: collision with root package name */
    public final JobScheduler f55665c;

    /* renamed from: d, reason: collision with root package name */
    public final d f55666d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f55667e;

    /* renamed from: f, reason: collision with root package name */
    public final C23538b f55668f;

    static {
        G.b("SystemJobScheduler");
    }

    public f(@N Context context, @N WorkDatabase workDatabase, @N C23538b c23538b) {
        JobScheduler jobSchedulerB = c.b(context);
        d dVar = new d(context, c23538b.f55450d, c23538b.f55461o);
        this.f55664b = context;
        this.f55665c = jobSchedulerB;
        this.f55666d = dVar;
        this.f55667e = workDatabase;
        this.f55668f = c23538b;
    }

    public static void a(@N JobScheduler jobScheduler, int i12) {
        try {
            jobScheduler.cancel(i12);
        } catch (Throwable unused) {
            G gA2 = G.a();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i12));
            gA2.getClass();
        }
    }

    @P
    public static ArrayList b(@N Context context, @N JobScheduler jobScheduler) {
        List<JobInfo> listA = c.a(jobScheduler);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listA.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listA) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @P
    public static C23580w c(@N JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C23580w(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k0
    public final void d(@N H h12, int i12) {
        int i13;
        String str;
        d dVar = this.f55666d;
        dVar.getClass();
        C23542f c23542f = h12.f55804j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", h12.f55795a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", h12.f55814t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", h12.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i12, dVar.f55659a).setRequiresCharging(c23542f.f55489c);
        boolean z12 = c23542f.f55490d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z12).setExtras(persistableBundle);
        NetworkRequest networkRequestA = c23542f.a();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 28 || networkRequestA == null) {
            NetworkType networkType = c23542f.f55487a;
            if (i14 < 30 || networkType != NetworkType.f55400g) {
                int iOrdinal = networkType.ordinal();
                if (iOrdinal == 0) {
                    i13 = 0;
                } else if (iOrdinal != 1) {
                    i13 = 2;
                    if (iOrdinal != 2) {
                        i13 = 3;
                        if (iOrdinal != 3) {
                            i13 = 4;
                            if (iOrdinal != 4) {
                                G gA2 = G.a();
                                networkType.toString();
                                int i15 = d.f55658d;
                                gA2.getClass();
                                i13 = 1;
                            }
                        }
                    }
                } else {
                    i13 = 1;
                }
                extras.setRequiredNetworkType(i13);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z12) {
            extras.setBackoffCriteria(h12.f55807m, h12.f55806l == BackoffPolicy.f55356c ? 0 : 1);
        }
        long jA2 = h12.a();
        dVar.f55660b.getClass();
        long jMax = Math.max(jA2 - System.currentTimeMillis(), 0L);
        if (i14 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!h12.f55811q && dVar.f55661c) {
            extras.setImportantWhileForeground(true);
        }
        if (c23542f.b()) {
            for (C23542f.c cVar : c23542f.f55495i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.f55505a, cVar.f55506b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c23542f.f55493g);
            extras.setTriggerContentMaxDelay(c23542f.f55494h);
        }
        extras.setPersisted(false);
        int i16 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(c23542f.f55491e);
        extras.setRequiresStorageNotLow(c23542f.f55492f);
        Object[] objArr = h12.f55805k > 0;
        boolean z13 = jMax > 0;
        if (i16 >= 31 && h12.f55811q && objArr == false && !z13) {
            extras.setExpedited(true);
        }
        if (i16 >= 35 && (str = h12.f55818x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        G.a().getClass();
        try {
            if (this.f55665c.schedule(jobInfoBuild) == 0) {
                G.a().getClass();
                if (h12.f55811q && h12.f55812r == OutOfQuotaPolicy.f55404b) {
                    h12.f55811q = false;
                    G.a().getClass();
                    d(h12, i12);
                }
            }
        } catch (IllegalStateException e12) {
            int i17 = c.f55657a;
            int i18 = Build.VERSION.SDK_INT;
            int i19 = i18 >= 31 ? 150 : 100;
            int size = this.f55667e.A().A().size();
            Context context = this.f55664b;
            String strO = "<faulty JobScheduler failed to getPendingJobs>";
            if (i18 >= 34) {
                JobScheduler jobSchedulerB = c.b(context);
                List<JobInfo> listA = c.a(jobSchedulerB);
                if (listA != null) {
                    ArrayList arrayListB = b(context, jobSchedulerB);
                    int size2 = arrayListB != null ? listA.size() - arrayListB.size() : 0;
                    String str2 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    ArrayList arrayListB2 = b(context, (JobScheduler) context.getSystemService("jobscheduler"));
                    int size3 = arrayListB2 != null ? arrayListB2.size() : 0;
                    strO = C42745f0.O(C42756l.B(new String[]{listA.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str2, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListB3 = b(context, c.b(context));
                if (arrayListB3 != null) {
                    strO = arrayListB3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb2 = new StringBuilder("JobScheduler ");
            sb2.append(i19);
            sb2.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb2.append(strO);
            sb2.append(".\nThere are ");
            sb2.append(size);
            sb2.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strT = r.t(sb2, this.f55668f.f55460n, '.');
            G.a().getClass();
            throw new IllegalStateException(strT, e12);
        } catch (Throwable unused) {
            G gA3 = G.a();
            h12.toString();
            gA3.getClass();
        }
    }

    @Override // androidx.work.impl.InterfaceC23590u
    public final void h(@N String str) {
        ArrayList arrayList;
        Context context = this.f55664b;
        JobScheduler jobScheduler = this.f55665c;
        ArrayList arrayListB = b(context, jobScheduler);
        if (arrayListB == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                C23580w c23580wC = c(jobInfo);
                if (c23580wC != null && str.equals(c23580wC.f55889a)) {
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
        this.f55667e.x().g(str);
    }

    @Override // androidx.work.impl.InterfaceC23590u
    public final boolean i() {
        return true;
    }

    @Override // androidx.work.impl.InterfaceC23590u
    public final void j(@N H... hArr) {
        int iIntValue;
        C23538b c23538b = this.f55668f;
        WorkDatabase workDatabase = this.f55667e;
        C23598h c23598h = new C23598h(workDatabase);
        for (H h12 : hArr) {
            workDatabase.c();
            try {
                H hI2 = workDatabase.A().i(h12.f55795a);
                if (hI2 != null && hI2.f55796b == WorkInfo.State.f55419b) {
                    C23580w c23580wA = o0.a(h12);
                    C23574p c23574pF = workDatabase.x().f(c23580wA);
                    if (c23574pF != null) {
                        iIntValue = c23574pF.f55878c;
                    } else {
                        c23538b.getClass();
                        iIntValue = ((Number) c23598h.f56015a.q(new CallableC23597g(c23538b.f55458l, 0, c23598h))).intValue();
                    }
                    if (c23574pF == null) {
                        workDatabase.x().a(new C23574p(c23580wA.f55889a, c23580wA.f55890b, iIntValue));
                    }
                    d(h12, iIntValue);
                    workDatabase.s();
                } else {
                    G.a().getClass();
                    workDatabase.s();
                }
            } finally {
                workDatabase.l();
            }
        }
    }
}
