package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloFlatMapSignal.java */
/* loaded from: classes8.dex */
final class C1<T, R> extends AbstractC41073l1<R> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super R> dVar) {
        new a(dVar);
        throw null;
    }

    /* compiled from: SoloFlatMapSignal.java */
    public static final class a<T, R> extends o41.f<R> implements org.reactivestreams.d<T> {

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f397562f = 0;
        private static final long serialVersionUID = -7631998337002592538L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T, R>.C11288a f397563d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f397564e;

        /* compiled from: SoloFlatMapSignal.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.C1$a$a, reason: collision with other inner class name */
        public final class C11288a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<R> {
            private static final long serialVersionUID = 5161815655607865861L;

            public C11288a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a aVar = a.this;
                aVar.l(aVar.f419377c);
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                int i12 = a.f397562f;
                a.this.f419376b.onError(th2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.reactivestreams.d
            public final void onNext(R r12) {
                int i12 = a.f397562f;
                a.this.f419377c = r12;
            }
        }

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397563d = new C11288a();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397564e, eVar)) {
                this.f397564e = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397564e.cancel();
            SubscriptionHelper.a(this.f397563d);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f419376b.onError(th3);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
        }
    }
}
