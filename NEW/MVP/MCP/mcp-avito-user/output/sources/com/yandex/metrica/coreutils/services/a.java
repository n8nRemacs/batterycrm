package com.yandex.metrica.coreutils.services;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import j.N;
import java.util.concurrent.TimeUnit;

/* compiled from: ActivationBarrier.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final long f377637c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    public long f377638a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final e f377639b = new e();

    /* compiled from: ActivationBarrier.java */
    /* renamed from: com.yandex.metrica.coreutils.services.a$a, reason: collision with other inner class name */
    public class RunnableC10947a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f377640b;

        public RunnableC10947a(c cVar) {
            this.f377640b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f377640b.onWaitFinished();
        }
    }

    /* compiled from: ActivationBarrier.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f377641a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final c f377642b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public final a f377643c;

        public b(@N Runnable runnable) {
            a aVar = h.f377659c.f377661b;
            this.f377641a = false;
            this.f377642b = new com.yandex.metrica.coreutils.services.b(this, runnable);
            this.f377643c = aVar;
        }
    }

    /* compiled from: ActivationBarrier.java */
    public interface c {
        void onWaitFinished();
    }

    public final void a(long j12, @N ICommonExecutor iCommonExecutor, @N c cVar) {
        this.f377639b.getClass();
        iCommonExecutor.executeDelayed(new RunnableC10947a(cVar), Math.max(j12 - (System.currentTimeMillis() - this.f377638a), 0L));
    }
}
