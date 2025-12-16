package id;

import Ec.C13472a;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.app.task.C28565j;
import com.avito.android.app.task.R1;
import com.avito.android.enabler.RemoteFeaturesStartupMonitor;
import com.avito.android.util.V2;
import kd.C42669a;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.reflect.n;

/* compiled from: MainProcessApplicationOnCreateDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lid/e;", "Lid/d;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f398595a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C28565j f398596b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<R1> f398597c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.app.coldstart.f> f398598d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RemoteFeaturesStartupMonitor f398599e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final I1 f398600f;

    public e(@Y61.k Application application, @Y61.k C28565j c28565j, @Y61.k h31.e eVar, @Y61.k h31.e eVar2, @Y61.k RemoteFeaturesStartupMonitor remoteFeaturesStartupMonitor, @Y61.k I1 i12) {
        this.f398595a = application;
        this.f398596b = c28565j;
        this.f398597c = eVar;
        this.f398598d = eVar2;
        this.f398599e = remoteFeaturesStartupMonitor;
        this.f398600f = i12;
    }

    @Override // id.d
    public final void a() throws ClassNotFoundException {
        V2.f318762a.c("MainAppDelegate", "initialize", null);
        try {
            Class.forName("android.os.AsyncTask");
        } catch (ClassNotFoundException unused) {
        }
        this.f398596b.a(this.f398595a);
    }

    @Override // id.d
    public final void b(long j12) {
        I1 i12 = this.f398600f;
        n<Object> nVar = I1.f67278k0[42];
        if (((Boolean) i12.f67295Q.a().invoke()).booleanValue()) {
            com.avito.android.app.coldstart.f fVar = this.f398598d.get();
            fVar.getClass();
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                l0.a aVar = new l0.a();
                aVar.f406838b = true;
                new Handler(Looper.getMainLooper()).post(new com.avito.android.app.coldstart.d(aVar, 0));
                fVar.f91360b.registerActivityLifecycleCallbacks(new com.avito.android.app.coldstart.e(fVar, aVar, j12));
            }
        } else {
            com.avito.android.time.c.f301452a.getClass();
            long jA2 = com.avito.android.time.c.f301453b.a() - j12;
            R1 r12 = this.f398597c.get();
            r12.getClass();
            C42669a c42669a = new C42669a(jA2);
            InterfaceC28373a interfaceC28373a = r12.f91507a;
            interfaceC28373a.c(c42669a);
            C13472a.f4111a.getClass();
            interfaceC28373a.c(new y.c("application_start.app_init_time", Long.valueOf(jA2), null));
        }
        this.f398599e.checkMonitorToggle();
    }
}
