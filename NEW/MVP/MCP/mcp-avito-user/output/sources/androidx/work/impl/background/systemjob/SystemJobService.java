package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.annotation.RestrictTo;
import androidx.work.G;
import androidx.work.WorkerParameters;
import androidx.work.impl.C23588s;
import androidx.work.impl.C23613x;
import androidx.work.impl.InterfaceC23551f;
import androidx.work.impl.InterfaceC23614y;
import androidx.work.impl.W;
import androidx.work.impl.Y;
import androidx.work.impl.model.C23580w;
import j.K;
import j.N;
import j.P;
import j.X;
import java.util.Arrays;
import java.util.HashMap;

@RestrictTo
@X
/* loaded from: classes10.dex */
public class SystemJobService extends JobService implements InterfaceC23551f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f55650f = 0;

    /* renamed from: b, reason: collision with root package name */
    public Y f55651b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f55652c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC23614y f55653d;

    /* renamed from: e, reason: collision with root package name */
    public W f55654e;

    @X
    public static class a {
    }

    @X
    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    @X
    public static class c {
        public static int a(JobParameters jobParameters) {
            int stopReason = jobParameters.getStopReason();
            int i12 = SystemJobService.f55650f;
            switch (stopReason) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return stopReason;
                default:
                    return -512;
            }
        }
    }

    static {
        G.b("SystemJobService");
    }

    public SystemJobService() {
        InterfaceC23614y.f56085a.getClass();
        this.f55653d = InterfaceC23614y.a.a(false);
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AK.c.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    @P
    public static C23580w b(@N JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C23580w(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            Y yF2 = Y.f(getApplicationContext());
            this.f55651b = yF2;
            C23588s c23588s = yF2.f55562g;
            this.f55654e = new W(c23588s, yF2.f55560e);
            c23588s.a(this);
        } catch (IllegalStateException e12) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e12);
            }
            G.a().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        Y y12 = this.f55651b;
        if (y12 != null) {
            y12.f55562g.f(this);
        }
    }

    @Override // androidx.work.impl.InterfaceC23551f
    @K
    public final void onExecuted(@N C23580w c23580w, boolean z12) {
        a("onExecuted");
        G gA2 = G.a();
        String str = c23580w.f55889a;
        gA2.getClass();
        JobParameters jobParameters = (JobParameters) this.f55652c.remove(c23580w);
        this.f55653d.a(c23580w);
        if (jobParameters != null) {
            jobFinished(jobParameters, z12);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@N JobParameters jobParameters) {
        a("onStartJob");
        if (this.f55651b == null) {
            G.a().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        C23580w c23580wB = b(jobParameters);
        if (c23580wB == null) {
            G.a().getClass();
            return false;
        }
        HashMap map = this.f55652c;
        if (map.containsKey(c23580wB)) {
            G gA2 = G.a();
            c23580wB.toString();
            gA2.getClass();
            return false;
        }
        G gA3 = G.a();
        c23580wB.toString();
        gA3.getClass();
        map.put(c23580wB, jobParameters);
        int i12 = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (jobParameters.getTriggeredContentUris() != null) {
            aVar.f55445b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            aVar.f55444a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (i12 >= 28) {
            aVar.f55446c = b.a(jobParameters);
        }
        this.f55654e.c(this.f55653d.d(c23580wB), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@N JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.f55651b == null) {
            G.a().getClass();
            return true;
        }
        C23580w c23580wB = b(jobParameters);
        if (c23580wB == null) {
            G.a().getClass();
            return false;
        }
        G gA2 = G.a();
        c23580wB.toString();
        gA2.getClass();
        this.f55652c.remove(c23580wB);
        C23613x c23613xA = this.f55653d.a(c23580wB);
        if (c23613xA != null) {
            this.f55654e.a(c23613xA, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        C23588s c23588s = this.f55651b.f55562g;
        String str = c23580wB.f55889a;
        synchronized (c23588s.f55931k) {
            zContains = c23588s.f55929i.contains(str);
        }
        return !zContains;
    }
}
