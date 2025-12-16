package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloDelay.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.s1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41093s1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloDelay.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.s1$a */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements QueueSubscription<T>, org.reactivestreams.d<T>, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super T> f397768b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f397769c;

        /* renamed from: d, reason: collision with root package name */
        public T f397770d;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f397771e;

        public a(org.reactivestreams.d dVar) {
            this.f397768b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397769c, eVar)) {
                this.f397769c = eVar;
                this.f397768b.K(this);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397771e = th2;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f397770d = t12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f397771e;
            if (th2 != null) {
                this.f397768b.onError(th2);
                return;
            }
            T t12 = this.f397770d;
            this.f397770d = null;
            this.f397768b.onNext(t12);
            this.f397768b.e();
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
