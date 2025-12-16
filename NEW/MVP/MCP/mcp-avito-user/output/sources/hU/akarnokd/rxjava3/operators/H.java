package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableRequestSampleTime.java */
/* loaded from: classes8.dex */
final class H<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableRequestSampleTime.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397935b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f397936c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f397937d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397938e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f397939f = new AtomicReference<>();

        /* renamed from: g, reason: collision with root package name */
        public long f397940g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f397941h;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f397935b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this.f397938e, this.f397937d, eVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this.f397938e);
            DisposableHelper.a(this.f397939f);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397941h) {
                return;
            }
            this.f397941h = true;
            this.f397935b.e();
            DisposableHelper.a(this.f397939f);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f397941h) {
                C47998a.b(th2);
                return;
            }
            this.f397941h = true;
            this.f397935b.onError(th2);
            DisposableHelper.a(this.f397939f);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f397941h) {
                return;
            }
            long j12 = this.f397940g;
            long j13 = this.f397936c.get();
            InterfaceC41782o interfaceC41782o = this.f397935b;
            if (j13 != j12) {
                this.f397940g = j12 + 1;
                interfaceC41782o.onNext(t12);
            } else {
                this.f397941h = true;
                cancel();
                interfaceC41782o.onError(new MissingBackpressureException("Downstream is not ready to receive the next upstream item."));
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(this.f397936c, j12);
        }

        @Override // java.lang.Runnable
        public final void run() {
            SubscriptionHelper.b(this.f397938e, this.f397937d, 1L);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a((InterfaceC41782o) dVar));
        throw null;
    }
}
