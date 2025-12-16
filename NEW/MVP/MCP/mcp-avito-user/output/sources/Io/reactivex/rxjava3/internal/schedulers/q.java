package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SchedulerWhen.java */
/* loaded from: classes8.dex */
public class q extends H implements io.reactivex.rxjava3.disposables.d {

    /* renamed from: d, reason: collision with root package name */
    public static final io.reactivex.rxjava3.disposables.d f404744d = new g();

    /* renamed from: e, reason: collision with root package name */
    public static final EmptyDisposable f404745e = EmptyDisposable.f401988b;

    /* compiled from: SchedulerWhen.java */
    public static final class a implements l41.o<f, AbstractC41768a> {

        /* compiled from: SchedulerWhen.java */
        /* renamed from: io.reactivex.rxjava3.internal.schedulers.q$a$a, reason: collision with other inner class name */
        public final class C11519a extends AbstractC41768a {

            /* renamed from: b, reason: collision with root package name */
            public final f f404746b;

            public C11519a(a aVar, f fVar) {
                this.f404746b = fVar;
            }

            @Override // io.reactivex.rxjava3.core.AbstractC41768a
            public final void w(InterfaceC41771d interfaceC41771d) {
                interfaceC41771d.b(this.f404746b);
                throw null;
            }
        }

        @Override // l41.o
        public final AbstractC41768a apply(f fVar) {
            return new C11519a(this, fVar);
        }
    }

    /* compiled from: SchedulerWhen.java */
    public static class b extends f {

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f404747b;

        public b(Runnable runnable, long j12, TimeUnit timeUnit) {
            this.f404747b = runnable;
        }
    }

    /* compiled from: SchedulerWhen.java */
    public static class c extends f {

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f404748b;

        public c(Runnable runnable) {
            this.f404748b = runnable;
        }
    }

    /* compiled from: SchedulerWhen.java */
    public static class d implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: SchedulerWhen.java */
    public static final class e extends H.c {
        public e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d b(@j41.e Runnable runnable) {
            new c(runnable);
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d c(@j41.e Runnable runnable, long j12, @j41.e TimeUnit timeUnit) {
            new b(runnable, j12, timeUnit);
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            throw null;
        }
    }

    /* compiled from: SchedulerWhen.java */
    public static abstract class f extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.disposables.d {
        public f() {
            super(q.f404744d);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            getAndSet(q.f404745e).dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get().getF318621e();
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final H.c b() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        throw null;
    }

    /* compiled from: SchedulerWhen.java */
    public static final class g implements io.reactivex.rxjava3.disposables.d {
        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return false;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
        }
    }
}
