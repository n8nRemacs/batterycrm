package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.G;
import androidx.work.impl.C23588s;
import androidx.work.impl.InterfaceC23551f;
import androidx.work.impl.InterfaceC23614y;
import androidx.work.impl.V;
import androidx.work.impl.W;
import androidx.work.impl.Y;
import androidx.work.impl.model.C23580w;
import androidx.work.impl.utils.J;
import androidx.work.impl.utils.S;
import j.K;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: SystemAlarmDispatcher.java */
@RestrictTo
/* loaded from: classes10.dex */
public class f implements InterfaceC23551f {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f55633m = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f55634b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.c f55635c;

    /* renamed from: d, reason: collision with root package name */
    public final S f55636d;

    /* renamed from: e, reason: collision with root package name */
    public final C23588s f55637e;

    /* renamed from: f, reason: collision with root package name */
    public final Y f55638f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.b f55639g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f55640h;

    /* renamed from: i, reason: collision with root package name */
    public Intent f55641i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public SystemAlarmService f55642j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC23614y f55643k;

    /* renamed from: l, reason: collision with root package name */
    public final V f55644l;

    /* compiled from: SystemAlarmDispatcher.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Executor executor;
            d dVar;
            synchronized (f.this.f55640h) {
                f fVar = f.this;
                fVar.f55641i = (Intent) fVar.f55640h.get(0);
            }
            Intent intent = f.this.f55641i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = f.this.f55641i.getIntExtra("KEY_START_ID", 0);
                G gA2 = G.a();
                int i12 = f.f55633m;
                Objects.toString(f.this.f55641i);
                gA2.getClass();
                PowerManager.WakeLock wakeLockB = J.b(f.this.f55634b, action + " (" + intExtra + ")");
                try {
                    try {
                        G gA3 = G.a();
                        wakeLockB.toString();
                        gA3.getClass();
                        wakeLockB.acquire();
                        f fVar2 = f.this;
                        fVar2.f55639g.a(intExtra, fVar2.f55641i, fVar2);
                        G gA4 = G.a();
                        wakeLockB.toString();
                        gA4.getClass();
                        wakeLockB.release();
                        f fVar3 = f.this;
                        executor = fVar3.f55635c.f56031d;
                        dVar = new d(fVar3);
                    } catch (Throwable unused) {
                        G gA5 = G.a();
                        int i13 = f.f55633m;
                        gA5.getClass();
                        G gA6 = G.a();
                        wakeLockB.toString();
                        gA6.getClass();
                        wakeLockB.release();
                        f fVar4 = f.this;
                        executor = fVar4.f55635c.f56031d;
                        dVar = new d(fVar4);
                    }
                    executor.execute(dVar);
                } catch (Throwable th2) {
                    G gA7 = G.a();
                    int i14 = f.f55633m;
                    wakeLockB.toString();
                    gA7.getClass();
                    wakeLockB.release();
                    f fVar5 = f.this;
                    fVar5.f55635c.f56031d.execute(new d(fVar5));
                    throw th2;
                }
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final f f55646b;

        /* renamed from: c, reason: collision with root package name */
        public final Intent f55647c;

        /* renamed from: d, reason: collision with root package name */
        public final int f55648d;

