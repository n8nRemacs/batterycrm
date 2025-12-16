package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.annotation.RestrictTo;
import androidx.work.C23538b;
import androidx.work.C23540d;
import androidx.work.ExistingWorkPolicy;
import androidx.work.G;
import androidx.work.WorkManager;
import androidx.work.impl.model.C23580w;
import androidx.work.impl.utils.C23593c;
import androidx.work.impl.utils.C23610u;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.List;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43176k0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: WorkManagerImpl.java */
@RestrictTo
/* loaded from: classes10.dex */
public class Y extends WorkManager {

    /* renamed from: m, reason: collision with root package name */
    public static Y f55554m;

    /* renamed from: n, reason: collision with root package name */
    public static Y f55555n;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f55556o;

    /* renamed from: b, reason: collision with root package name */
    public final Context f55557b;

    /* renamed from: c, reason: collision with root package name */
    public final C23538b f55558c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f55559d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.c f55560e;

    /* renamed from: f, reason: collision with root package name */
    public final List<InterfaceC23590u> f55561f;

    /* renamed from: g, reason: collision with root package name */
    public final C23588s f55562g;

    /* renamed from: h, reason: collision with root package name */
    public final C23610u f55563h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f55564i = false;

    /* renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f55565j;

    /* renamed from: k, reason: collision with root package name */
    public volatile androidx.work.multiprocess.t f55566k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.work.impl.constraints.trackers.n f55567l;

    /* compiled from: WorkManagerImpl.java */
    @j.X
    public static class a {
    }

    static {
        androidx.work.G.b("WorkManagerImpl");
        f55554m = null;
        f55555n = null;
        f55556o = new Object();
    }

    @RestrictTo
    public Y(@j.N Context context, @j.N final C23538b c23538b, @j.N androidx.work.impl.utils.taskexecutor.c cVar, @j.N final WorkDatabase workDatabase, @j.N final List list, @j.N C23588s c23588s, @j.N androidx.work.impl.constraints.trackers.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        int i12 = c23538b.f55457k;
        G.a aVar = new G.a();
        synchronized (androidx.work.G.f55382a) {
            if (androidx.work.G.f55383b == null) {
                androidx.work.G.f55383b = aVar;
            }
        }
        this.f55557b = applicationContext;
        this.f55560e = cVar;
        this.f55559d = workDatabase;
        this.f55562g = c23588s;
        this.f55567l = nVar;
        this.f55558c = c23538b;
        this.f55561f = list;
        C43238h c43238hA = kotlinx.coroutines.U.a(cVar.f56029b);
        this.f55563h = new C23610u(workDatabase);
        final androidx.work.impl.utils.z zVar = cVar.f56028a;
        int i13 = C23612w.f56044a;
        c23588s.a(new InterfaceC23551f() { // from class: androidx.work.impl.v
            @Override // androidx.work.impl.InterfaceC23551f
            public final void onExecuted(C23580w c23580w, boolean z12) {
                int i14 = C23612w.f56044a;
                zVar.execute(new FX0.a(list, c23580w, c23538b, workDatabase, 2));
            }
        });
        cVar.b(new ForceStopRunnable(applicationContext, this));
        int i14 = E.f55522b;
        if (androidx.work.impl.utils.v.a(applicationContext, c23538b)) {
            C43175k.K(new C43197r1(new D(applicationContext, null), C43175k.r(C43175k.c(new C43176k0(workDatabase.A().E(), new C(4, null)), -1, 2))), c43238hA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.N
    @RestrictTo
    public static Y f(@j.N Context context) {
        Y yF2;
        Object obj = f55556o;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    yF2 = f55554m;
                    if (yF2 == null) {
                        yF2 = f55555n;
                    }
                }
                return yF2;
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
        if (yF2 == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof C23538b.c)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            g(applicationContext, ((C23538b.c) applicationContext).c());
            yF2 = f(applicationContext);
        }
        return yF2;
    }

    @RestrictTo
    public static void g(@j.N Context context, @j.N C23538b c23538b) {
        synchronized (f55556o) {
            try {
                Y y12 = f55554m;
                if (y12 != null && f55555n != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (y12 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f55555n == null) {
                        f55555n = c0.a(applicationContext, c23538b);
                    }
                    f55554m = f55555n;
                }
            } finally {
            }
        }
    }

    @Override // androidx.work.WorkManager
    @j.N
    public final G b(@j.N String str, @j.N ExistingWorkPolicy existingWorkPolicy, @j.N List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new G(this, str, existingWorkPolicy, list, null);
    }

    @Override // androidx.work.WorkManager
    @j.N
    public final androidx.work.L c() {
        return C23593c.d(this, "mapkit_background_download");
    }

    @Override // androidx.work.WorkManager
    @j.N
    public final androidx.work.L d(@j.N List list) {
        return new G(this, "mapkit_background_download", ExistingWorkPolicy.f55375b, list, null).a();
    }

    @j.N
    public final androidx.work.L e(@j.N List<? extends androidx.work.c0> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new G(this, null, ExistingWorkPolicy.f55376c, list, null).a();
    }

    @RestrictTo
    public final void h() {
        synchronized (f55556o) {
            try {
                this.f55564i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f55565j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f55565j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        C23540d c23540d = this.f55558c.f55462p;
        F f12 = new F(this, 1);
        c23540d.getClass();
        boolean zD2 = androidx.tracing.b.d();
        if (zD2) {
            try {
                c23540d.a("ReschedulingWork");
            } catch (Throwable th2) {
                if (zD2) {
                    Trace.endSection();
                }
                throw th2;
            }
        }
        f12.invoke();
        if (zD2) {
            Trace.endSection();
        }
    }
}
