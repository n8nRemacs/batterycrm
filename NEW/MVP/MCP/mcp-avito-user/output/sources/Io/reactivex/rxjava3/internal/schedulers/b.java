package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import m41.C43881c;
import s41.C47998a;

/* compiled from: ComputationScheduler.java */
/* loaded from: classes8.dex */
public final class b extends H implements o {

    /* renamed from: e, reason: collision with root package name */
    public static final C11516b f404668e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f404669f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f404670g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f404671h;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<C11516b> f404672d;

    /* compiled from: ComputationScheduler.java */
    public static final class a extends H.c {

        /* renamed from: b, reason: collision with root package name */
        public final C43881c f404673b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f404674c;

        /* renamed from: d, reason: collision with root package name */
        public final C43881c f404675d;

        /* renamed from: e, reason: collision with root package name */
        public final c f404676e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f404677f;

        public a(c cVar) {
            this.f404676e = cVar;
            C43881c c43881c = new C43881c();
            this.f404673b = c43881c;
            io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
            this.f404674c = cVar2;
            C43881c c43881c2 = new C43881c();
            this.f404675d = c43881c2;
            c43881c2.b(c43881c);
            c43881c2.b(cVar2);
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d b(@j41.e Runnable runnable) {
            return this.f404677f ? EmptyDisposable.f401988b : this.f404676e.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f404673b);
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d c(@j41.e Runnable runnable, long j12, @j41.e TimeUnit timeUnit) {
            return this.f404677f ? EmptyDisposable.f401988b : this.f404676e.e(runnable, j12, timeUnit, this.f404674c);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404677f) {
                return;
            }
            this.f404677f = true;
            this.f404675d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404677f;
        }
    }

    /* compiled from: ComputationScheduler.java */
    /* renamed from: io.reactivex.rxjava3.internal.schedulers.b$b, reason: collision with other inner class name */
    public static final class C11516b implements o {

        /* renamed from: b, reason: collision with root package name */
        public final int f404678b;

        /* renamed from: c, reason: collision with root package name */
        public final c[] f404679c;

        /* renamed from: d, reason: collision with root package name */
        public long f404680d;

        public C11516b(int i12, k kVar) {
            this.f404678b = i12;
            this.f404679c = new c[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                this.f404679c[i13] = new c(kVar);
            }
        }

        public final c a() {
            int i12 = this.f404678b;
            if (i12 == 0) {
                return b.f404671h;
            }
            long j12 = this.f404680d;
            this.f404680d = 1 + j12;
            return this.f404679c[(int) (j12 % i12)];
        }
    }

    /* compiled from: ComputationScheduler.java */
    public static final class c extends i {
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f404670g = iAvailableProcessors;
        c cVar = new c(new k("RxComputationShutdown"));
        f404671h = cVar;
        cVar.dispose();
        k kVar = new k("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f404669f = kVar;
        C11516b c11516b = new C11516b(0, kVar);
        f404668e = c11516b;
        for (c cVar2 : c11516b.f404679c) {
            cVar2.dispose();
        }
    }

    public b() {
        AtomicReference<C11516b> atomicReference;
        k kVar = f404669f;
        C11516b c11516b = f404668e;
        this.f404672d = new AtomicReference<>(c11516b);
        C11516b c11516b2 = new C11516b(f404670g, kVar);
        do {
            atomicReference = this.f404672d;
            if (atomicReference.compareAndSet(c11516b, c11516b2)) {
                return;
            }
        } while (atomicReference.get() == c11516b);
        for (c cVar : c11516b2.f404679c) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final H.c b() {
        return new a(this.f404672d.get().a());
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d e(@j41.e Runnable runnable, long j12, TimeUnit timeUnit) {
        c cVarA = this.f404672d.get().a();
        cVarA.getClass();
        Objects.requireNonNull(runnable, "run is null");
        m mVar = new m(runnable, true);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = cVarA.f404733b;
        try {
            mVar.a(j12 <= 0 ? scheduledThreadPoolExecutor.submit(mVar) : scheduledThreadPoolExecutor.schedule(mVar, j12, timeUnit));
            return mVar;
        } catch (RejectedExecutionException e12) {
            C47998a.b(e12);
            return EmptyDisposable.f401988b;
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d f(@j41.e Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
        c cVarA = this.f404672d.get().a();
        cVarA.getClass();
        EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = cVarA.f404733b;
        if (j13 <= 0) {
            f fVar = new f(runnable, scheduledThreadPoolExecutor);
            try {
                fVar.a(j12 <= 0 ? scheduledThreadPoolExecutor.submit(fVar) : scheduledThreadPoolExecutor.schedule(fVar, j12, timeUnit));
                return fVar;
            } catch (RejectedExecutionException e12) {
                C47998a.b(e12);
                return emptyDisposable;
            }
        }
        l lVar = new l(runnable, true);
        try {
            lVar.a(scheduledThreadPoolExecutor.scheduleAtFixedRate(lVar, j12, j13, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e13) {
            C47998a.b(e13);
            return emptyDisposable;
        }
    }
}
