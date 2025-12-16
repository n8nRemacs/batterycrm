package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import j.X;
import java.util.HashMap;

/* compiled from: JobIntentService.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class s extends Service {

    /* renamed from: b, reason: collision with root package name */
    public f f44543b;

    /* renamed from: c, reason: collision with root package name */
    public a f44544c;

    /* compiled from: JobIntentService.java */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0054 A[SYNTHETIC] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Void doInBackground(java.lang.Void[] r5) {
            /*
                r4 = this;
                java.lang.Void[] r5 = (java.lang.Void[]) r5
            L2:
                androidx.core.app.s r5 = androidx.core.app.s.this
                androidx.core.app.s$f r0 = r5.f44543b
                r0.getClass()
                androidx.core.app.s$f r5 = r5.f44543b
                java.lang.Object r0 = r5.f44547b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r5.f44548c     // Catch: java.lang.Throwable -> L16
                r2 = 0
                if (r1 != 0) goto L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            L14:
                r0 = r2
                goto L31
            L16:
                r5 = move-exception
                goto L55
            L18:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch: java.lang.Throwable -> L16
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                if (r1 == 0) goto L14
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.s r3 = r5.f44546a
                java.lang.ClassLoader r3 = r3.getClassLoader()
                r0.setExtrasClassLoader(r3)
                androidx.core.app.s$f$a r0 = new androidx.core.app.s$f$a
                r0.<init>(r1)
            L31:
                if (r0 == 0) goto L54
                androidx.core.app.s r5 = androidx.core.app.s.this
                android.app.job.JobWorkItem r1 = r0.f44549a
                r1.getIntent()
                r5.a()
                androidx.core.app.s$f r5 = androidx.core.app.s.f.this
                java.lang.Object r5 = r5.f44547b
                monitor-enter(r5)
                androidx.core.app.s$f r1 = androidx.core.app.s.f.this     // Catch: java.lang.Throwable -> L4e
                android.app.job.JobParameters r1 = r1.f44548c     // Catch: java.lang.Throwable -> L4e
                if (r1 == 0) goto L50
                android.app.job.JobWorkItem r0 = r0.f44549a     // Catch: java.lang.Throwable -> L4e
                r1.completeWork(r0)     // Catch: java.lang.Throwable -> L4e
                goto L50
            L4e:
                r0 = move-exception
                goto L52
            L50:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
                goto L2
            L52:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
                throw r0
            L54:
                return r2
            L55:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.s.a.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r12) {
            s.this.getClass();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r12) {
            s.this.getClass();
        }
    }

    /* compiled from: JobIntentService.java */
    public interface b {
    }

    /* compiled from: JobIntentService.java */
    public static final class c extends h {
    }

    /* compiled from: JobIntentService.java */
    public final class d implements e {
    }

    /* compiled from: JobIntentService.java */
    public interface e {
    }

    /* compiled from: JobIntentService.java */
    @X
    public static final class f extends JobServiceEngine implements b {

        /* renamed from: a, reason: collision with root package name */
        public final s f44546a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f44547b;

        /* renamed from: c, reason: collision with root package name */
        public JobParameters f44548c;

        /* compiled from: JobIntentService.java */
        public final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            public final JobWorkItem f44549a;

            public a(JobWorkItem jobWorkItem) {
                this.f44549a = jobWorkItem;
            }
        }

        public f(s sVar) {
            super(sVar);
            this.f44547b = new Object();
            this.f44546a = sVar;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStartJob(JobParameters jobParameters) {
            this.f44548c = jobParameters;
            s sVar = this.f44546a;
            if (sVar.f44544c != null) {
                return true;
            }
            a aVar = sVar.new a();
            sVar.f44544c = aVar;
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStopJob(JobParameters jobParameters) {
            a aVar = this.f44546a.f44544c;
            if (aVar != null) {
                aVar.cancel(false);
            }
            synchronized (this.f44547b) {
                this.f44548c = null;
            }
            return true;
        }
    }

    /* compiled from: JobIntentService.java */
    @X
    public static final class g extends h {
    }

    /* compiled from: JobIntentService.java */
    public static abstract class h {
    }

    static {
        new HashMap();
    }

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(@j.N Intent intent) {
        f fVar = this.f44543b;
        if (fVar != null) {
            return fVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f44543b = new f(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(@j.P Intent intent, int i12, int i13) {
        return 2;
    }
}
