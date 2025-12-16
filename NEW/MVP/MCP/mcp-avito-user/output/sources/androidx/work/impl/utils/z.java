package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* compiled from: SerialExecutorImpl.java */
/* loaded from: classes10.dex */
public class z implements androidx.work.impl.utils.taskexecutor.a {

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f56035c;

    /* renamed from: d, reason: collision with root package name */
    @j.B
    public Runnable f56036d;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<a> f56034b = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public final Object f56037e = new Object();

    /* compiled from: SerialExecutorImpl.java */
    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final z f56038b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f56039c;

        public a(@j.N z zVar, @j.N Runnable runnable) {
            this.f56038b = zVar;
            this.f56039c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f56039c.run();
                synchronized (this.f56038b.f56037e) {
                    this.f56038b.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f56038b.f56037e) {
                    this.f56038b.a();
                    throw th2;
                }
            }
        }
    }

    public z(@j.N ExecutorService executorService) {
        this.f56035c = executorService;
    }

    @j.B
    public final void a() {
        a aVarPoll = this.f56034b.poll();
        this.f56036d = aVarPoll;
        if (aVarPoll != null) {
            this.f56035c.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@j.N Runnable runnable) {
        synchronized (this.f56037e) {
            try {
                this.f56034b.add(new a(this, runnable));
                if (this.f56036d == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
