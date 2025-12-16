package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s41.C47998a;

/* compiled from: NewThreadWorker.java */
/* loaded from: classes8.dex */
public class i extends H.c implements io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f404733b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f404734c;

    public i(k kVar) {
        boolean z12 = p.f404743a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, kVar);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(p.f404743a);
        this.f404733b = scheduledThreadPoolExecutor;
    }

    @Override // io.reactivex.rxjava3.core.H.c
    @j41.e
    public final io.reactivex.rxjava3.disposables.d b(@j41.e Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // io.reactivex.rxjava3.core.H.c
    @j41.e
    public final io.reactivex.rxjava3.disposables.d c(@j41.e Runnable runnable, long j12, @j41.e TimeUnit timeUnit) {
        return this.f404734c ? EmptyDisposable.f401988b : e(runnable, j12, timeUnit, null);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (this.f404734c) {
            return;
        }
        this.f404734c = true;
        this.f404733b.shutdownNow();
    }

    @j41.e
    public final n e(Runnable runnable, long j12, @j41.e TimeUnit timeUnit, @j41.f io.reactivex.rxjava3.disposables.e eVar) {
        Objects.requireNonNull(runnable, "run is null");
        n nVar = new n(runnable, eVar);
        if (eVar != null && !eVar.b(nVar)) {
            return nVar;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f404733b;
        try {
            nVar.a(j12 <= 0 ? scheduledThreadPoolExecutor.submit((Callable) nVar) : scheduledThreadPoolExecutor.schedule((Callable) nVar, j12, timeUnit));
        } catch (RejectedExecutionException e12) {
            if (eVar != null) {
                eVar.a(nVar);
            }
            C47998a.b(e12);
        }
        return nVar;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f404734c;
    }
}
