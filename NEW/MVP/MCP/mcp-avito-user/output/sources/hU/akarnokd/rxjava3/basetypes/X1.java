package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SoloTakeUntil.java */
/* loaded from: classes8.dex */
final class X1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloTakeUntil.java */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -3094876274753374720L;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397659d;

        /* renamed from: e, reason: collision with root package name */
        public final a<T>.C11297a f397660e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f397661f;

        /* compiled from: SoloTakeUntil.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.X1$a$a, reason: collision with other inner class name */
        public final class C11297a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = -7055801798042780544L;

            /* renamed from: b, reason: collision with root package name */
            public boolean f397662b;

            public C11297a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                if (this.f397662b) {
                    return;
                }
                this.f397662b = true;
                NoSuchElementException noSuchElementException = new NoSuchElementException();
                a aVar = a.this;
                SubscriptionHelper.a(aVar.f397659d);
                if (!aVar.f397661f.compareAndSet(false, true)) {
                    C47998a.b(noSuchElementException);
                } else {
                    aVar.f419377c = null;
                    aVar.f419376b.onError(noSuchElementException);
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (this.f397662b) {
                    C47998a.b(th2);
                    return;
                }
                this.f397662b = true;
                a aVar = a.this;
                SubscriptionHelper.a(aVar.f397659d);
                if (!aVar.f397661f.compareAndSet(false, true)) {
                    C47998a.b(th2);
                } else {
                    aVar.f419377c = null;
                    aVar.f419376b.onError(th2);
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                if (this.f397662b) {
                    return;
                }
                get().cancel();
                e();
            }
        }

        public a(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
            this.f397659d = new AtomicReference<>();
            this.f397660e = new C11297a();
            this.f397661f = new AtomicBoolean();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this.f397659d, eVar)) {
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            SubscriptionHelper.a(this.f397660e);
            if (this.f397661f.compareAndSet(false, true)) {
                T t12 = this.f419377c;
                if (t12 == null) {
                    this.f419376b.e();
                } else {
                    this.f419377c = null;
                    l(t12);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            SubscriptionHelper.a(this.f397660e);
            if (!this.f397661f.compareAndSet(false, true)) {
                C47998a.b(th2);
            } else {
                this.f419377c = null;
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a(dVar));
        throw null;
    }
}
