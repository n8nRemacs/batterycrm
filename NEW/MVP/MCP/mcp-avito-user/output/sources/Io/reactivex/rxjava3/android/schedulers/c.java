package io.reactivex.rxjava3.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import s41.C47998a;

/* compiled from: HandlerScheduler.java */
/* loaded from: classes8.dex */
final class c extends H {

    /* renamed from: d, reason: collision with root package name */
    public final Handler f401943d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f401944e = true;

    /* compiled from: HandlerScheduler.java */
    public static final class a extends H.c {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f401945b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f401946c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f401947d;

        public a(Handler handler, boolean z12) {
            this.f401945b = handler;
            this.f401946c = z12;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @SuppressLint({"NewApi"})
        public final d c(Runnable runnable, long j12, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            boolean z12 = this.f401947d;
            EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
            if (z12) {
                return emptyDisposable;
            }
            Handler handler = this.f401945b;
            b bVar = new b(handler, runnable);
            Message messageObtain = Message.obtain(handler, bVar);
            messageObtain.obj = this;
            if (this.f401946c) {
                messageObtain.setAsynchronous(true);
            }
            this.f401945b.sendMessageDelayed(messageObtain, timeUnit.toMillis(j12));
            if (!this.f401947d) {
                return bVar;
            }
            this.f401945b.removeCallbacks(bVar);
            return emptyDisposable;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f401947d = true;
            this.f401945b.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f401947d;
        }
    }

    /* compiled from: HandlerScheduler.java */
    public static final class b implements Runnable, d {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f401948b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f401949c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f401950d;

        public b(Handler handler, Runnable runnable) {
            this.f401948b = handler;
            this.f401949c = runnable;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f401948b.removeCallbacks(this);
            this.f401950d = true;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f401950d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f401949c.run();
            } catch (Throwable th2) {
                C47998a.b(th2);
            }
        }
    }

    public c(Handler handler) {
        this.f401943d = handler;
    }

    @Override // io.reactivex.rxjava3.core.H
    public final H.c b() {
        return new a(this.f401943d, this.f401944e);
    }

    @Override // io.reactivex.rxjava3.core.H
    @SuppressLint({"NewApi"})
    public final d e(Runnable runnable, long j12, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f401943d;
        b bVar = new b(handler, runnable);
        Message messageObtain = Message.obtain(handler, bVar);
        if (this.f401944e) {
            messageObtain.setAsynchronous(true);
        }
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j12));
        return bVar;
    }
}
