package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.r;
import androidx.work.G;
import androidx.work.impl.C23613x;
import androidx.work.impl.background.systemalarm.f;
import androidx.work.impl.constraints.b;
import androidx.work.impl.constraints.trackers.n;
import androidx.work.impl.model.C23580w;
import androidx.work.impl.model.H;
import androidx.work.impl.utils.J;
import androidx.work.impl.utils.S;
import j.N;
import j.P;
import j.l0;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlinx.coroutines.M;
import kotlinx.coroutines.P0;

/* compiled from: DelayMetCommandHandler.java */
@RestrictTo
/* loaded from: classes10.dex */
public class e implements androidx.work.impl.constraints.e, S.a {

    /* renamed from: b, reason: collision with root package name */
    public final Context f55619b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55620c;

    /* renamed from: d, reason: collision with root package name */
    public final C23580w f55621d;

    /* renamed from: e, reason: collision with root package name */
    public final f f55622e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.work.impl.constraints.f f55623f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f55624g;

    /* renamed from: h, reason: collision with root package name */
    public int f55625h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.a f55626i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f55627j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public PowerManager.WakeLock f55628k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f55629l;

    /* renamed from: m, reason: collision with root package name */
    public final C23613x f55630m;

    /* renamed from: n, reason: collision with root package name */
    public final M f55631n;

    /* renamed from: o, reason: collision with root package name */
    public volatile P0 f55632o;

    static {
        G.b("DelayMetCommandHandler");
    }

    public e(@N Context context, int i12, @N f fVar, @N C23613x c23613x) {
        this.f55619b = context;
        this.f55620c = i12;
        this.f55622e = fVar;
        this.f55621d = c23613x.f56084a;
        this.f55630m = c23613x;
        n nVar = fVar.f55638f.f55567l;
        androidx.work.impl.utils.taskexecutor.c cVar = fVar.f55635c;
        this.f55626i = cVar.f56028a;
        this.f55627j = cVar.f56031d;
        this.f55631n = cVar.f56029b;
        this.f55623f = new androidx.work.impl.constraints.f(nVar);
        this.f55629l = false;
        this.f55625h = 0;
        this.f55624g = new Object();
    }

    public static void b(e eVar) {
        C23580w c23580w = eVar.f55621d;
        String str = c23580w.f55889a;
        if (eVar.f55625h >= 2) {
            G.a().getClass();
            return;
        }
        eVar.f55625h = 2;
        G.a().getClass();
        int i12 = b.f55606g;
        Context context = eVar.f55619b;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        b.c(intent, c23580w);
        f fVar = eVar.f55622e;
        int i13 = eVar.f55620c;
        f.b bVar = new f.b(i13, intent, fVar);
        Executor executor = eVar.f55627j;
        executor.execute(bVar);
        if (!fVar.f55637e.e(c23580w.f55889a)) {
            G.a().getClass();
            return;
        }
        G.a().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        b.c(intent2, c23580w);
        executor.execute(new f.b(i13, intent2, fVar));
    }

    public static void c(e eVar) {
        if (eVar.f55625h != 0) {
            G gA2 = G.a();
            Objects.toString(eVar.f55621d);
            gA2.getClass();
            return;
        }
        eVar.f55625h = 1;
        G gA3 = G.a();
        Objects.toString(eVar.f55621d);
        gA3.getClass();
        if (!eVar.f55622e.f55637e.g(eVar.f55630m, null)) {
            eVar.d();
            return;
        }
        S s5 = eVar.f55622e.f55636d;
        C23580w c23580w = eVar.f55621d;
        synchronized (s5.f55973d) {
            G gA4 = G.a();
            int i12 = S.f55969e;
            Objects.toString(c23580w);
            gA4.getClass();
            s5.a(c23580w);
            S.b bVar = new S.b(s5, c23580w);
            s5.f55971b.put(c23580w, bVar);
            s5.f55972c.put(c23580w, eVar);
            s5.f55970a.a(600000L, bVar);
        }
    }

    @Override // androidx.work.impl.utils.S.a
    public final void a(@N C23580w c23580w) {
        G gA2 = G.a();
        Objects.toString(c23580w);
        gA2.getClass();
        this.f55626i.execute(new d(this, 0));
    }

    public final void d() {
        synchronized (this.f55624g) {
            try {
                if (this.f55632o != null) {
                    this.f55632o.c(null);
                }
                this.f55622e.f55636d.a(this.f55621d);
                PowerManager.WakeLock wakeLock = this.f55628k;
                if (wakeLock != null && wakeLock.isHeld()) {
                    G gA2 = G.a();
                    Objects.toString(this.f55628k);
                    Objects.toString(this.f55621d);
                    gA2.getClass();
                    this.f55628k.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l0
    public final void e() {
        String str = this.f55621d.f55889a;
        Context context = this.f55619b;
        StringBuilder sbZ = r.z(str, " (");
        sbZ.append(this.f55620c);
        sbZ.append(")");
        this.f55628k = J.b(context, sbZ.toString());
        G gA2 = G.a();
        Objects.toString(this.f55628k);
        gA2.getClass();
        this.f55628k.acquire();
        H hI2 = this.f55622e.f55638f.f55559d.A().i(str);
        if (hI2 == null) {
            this.f55626i.execute(new d(this, 0));
            return;
        }
        boolean zC2 = hI2.c();
        this.f55629l = zC2;
        if (zC2) {
            this.f55632o = androidx.work.impl.constraints.h.a(this.f55623f, hI2, this.f55631n, this);
        } else {
            G.a().getClass();
            this.f55626i.execute(new d(this, 1));
        }
    }

    public final void f(boolean z12) {
        G gA2 = G.a();
        C23580w c23580w = this.f55621d;
        Objects.toString(c23580w);
        gA2.getClass();
        d();
        int i12 = this.f55620c;
        f fVar = this.f55622e;
        Executor executor = this.f55627j;
        Context context = this.f55619b;
        if (z12) {
            int i13 = b.f55606g;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            b.c(intent, c23580w);
            executor.execute(new f.b(i12, intent, fVar));
        }
        if (this.f55629l) {
            int i14 = b.f55606g;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor.execute(new f.b(i12, intent2, fVar));
        }
    }

    @Override // androidx.work.impl.constraints.e
    public final void onConstraintsStateChanged(@N H h12, @N androidx.work.impl.constraints.b bVar) {
        boolean z12 = bVar instanceof b.a;
        androidx.work.impl.utils.taskexecutor.a aVar = this.f55626i;
        if (z12) {
            aVar.execute(new d(this, 1));
        } else {
            aVar.execute(new d(this, 0));
        }
    }
}
