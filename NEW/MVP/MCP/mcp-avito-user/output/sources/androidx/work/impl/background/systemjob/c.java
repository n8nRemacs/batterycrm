package androidx.work.impl.background.systemjob;

import Y61.k;
import Y61.l;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.G;
import j.X;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobSchedulerExt.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55657a = 0;

    static {
        G.b("SystemJobScheduler");
    }

    @l
    @X
    public static final List<JobInfo> a(@k JobScheduler jobScheduler) {
        try {
            a.f55655a.getClass();
            return jobScheduler.getAllPendingJobs();
        } catch (Throwable unused) {
            G.a().getClass();
            return null;
        }
    }

    @k
    @X
    public static final JobScheduler b(@k Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        b.f55656a.getClass();
        return jobScheduler.forNamespace("androidx.work.systemjobscheduler");
    }
}
