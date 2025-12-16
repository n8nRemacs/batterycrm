package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.H;
import java.util.concurrent.TimeUnit;

/* compiled from: ImmediateThinScheduler.java */
/* loaded from: classes8.dex */
public final class e extends H {

    /* renamed from: d, reason: collision with root package name */
    public static final H.c f404704d;

    /* renamed from: e, reason: collision with root package name */
    public static final io.reactivex.rxjava3.disposables.d f404705e;

    static {
        new e();
        f404704d = new a();
        io.reactivex.rxjava3.disposables.d dVarE = io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        f404705e = dVarE;
        dVarE.dispose();
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final H.c b() {
        return f404704d;
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d d(@j41.e Runnable runnable) {
        runnable.run();
        return f404705e;
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d e(@j41.e Runnable runnable, long j12, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d f(@j41.e Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }

    /* compiled from: ImmediateThinScheduler.java */
    public static final class a extends H.c {
        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d b(@j41.e Runnable runnable) {
            runnable.run();
            return e.f404705e;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d c(@j41.e Runnable runnable, long j12, @j41.e TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d d(@j41.e Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }

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