        public b(int i12, @N Intent intent, @N f fVar) {
            this.f55646b = fVar;
            this.f55647c = intent;
            this.f55648d = i12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = this.f55647c;
            this.f55646b.a(this.f55648d, intent);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    public interface c {
    }

    /* compiled from: SystemAlarmDispatcher.java */
    public static class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final f f55649b;

        public d(@N f fVar) {
            this.f55649b = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0088 A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:4:0x0014, B:6:0x0018, B:8:0x0035, B:11:0x003b, B:12:0x0042, B:13:0x0043, B:14:0x004b, B:18:0x0055, B:20:0x005d, B:21:0x005f, B:25:0x0069, B:27:0x0074, B:35:0x0093, B:31:0x0087, B:32:0x0088, B:34:0x0090, B:39:0x0097, B:22:0x0060, B:23:0x0066, B:15:0x004c, B:16:0x0052), top: B:46:0x0014, inners: #0, #1 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r5 = this;
                androidx.work.impl.background.systemalarm.f r0 = r5.f55649b
                r0.getClass()
                androidx.work.G r1 = androidx.work.G.a()
                int r2 = androidx.work.impl.background.systemalarm.f.f55633m
                r1.getClass()
                androidx.work.impl.background.systemalarm.f.b()
                java.util.ArrayList r1 = r0.f55640h
                monitor-enter(r1)
                android.content.Intent r2 = r0.f55641i     // Catch: java.lang.Throwable -> L39
                if (r2 == 0) goto L43
                androidx.work.G r2 = androidx.work.G.a()     // Catch: java.lang.Throwable -> L39
                android.content.Intent r3 = r0.f55641i     // Catch: java.lang.Throwable -> L39
                java.util.Objects.toString(r3)     // Catch: java.lang.Throwable -> L39
                r2.getClass()     // Catch: java.lang.Throwable -> L39
                java.util.ArrayList r2 = r0.f55640h     // Catch: java.lang.Throwable -> L39
                r3 = 0
                java.lang.Object r2 = r2.remove(r3)     // Catch: java.lang.Throwable -> L39
                android.content.Intent r2 = (android.content.Intent) r2     // Catch: java.lang.Throwable -> L39
                android.content.Intent r3 = r0.f55641i     // Catch: java.lang.Throwable -> L39
                boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L39
                if (r2 == 0) goto L3b
                r2 = 0
                r0.f55641i = r2     // Catch: java.lang.Throwable -> L39
                goto L43
            L39:
                r0 = move-exception
                goto L98
            L3b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L39
                java.lang.String r2 = "Dequeue-d command is not the first."
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L39
                throw r0     // Catch: java.lang.Throwable -> L39
            L43:
                androidx.work.impl.utils.taskexecutor.c r2 = r0.f55635c     // Catch: java.lang.Throwable -> L39
                androidx.work.impl.utils.z r2 = r2.f56028a     // Catch: java.lang.Throwable -> L39
                androidx.work.impl.background.systemalarm.b r3 = r0.f55639g     // Catch: java.lang.Throwable -> L39
                java.lang.Object r4 = r3.f55609d     // Catch: java.lang.Throwable -> L39
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L39
                java.util.HashMap r3 = r3.f55608c     // Catch: java.lang.Throwable -> L95
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L95
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L95
                if (r3 == 0) goto L88
                java.util.ArrayList r3 = r0.f55640h     // Catch: java.lang.Throwable -> L39
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L39
                if (r3 == 0) goto L88
                java.lang.Object r3 = r2.f56037e     // Catch: java.lang.Throwable -> L39
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L39
                java.util.ArrayDeque<androidx.work.impl.utils.z$a> r2 = r2.f56034b     // Catch: java.lang.Throwable -> L85
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L85
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L85
                if (r2 == 0) goto L88
                androidx.work.G r2 = androidx.work.G.a()     // Catch: java.lang.Throwable -> L39
                r2.getClass()     // Catch: java.lang.Throwable -> L39
                androidx.work.impl.background.systemalarm.SystemAlarmService r0 = r0.f55642j     // Catch: java.lang.Throwable -> L39
                if (r0 == 0) goto L93
                r2 = 1
                r0.f55604c = r2     // Catch: java.lang.Throwable -> L39
                androidx.work.G r2 = androidx.work.G.a()     // Catch: java.lang.Throwable -> L39
                r2.getClass()     // Catch: java.lang.Throwable -> L39
                androidx.work.impl.utils.J.a()     // Catch: java.lang.Throwable -> L39
                r0.stopSelf()     // Catch: java.lang.Throwable -> L39
                goto L93
            L85:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L85
                throw r0     // Catch: java.lang.Throwable -> L39
            L88:
                java.util.ArrayList r2 = r0.f55640h     // Catch: java.lang.Throwable -> L39
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L39
                if (r2 != 0) goto L93
                r0.c()     // Catch: java.lang.Throwable -> L39
            L93:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L39
                return
            L95:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L95
                throw r0     // Catch: java.lang.Throwable -> L39
            L98:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L39
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.f.d.run():void");
        }
    }

    static {
        G.b("SystemAlarmDispatcher");
    }

    public f(@N SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f55634b = applicationContext;
        InterfaceC23614y.f56085a.getClass();
        InterfaceC23614y interfaceC23614yA = InterfaceC23614y.a.a(true);
        this.f55643k = interfaceC23614yA;
        Y yF2 = Y.f(systemAlarmService);
        this.f55638f = yF2;
        this.f55639g = new androidx.work.impl.background.systemalarm.b(applicationContext, yF2.f55558c.f55450d, interfaceC23614yA);
        this.f55636d = new S(yF2.f55558c.f55453g);
        C23588s c23588s = yF2.f55562g;
        this.f55637e = c23588s;
        androidx.work.impl.utils.taskexecutor.c cVar = yF2.f55560e;
        this.f55635c = cVar;
        this.f55644l = new W(c23588s, cVar);
        c23588s.a(this);
        this.f55640h = new ArrayList();
        this.f55641i = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @K
    public final void a(int i12, @N Intent intent) {
        G gA2 = G.a();
        intent.toString();
        gA2.getClass();
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            G.a().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f55640h) {
                try {
                    Iterator it = this.f55640h.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i12);
        synchronized (this.f55640h) {
            try {
                boolean zIsEmpty = this.f55640h.isEmpty();
                this.f55640h.add(intent);
                if (zIsEmpty) {
                    c();
                }
            } finally {
            }
        }
    }

    @K
    public final void c() {
        b();
        PowerManager.WakeLock wakeLockB = J.b(this.f55634b, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f55638f.f55560e.b(new a());
        } finally {
            wakeLockB.release();
        }
    }

    @Override // androidx.work.impl.InterfaceC23551f
    public final void onExecuted(@N C23580w c23580w, boolean z12) {
        Executor executor = this.f55635c.f56031d;
        int i12 = androidx.work.impl.background.systemalarm.b.f55606g;
        Intent intent = new Intent(this.f55634b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z12);
        androidx.work.impl.background.systemalarm.b.c(intent, c23580w);
        executor.execute(new b(0, intent, this));
    }
}
